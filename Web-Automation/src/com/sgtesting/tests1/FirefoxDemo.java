package com.sgtesting.tests1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
	private static WebDriver oBrowser = null;
    public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();
	}

	private static void launchBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser = new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeApplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
