package Test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Pages.LoginPage;
import TestBase.TestBase;


public class LoginTest extends TestBase {
	LoginPage LP;
	public LoginTest() {
		super();
	}
	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		LP= new LoginPage(driver);
	}
	@Test(priority=1)
	public void Login_invalidusername_invalidpassword() {
		LP.Enterdata_usersametextbox(prop.getProperty("user2"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass2"));
		LP.Click_login_button();
		Assert.assertEquals(true,LP.Check_username_textbox());
	}
	@Test(priority=2)
	public void login_without_entering_credentials() {
		LP.Click_clear_button();
		LP.Click_login_button();
		driver.switchTo().alert().accept();
		Assert.assertEquals(true,LP.Check_username_textbox());
	}
	@Test(priority=3)
	public void login_TestCase_invalidUsername_blankPassword() {
		LP.Click_clear_button();
		LP.Cleardata_usersametextbox();
		LP.Enterdata_usersametextbox(prop.getProperty("user2"));
		LP.Click_login_button();
		driver.switchTo().alert().accept();
		Assert.assertEquals(true, LP.Check_username_textbox());

	}
	@Test(priority=4)
	public void Login_invalidusername_validpassword() {
		LP.Click_clear_button();
		LP.Cleardata_usersametextbox();
		LP.Enterdata_usersametextbox(prop.getProperty("user2"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		LP.Click_login_button();
		Assert.assertEquals(true,LP.Check_username_textbox());
	}
	@Test(priority=5)
	public void Login_validusername_invalidpassword() {
		LP.Click_clear_button();
		LP.Cleardata_usersametextbox();
		LP.Enterdata_usersametextbox(prop.getProperty("user1"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass2"));
		LP.Click_login_button();
		Assert.assertEquals(true,LP.Check_username_textbox());
	}
	@Test(priority=6)
	public void Login_blankusername_invalidpassword() {
		LP.Click_clear_button();
		LP.Cleardata_usersametextbox();
		LP.Enterdata_passwordtextbox(prop.getProperty("pass2"));
		LP.Click_login_button();
		driver.switchTo().alert().accept();
		Assert.assertEquals(true,LP.Check_username_textbox());
	}
	@Test(priority=7)
	public void Login_validusername_validpassword() {
		LP.Click_clear_button();
		LP.Cleardata_usersametextbox();
		LP.Enterdata_usersametextbox(prop.getProperty("user1"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		LP.Click_login_button();
	    Assert.assertEquals(true, LP.check_campanylogo());
	}
}
