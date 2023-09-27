package MINT;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MINTPageObjects.MintLoginPage;
import MINTPageObjects.OpsNewSubmission;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.concurrent.TimeUnit;


public class TestNGDemo_1 {
	WebDriver driver= null;
	
	@BeforeTest
	public void setupTest()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavit\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://skye1.dev2.hamilton.innoveo-skye.net/page/internal/en/US/index.html");
		
	}
@Test

	public void login() {
		
		//enter user name
		
		MintLoginPage.user_name(driver).sendKeys("innhamiltontest+ops@gmail.com");
		
		//enter password
		
				
		MintLoginPage.password(driver).sendKeys("Test1234");
				
		//enter login button
				
         MintLoginPage.Loginbtn_click(driver).click();
		
	}
	@AfterTest
	public void session() throws InterruptedException {
		
		// session out ok 
		Thread.sleep(10000);
			
			MintLoginPage.Session_ok(driver).click();

			Thread.sleep(5000);
		
		
	}
		
	
	
	public void newsubmission() {

		OpsNewSubmission.New_Submission(driver).click();
		driver.manage().window().maximize();
	
	
	}
	
}
	
	
	
		

		
		
		
		
		
		
		
