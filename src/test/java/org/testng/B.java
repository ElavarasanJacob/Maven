package org.testng;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B extends BaseClass {

	@BeforeClass
	private void beforeClass() {
		getDriver();
		launchURL("https://adactinhotelapp.com/");
		maximizeWindow();
		implicityWaits(50);
	}

	@BeforeMethod
	private void beforeMethod() throws IOException {
		takeScreenShot("C:\\Maven\\Excel\\Adactin beforelogin.png");
	}

	@AfterMethod
	private void afterMethod() throws IOException {
		takeScreenShot("C:\\Maven\\Excel\\Adactin after login.png");
	}

	@Parameters({ "username", "password" })
	@Test
	private void tc01(String a, String b) {

		LoginPage t = new LoginPage();
		t.loginPage(a);
	}

	@Parameters({ "location", "hotels", "room_type", "room_nos", "datepick_in", "datepick_out", "adult_room",
			"child_room" })
	@Test(priority=1)
	private void searchHistory(String location, String hotel, String roomtype, String roomNo, String checkinDate,
			String checkoutDate, String adults, String child) {
		SearchHotel s = new SearchHotel();
		s.searchHotel(location, hotel, roomtype, roomNo, checkinDate, checkoutDate, adults, child);

	}

	@AfterClass
	private void afterClass() {
		closeCurrentBrowser();

	}

}
