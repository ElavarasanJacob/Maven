package org.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radiobtn;
	
	@FindBy(css="input#continue")
	private WebElement continueClick;
	
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}


	public WebElement getContinueClick() {
		return continueClick;
	}


	public void booking() {
		
		click(getRadiobtn());
		click(getContinueClick());
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
