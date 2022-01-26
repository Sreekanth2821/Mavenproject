package maventraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OneTest {

	@Test
	public static void methodone() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kcsm6\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.tutorialsninja.com/demo/");
		String actualtext = driver.findElement(By.xpath("//a[text()='Your Store']")).getText();
		System.out.println(actualtext);
		driver.close();
		
	}
}
