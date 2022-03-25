package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accept_Addtocart {
	public WebDriver driver;

	@FindBy(id = "cgv")

	private WebElement termsandcond_Btn;

	public Accept_Addtocart(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getTermsandcond_Btn() {
		return termsandcond_Btn;
	}

	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	
	private WebElement checkout4;

	public WebElement getCheckout4() {
		return checkout4;
	}


}
