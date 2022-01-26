package maventraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialninjaReg {
	

	public static WebDriver Browseropen() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kcsm6\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void Websiteenter(WebDriver driver,String url) {
		driver.get(url);
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.linkText("Register")).click();
		
	}
	
	public static void Registerdetails(WebDriver driver,String xpath,String value) {
		
		driver.findElement(By.id(xpath)).sendKeys(value);
		
	}
	
	public static void CheckandAgree(WebDriver driver) {
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	public static void Closebrowser(WebDriver driver) {
		driver.close();
		
	}
	
}
