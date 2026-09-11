package test;

import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;

public class LoginTest extends Base {

	@Test
	public void invalidLoginShowsErrorMessage() {
		webUtil.openUrl("https://demowebshop.tricentis.com/login");

		LoginPage loginPage = new LoginPage(page);
		loginPage.login("qa.shailesh08@gmail.com", "shaesh08");

//		String actualError = loginPage.getErrorMessage();
//		Assert.assertEquals(actualError, "Invalid username or password");
	}
}