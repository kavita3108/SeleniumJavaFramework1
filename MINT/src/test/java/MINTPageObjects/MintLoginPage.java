package MINTPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MintLoginPage {
	
	public static WebElement  user_name(WebDriver driver) {
		WebElement element = driver.findElement(By.name("username"));
		return element;
		
	}
	
	public static WebElement password(WebDriver driver) {
		WebElement element= driver.findElement(By.name("password"));
		return element;
		
	}
		
	public static WebElement Loginbtn_click(WebDriver driver)
		{
			WebElement element =driver.findElement(By.xpath("//span[@class='sk-button-text' and text()='Login']"));
			return element;
		}
	public static WebElement Session_ok(WebDriver driver)
	{
		WebElement element= driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div/div/button"));
				
		return element;
	}
	}

	

