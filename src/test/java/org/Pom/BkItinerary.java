package org.Pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class BkItinerary extends BaseClass {

	public BkItinerary() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderPrint;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bkdItinerary;

	public WebElement getOrderPrint() {
		return orderPrint;
	}

	public WebElement getBkdItinerary() {
		return bkdItinerary;
	}

	public void bookItinerary() throws IOException {

		String attribute = getAttribute(getOrderPrint());
		writeData("C:\\Maven\\Excel\\Adactin.xlsx", "Sheet1", 1, 18, attribute);
		click(getBkdItinerary());

	}
	

}
