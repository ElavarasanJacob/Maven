package org.Pom;

import org.apache.poi.ooxml.POIXMLFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class Login extends BaseClass{

	public Login() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void loginPage(String name,String pass) {
		textPass(getTxtUsername(), name);
		textPass(getTxtPassword(), pass);
		click(getBtnLogin());


		
		
	}
	
	
	
	
}
