package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TableReadAndWrite extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		String res=null;
	File f = new File("C:\\Maven\\Excel\\Adactin2.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(stream);
	Sheet sheet1 = w.createSheet("Sheet4");
	Sheet sheet = w.getSheet("Sheet2");
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	for (int i = 0; i < physicalNumberOfRows; i++) {
		Row createRow = sheet1.createRow(i);
		Row row = sheet.getRow(i);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j <physicalNumberOfCells ; j++) {
			Cell createCell = createRow.createCell(j);
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				res = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
					res = s.format(dateCellValue);
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					
					BigDecimal b = BigDecimal.valueOf(numericCellValue);
					String string = b.toString();
					System.out.println(string);
				}
				break;
			}
//			System.out.println(res);
			createCell.setCellValue(res);
			FileOutputStream a = new FileOutputStream(f);
			w.write(a);
		}
	}
	}}														
