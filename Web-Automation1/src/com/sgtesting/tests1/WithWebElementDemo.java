package com.sgtesting.tests1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithWebElementDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
	}
	
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:83/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		WebElement oEle=null;
		try
		{
			oEle=oBrowser.findElement(By.id("username"));
			oEle.sendKeys("DemoUser1");
			Thread.sleep(2000);
			oEle.clear();
			Thread.sleep(2000);
			oEle.sendKeys("DemoUser2");
			Thread.sleep(2000);
			oEle.clear();
			Thread.sleep(2000);
			oEle.sendKeys("DemoUser3");
			Thread.sleep(2000);
			oEle.clear();
			Thread.sleep(2000);
			oEle.sendKeys("DemoUser12345");
			Thread.sleep(2000);
			String val=oEle.getAttribute("value");
			System.out.println(val);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
