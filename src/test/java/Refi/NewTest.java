package Refi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	ChromeDriver driver;
  @Test
  public void f() throws IOException {
	  
	  WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();

		option.addExtensions(new File(".//Metamask//metamask_10_2_2_0.crx"));

		driver = new ChromeDriver(option);

		driver.manage().deleteAllCookies();

		driver.get("https://rapid:pineapple@staging.dnfbhl3qf3v8x.amplifyapp.com/");
		
		System.out.println(driver.getCurrentUrl());

		driver.manage().window().maximize();
	  
	  System.out.println("Satish kumar");
	  
	  
  }
}
