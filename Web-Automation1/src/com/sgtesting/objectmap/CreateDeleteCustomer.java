package com.sgtesting.objectmap;
// 3) LaunchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteCustomer {
	public static WebDriver wb= null;
	public static ObjectMap obj=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateApplication();
		login();
		FlyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\library\\drivers\\chromedriver.exe");
			wb= new ChromeDriver();
			obj = new ObjectMap(path+"\\ObjectMap\\objectMap.properties");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateApplication()
	{
		try
		{
			wb.get("http://localhost:83/login.do");
			wb.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void FlyOutWindow()
	{
		try
		{
			wb.findElement(obj.getLocator("HomeFlyoutWindow")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			wb.findElement(obj.getLocator("LoginAdminUserName")).sendKeys("admin");
			wb.findElement(obj.getLocator("LoginAdminPwd")).sendKeys("manager");
			wb.findElement(obj.getLocator("loginButton")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("HomeTaskTab")).click();
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("TaskAddNewBtn")).click();
			wb.findElement(obj.getLocator("TaskNewCustomer")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("CustomerNameField")).sendKeys("Accenture");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("CustomerDescription")).sendKeys("This is Project 1");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("CustomerCreateCustomerBtn")).click();
			System.out.println("Customer created successfully");
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			Thread.sleep(5000);
			wb.findElement(obj.getLocator("CustomerSettingBtn")).click();
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("CustomerActionBtn")).click();
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("CutomerDeleteBtn")).click();
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("CustomerDeletePermBtn")).click();
			System.out.println("Customer deleted successfully");
			Thread.sleep(3000);

		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			wb.findElement(obj.getLocator("HomeLogoutLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			wb.close();
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}
	}
}
