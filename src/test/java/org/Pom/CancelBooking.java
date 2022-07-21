package org.Pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class CancelBooking extends BaseClass {
	
	public CancelBooking() {
PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_id_text")
	private WebElement enterOrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement searchOrderId;
	
	@FindBy(id="check_all")
	private WebElement radioBtnClick;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancelOrder;

	public WebElement getEnterOrderId() {
		return enterOrderId;
	}

	public WebElement getSearchOrderId() {
		return searchOrderId;
	}

	public WebElement getRadioBtnClick() {
		return radioBtnClick;
	}

	public WebElement getCancelOrder() {
		return cancelOrder;
	}
	
	public void cancelbkng(String orderid) throws InterruptedException {
		textPass(getEnterOrderId(), orderid);
		click(getSearchOrderId());
		click(getRadioBtnClick());
		click(getCancelOrder());
		switctoAlert();
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
