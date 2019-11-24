package com.pedigree.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
	String ExceFile = System.getProperty("user.dir") + "\\TestData\\Pedigree TestData.xlsx";

	@SuppressWarnings("resource")
	public String getExceFileReader(String SheetName, int RowNumber, int ColumnNumber) throws IOException {
		FileInputStream inputstream = new FileInputStream(ExceFile);
		Workbook wbook = new XSSFWorkbook(inputstream);
		Sheet sheet = wbook.getSheet(SheetName);
		Row row = sheet.getRow(RowNumber);
		Cell cell = row.getCell(ColumnNumber);
		String Data = cell.getStringCellValue();
		return Data;
	}
}
