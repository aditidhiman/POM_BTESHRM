package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;


public class LoginPage extends TestBase{
	
	//POM using Page Factory Implementation
	//@FindBy(locator= "locatorvalue")
	// WebElement element;
	WebDriver driver;
		
	@FindBy(xpath="//*[@name='txtUserName']")
	WebElement username_txtbox;
	
	@FindBy(xpath="//*[@name='txtPassword']")
	WebElement password_txtbox;
	
	@FindBy(xpath="//input[@name=\"Submit\"]")
	WebElement login_button;
	
	@FindBy(xpath="//input[@name=\"clear\"]")
	WebElement clear_button;
	@FindBy(xpath="//div[@id='companyLogoHeader']")
	WebElement campany_logo;
	
	public LoginPage(WebDriver driver)
	{ 	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Enterdata_usersametextbox(String uname)
	{
		username_txtbox.sendKeys(uname);
	}
	public void Cleardata_usersametextbox()
	{
		username_txtbox.clear();
	}
	
	public void Enterdata_passwordtextbox(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public boolean Check_username_textbox()
	{
		return username_txtbox.isDisplayed();
		
		//password_txtbox.isDisplayed();
	}
	public boolean check_campanylogo() {
		return campany_logo.isDisplayed();
	}
	
	public void Click_login_button()
	{
		login_button.submit();
	}
	public void Click_clear_button()
	{
		clear_button.click();
	}
	

	
	

}
