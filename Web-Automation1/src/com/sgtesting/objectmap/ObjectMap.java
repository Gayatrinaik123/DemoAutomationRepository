package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

public class ObjectMap {
	public static Properties prop = null;
	FileInputStream fin = null;

	public ObjectMap(String fileName) {
		try {
			fin = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fin);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public By getLocator(String logicalname) {
		By by = null;
		try {
			String locator = prop.getProperty(logicalname);
			System.out.println(locator);
			Pattern pat = Pattern.compile("[|]");
			String[] locatorDetails = pat.split(locator);
			String locatorname = locatorDetails[0];
			String locatorValue = locatorDetails[1];
			String loc = locatorname;
			if (loc.equalsIgnoreCase("id")) {
				by = By.id(locatorValue);
			} else if (loc.equalsIgnoreCase("name")) {
				by = By.name(locatorValue);
			} else if (loc.equalsIgnoreCase("tagname")) {
				by = By.tagName(locatorValue);
			} else if (loc.equalsIgnoreCase("cssselector")) {
				by = By.cssSelector(locatorValue);
			} else if (loc.equalsIgnoreCase("xpath")) {
				by = By.xpath(locatorValue);
			} else if (loc.equalsIgnoreCase("linktext")) {
				by = By.linkText(locatorValue);
			} else if (loc.equalsIgnoreCase("classname")) {
				by = By.className(locatorValue);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return by;
	}
}
