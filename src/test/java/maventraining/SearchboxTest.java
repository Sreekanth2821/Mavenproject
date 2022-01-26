package maventraining;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchboxTest {
	
	static WebDriver driver=null;
	
	
	@BeforeTest
	public static void Websiteenter() {
		
		driver=Searchbox.browseropen();
		Searchbox.websiteenter(driver, "http://www.tutorialsninja.com/demo/");
	}

	
	@Test
		public static void enterdetails() {
			
			Searchbox.Searchdetails(driver, "search", "iphone");
			
		}
	
	@AfterTest
	public static void Close() {
		
		Searchbox.Closebrowser(driver);
	}
	
	

	
	}
	
	
	

