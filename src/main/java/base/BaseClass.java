package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  ChromeDriver driver1;
	
	@BeforeMethod
	public  void precondition() {
		// open browser
		
		WebDriverManager.chromedriver().setup();
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		//driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch application url
		driver1.get("http://leaftaps.com/opentaps/");

	}
	
	@AfterMethod
	public  void postcondition() {
		// close browser
		driver1.close();
	}
}
