package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ProgramPractice extends BaseClass {
	
	
	public static void main(String[] args) throws IOException {
	
		ProgramPractice b = new ProgramPractice();
			/*File f = new File("C:\\Maven\\Excel\\HotelBooking.xlsx");
			FileInputStream stream = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(stream);
			Sheet createSheet = w.getSheet("Sheet1");
			Row createRow = createSheet.getRow(1);
			Cell cell = createRow.getCell(16);
			CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				 String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				 break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
					String format = s.format(dateCellValue);
					System.out.println(format);
				} 
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					BigDecimal bigDecimal = BigDecimal.valueOf(l);
					String string = bigDecimal.toString();
					System.out.println(string);
				}
				break;
			
			default:
				break;
			}
		
		}
*/
//	WebElement cardName = b.LocateByID("cc_type");
		String Cardnametext = b.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 14);
		System.out.println(Cardnametext);
//		b.SelectByValue(cardName, Cardnametext);
//		String attribute7 = b.getAttribute(cardName);
//		System.out.println(attribute7);

//		WebElement expiryMonth = b.LocateByID("cc_exp_month");
		String month = b.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 15);
		System.out.println(month);
//		b.SelectByValue(expiryMonth, month);
//		String attribute8 = b.getAttribute(expiryMonth);
//		System.out.println(attribute8);

//		WebElement expiryYear = b.LocateByID("cc_exp_year");
		String va = b.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 2, 16);
		System.out.println(va);
//		String attribute9 = b.getAttribute(expiryYear);
//		System.out.println(attribute9);
//		b.SelectByValue(expiryYear, va);

//		WebElement ccvNumber = b.LocateByID("cc_cvv");
		String numberccv = b.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 17);
		System.out.println(numberccv);
//		System.out.println("numberccv is :"+numberccv);
//		b.textPass(ccvNumber, numberccv);
//		String attribute10 = b.getAttribute(ccvNumber);
//		System.out.println(attribute10);
	
		
		
	}	
		
		
		}
		
	


