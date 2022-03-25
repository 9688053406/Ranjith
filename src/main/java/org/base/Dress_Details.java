package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Details {
	
	public WebDriver driver;
	@FindBy(xpath = "(//a[@class='product-name'])[5]")
	private WebElement printedclothes;

	public Dress_Details(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getPrintedclothes() {
		return printedclothes;
	}

	@FindBy(xpath = "(//input[@type='text'])[4]")

	private WebElement quantity;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	@FindBy(id = "group_1")

	private WebElement size;

	public WebElement getSize() {
		return size;
	}

	@FindBy(id = "color_24")

	private WebElement color;

	public WebElement getColor() {
		return color;
	}

	@FindBy(xpath = "(//button[@type='submit'])[3]")

	private WebElement tocart;

	public WebElement getTocart() {
		return tocart;
	}


}
