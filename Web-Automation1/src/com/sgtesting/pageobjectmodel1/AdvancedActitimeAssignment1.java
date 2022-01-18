package com.sgtesting.pageobjectmodel1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedActitimeAssignment1 {
	private static WebDriver oBrowser = null;
	private static ActiTimePage oPage = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginAsUser1();
		logout();
		loginAsUser2();
		logout();
		loginAsUser3();
		logout();
		login(); // admin login
		// minimizeFlyOutWindow();
		modifyUserPassword();
		logout(); // admin logout
		loginAsUser11();
		logout();
		loginAsUser21();
		logout();
		loginAsUser31();
		logout();
		login();
		// minimizeFlyOutWindow();
		deleteUser1();
		deleteUser2N3();
		deleteUser3N3();
		logout();
		closeApplication();

	}

	private static void launchBrowser() {
		try {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oPage = new ActiTimePage(oBrowser);
			oBrowser.manage().window().maximize();
			System.out.println("Launch Browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			oBrowser.navigate().to("http://localhost:83/login.do");
			Thread.sleep(3000);
			System.out.println("Navigate to URL");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() {
		try {
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			System.out.println("Login admin");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow() {
		try {
			Thread.sleep(6000);
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);
			System.out.println("Minimize");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logout() {
		try {
			oPage.getLogoutLink().click();
			Thread.sleep(3000);
			System.out.println("Logout admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeApplication() {
		try {
			oBrowser.close();
			System.out.println("Close application");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser1() {
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(2000);
			oPage.getAddUserFirstName().sendKeys("gayatri");
			oPage.getAddUserLastName().sendKeys("demo1");
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			oPage.getUserName().sendKeys("User1");
			oPage.getAddUserPassword().sendKeys("pwduser1");
			oPage.getAddUserRetypePassword().sendKeys("pwduser1");
			Thread.sleep(2000);
			oPage.getCreateUserCreateButton().click();
			System.out.println("Create user1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser2() {
		try {
			// oPage.getCreateUserButton().click();
			// Thread.sleep(2000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(2000);
			oPage.getAddUserFirstName().sendKeys("gayatri2");
			oPage.getAddUserLastName().sendKeys("demo2");
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			oPage.getUserName().sendKeys("User2");
			oPage.getAddUserPassword().sendKeys("pwduser2");
			oPage.getAddUserRetypePassword().sendKeys("pwduser2");
			Thread.sleep(3000);
			oPage.getCreateUserCreateButton().click();
			System.out.println("Create user 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser3() {
		try {
			// oPage.getCreateUserCreateButton().click();
			// Thread.sleep(2000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(2000);
			oPage.getAddUserFirstName().sendKeys("gayatri3");
			oPage.getAddUserLastName().sendKeys("demo3");
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			oPage.getUserName().sendKeys("User3");
			oPage.getAddUserPassword().sendKeys("pwduser3");
			oPage.getAddUserRetypePassword().sendKeys("pwduser3");
			Thread.sleep(6000);
			oPage.getCreateUserCreateButton().click();
			System.out.println("Create User 3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser1() {
		try {
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("pwduser1");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);
			System.out.println("Login user 1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser2() {
		try {
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("pwduser2");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);
			System.out.println("Login user 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser3() {
		try {
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("pwduser3");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);
			System.out.println("Login User 3");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUserPassword() {
		try {
			Thread.sleep(3000);
			oPage.getCreateUserButton().click();
			Thread.sleep(3000);
			oPage.getClickOnUser1().click();
			Thread.sleep(3000);
			oPage.getAddUserPassword().sendKeys("user1pwd");
			Thread.sleep(3000);
			oPage.getAddUserRetypePassword().sendKeys("user1pwd");
			Thread.sleep(3000);
			oPage.getCreateUserCreateButton().click();
			Thread.sleep(3000);
			System.out.println("User 1 modified");
			oPage.getClickOnUser2().click();
			Thread.sleep(3000);
			oPage.getAddUserPassword().sendKeys("user2pwd");
			Thread.sleep(3000);
			oPage.getAddUserRetypePassword().sendKeys("user2pwd");
			Thread.sleep(3000);
			System.out.println("User 2 modified");
			oPage.getCreateUserCreateButton().click();
			Thread.sleep(3000);
			oPage.getClickOnUser3().click();
			Thread.sleep(3000);
			oPage.getAddUserPassword().sendKeys("user3pwd");
			Thread.sleep(3000);
			oPage.getAddUserRetypePassword().sendKeys("user3pwd");
			Thread.sleep(3000);
			oPage.getCreateUserCreateButton().click();
			Thread.sleep(3000);
			System.out.println("User 3 modified");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser11() {
		try {
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("user1pwd");
			oPage.getLoginButton().click();
			// Thread.sleep(1000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);
			System.out.println("Modi user 1 login");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser21() {
		try {
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("user2pwd");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);
			System.out.println("Modi User 2 login");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser31() {
		try {
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("user3pwd");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);
			System.out.println("Modi User login 3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteUser1() {
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);
			oPage.getClickOnUser1().click();
			Thread.sleep(3000);
			oPage.getDeleteUserDeleteButton().click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(3000);
			oa.accept();
			Thread.sleep(3000);
			System.out.println("Delete 1 user");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteUser2N3() {
		try {
			oPage.getClickOnUser2().click();
			Thread.sleep(3000);
			oPage.getDeleteUserDeleteButton().click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(3000);
			oa.accept();
			Thread.sleep(3000);
			System.out.println("Delete 2 user");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteUser3N3() {
		try {
			oPage.getClickOnUser3().click();
			Thread.sleep(3000);
			oPage.getDeleteUserDeleteButton().click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(3000);
			oa.accept();
			Thread.sleep(3000);
			System.out.println("Delete 3 user");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
