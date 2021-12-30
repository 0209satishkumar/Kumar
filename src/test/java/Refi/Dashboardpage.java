package Refi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dashboardpage {
	static WebDriver driver;

	@Test
	public void greaterthanborrowamount(ChromeDriver driver) throws IOException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}

		List<WebElement> Borrowlimitamount = driver.findElements(By.cssSelector(p.getProperty("Borrowlimitamount")));

		for (WebElement Borrowlimitamount1 : Borrowlimitamount) {

			String errormessage2 = Borrowlimitamount1.getText();

			String result = errormessage2.replaceAll("[DAI $ ,]", "");

			double d = Double.parseDouble(result);

			double d1 = 1.00;

			double d2 = d + d1;

			String s = String.valueOf(d2);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("daiAmount")));

			driver.findElement(By.id("daiAmount")).sendKeys(s);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Take Loan']")));

			driver.findElement(By.xpath("//*[text()='Take Loan']")).click();

			List<WebElement> errormessage = driver.findElements(By.cssSelector(p.getProperty("Borrowlimitreached")));

			for (WebElement errormessage1 : errormessage) {

				String errormessage3 = errormessage1.getText();

				String Actual = "Borrow amount more than permissible";

				if (Actual.equals(errormessage3)) {
					System.out.println("Test case PASS");
				} else {
					System.out.println("Test case FAILs");
				}
			}

		}
	}
}
