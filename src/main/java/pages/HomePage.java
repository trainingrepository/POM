package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(ChromeDriver driver) {
		this.driver1=driver;

	}
	
	public HomePage verifyHomepagDisplay() {
		boolean displayed = driver1.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed)
		{
			System.out.println("dispalyed");
		}
		else
		{
			System.out.println("not displayed");
		}
		
		return this;
	}
	
	public MyHomePage clickCRMSFA() {
		driver1.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver1);
		
	}
public LoginPage clickLogout() {
	driver1.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver1);
	}
}
