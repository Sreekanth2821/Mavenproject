package maventraining;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialninjaRegTest {
	static WebDriver driver=null;

	
	@BeforeTest
	public static void Websiteenter() {
		driver=TutorialninjaReg.Browseropen();
		TutorialninjaReg.Websiteenter(driver, "http://www.tutorialsninja.com/demo/");
		
		
	}
	@Test(groups= {"smoke"})
		public static void Regdetailenter() {
		
			TutorialninjaReg.Registerdetails(driver, "input-firstname", "Sreekanth");
			TutorialninjaReg.Registerdetails(driver, "input-lastname", "Pamulu");
			TutorialninjaReg.Registerdetails(driver, "input-email", "pamulusree000@gmail.com");
			TutorialninjaReg.Registerdetails(driver, "input-telephone", "8790592821");
			TutorialninjaReg.Registerdetails(driver, "input-password", "pamulu@1996");
			TutorialninjaReg.Registerdetails(driver, "input-confirm", "pamulu@1996");
			TutorialninjaReg.CheckandAgree(driver);
			
		}
	@AfterTest
	public static void Browserclosed() {
		TutorialninjaReg.Closebrowser(driver);
	}
}
