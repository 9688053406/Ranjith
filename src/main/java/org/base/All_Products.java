package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class All_Products {
	
	public All_Products(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver;

	@FindBy(xpath = "//a[text()='Women']")

	private WebElement womensdress;

	public WebElement getWomensdress() {
		return womensdress;
	}


}
