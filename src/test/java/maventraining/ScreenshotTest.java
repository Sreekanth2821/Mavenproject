package maventraining;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;



public class ScreenshotTest {
	WebDriver driver=null;
	
	@Test(priority=1)
	public  void screenshot() throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\kcsm6\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.tutorialsninja.com/demo/");
		TakesScreenshot screenshot=  ((TakesScreenshot) driver);
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File des=new File("F:\\kcsm6\\Screenshots\\homepage.jpg");
		Files.copy(src, des);
		
		
	}
	
	@Test(priority=2)
	public void Camerascreenshot() throws IOException {
		
		driver.findElement(By.linkText("Cameras")).click();
		TakesScreenshot st=((TakesScreenshot)driver);
		File source=st.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\kcsm6\\Screenshots\\camerashot.jpg");
		Files.copy(source, dest);
	
		
	}

	
		@AfterTest
		public void closebrowser() {
		
		driver.close();

	}

}
