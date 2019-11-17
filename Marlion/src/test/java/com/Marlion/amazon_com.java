package com.Marlion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class amazon_com {
	/*
	 * @Test public void createCustomer() { System.out.println("Create Customer"); }
	 * 
	 * @Test public void modifyCustomer() { System.out.println("Create Customer"); }
	 * 
	 * @Test public void deleteCustomer() { System.out.println("Create Customer"); }
	 */
@Test
	public void firsttest() throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	driver.close();
	}


}
