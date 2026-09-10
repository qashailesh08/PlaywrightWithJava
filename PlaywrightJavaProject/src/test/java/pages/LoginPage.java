package pages;

import com.eva.webutil.WebUtil;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {

	@SuppressWarnings("unused")
	private final Page page;
	private final WebUtil webUtil;
	private final Locator usernameInput;
	private final Locator passwordInput;
	private final Locator loginButton;
	private final Locator errorMessage;

	public LoginPage(Page page) {
		this.page = page;
		this.webUtil = WebUtil.getInstance();
		this.usernameInput = page.locator("#Email");
		this.passwordInput = page.locator("#Password");
		this.loginButton = page.locator("#RememberMe");
		this.errorMessage = page.locator("input[value='Log in']");
	}

	public void login(String username, String password) {
		webUtil.inputValue(usernameInput, username, "Username Input");
		webUtil.inputValue(passwordInput, password, "Password Input");
		webUtil.click(loginButton, "Login Button");
	}

	public String getErrorMessage() {
		return webUtil.getText(errorMessage, "Error Message");
	}
}
