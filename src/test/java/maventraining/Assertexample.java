package maventraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertexample {
	WebDriver driver=null;
	@Test
	public void assertmethod() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kcsm6\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		String actualtitle = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")).getText();
		String exceptedtitle = "Google Search";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualtitle, exceptedtitle);
		driver.close();
		
		
	}
	
	

}
