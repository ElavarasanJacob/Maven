package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.CaseFormat;
import com.graphbuilder.curve.CatmullRomSpline;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

	File f = new File("C:\\Maven\\Excel\\Task Read excele.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(stream);
	Sheet sheet = w.getSheet("Sheet2");
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		System.out.println();

		for(int j=0; j<row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);

			CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				break;

			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy");
					String format = s.format(dateCellValue);
					System.out.println(format);
				}
				else {
					double d = cell.getNumericCellValue();
					BigDecimal b =BigDecimal.valueOf(d);
					String string = b.toString();
					System.out.println(string);
				}

				break;
			case BOOLEAN:
				boolean booleanCellValue = cell.getBooleanCellValue();
				System.out.println(booleanCellValue);
				
				break;
			case FORMULA:
				String cellFormula = cell.getCellFormula();
				System.out.println(cellFormula);

			default:

				break;
				
			}
			
			
			
			
			
			
			
			
		}
	}
	}
}
