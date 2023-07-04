package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	//action+ElementName
	
	public LoginPage(ChromeDriver driver) {
		this.driver1=driver;
	}

	@Given  ("enter username as 'DemoSalesManager'")
	public LoginPage enterUsername() {
		driver1.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
	}
	 public  LoginPage enterPassword() {
		 driver1.findElement(By.id("password")).sendKeys("crmsfa");
		 	return this;
		
	}
	 public HomePage clickLoginButton() {
		 driver1.findElement(By.className("decorativeSubmit")).click();
		 HomePage hp=new HomePage(driver1);
		return hp;
	}
}

