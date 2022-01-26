package maventraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutoriallogin {
	 static WebDriver driver=null;
	
	
	public static  WebDriver Websitedetails() {
		System.setProperty("webdriver.chrome.driver", "F:\\kcsm6\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
		public static void browserenter(WebDriver driver,String url) {
			driver.get(url);
			driver.findElement(By.xpath("//span[@class='caret']")).click();
			driver.findElement(By.linkText("Login")).click();
		 
		}
	
		public static void Loginusername(WebDriver driver,String text) {
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(text);
	}
		
		public static void Loginpassward(WebDriver driver,String text) {
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(text);
		}
		
		public static void browserleave(WebDriver driver) {
			driver.close();
			
		}
		
		
		
}
