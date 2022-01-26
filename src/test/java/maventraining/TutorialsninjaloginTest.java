package maventraining;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialsninjaloginTest {
	static WebDriver driver=null;
	
	@BeforeTest
	public static void Websiteenter() {
		driver=Tutoriallogin.Websitedetails();
		Tutoriallogin.browserenter(driver, "http://www.tutorialsninja.com/demo/");
	}
		@Test(groups= {"smoke"})
		public static void Logindetails() {
		Tutoriallogin.Loginusername(driver, "pamulusree000@gmail.com");
		Tutoriallogin.Loginpassward(driver, "pamulu@1996");
	}
		
		
		@AfterTest
		public static void Websiteclose() {
			
			Tutoriallogin.browserleave(driver);
		}
		
		
		
		
		
		
		
		
		

}