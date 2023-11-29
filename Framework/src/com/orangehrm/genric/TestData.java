package com.orangehrm.genric;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "endtoend")
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		Object[][] arr = Generic_Excel.get_multiple_data("Sheet1");
		return arr;
	}
}
