package org.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class BookHotel extends BaseClass {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardno;

	@FindBy(id = "cc_type")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expYear;

	@FindBy(id = "cc_cvv")
	private WebElement ccvNo;

	@FindBy(id = "book_now")
	private WebElement book;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCcvNo() {
		return ccvNo;
	}

	public WebElement getBook() {
		return book;
	}

	public void confirm(String fstName, String lstName, String address, String cardno, String cardType, String expmnth,
			String expYear, String ccvNo) {

		textPass(getFirstName(), fstName);
		textPass(getLastName(), lstName);
		textPass(getAddress(), address);
		textPass(getCardno(), cardno);
		SelectByVisibleText(getCardType(), cardType);
		SelectByVisibleText(getExpMonth(), expmnth);
		SelectByVisibleText(getExpYear(), expYear);
		textPass(getCcvNo(), ccvNo);
		click(getBook());

	}

}
