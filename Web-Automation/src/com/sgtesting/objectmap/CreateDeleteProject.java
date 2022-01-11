package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDeleteProject {
	private static WebDriver wb = null;
	private static ObjectMap obj = null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigateApplication();
		login();
		FlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
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
			Thread.sleep(3000);
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
	
	private static void createProject()
	{
		try
		{
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("TaskAddNewBtn")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("TaskNewProject")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("ProjectNameFiled")).sendKeys("Project_QA");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("ProjectDescriptionField")).sendKeys("This is project 1 to execute 500 test cases");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("ProjectCreateProjectBtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("ProjectSettingBtn")).click();
			Thread.sleep(6000);
			wb.findElement(obj.getLocator("ProjectActionBtn")).click();
			Thread.sleep(5000);
			wb.findElement(obj.getLocator("ProjectDeleteBtn")).click();
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("ProjectDeletePerBtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			Thread.sleep(3000);
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
