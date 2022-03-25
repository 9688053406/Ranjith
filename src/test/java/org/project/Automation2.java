package org.project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base.Accept_Addtocart;
import org.base.Addtocart;
import org.base.All_Products;
import org.base.Base_Class;
import org.base.By_Bank;
import org.base.Confirm_Order;
import org.base.Dress_Details;
import org.base.Home_Page;
import org.base.Login_Page;
import org.base.Womens_Product;


public class Automation2 extends Base_Class{
	
	public static void main(String[] args) throws IOException, InterruptedException {

		driver = browser_configuration("chrome");

		getUrl("http://automationpractice.com/index.php");

		implicitywait(30, TimeUnit.SECONDS);

		Home_Page hp = new Home_Page(driver);
		ClickOnElement(hp.getSigninbutton());

		Login_Page login = new Login_Page(driver);

		inputValueElement(login.getMailid(), "ranjithk373@gmail.com");
		inputValueElement(login.getPassword(), "Ranjithsubramani@123");

		ClickOnElement(login.getSubmitbutton());

		All_Products product = new All_Products(driver);

		ClickOnElement(product.getWomensdress());

		Womens_Product wp = new Womens_Product(driver);

		ClickOnElement(wp.getShowtype());

		Dress_Details details = new Dress_Details(driver);

		ClickOnElement(details.getPrintedclothes());

		ClickOnElement(details.getQuantity());
		clear(details.getQuantity());
		inputValueElement(details.getQuantity(), "5");

		dropdown("byvalue", details.getSize(), "3");

		ClickOnElement(details.getColor());

		ClickOnElement(details.getTocart());

		Addtocart cart = new Addtocart(driver);

		ClickOnElement(cart.getCheckout1());

		ClickOnElement(cart.getCheckout2());

		ClickOnElement(cart.getCheckout3());

		Accept_Addtocart addtocart = new Accept_Addtocart(driver);

		ClickOnElement(addtocart.getTermsandcond_Btn());

		ClickOnElement(addtocart.getCheckout4());

		By_Bank bank = new By_Bank(driver);

		ClickOnElement(bank.getPaybutton());

		Confirm_Order order = new Confirm_Order(driver);

		ClickOnElement(order.getOrder());

		// endSession("quit");

	}

	

}
