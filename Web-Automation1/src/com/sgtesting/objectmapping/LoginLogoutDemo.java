package com.sgtesting.objectmapping;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
class LoginLogoutDemo {
	public static String filename = "E:\\ExampleAutomation\\Automation\\Web-Automation\\src\\com\\sgtesting\\objectmapping\\objectmap.properties";
	public static ObjectMap objmap = new ObjectMap(filename);
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		logout();
		closeApplication();

	}

	static void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void navigate() {
		try {
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void closeApplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void login() {
		try {
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin"); //(locator value)username --> admin
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			//oBrowser.findElement(prop.getProperty('username');
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(objmap.getLocator("clickonuserbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("clickonadduser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("enterfirstName")).sendKeys("demo");
			oBrowser.findElement(objmap.getLocator("enterlastName")).sendKeys("User1");
			oBrowser.findElement(objmap.getLocator("enteremail")).sendKeys("demo@gmail.com");
			oBrowser.findElement(objmap.getLocator("enterusername")).sendKeys("demoUser1"); 
			oBrowser.findElement(objmap.getLocator("enterpassword")).sendKeys("Welcome123");
			oBrowser.findElement(objmap.getLocator("entepasswordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(objmap.getLocator("clickoncreateuser")).click();
			Thread.sleep(5000);
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

	static void logout() {
		try {
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

