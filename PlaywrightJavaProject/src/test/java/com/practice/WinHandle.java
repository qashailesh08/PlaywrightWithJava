package com.practice;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WinHandle {
	public static void main(String[] args) {
		Playwright pl = Playwright.create();
		Browser browser = pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
		Page page = browser.newPage();
		page.navigate("https://testautomationpractice.blogspot.com/");
		Page newTab = page.waitForPopup(() -> {
			page.locator("//button[text()='New Tab']").click();
		});
		System.out.println("New Tab URL= " + newTab.url());
		System.out.println("New Tab Title= " + newTab.title());
	}

}
