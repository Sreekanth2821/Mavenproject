package maventraining;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {
	
	public static WebDriver byjushandle(String url) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kcsm6\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
	
	public static void anotherwindow(WebDriver driver,String path) {
		
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.SHIFT).build().perform();
		ac.click(driver.findElement(By.xpath(path))).build().perform();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> ite = window.iterator();
		String parentwindow = driver.getWindowHandle();
		while(ite.hasNext()) {
			String windowid = ite.next();
			if(!windowid.equals(driver.getWindowHandle())) {
				driver.switchTo().window(parentwindow);
			}
		}
		
		
		

		
	}
	
	

}
