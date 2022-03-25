package org.project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Automation extends Base_Class {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		driver = browser_configuration("chrome");
		
		getUrl("http://automationpractice.com/index.php");
		
		WebElement signinButton = driver.findElement(By.xpath("//a[@class='login']"));
		ClickOnElement(signinButton);

		implicitywait(30, TimeUnit.SECONDS);
		// Already Registered Mail and password enter

		WebElement mailid = driver.findElement(By.id("email"));
		inputValueElement(mailid, "ranjithk373@gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		inputValueElement(password, "Ranjithsubramani@123");

		WebElement submitbutton = driver.findElement(By.id("SubmitLogin"));
		ClickOnElement(submitbutton);

		// Womens Section

		WebElement womendress = driver.findElement(By.xpath("//a[text()='Women']"));
		ClickOnElement(womendress);

		WebElement showtype = driver.findElement(By.id("list"));
		ClickOnElement(showtype);

		// printed clothes

		WebElement printedclothes = driver.findElement(By.xpath("(//a[@class='product-name'])[5]"));
		ClickOnElement(printedclothes);

		WebElement quantity = driver.findElement(By.xpath("(//input[@type='text'])[4]"));

		clear(quantity);

		inputValueElement(quantity, "3");

		// DropdownMethod

		WebElement size = driver.findElement(By.id("group_1"));

		dropdown("byindex", size, "2");

		WebElement color = driver.findElement(By.id("color_24"));

		ClickOnElement(color);

		WebElement tocart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));

		ClickOnElement(tocart);

		// proceed to checkout 1

		WebElement checkout1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		ClickOnElement(checkout1);
		// Checkout2

		WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ClickOnElement(checkout2);

		// checkout3.

		WebElement checkout3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		ClickOnElement(checkout3);

		// accept terms & conditions.

		WebElement termsandcond_Btn = driver.findElement(By.id("cgv"));
		ClickOnElement(termsandcond_Btn);

		// checkout4.
		WebElement checkout4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		ClickOnElement(checkout4);

		// Pay by Bank.

		WebElement paybutton = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		ClickOnElement(paybutton);

		// Confirm order.

		WebElement confirm_order = driver
				.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));

		ClickOnElement(confirm_order);

		// endSession("quit");

		
		


	}

}
