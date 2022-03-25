package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.base.Home_Page;

import org.base.Login_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;

	private Home_Page hp;

	private Login_Page login;

	private All_Products products;

	private Womens_Product wp;

	private Dress_Details DD;

	private Addtocart cart;

	private By_Bank bank;

	private Accept_Addtocart acceptcart;

	private Confirm_Order co;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Home_Page get_instance_Hp() {

		hp = new Home_Page(driver);
		return hp;

	}

	public Login_Page get_instance_login() {

		login = new Login_Page(driver);

		return login;

	}

	public All_Products get_instance_products() {

		products = new All_Products(driver);

		return products;

	}

	public Womens_Product get_instance_wp() {

		wp = new Womens_Product(driver);

		return wp;

	}

	public Dress_Details get_instance_DD() {

		DD = new Dress_Details(driver);

		return DD;

	}

	public Addtocart get_instance_cart() {

		cart = new Addtocart(driver);

		return cart;

	}

	public By_Bank get_instance_bank() {

		bank = new By_Bank(driver);

		return bank;

	}

	public Accept_Addtocart get_instance_acceptcart() {

		acceptcart = new Accept_Addtocart(driver);

		return acceptcart;
	}

	public Confirm_Order get_instance_co() {

		co = new Confirm_Order(driver);

		return co;

	}


}
