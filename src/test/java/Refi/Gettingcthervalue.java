package Refi;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gettingcthervalue {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver() ;

		driver.get("https://etherscan.io/readContract?m=normal&a=0x3d9819210a31b4961b30ef54be2aed79b9c9cd3b&v=0xbafe01ff935c7305907c33bf824352ee5979b526#readCollapse35");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#readCollapse35']")));
		
		driver.findElement(By.xpath("//*[@href='#readCollapse35']")).click();
		
		driver.findElement(By.id("input_35_1")).sendKeys("0x5d3a536e4d6dbd6114cc1ead35777bab948e3643");
		
		driver.findElement(By.id("btn_35")).click();
			
		//List<WebElement> Loanamount = driver.findElements(By.cssSelector(".collapse.readContractFunction.show .mt-3.text-secondary"));
		
		
		WebElement ele= driver.findElement(By.xpath("//*[@aria-labelledby='readHeading35']"));
		
		ele.getAttribute("InnerText");
		
		System.out.println(ele);
//		Loanamount.
//
//		for (WebElement Loanamountbalance : Loanamount) {
//
//			String Loanbalance = Loanamountbalance.get
//			
//			System.out.println(Loanbalance);
//		
//
//
//	}

}
}
