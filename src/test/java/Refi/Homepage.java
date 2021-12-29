package Refi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Homepage {

	static WebDriver driver;

	public void Colletralbalance(ChromeDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> AccountBalance = driver.findElements(By.cssSelector(".sc-ehSDrC div:nth-of-type(1) .dAlUnL"));

		WebElement element = driver.findElement(By.cssSelector(p.getProperty("CollateralETHBALANCE")));

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {

			// Here checking dummy element why because after connect to meta mask values
			// will change its takes fractions of seconds

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(".sc-eJMPIT div:nth-of-tye(1) .gtRlYV")));

		}

		catch (Exception E) {
			// System.out.println("Getting application values");
		}

		for (WebElement Balance : AccountBalance) {

			String CollateralBalance = Balance.getText();

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Assetbalance = CollateralBalance;

			String AETHbalance = Assetbalance.replace("ETH", "");

			System.out.println("Before dashboard  Collateral balance  = " + AETHbalance);

		}
	}

	public void Afterbalance(ChromeDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);

		List<WebElement> AccountBalance = driver.findElements(By.cssSelector(p.getProperty("CollateralETHBALANCE")));

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {

			// Here checking dummy element why because after connect to meta mask values
			// will change its takes fractions of seconds

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(".sc-eJMPIT div:nth-of-tye(1) .gtRlYV")));

		}

		catch (Exception E) {
			// System.out.println("Getting application values");
		}

		for (WebElement Balance : AccountBalance) {

			String CollateralBalance = Balance.getText();

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Assetbalance = CollateralBalance;

			String AETHbalance = Assetbalance.replace("ETH", "");

			System.out.println("After dashboard  Collateral balance  = " + AETHbalance);

		}

	}

	public void ColletralbalanceAfter(ChromeDriver driver) {

		List<WebElement> AccountBalance1 = driver.findElements(By.cssSelector(".sc-ehSDrC div:nth-of-type(1) .grrkDB"));

		try {

			// Here checking dummy element why because after connect to meta mask values
			// will change its takes fractions of seconds
			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(".sc-eJMPIT div:nth-of-tye(1) .gtRlYV")));

		}

		catch (Exception E) {
			// System.out.println("Getting application values");

			for (WebElement Balance1 : AccountBalance1) {

				String CollateralBalance1 = Balance1.getText();

				// System.out.println("Before transaction Balance = " + AssetETHBalance);

				String Assetbalance1 = CollateralBalance1;

				String AETHbalance1 = Assetbalance1.replace("ETH", "");

				System.out.println("After Dashboard Collateral balance  = " + AETHbalance1);

			}

		}
	}

	public void transactionsuccess(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.switchTo().window(newTb.get(1));

		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			driver.findElement(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div.sc-jeGTLq.eAmDAT > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.kyhqia"))
					.click();
		}

		catch (Exception e) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			driver.findElement(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div.sc-higWrZ.rlnin > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII"))
					.click();

		}

	}

	public void ETHDEPOSIT(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		WebDriverWait wait = new WebDriverWait(driver, 20);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sc-ehSDrC
		// div:nth-of-type(1) .dAlUnL")));
		
		driver.navigate().refresh();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#ethAmount")));

		driver.findElement(By.cssSelector("input#ethAmount")).sendKeys("0.5");

		// Click on procedd button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Deposit']")));

		driver.findElement(By.xpath("//*[text()='Deposit']")).click();

		driver.switchTo().window(newTb.get(0));

	}
	
	public void depositandtakeloan(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Deposit / Borrow']")));

		driver.findElement(By.xpath("//*[text()='Deposit / Borrow']")).click();

		// Borrowing loan

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("daiAmount")));

		driver.findElement(By.id("daiAmount")).sendKeys("100");
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Deposit & Take Loan']")));

		driver.findElement(By.xpath("//*[text()='Deposit & Take Loan']")).click();


	}

	public void metamaskdisconnection(ChromeDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-pGacB jkQiiZ']")));

		driver.findElement(By.xpath("//*[@class='sc-pGacB jkQiiZ']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Disconnect Wallet']")));

		driver.findElement(By.xpath("//*[text()='Disconnect Wallet']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect Wallet'][1]")));

		driver.findElement(By.xpath("//*[text()='Connect Wallet'][1]")).click();

	}

	public void viewonetherscan(ChromeDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-pGacB jkQiiZ']")));

		driver.findElement(By.xpath("//*[@class='sc-pGacB jkQiiZ']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='View on Etherscan']")));

		driver.findElement(By.xpath("//*[text()='View on Etherscan']")).click();

	}

	public void copylink(ChromeDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-pGacB jkQiiZ']")));

		driver.findElement(By.xpath("//*[@class='sc-pGacB jkQiiZ']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Copy Address']")));

		driver.findElement(By.xpath("//*[text()='Copy Address']")).click();

	}

	public void Borrowloan(ChromeDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Deposit / Borrow']")));

		driver.findElement(By.xpath("//*[text()='Deposit / Borrow']")).click();

		// Borrowing loan

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("daiAmount")));

		driver.findElement(By.id("daiAmount")).sendKeys("100");

		// Procedd button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Take Loan']")));

		driver.findElement(By.xpath("//*[text()='Take Loan']")).click();

	}

	public void confirmbuttton(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));

		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();
		}

		catch (Exception E3) {
			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

		}

	}
	public void Rejectionbutton(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));

		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Reject']")));

			driver.findElement(By.xpath("//*[text()='Reject']")).click();
		}

		catch (Exception E3) {
			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Reject']")));

			driver.findElement(By.xpath("//*[text()='Reject']")).click();

		}

	}

	public void Aftertransactionloan(ChromeDriver driver) throws IOException {

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
		List<WebElement> Loanamount = driver.findElements(By.cssSelector(p.getProperty("Loan")));

		for (WebElement Loanamountbalance : Loanamount) {

			String Loanbalance = Loanamountbalance.getText();

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Lbalance = Loanbalance;

			String AETHbalance1 = Lbalance.replace("$", "");

			System.out.println("After Borrow Loan Amount = " + Lbalance);

		}
	}

	public void Beforetransactionloan(ChromeDriver driver) throws IOException {

		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> Loanamount = driver.findElements(By.cssSelector(p.getProperty("Loan")));

		for (WebElement Loanamountbalance : Loanamount) {

			String Loanbalance = Loanamountbalance.getText();

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Lbalance = Loanbalance;
			String AETHbalance1 = Lbalance.replace("$", "");

			System.out.println("Before borrow Loan Amount = " + Lbalance);

		}

	}

	public void repayloan(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay / Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

		// repay Loan

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("daiAmount")));

		driver.findElement(By.id("daiAmount")).sendKeys("50");

		// proceed

		// Click on proceed button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay']")));

		driver.findElement(By.xpath("//*[text()='Repay']")).click();
	}

	public void unapprovedtransaction(ChromeDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Unapproved']")));
			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

		}

		catch (Exception e6) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Unapproved']")));
			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

		}
	}

	public void withdrawcolletral(ChromeDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Repay button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay / Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

		// with draw colletral

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ethAmount")));

		driver.findElement(By.id("ethAmount")).sendKeys("0.5");

		// Click on procedd button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Withdraw']")).click();
	}
	
	public void repaywithdrawreject(ChromeDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);


		// with draw colletral

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ethAmount")));

		driver.findElement(By.id("ethAmount")).sendKeys("0.5");

		// Click on procedd button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-gsTEea sc-gVgoRu kPwtkQ jgbTWw']")));

		driver.findElement(By.xpath("//*[@class='sc-gsTEea sc-gVgoRu kPwtkQ jgbTWw']")).click();
	}

	public void calcualteborrowlimitamount(ChromeDriver driver) throws IOException {
		
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);

		// Borrow limit amount = (loan / (loan + borrow limit amount)) * 100

		// Get Loan value

		// Get Borrow limit amount then calculate

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> Loan = driver.findElements(By.cssSelector(p.getProperty("Loan")));

		for (WebElement Loa : Loan) {

			String LOANAMOUNT = Loa.getText();

			String MM = LOANAMOUNT;

			String spaces = MM.replaceAll("\\s", "");

			String result = spaces.replaceAll("[$,%]", "");

			Double d1 = Double.valueOf(result);

			// System.out.println("Loan amount =" + d1);

			// Borrow Limit amount

			List<WebElement> ratio111 = driver.findElements(By.cssSelector(p.getProperty("Borrowlimitamount")));

			for (WebElement rati12 : ratio111) {

				String rat12 = rati12.getText();

				String BLA = rat12;

				String BLV1 = BLA.replace("DAI", "");

				String spaces1 = BLV1.replaceAll("\\s", "");

				String BLV = BLV1.replace(",", "");

				double d = Double.parseDouble(BLV);

				// System.out.println("Borrow lmit amount =" + d);

				double d3 = d + d1;

				double d4 = d1 / d3;

				double d5 = d4 * 100;

				System.out.println("Borrow limit = " + d5);

				double value = d5;

				value = Double.parseDouble(new DecimalFormat("##.##").format(value));

				System.out.println("Borrow limit =" + value);

				String Bl = Double.toString(value);

				String BLimit = Bl.split("\\.", 2)[0];

				System.out.println(BLimit);

				// comparing the application values and expected values

				List<WebElement> Loan1 = driver.findElements(By.cssSelector(p.getProperty("Applicationborrowlimit")));

				for (WebElement Limit : Loan1) {

					String Borrow = Limit.getText();

					String BLoan = Borrow;

					String BL = BLoan.replace("%", "");

					String BLimit1 = BL.split("\\.", 2)[0];
					
					System.out.println(BLimit1);

					// Comparing the values excepted and actual

					if (BLimit.equals(BLimit1)) {
						System.out.println("Test case PASS");
					} else {
						System.out.println("Test case FAIL");
					}

				}
			}

		}

	}

	public void Healthratio(ChromeDriver driver) throws IOException {
		
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);
		

		// Health ratio = ( collettral in usd * ethercolletram factor )/ (loan -
		// uncommiteed harvest )
		WebDriverWait wait = new WebDriverWait(driver, 15);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-gImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> Loan = driver.findElements(By.cssSelector(p.getProperty("Loan")));

		for (WebElement Loa : Loan) {

			String LOANAMOUNT = Loa.getText();

			String MM = LOANAMOUNT;

			String spaces = MM.replaceAll("\\s", "");

			String result = spaces.replaceAll("[$,%]", "");

			Double Loan1 = Double.valueOf(result);

			// Colletral amount

			List<WebElement> Colletralamount = driver.findElements(By.cssSelector(p.getProperty("Collateralamount")));

			for (WebElement Camount : Colletralamount) {

				String Collamount = Camount.getText();

				String CA = Collamount;

				String spaces1 = CA.replaceAll("\\s", "");

				String BLV1 = spaces1.replaceAll("[$,%]", "");

				double Dcolletralamount = Double.parseDouble(BLV1);

				double cthrefactor = 0.60;

				double uncommitedharvest = 0.00;

				double Healthratio = (Dcolletralamount * cthrefactor) / (Loan1 - 0);

				double value = Healthratio;

				value = Double.parseDouble(new DecimalFormat("##.##").format(value));

				String s6 = Double.toString(value);

				System.out.println("Health Ratio " + s6);

				// Getting application health ratio value

				List<WebElement> HRV = driver.findElements(By.cssSelector(p.getProperty("Applicationhealthratio")));

				for (WebElement HR : HRV) {

					String Health = HR.getText();

					String Health2 = Health.replaceAll("\\s+", "");

					System.out.println(Health2);

					double Health3 = Double.valueOf(Health2);

					if (Health3 == value) {
						System.out.println(
								"Application value and calculation value both are same that why = Test case Pass");
					} else {
						System.out.println(
								"Application value and calculation value both are same that why =Test case Fail");
					}

				}
			}
		}
	}

	public void calculateBorrowingpower(ChromeDriver driver) throws IOException {
		
		

//	Borrowingpower = (loan / collateral ) * cether collateral factor

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
		List<WebElement> Loan =  driver.findElements(By.cssSelector(p.getProperty("Loan")));

		for (WebElement Loa : Loan) {

			String LOANAMOUNT = Loa.getText();

			String LOANAMOUNT1 = LOANAMOUNT;

			String LOANAMOUNT2 = LOANAMOUNT1.replaceAll("\\s+", "");

			String LOANAMOUNT3 = LOANAMOUNT2.replaceAll("[$,%]", "");

			String main = LOANAMOUNT3.replaceAll("\\s+", "");

			Double Loan1 = Double.valueOf(main);

			System.out.println("Loan amount =" + Loan1);

			// Colletral amount

			List<WebElement> Colletralamount = driver.findElements(By.cssSelector(p.getProperty("Collateralamount")));
				

			for (WebElement Camount : Colletralamount) {

				String Collamount = Camount.getText();

				String CA = Collamount;

				// System.out.println("======================"+ CA);

				String BLV1 = CA.replaceAll("[$,%]", "");

				String spaces = BLV1.replaceAll("\\s", "");

				double Dcolletralamount = Double.parseDouble(spaces);

				// System.out.println("Borrow lmit amount =" + Dcolletralamount);

				// Borrowingpower = (loan / collateral ) * cether collateral factor

				double cethercolletralfactor = 0.8;

				double LCA = (Loan1 / Dcolletralamount) * cethercolletralfactor;

				double d6 = LCA * 100;

				double value = d6;

				value = Double.parseDouble(new DecimalFormat("##.##").format(value));

				System.out.println("Borrowing power = " + value);

				String total2 = Double.toString(value);

				String BP2 = total2.split("\\.", 2)[0];

				System.out.println("Final borrowing power value " + BP2);

				// Application borrowing value

				List<WebElement> bPower = driver.findElements(By.cssSelector(p.getProperty("Applicationborrowingpower")));

				for (WebElement powerborrowing : bPower) {

					String Bpower1 = powerborrowing.getText();

					String Bpower2 = Bpower1.replaceAll("\\s", "");

					String Bpower3 = Bpower2.replaceAll("[$,%]", "");

					System.out.println(Bpower3);

					// double Bpower4 = Double.parseDouble(Bpower3);

					if (BP2.equals(Bpower3)) {
						System.out.println(
								"Comparing calculation value and application value both are same = Test case PASS");
					} else {
						System.out.println(
								" Comparing calculation value and application value both are same = Test case FAil");
					}
				}
			}
		}

	}

	public void Maxrepayloan(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay / Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

		// Max button

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("[action] .fdXzIF:nth-of-type(2) .sc-gVgoRu")));

		driver.findElement(By.cssSelector("[action] .fdXzIF:nth-of-type(2) .sc-gVgoRu")).click();

		// proceed

		// Click on proceed button

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Proceed']")));
//
//		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	}

	public void Maxwithdraw(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay / Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

		// Max button

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("[action] .fdXzIF:nth-of-type(2) .sc-gVgoRu")));

		driver.findElement(By.cssSelector("[action] .fdXzIF:nth-of-type(2) .sc-gVgoRu")).click();

		// proceed

		// Click on proceed button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Proceed']")));

		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	}

	public void Stake(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Stake']")));

		driver.findElement(By.xpath("//*[text()='Stake']")).click();

	}
	public void Stakewithdraw(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-fvFlGH cOuUoR']")));
		
		WebElement stakewithdraw= driver.findElement(By.xpath("//*[@class='sc-fvFlGH cOuUoR']"));
		
		stakewithdraw.click();
	}
	
	public void requestwithdrawbutton(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-gsTEea sc-cAxRzm kPwtkQ dMQbPm'][1]")));

		WebElement element = driver.findElement(By.xpath("//*[@class='sc-gsTEea sc-cAxRzm kPwtkQ dMQbPm'][1]"));
		
		element.click();

	}
	
	
	public void StakeETHdeposit(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ethAmount")));

		driver.findElement(By.id("ethAmount")).sendKeys("2");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));

		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

	public void StakeETHdepositmax(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ethAmount")));

		driver.findElement(By.id("ethAmount")).sendKeys("200");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));

		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

	public void Stakevaluterror(ChromeDriver driver) throws IOException {

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

		List<WebElement> Borrowlimitamount = driver.findElements(By.cssSelector(p.getProperty("Stakedamountvalutreached")));

		for (WebElement Borrowlimitamount1 : Borrowlimitamount) {

			String errormessage2 = Borrowlimitamount1.getText();
			


				String Actual = "Vault limit reached";

				if (Actual.equals(errormessage2)) {
					System.out.println("Test case PASS");
				} else {
					System.out.println("Test case FAIL");
				}
			}
	}

	public void withdrawamountzero (ChromeDriver driver) throws IOException {

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

		List<WebElement> Borrowlimitamount = driver.findElements(By.cssSelector(p.getProperty("Stakeamountzero")));

		for (WebElement Borrowlimitamount1 : Borrowlimitamount) {

			String errormessage2 = Borrowlimitamount1.getText();
			


				String Actual = "Amount cannot be 0";

				if (Actual.equals(errormessage2)) {
					System.out.println("Test case PASS");
				} else {
					System.out.println("Test case FAIL");
				}
			}
	}

	public void errormessage(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bsfnEV.sc-dIUeWJ
		// img[alt='close']")));

		List<WebElement> Availl = driver.findElements(By.cssSelector("form > div:nth-of-type(2)"));

		for (WebElement ava1 : Availl) {

			String ball = ava1.getText();

			// System.out.println("===" + ball);

			String SS1 = ball.substring(9, 15);

			String AA1 = "Enter value of eth token";

			if (AA1.equals(SS1)) {
				System.out.println("Test case pass");
			} else {
				System.out.println("Test case Fail");
			}

		}
	}

	public void Loantovalue(ChromeDriver driver) throws IOException

	{

		// Loan to value = loan/colletral *100

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
		List<WebElement> Loan = driver
				.findElements(By.cssSelector(".bmhFje:nth-of-type(1) .cfDMUy:nth-of-type(2) .sc-nFqVA"));

		for (WebElement Loa : Loan) {

			String LOANAMOUNT = Loa.getText();

			// System.out.println(LOANAMOUNT);

			String MM = LOANAMOUNT;

			// System.out.println("++++++++++++++" + MM);

			// String MM2 = MM.replace("$", "");

			String main = MM.replaceAll("\\s+", "");

			String ss = main.trim();

			String result = ss.replaceAll("[$,]", "");

			Double Loan1 = Double.parseDouble(result);

			// System.out.println("Loan amount =" + Loan1);

			// Colletral amount

			List<WebElement> Colletralamount = driver
					.findElements(By.cssSelector(".bmhFje:nth-of-type(1) .cfDMUy:nth-of-type(1) .sc-nFqVA"));

			for (WebElement Camount : Colletralamount) {

				String Collamount = Camount.getText();

				String CA = Collamount;

				String spaces = CA.replaceAll("\\s", "");

				String AMount = spaces.replaceAll("[$,]", "");

				String SS = AMount.trim();

				double Dcolletralamount = Double.parseDouble(SS);

				// System.out.println("Colletral amount =" + Dcolletralamount);

				double loantovalue = (Loan1 / Dcolletralamount) * 100;

				double value = loantovalue;

				value = Double.parseDouble(new DecimalFormat("##.##").format(value));

				// System.out.println("Loan to value = " + value);

				// Getting application value loan to value and comparing

				List<WebElement> Loantovalue2 = driver.findElements(By.cssSelector(".hfQZUe:nth-of-type(5) .sc-nFqVA"));

				for (WebElement Loantovalue3 : Loantovalue2) {

					String Loantovalue4 = Loantovalue3.getText();

					String Loantovalue5 = Loantovalue4;

					String Loantovalue6 = Loantovalue5.replaceAll("\\s", "");

					String Loantovalue7 = Loantovalue6.replaceAll("[$,%]", "");

					double Loantovalue8 = Double.parseDouble(Loantovalue7);

					if (value == Loantovalue8) {
						System.out.println(
								"Comparing calculation value and application value both are same = Test case PASS");
					} else {
						System.out.println(
								" Comparing calculation value and application value both are same = Test case PASS = Test case FAil");
					}
				}

			}
		}

	}

	public void TotalBorrowlimitamount(ChromeDriver driver) throws IOException

	{

		// Loan to value = loan/colletral *100

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		Properties p = new Properties();

		FileInputStream fi = new FileInputStream(".//All.properties");

		p.load(fi);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-cd(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}

		driver.findElement(By.xpath("//*[text()='Deposit / Borrow']")).click();

		List<WebElement> TBLV = driver.findElements(By.cssSelector(p.getProperty("Borrowlimitamount")));

		for (WebElement BLV : TBLV) {

			String LOANAMOUNT = BLV.getText();

			// System.out.println(LOANAMOUNT);

			String MM = LOANAMOUNT;

			// System.out.println("++++++++++++++" + MM);

			String MM2 = MM.replace("DAI", "");

			String MM3 = MM2.replace(",", "");

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("daiAmount")));

			driver.findElement(By.id("daiAmount")).sendKeys(MM3);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Take Loan']")));

			driver.findElement(By.xpath("//*[text()='Take Loan']")).click();

		}
	}

	public void BeforeStakedamount(ChromeDriver driver) throws IOException {

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

		List<WebElement> Stakedamount = driver.findElements(By.cssSelector(p.getProperty("Stakedamount")));

		for (WebElement Stakedamount1 : Stakedamount) {

			String Stakedamount2 = Stakedamount1.getText();

			System.out.println("Before transaction Staked amount =" + Stakedamount2);

		}
	}
	

	public void afterStakedamount(ChromeDriver driver) throws IOException {

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

		List<WebElement> Stakedamount = driver.findElements(By.cssSelector(p.getProperty("Stakedamount")));

		for (WebElement Stakedamount1 : Stakedamount) {

			String Stakedamount2 = Stakedamount1.getText();

			System.out.println("Before transaction Staked amount =" + Stakedamount2);

		}
	}

	public void Staketransactionsuccess(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.switchTo().window(newTb.get(1));

		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			driver.findElement(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div.sc-gLnszc.bZnaLz > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII"))
					.click();
		}

		catch (Exception e) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			driver.findElement(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div.sc-gLnszc.bZnaLz > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII"))
					.click();

		}

	}
	public void transactionfailure(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.switchTo().window(newTb.get(1));

		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Failure']")));

			driver.findElement(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div.sc-higWrZ.rlnin > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII > img"))
					.click();
		}

		catch (Exception e) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Failure']")));

			driver.findElement(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div.sc-higWrZ.rlnin > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII > img"))
					.click();

		}

	}
	public void takesscreenshot(ChromeDriver driver) throws IOException {

		// WebDriverWait wait = new WebDriverWait(driver, 20);
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");

		String timestamp = sdf.format(d);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		// FileUtils.copyFile(source, new File(".//Screenshots//"+
		// System.currentTimeMillis()+ ".jpg"));

		FileUtils.copyFile(source, new File(".//Screenshots//" + timestamp + ".jpg"));

	}
}