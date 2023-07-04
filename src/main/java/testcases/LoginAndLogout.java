package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginAndLogout  extends BaseClass {

	@Test
	public void runLogins(String uName,String pWord) {
		//first action is enterusername which is available in login page
		//create object for login page
		
		LoginPage lp=new LoginPage(driver1);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomepagDisplay();

	}
}
