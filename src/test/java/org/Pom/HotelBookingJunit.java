package org.Pom;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sam.BaseClass;

public class HotelBookingJunit extends BaseClass {

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		launchURL("https://adactinhotelapp.com/");
		maximizeWindow();
		implicityWaits(90);
	}

	@AfterClass
	public static void afterClass() {
		closeCurrentBrowser();
	}

	@Test
	public void bookHotel() throws IOException, InterruptedException {
		// Login class-1
		Login l = new Login();
		l.loginPage(readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 0),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 1));
		// search class2
		SearchHotel s = new SearchHotel();
		s.searchHotel(readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 2),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 3),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 4),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 5),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 6),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 7),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 8),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 9));

		// class 3
		SelectHotel b = new SelectHotel();
		b.booking();

		// class 4
		BookHotel c = new BookHotel();
		c.confirm(readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 10),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 11),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 12),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 13),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 14),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 15),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 16),
				readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 17));

		BkItinerary x = new BkItinerary();
		x.bookItinerary();

		CancelBooking n = new CancelBooking();
		n.cancelbkng(readFile("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 18));

	}

}
