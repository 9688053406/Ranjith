package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	
	public Addtocart(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")

	private WebElement checkout1;

	public WebElement getCheckout1() {
		return checkout1;
	}

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")

	private WebElement checkout2;

	public WebElement getCheckout2() {
		return checkout2;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")

	private WebElement checkout3;

	public WebElement getCheckout3() {
		return checkout3;
	}


}
