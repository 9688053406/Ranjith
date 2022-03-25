package org.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womens_Product {
	
	public WebDriver driver;

	@FindBy(id = "list")

	private WebElement showtype;

	public Womens_Product(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getShowtype() {
		return showtype;
	}


}
