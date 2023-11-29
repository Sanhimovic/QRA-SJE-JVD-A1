package com.orangehrm.genric;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel implements Framework_Constants{

	public static String get_single_data(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
		Cell cel = WorkbookFactory.create(fis).getSheet(sheet)
				.getRow(row).getCell(cell);
		String value = cel.toString();
		return value;
	}
	
	public static  Object[][] get_multiple_data(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
		Sheet shet = WorkbookFactory.create(fis).getSheet(sheet);
		
		int row_count = shet.getPhysicalNumberOfRows();
		int cell_count = shet.getRow(0).getPhysicalNumberOfCells();
		
		Object [][]data=new Object[row_count-1][cell_count];
		
		for(int i=0;i<row_count-1;i++) {
			for(int j=0;j<cell_count;j++) {
				data[i][j]=shet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
}
