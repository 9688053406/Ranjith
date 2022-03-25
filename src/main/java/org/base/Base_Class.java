package org.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver  browser_configuration(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "value");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();		
		return driver;
		// TODO Auto-generated method stub
		
		

	}

	public static void ClickOnElement(WebElement element) {
		// signinbutton.click();
		element.click();
	}

	public static void inputValueElement(WebElement element, String data) {
		// Mailid.sendkeys();
		element.sendKeys(data);
	}

	public static void close() {

		driver.close();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void clear(WebElement element) {

		element.clear();
	}

	public static void dropdown(String type, WebElement element, String value) {

		Select select = new Select(element);

		if (type.equalsIgnoreCase("byvalue")) {

			select.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("bytext")) {

			select.selectByVisibleText(value);

		}

		else if (type.equalsIgnoreCase("byIndex")) {

			int index = Integer.parseInt(value);

			select.selectByIndex(index);

		}

	}

	public static void endSession(String type) {

		if (type.equalsIgnoreCase("close")) {

			driver.close();

		} else if (type.equalsIgnoreCase("quit")) {

			driver.quit();
		}

	}

	public static void implicitywait(int seconds, TimeUnit format) {

		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

	}

	public static String Particular_Data(String path, int row_Index, int cell_Index) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_Index);

		Cell cell = row.getCell(cell_Index);

		CellType celltype = cell.getCellType();

		String value = null;
		if (celltype.equals(CellType.STRING)) {

			value = cell.getStringCellValue();

		}
		else if (celltype.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int val = (int) numericCellValue;

			value = String.valueOf(val);

		}
		
		w.close();
		
		return value;
		
		
	}



}
