package MINTPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OpsNewSubmission {
	
	public static WebElement  New_Submission(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		return element;

}
	
	
	//public static WebElement Actions(WebDriver driver) {
		
		//WebElement element= driver.findElement(By.xpath("//span[@class='sk-button-text' and text()='ACTIONS']"));
		//WebElement element= driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/div/section/div/div/div/div/a/span"));
		//return element;
		
			
	//}
	
	public static WebElement  UW_Company(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='sk-app']/div[@id='sk-page']/main[@id='sk-main']/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		return element;
	
	
	
}
	
	public static WebElement  Major_class(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='sk-app']/div[@id='sk-page']/main[@id='sk-main']/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		return element;
}
	
	public static WebElement  Minor_class(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='sk-app']/div[@id='sk-page']/main[@id='sk-main']/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]"));
		return element;
		
	}
	
	public static WebElement  Placing_basis(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='sk-app']/div[@id='sk-page']/main[@id='sk-main']/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]"));
		return element;
		
	}
	
	//Applicant information
	
	public static WebElement Named_Insured_Search(WebDriver driver) {
		
		WebElement element= driver.findElement(By.xpath("//input[@placeholder='Search for Name Insured by name or Address']"));
		//WebElement element= driver.findElement(By.xpath("//input[@class='sk-input  sk-input--iconnized  react-autosuggest__input']"));
	
		return element;
	}
	
	//Broker Information
	
	public static WebElement Brokerage_Name(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//div[@class='react-select__input-container']/input[@class='react-select__input']"));
		//WebElement element = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='sk-app']/div[@id='sk-page']/main[@id='sk-main']/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]));		
		return element;
		
				
		
	}
	
	
	public static WebElement Branch(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Default Brokerage New York')]"));
		return element;
			
	}
	
	public static WebElement Search_Broker(WebDriver driver) {
		
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'innhamiltontest@gmail.com')]"));
		return element;
	}
	
	//Basic Information
	
	public static WebElement Received_date(WebDriver driver) {
//<i class="fal fa-calendar-alt  sk-datepicker-icon  sk-input-icon" title="Received Date" xpath="1"></i>
		WebElement element = driver.findElement(By.xpath("//input[@id='GenericSubmission-BasicInformation-Received']"));
		return element;
		
		
	}
	
	public static WebElement Effective_date(WebDriver driver) {
		WebElement element= driver.findElement(By.xpath("//body/div[@id='root']/div[@id='sk-app']/div[@id='sk-page']/main[@id='sk-main']/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/i[1]"));
		return element;
		
		
		
	}
	
	public static WebElement AssignUW_Btn(WebDriver driver) {
		WebElement element= driver.findElement(By.xpath("//span[contains(text(),'ASSIGN TO UNDERWRITER POOL & EXIT')]"));
		return element;
			
	}
	

	public static WebElement LogoutOPS_Btn(WebDriver driver) {
		WebElement element= driver.findElement(By.xpath("//header/nav[@id='sk-toolbar']/div[1]/ul[2]/li[2]/a[1]/i[1]"));
		return element;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	
	
}