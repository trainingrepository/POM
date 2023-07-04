package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver) {
		driver1=driver;

	}
	
	public CreateLeadPage enterFirstName() {
		driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("test");
		return this;
		//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("999");
	
	}
	public CreateLeadPage enterLastName() {
		driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("user1");
		return this;
	}
	public CreateLeadPage enterCompanyName() {
		driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		return this;
	}
	public ViewLeadPage clickCreateLeadButton() {
		driver1.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver1);

	}

}
