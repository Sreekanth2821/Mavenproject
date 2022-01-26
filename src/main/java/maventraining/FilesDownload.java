package maventraining;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FilesDownload {
	
	public static WebDriver browserdetails() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kcsm6\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/download-sample-test-case-template-with-explanation-of-important-fields.html");
		return driver;
	}

	public static void Pdfdownload(WebDriver driver) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		String download = "F:\\kcsm6\\seleniumdownloads";
		Map<String,Object>pref=new HashMap<>();
		pref.put("download.default_directory", download);
		options.setExperimentalOption("prefs", pref);
		driver.findElement(By.xpath("//a[@data-lasso-id='192878']")).click();
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
}
