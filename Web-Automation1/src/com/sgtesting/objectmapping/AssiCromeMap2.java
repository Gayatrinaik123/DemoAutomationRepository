package com.sgtesting.objectmapping;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiCromeMap2 {
  public static String filename="E:\\ExampleAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\objectmapping\\objectmap.properties";
  public static ObjectMap objmap=new ObjectMap(filename);
  public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lounchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}
	private static void lounchBrowser()
	{
		
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow() {
		try {
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try {
			oBrowser.findElement(objmap.getLocator("homepageuser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("userpageadduser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("AdduserFirstname")).sendKeys("gayatri");
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("Adduserlastname")).sendKeys("demo1");
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("Adduseremail")).sendKeys("gayu@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("Adduserusername")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("Adduserpassword")).sendKeys("welcome");
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("Addusercopypassword")).sendKeys("welcome");
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("Addusercreateuser")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try {
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("selectuser1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("AdduserFirstname")).clear();
			oBrowser.findElement(objmap.getLocator("AdduserFirstname")).sendKeys("gayatri1");
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("Adduserlastname")).clear();
			oBrowser.findElement(objmap.getLocator("Adduserlastname")).sendKeys("demo2");
			Thread.sleep(1000);
			oBrowser.findElement(objmap.getLocator("savechanges")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try {
			oBrowser.findElement(objmap.getLocator("selectuser1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deleteuser1")).click();
			Thread.sleep(2000);
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(2000);
			oa.accept();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    private static void closeApplication()
    {
    	try {
    		oBrowser.close();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	


}
