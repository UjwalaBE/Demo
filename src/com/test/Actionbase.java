package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionbase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(1).exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	   
		driver.manage().deleteAllCookies();
		
			
			driver.get("http://magnus.jalaacademy.com/");
		
			driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
			
		    driver.findElement(By.name("Password")).sendKeys("jobprogram");
		    
		    driver.findElement(By.id("btnLogin")).click();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.linkText("More")).click();
		  
		    Thread.sleep(1000);
		    
		    driver.findElement(By.linkText("Menu")).click();
		    
		    driver.findElement(By.linkText("Sub Menus")).click();
		    Thread.sleep(2000);
		    
		    Actions action =new Actions(driver);
		    
		    action.moveToElement( driver.findElement(By.linkText("Testing"))).build().perform();
		    
		    driver.findElement(By.linkText("Selenium")).click();
		   
		    
	}

}
