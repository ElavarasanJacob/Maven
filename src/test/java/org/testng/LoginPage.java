package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class LoginPage extends BaseClass {
	
	public  LoginPage() {
PageFactory.initElements(driver, this);
		
	}
	
@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement popupbtn;

@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement input;

@FindBy(xpath="//button[@type='submit']")
private WebElement searchbtn;


public WebElement getPopupbtn() {
	return popupbtn;
}
public WebElement getInput() {
	return input;
}
public WebElement getSearchbtn() {
	return searchbtn;
}
public void loginPage(String s) {
	
click(getPopupbtn());
textPass(getInput(), s);
click(getSearchbtn());
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
