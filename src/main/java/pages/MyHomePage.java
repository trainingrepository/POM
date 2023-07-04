package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver1=driver;

	}

	public MyLeadsPage clickLeadsLink() {
		driver1.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver1);
	}
}
