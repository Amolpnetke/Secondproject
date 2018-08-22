package com.org.amol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class X3
{
public static void main(String[] args) 
{
	System.out.println("Welcome to Selenium");
	
	System.setProperty("webdriver.gecko.driver","Resources/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement username=driver.findElement(By.id("email"));
	username.sendKeys("amolnetke0@gmail.com");
	
	WebElement password=driver.findElement(By.id("pass"));
	password.sendKeys("@Amol1988");
	
	WebElement loginButton =driver.findElement(By.id("loginbutton"));
	loginButton.click();
	driver.close();
	
	
}
}