package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class view_reportPage extends TestBase {
	WebDriver driver;
	@FindBy(xpath="//input[@value='Search']")
	WebElement search_button;
	@FindBy(xpath="//input[@value='Reset']")
     WebElement reset_button;	
	@FindBy(xpath="//input[@id='loc_name']")
	WebElement searchfor;
	@FindBy(xpath="//select[@id='loc_code']")
	WebElement searchby;
	public  view_reportPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void click_searchbutton() {
		search_button.click();
	}
	public void click_resetbutton() {
		reset_button.click();
	}
	public void Enter_searchfor(String ReportID) {
		searchfor.sendKeys(ReportID);
	}
	public void Enter_searchby_ID() {
	searchby.click();
		Select sl=new Select(searchby);
		sl.selectByVisibleText("ID");
	}
	public void Enter_searchby_Name() {
		searchby.click();
			Select sl=new Select(searchby);
			sl.selectByVisibleText("Name");
		}
}
