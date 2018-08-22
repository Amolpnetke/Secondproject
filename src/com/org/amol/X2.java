package com.org.amol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class X2 {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Selenium");
		
		System.setProperty("webdriver.ie.driver","Resources/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("Amol");
		
		WebElement passWord= driver.findElement(By.id("pass"));
		passWord.sendKeys("Rahul");
		
		WebElement loginButton=driver.findElement(By.id("loginbutton"));
		loginButton.click();
		//driver.close();
	}

}
