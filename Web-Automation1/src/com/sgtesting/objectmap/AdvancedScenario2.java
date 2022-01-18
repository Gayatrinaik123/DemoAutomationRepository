package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario2 {
	private static WebDriver wb = null;
	private static ObjectMap obj = null;
	public static void main(String[] args) {
		launchBrowser();
		navigateApplication();
		login(); //login admin
		FlyOutWindow();
		createUser1(); //create user 1
		logout(); //logout admin
		LoginUser1(); // login user 1
		createUser2(); // create user 2
		logout(); //logout User 1
		LoginUser2(); // login user 2
		createUser3(); //create user 3
		logout();
		LoginUser3();
		logout();
		LoginUser2();
		modifyUser3();
		logout();
		ModiLoginUser3();
		logout();
		LoginUser1();
		modifyUser2();
		logout();
		ModiLoginUser2();
		logout();
		login();
		modifyUser1();
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
			wb.get("http://localhost:82/login.do");
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
	
	private static void createUser1()
	{
		try
		{
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("HomeUserTab")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserAddUserBtn")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserFirstnameTextField")).sendKeys("Tom");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserLastnameTextField")).sendKeys("User 1");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserEmailTextField")).sendKeys("abs@gmail.com");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserUsernameTextField")).sendKeys("Tom");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserPasswordTextFiled")).sendKeys("abs");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserRePasswordTextField")).sendKeys("abs");
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("UserCreateUserBtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginUser1()
	{
		try
		{
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("LoginAdminUserName")).sendKeys("Tom");
			wb.findElement(obj.getLocator("LoginAdminPwd")).sendKeys("abs");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("loginButton")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("StartExploreLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginUser2()
	{
		try
		{
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("LoginAdminUserName")).sendKeys("Jerry");
			wb.findElement(obj.getLocator("LoginAdminPwd")).sendKeys("abs");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("loginButton")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("StartExploreLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginUser3()
	{
		try
		{
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("LoginAdminUserName")).sendKeys("Sherlock");
			wb.findElement(obj.getLocator("LoginAdminPwd")).sendKeys("abs");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("loginButton")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("StartExploreLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser2()
	{
		try
		{
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("HomeUserTab")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserAddUserBtn")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserFirstnameTextField")).sendKeys("Jerry");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserLastnameTextField")).sendKeys("User 2");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserEmailTextField")).sendKeys("abs@gmail.com");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserUsernameTextField")).sendKeys("Jerry");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserPasswordTextFiled")).sendKeys("abs");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserRePasswordTextField")).sendKeys("abs");
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("UserCreateUserBtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser3()
	{
		try
		{
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("HomeUserTab")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserAddUserBtn")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserFirstnameTextField")).sendKeys("Sherlock");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserLastnameTextField")).sendKeys("User 3");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserEmailTextField")).sendKeys("abs@gmail.com");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserUsernameTextField")).sendKeys("Sherlock");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserPasswordTextFiled")).sendKeys("abs");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserRePasswordTextField")).sendKeys("abs");
			Thread.sleep(3000);
			wb.findElement(obj.getLocator("UserCreateUserBtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser3()
	{
		try
		{
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("HomeUserTab")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("User2Link")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserPasswordTextFiled")).sendKeys("abc");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserRePasswordTextField")).sendKeys("abc");
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("UserSaveChangesBtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser2()
	{
		try
		{
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("HomeUserTab")).click();
			//Thread.sleep(2000);
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("User2Link")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserPasswordTextFiled")).sendKeys("abc");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserRePasswordTextField")).sendKeys("abc");
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("UserSaveChangesBtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser1()
	{
		try
		{
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("HomeUserTab")).click();
			//Thread.sleep(2000);
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("User1Link")).click();
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserPasswordTextFiled")).sendKeys("abc");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("UserRePasswordTextField")).sendKeys("abc");
			Thread.sleep(4000);
			wb.findElement(obj.getLocator("UserSaveChangesBtn")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void ModiLoginUser3()
	{
		try
		{

			Thread.sleep(4000);
			wb.findElement(obj.getLocator("LoginAdminUserName")).sendKeys("Sherlock");
			wb.findElement(obj.getLocator("LoginAdminPwd")).sendKeys("abc");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("loginButton")).click();
			Thread.sleep(2000);
//			wb.findElement(obj.getLocator("StartExploreLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void ModiLoginUser2()
	{
		try
		{

			Thread.sleep(4000);
			wb.findElement(obj.getLocator("LoginAdminUserName")).sendKeys("Jerry");
			wb.findElement(obj.getLocator("LoginAdminPwd")).sendKeys("abc");
			Thread.sleep(2000);
			wb.findElement(obj.getLocator("loginButton")).click();
			Thread.sleep(2000);
//			wb.findElement(obj.getLocator("StartExploreLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
