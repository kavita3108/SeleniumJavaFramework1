package MINT;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import MINTPageObjects.MintLoginPage;
import MINTPageObjects.OpsNewSubmission;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.concurrent.TimeUnit;


public class MintLoginTest {
	private static final String GetDropdown = null;
	//WebDriverWait wait = new WebDriverWait(driver, 30);
	
	//private static final String TimeSpan = null;
	private static WebDriver driver= null;

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavit\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		//ChromeDriver driver =new ChromeDriver();
		
		//Got to Mint login 
		driver.get("https://skye1.dev2.hamilton.innoveo-skye.net/page/internal/en/US/index.html");
		
		//enter user name
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("innhamiltontest+ops@gmail.com");
		MintLoginPage.user_name(driver).sendKeys("innhamiltontest+ops@gmail.com");
		
		//enter password
		
				//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
		MintLoginPage.password(driver).sendKeys("Test1234");
				
		//enter login button
				
				//driver.findElement(By.xpath("//input[@id='sk-auth']")).click();
		
		MintLoginPage.Loginbtn_click(driver).click();
		
	
	
	
		
		// session out ok 
	Thread.sleep(10000);
		
		MintLoginPage.Session_ok(driver).click();
		
		
		//driver.get("https://skye1.dev2.hamilton.innoveo-skye.net/page/internal/en/US/index.html");
		
		// Actions
		
		//OpsNewSubmission.Actions(driver);
		
		//new submission - General information
		Thread.sleep(5000);
		
		OpsNewSubmission.New_Submission(driver).click();
		driver.manage().window().maximize();
		
		
		
		// Select Underwriter company
		OpsNewSubmission.UW_Company(driver).isDisplayed();
		
		
		
		// Locate the dropdown element -Select Major class Excess Casuality
		
		
		// WebElement dropdownElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]")); // Replace with the actual ID of your dropdown
		// Select dropdown= new Select(dropdownElement);
		 //dropdown.selectByValue("Excess Casualty");

		 //dropdown.selectByIndex(2);
		// dropdown.selectByVisibleText("Excess Casualty");
		 Thread.sleep(2000);
		 
		 WebElement dropdownElement = driver.findElement(By.xpath("//input[contains(@id,'GenericSubmission-ProductDetails-MajorClass')]/preceding-sibling::div[contains(@class,'react')]"));

		// Click on the dropdown element to open the dropdown list.
		dropdownElement.click();

		// Locate the fourth option in the dropdown list.
		WebElement optionElement = driver.findElement(By.xpath("//div[@class='react-select__option-container']//div[text()='Excess Casualty']"));

		// Click on the option to select it.
		optionElement.click();
		
		

		
		//List<WebElement> allavailableoptions= dropdown.getOptions();
		//List<WebElements> alloptions =	driver.findElements(By.id("react-select-4-placeholder"));
		
	
		
		//OpsNewSubmission.Major_class(driver).isSelected();
		//OpsNewSubmission.Major_class(driver).isSelected();
		
		// Locate teh dropdown -select Minor class
		
		OpsNewSubmission.Minor_class(driver).isSelected();
		
		// select Placing basis
		
		OpsNewSubmission.Placing_basis(driver).isDisplayed();
		
		//driver.close();
		//System.out.print("Tested Login Successfully");
		
		// Search name Insured  under General information
		
		OpsNewSubmission.Named_Insured_Search(driver).sendKeys("vaibhav");
		
		OpsNewSubmission.Brokerage_Name(driver).isSelected();
		
		OpsNewSubmission.Branch(driver).isSelected();
		
		OpsNewSubmission.Search_Broker(driver).isSelected();
		
		OpsNewSubmission.Received_date(driver).isSelected();
		
		OpsNewSubmission.Effective_date(driver).isSelected();
		
		OpsNewSubmission.AssignUW_Btn(driver).isSelected();
		
		
		OpsNewSubmission.LogoutOPS_Btn(driver).click();
		
		
			}
}
	
         
		

	


