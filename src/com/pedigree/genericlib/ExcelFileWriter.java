package com.pedigree.genericlib;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriter {
	String ExceFile = System.getProperty("user.dir") + "\\TestData\\Pedigree TestData.xlsx";

	@SuppressWarnings("resource")
	public void setExceFile(String SheetName, int RowNumber, int ColumnNumber, String Data) throws IOException {
		FileInputStream inputstream = new FileInputStream(ExceFile);
		Workbook wbook = new XSSFWorkbook(inputstream);
		Sheet sheet = wbook.getSheet(SheetName);
		Row row = sheet.createRow(RowNumber);
		Cell cell = row.createCell(ColumnNumber);
		cell.setCellValue(Data);
		inputstream.close();

		FileOutputStream foutput = new FileOutputStream(ExceFile);
		wbook.write(foutput);
		foutput.close();
	}
}
