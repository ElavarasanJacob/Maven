package org.sam;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AssertionJunit {
	static BaseClass s;

	@BeforeClass
	public static void login() {
		s.getDriver();
		s.launchURL("https://adactinhotelapp.com/");
		s.maximizeWindow();
		s.implicityWaits(50);
	}

	@Test
	public void loginPage() throws IOException {
		s = new BaseClass();
		WebElement userName = s.LocateByID("username");
		String user = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 0);
		s.textPass(userName, user);
		String name = s.getAttribute(userName);
		Assert.assertEquals("verify Username", user, name);

		WebElement password = s.LocateByID("password");
		String passTxt = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 1);
		s.textPass(password, passTxt);
		Assert.assertEquals("Verify Password", passTxt, s.getAttribute(password));

		WebElement clickbtn = s.LocateByID("login");
		s.click(clickbtn);

		String title = s.getTitle();
		System.out.println(title);
		boolean contains = title.contains("Search");
		Assert.assertTrue("Verify login", contains);

		WebElement hello = s.LocateByID("username_show");
		String attribute = hello.getAttribute("value");
		System.out.println(attribute);
		Assert.assertEquals("verify Hello", "Hello ElavarasanJacob!", attribute);
//		s.createRow("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 2, 20, attribute);

		WebElement location = s.LocateByID("location");
		String newYork = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 2);
		s.SelectByVisibleText(location, newYork);

		WebElement hotel = s.LocateByID("hotels");
		String hotelName = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 3);
		s.SelectByVisibleText(hotel, hotelName);

		WebElement roomType = s.LocateByID("room_type");
		String rooms = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 4);
		s.SelectByVisibleText(roomType, rooms);

		WebElement roomrqrd = s.LocateByID("room_nos");
		String Rqrdrooms = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 5);
		s.SelectByVisibleText(roomrqrd, Rqrdrooms);

		WebElement chkndate = s.LocateByID("datepick_in");
		s.clear(chkndate);
		String stdate = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 6);
		s.textPass(chkndate, stdate);

		WebElement chkoutDate = s.LocateByID("datepick_out");
		s.clear(chkoutDate);
		String eddate = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 7);
		s.textPass(chkoutDate, eddate);

		WebElement adults = s.LocateByID("adult_room");
		String persons = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 8);
		s.SelectByVisibleText(adults, persons);

		WebElement child = s.LocateByID("child_room");
		String nochild = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 9);
		s.SelectByVisibleText(child, nochild);

		WebElement search = s.LocateByID("Submit");
		s.click(search);
		
		WebElement printHotel = s.XpathLocator("//td[@class='login_title']");
		String selectHotel = s.getText(printHotel);
		System.out.println(selectHotel);
		Assert.assertEquals("Verify select Hotel", "Select Hotel", selectHotel);
//		s.writeData("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 3, 20, selectHotel);
//		s.createRow("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 3, 20, selectHotel);

		WebElement select = s.XpathLocator("//input[@name='radiobutton_0']");
		s.click(select);

		WebElement continueClick = s.CSSLocator("input#continue");
		s.click(continueClick);

		WebElement BookHotelprint = s.XpathLocator("//td[contains(text(),'Book')]");
		String text = s.getText(BookHotelprint);
		System.out.println(text);
		Assert.assertEquals("Verify Book page open", "Book A Hotel", text);
		s.createRow("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 4, 20, text);

		WebElement firstname = s.LocateByID("first_name");
		String frstnamepass = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 10);
		s.textPass(firstname, frstnamepass);

		WebElement lastNamename = s.LocateByID("last_name");
		String lastnamepass = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 11);
		s.textPass(lastNamename, lastnamepass);

		WebElement address = s.LocateByID("address");
		String billingadd = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 12);
		s.textPass(address, billingadd);

		WebElement cardNo = s.LocateByID("cc_num");
		String no = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 13);
		s.textPass(cardNo, no);

		WebElement cardName = s.LocateByID("cc_type");
		String Cardnametext = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 14);
		s.SelectByVisibleText(cardName, Cardnametext);

		WebElement expiryMonth = s.LocateByID("cc_exp_month");
		String month = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 15);
		s.SelectByVisibleText(expiryMonth, month);

		WebElement expiryYear = s.LocateByID("cc_exp_year");
		String va = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 16);
		s.SelectByValue(expiryYear, va);

		WebElement ccvNumber = s.LocateByID("cc_cvv");
		String numberccv = s.readFile("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 17);
		s.textPass(ccvNumber, numberccv);

		WebElement booknowclick = s.LocateByID("book_now");
		s.click(booknowclick);

		WebElement bookingconfirm = s.XpathLocator("//td[contains(text(),'Booking')]");
		String text2 = s.getText(bookingconfirm);
		System.out.println(text2);
		Assert.assertEquals("Verify booking confirm", "Booking Confirmation", text2);
		s.createRow("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 5, 20, text2);

		WebElement value = s.LocateByID("order_no");
		String orderId = value.getAttribute("value");
		System.out.println(orderId);
		s.writeData("C:\\Maven\\Excel\\HotelBooking.xlsx", "Sheet1", 1, 20, orderId);

	}

	@Test
	public void clickingButton() {

	}

	@AfterClass
	public static void close() {
		s.closeCurrentBrowser();

	}

}
