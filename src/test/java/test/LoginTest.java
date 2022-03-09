package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	String userName = "demo@techfios.com";
	String password = "abc123";
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignin();
		
	    DashBoardPage dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
	    dashboardPage.varifyDashbardHeader();
	    BrowserFactory.tearDown();
}

}
