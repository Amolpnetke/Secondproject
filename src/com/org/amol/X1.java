package com.org.amol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class X1 
{
	public static void main(String[] args) 
	{
	System.out.println("Welcome to Selenium");
		
			
				System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
				driver.manage().window().maximize();
				
				WebElement username= driver.findElement(By.id("email"));
				username.sendKeys("amolnetke0@gmail.com");
		
				WebElement password= driver.findElement(By.id("pass"));
				password.sendKeys("@Amol1988");
				System.out.println("hello");
				WebElement loginButton= driver.findElement(By.id("loginbutton"));
				loginButton.click();
				
				
				//driver.quit();
		}
}


