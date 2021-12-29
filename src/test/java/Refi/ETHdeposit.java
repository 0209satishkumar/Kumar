package Refi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ETHdeposit {

	public void twodigits(ChromeDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#ethAmount")));

		driver.findElement(By.cssSelector("input#ethAmount")).sendKeys("30");

	}

	public void threedigits(ChromeDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#ethAmount")));

		driver.findElement(By.cssSelector("input#ethAmount")).sendKeys("500");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Deposit']")));

		driver.findElement(By.xpath("//*[text()='Deposit']")).click();

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> errormessage = driver.findElements(By.cssSelector(p.getProperty("valut")));

		for (WebElement errormessage1 : errormessage) {

			String errormessage2 = errormessage1.getText();
			
			

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Actual = "Vault limit reached";

			if (Actual.equals(errormessage2)) {
				System.out.println("Test case PASS");
			} else {
				System.out.println("Test case FAIL");
			}
		}

	}

}
