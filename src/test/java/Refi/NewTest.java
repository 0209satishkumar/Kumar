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

public class NewTest extends metamaskconnection  {
	ChromeDriver driver;
	@Test(enabled = false, priority = 1 ,description = "Meta mask connection")

	public void checkingconnection() {
		
		System.out.println("Connection done");

	}
}
