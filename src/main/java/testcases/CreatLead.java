package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateLeadPage;
import pages.LoginPage;

public class CreatLead extends BaseClass {
	@Test
	public void runCreatLead() {
		
		new LoginPage(driver1)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickCreateLeadButton()
		.verifyFirstName();
	}

}
