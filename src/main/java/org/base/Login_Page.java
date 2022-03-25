package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	

	public WebDriver driver;

	public Login_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")

	private WebElement mailid;

	public WebElement getMailid() {
		return mailid;
	}

	@FindBy(id = "passwd")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	
	@FindBy(id="SubmitLogin")
	
	private WebElement submitbutton;

	public WebElement getSubmitbutton() {
		return submitbutton;
	}


}
