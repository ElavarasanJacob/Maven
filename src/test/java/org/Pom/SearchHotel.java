package org.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement selectlocation;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType; 														
	
	@FindBy(id="room_nos")
	private WebElement roomNo; 
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate ; 
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate ; 
	
	@FindBy(id="adult_room")
	private WebElement adultsInRoom ; 
	
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement click;

	public WebElement getSelectlocation() {
		return selectlocation;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsInRoom() {
		return adultsInRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getClick() {
		return click;
	}
	
	public void searchHotel(String location,String hotel,String roomtype,String roomNo,String checkinDate,String checkoutDate,String adults,String child) {
		SelectByVisibleText(getSelectlocation(), location);
		SelectByVisibleText(getHotels(), hotel);
		SelectByVisibleText(getRoomType(), roomtype);
		SelectByVisibleText(getRoomNo(), roomNo);
		clear(getCheckInDate());
		textPass(getCheckInDate(), checkinDate);
		click(getCheckOutDate());
		textPass(getCheckOutDate(), checkoutDate);
		SelectByVisibleText(getAdultsInRoom(), adults);
		SelectByVisibleText(getChildRoom(), child);
		click(getClick());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
