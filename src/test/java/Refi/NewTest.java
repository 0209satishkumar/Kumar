package Refi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	ChromeDriver driver;
  @Test
  public void f() throws IOException {
	  
	  WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://main.d1wxtput80cmif.amplifyapp.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		System.out.println("Login button click successfully");
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	  
	  System.out.println("Satish kumar");
	  
	  
  }
}
