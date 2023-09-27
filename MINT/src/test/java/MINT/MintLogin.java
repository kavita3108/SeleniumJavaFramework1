package MINT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MintLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavit\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//ChromeDriver driver =new ChromeDriver();
		driver.get("https://skye1.dev2.hamilton.innoveo-skye.net/page/internal/en/US/index.html");
		driver.findElement(By.id("sk-auth")).sendKeys("innhamiltontest+ops@gmail.com");
		WebElement textBox = driver.findElement(By.id("sk-auth"));
		textBox.sendKeys("innhamiltontest+ops@gmail.com");
		WebElement textBox1 = driver.findElement(By.id("sk-auth"));
		textBox1.sendKeys("innhamiltontest+ops@gmail.com");
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("innhamiltontest+ops@gmail.com");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
		//driver.finElement(By.xpath)("//input[@id='sk-auth').click();
		
		//String title =driver.getTitle();
		//System.out.println(title.length());
		//System.out.println(title);
		//driver.close();
		//driver.quit();
			}

		

	}


