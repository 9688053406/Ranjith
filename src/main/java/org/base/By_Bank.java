package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class By_Bank {
	
	
    public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	
	private WebElement paybutton;

	public By_Bank(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getPaybutton() {
		return paybutton;
	}
	


}
