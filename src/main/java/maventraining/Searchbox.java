package maventraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbox {
	
	public static WebDriver browseropen() {
		System.setProperty("webdriver.chrome.driver", "F:\\kcsm6\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	public static void websiteenter(WebDriver driver,String url) {
		driver.get(url);
		
	}
	
	public static void Searchdetails (WebDriver driver,String path,String value) {
		
		driver.findElement(By.name(path)).sendKeys(value);
		driver.findElement(By.xpath("//button[@type='button']/parent::span")).click();
		
		
	}
	
	
	public static void Closebrowser(WebDriver driver) {
		driver.close();
		
	}
	
	
	
	
	
	
	

}
