package Refi;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class complete extends metamaskconnection {

	@Test(enabled = false, priority = 1 ,description = "Meta mask connection")

	public void checkingconnection() {
		System.out.println("Connection done");

	}

	@Test(enabled = false, priority = 1  ,description = "Adding ETH 0.5")
	public void ETHdesposit() throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		Homepage page = new Homepage();

		page.Colletralbalance(driver);
		
		page.takesscreenshot(driver);

		page.ETHDEPOSIT(driver);

		page.confirmbuttton(driver);
		
		page.transactionsuccess(driver);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sc-ehSDrC div:nth-of-type(1) .grrkDB")));

		page.ColletralbalanceAfter(driver);
		
		page.takesscreenshot(driver);

	}

	@Test(enabled = false, priority = 1,description = "Meta mask Disconnection")

	public void disconn() {

		Homepage page = new Homepage();

		page.metamaskdisconnection(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Borrowing loan")

	public void Borrowloan() throws IOException {

		Homepage page = new Homepage();

		page.Beforetransactionloan(driver);

		page.Borrowloan(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		page.Aftertransactionloan(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Repay Loan")

	public void Repayloan() throws IOException {

		Homepage page = new Homepage();

		page.Beforetransactionloan(driver);

		page.repayloan(driver);

		page.confirmbuttton(driver);

		page.unapprovedtransaction(driver);

		page.transactionsuccess(driver);

		page.Aftertransactionloan(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Withdraw ETH")

	public void WithdrawETH() throws IOException {

		Homepage page = new Homepage();

		page.Colletralbalance(driver);

		page.withdrawcolletral(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		page.ColletralbalanceAfter(driver);

	}

	@Test(enabled = false, priority = 1,description = "Borrow limit calculation")

	public void Borrowlimtcalculation() throws IOException {

		Homepage page = new Homepage();

		page.calcualteborrowlimitamount(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Calculating Health ratio")

	public void Healthratio() throws IOException {

		Homepage page = new Homepage();

		page.Healthratio(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Borrowing power ")

	public void borrowingpower() throws IOException {

		Homepage page = new Homepage();

		System.out.println("calculation part ");

		page.calculateBorrowingpower(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Repay loan maximum")

	public void Repayloanmax() {

		Homepage page = new Homepage();

		page.Maxrepayloan(driver);

		page.confirmbuttton(driver);

		page.unapprovedtransaction(driver);

		page.transactionsuccess(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Max Withdraw ETH")

	public void Maxwithdraweth() {

		Homepage page = new Homepage();

		page.Maxwithdraw(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Error message validation")

	public void valulterrormessage() {

		Homepage page = new Homepage();

		page.errormessage(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "view on ETHER")

	public void viewonether() {

		Homepage page = new Homepage();

		page.viewonetherscan(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Copy link")

	public void copylink() {

		Homepage page = new Homepage();

		page.copylink(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Loan to value")

	public void loantoval() throws IOException {

		Homepage page = new Homepage();

		page.Loantovalue(driver);

	}

	@Test(enabled = false, priority = 1 ,description = "Stake page ETh")

	public void Stakepage() throws IOException {

		Homepage page = new Homepage();

		page.Stake(driver);

		page.StakeETHdeposit(driver);
		
		page.BeforeStakedamount(driver);

		page.confirmbuttton(driver);

		page.Staketransactionsuccess(driver);
		
		page.takesscreenshot(driver);
		
		page.afterStakedamount(driver);
	}
	
	@Test(enabled = false, priority = 1 ,description = "Stake page MAX withdraw")

	public void Stakepagemax() throws IOException {

		Homepage page = new Homepage();

		page.Stake(driver);

		page.StakeETHdepositmax(driver);
		
		page.BeforeStakedamount(driver);
		
		page.takesscreenshot(driver);
		
		page.Stakevaluterror(driver);
		
	}
	
	@Test(enabled = false, priority = 1 ,description = "Amount cannot be 0 ")

	public void stakewithdrawzero() throws IOException {

		Homepage page = new Homepage();

		page.Stake(driver);
		
		page.Stakewithdraw(driver);

		page.requestwithdrawbutton(driver);
		
		page.withdrawamountzero(driver);
		
		page.takesscreenshot(driver);
		
	}
	

	@Test(enabled = false, priority = 1 ,description = "All transactions")

	public void dotransaction() throws IOException {

		Homepage page = new Homepage();

		page.ETHDEPOSIT(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		page.Borrowloan(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		page.calcualteborrowlimitamount(driver);

		page.Loantovalue(driver);

		page.calculateBorrowingpower(driver);

		page.Healthratio(driver);

	}

	@Test(enabled = true, priority = 1 ,description = "Doing all transactions")

	public void Alltransactions() throws IOException {

		Homepage page = new Homepage();

		page.ETHDEPOSIT(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		System.out.println("Eth desposit successfully");

		// Borrowing loan

		page.Borrowloan(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		page.calculateBorrowingpower(driver);

		page.calcualteborrowlimitamount(driver);

		page.Loantovalue(driver);

		page.Healthratio(driver);

		System.out.println("Borrow loan  successfully");

//		// Repay loan 		
		page.repayloan(driver);

		page.confirmbuttton(driver);

		page.unapprovedtransaction(driver);

		page.transactionsuccess(driver);

		page.calcualteborrowlimitamount(driver);

		page.Loantovalue(driver);

		page.Healthratio(driver);

		System.out.println("Repay loan  successfully");
		// Total borrow limit

		page.TotalBorrowlimitamount(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		System.out.println("total borrow limit successfully");

		// Withdraw colletral
//		page.withdrawcolletral(driver);
//
//		page.confirmbuttton(driver);
//
//		page.transactionsuccess(driver);
//
//		System.out.println("with draw colletral  successfully");

	}

	@Test(enabled = false, priority = 1)

	public void totalborrowlimit() throws IOException {

		Homepage page = new Homepage(); 
			page.takesscreenshot(driver);
		

		page.TotalBorrowlimitamount(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

	}
	
	@Test(enabled = false, priority = 1 ,description = "Error message check greater that 100 plus")

	public void availablebalance() throws IOException {

		ETHdeposit ETH = new ETHdeposit(); 
		
		ETH.threedigits(driver);
		
		
		

	}
	
	@Test(enabled = false, priority = 1 ,description = "Rejections transactions")

	public void rejecttransactions() throws IOException {

		Homepage page= new Homepage();
		
		page.ETHDEPOSIT(driver);
		
		page.Rejectionbutton(driver);
		
		page.transactionfailure(driver);
		
		System.out.println("ETH deposit rejected");
		
		page.depositandtakeloan(driver);
		
		page.Rejectionbutton(driver);
	
		page.transactionfailure(driver);
		
		System.out.println("Deposit and take laon  rejected");
		
		page.repayloan(driver);
		
		page.Rejectionbutton(driver);
		
		page.transactionfailure(driver);
		
		System.out.println("Repay loan rejected");

		page.repaywithdrawreject(driver);
		
		page.Rejectionbutton(driver);
		
		page.transactionfailure(driver);
		
		System.out.println("Repay and withdraw  rejected");
	
	}
	
	@Test(enabled = false, priority = 1 ,description = "Borrow amount is more than borrow limit amount ")

	public void Borrowamountlimitreached() throws IOException {

		Dashboardpage loanamount = new Dashboardpage(); 
		
		loanamount.greaterthanborrowamount(driver);
		
		
		
		
		

	}

}
