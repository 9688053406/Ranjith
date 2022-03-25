package org.project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopal\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://adactinhotelapp.com/");
		  driver.manage().window().maximize();
		  
		  WebElement name = driver.findElement(By.id("username"));
		  name.sendKeys("ranjithk373");
		  
		  WebElement pass = driver.findElement(By.id("password"));
		  pass.sendKeys("LB85W0");
		  
		  WebElement login = driver.findElement(By.id("login"));
		  login.click();
		  
		  //next page		  
		  WebElement location = driver.findElement(By.id("location"));
		  Select s=new Select(location);
		  s.selectByValue("London");
		  
		  WebElement hotel = driver.findElement(By.id("hotels"));
		  Select h=new Select(hotel);
		  h.selectByValue("Hotel Sunshine");
		  
		  WebElement room = driver.findElement(By.id("room_type"));
		  Select r=new Select(room);
		  r.selectByValue("Super Deluxe");
		  
		  WebElement number = driver.findElement(By.id("room_nos"));
		  Select n=new Select(number);
		  n.selectByValue("3");
		  
		  WebElement date1 = driver.findElement(By.id("datepick_in"));
		  date1.sendKeys("02/03/2022");
		  
		  WebElement date2 = driver.findElement(By.id("datepick_out"));
		  date2.sendKeys("10/03/2022");
		  
		  WebElement adult = driver.findElement(By.id("adult_room"));
		  Select a = new Select(adult);
		  a.selectByValue("2");
		  
		  WebElement child = driver.findElement(By.id("child_room"));
		  Select c = new Select(child);
		  c.selectByValue("2");
		  
		  WebElement submit = driver.findElement(By.id("Submit"));
		  submit.click();
		  
		  //next page
		  WebElement radio = driver.findElement(By.id("radiobutton_0"));
		  radio.click();
		  
		  WebElement btn = driver.findElement(By.id("continue"));
		  btn.click();
		  
		  //next page
		  
		  WebElement fname = driver.findElement(By.id("first_name"));
		  fname.sendKeys("Ranjith");
		  
		  WebElement lname = driver.findElement(By.id("last_name"));
		  lname.sendKeys("kumar S");
		  
		  WebElement address = driver.findElement(By.id("address"));
		  address.sendKeys("11/2c, Puthur,Kulithalai,Karur.");
		  
		  WebElement cnumber = driver.findElement(By.id("cc_num"));
		  cnumber.sendKeys("1234567890123456");
		  
		  WebElement ctype = driver.findElement(By.id("cc_type"));
		  Select type=new Select(ctype);
		  type.selectByValue("MAST");
		  
		  WebElement cmonth = driver.findElement(By.id("cc_exp_month"));
		  Select m = new Select(cmonth);
		  m.selectByValue("4");
		  
		  WebElement cyear = driver.findElement(By.id("cc_exp_year"));
		  Select y = new Select(cyear);
		  y.selectByValue("2022");
		  
		  WebElement cvv = driver.findElement(By.id("cc_cvv"));
		  cvv.sendKeys("123");
		  
		  WebElement btn2 = driver.findElement(By.id("book_now"));
		  btn2.click();
		  
		  //next page	
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		 

		  WebElement logout = driver.findElement(By.id("logout"));
		  TakesScreenshot ts=(TakesScreenshot) driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File dest= new File("C:\\Users\\gopal\\eclipse-workspace\\Selenium\\File\\hotelbook.png");
			
			FileUtils.copyFile(src, dest);
		  logout.click();
		  
		  //next page
		  WebElement link = driver.findElement(By.xpath("//a[@href='index.php']"));
		  link.click();
		  
		  
		  
		  
		  

	}

}
