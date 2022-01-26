package maventraining;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Browserhandle {
	
	static WebDriver driver=null;
	@Test
	public static void openbrowser() {
		
	 driver=Windowhandling.byjushandle("https://byjusexamprep.com/");
		Windowhandling.anotherwindow(driver, "//a[text()='Test Series']");
		
	
		
		
	}
	
	

}
