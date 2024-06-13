package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class define_reportPage extends TestBase {
	WebDriver driver;
	@FindBy(xpath="//input[@value='Search']")
	WebElement search_button;
	@FindBy(xpath="//input[@value='Reset']")
    WebElement reset_button;	
	@FindBy(xpath="//input[@id='loc_name']")
	WebElement searchfor;
	@FindBy(xpath="//select[@id='loc_code']")
	WebElement searchby;
	@FindBy(xpath="//input[@value='Add']")
	WebElement add;
	@FindBy(xpath="//input[@value='Delete']")
	WebElement delete;
	@FindBy(xpath="//input[@value='Back']")
	WebElement back_button;
	@FindBy(xpath="//input[@name='allCheck']")
	WebElement allcheckbox;
	@FindBy(xpath="//input[@value=\"REP010\"]")
	WebElement particular_checkbox;
	@FindBy(xpath="//a[text()='REP010']")
	WebElement reportID_link;
	@FindBy(xpath="//input[@value='REP040']")
	WebElement delete_reportID;
	public  define_reportPage(WebDriver driver){
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
	public void click_add_button() {
		add.click();
	}
	public void click_delete_button() {
		delete.click();
	}
	public void click_back_button() {
		back_button.click();
		
	}
	public void click_on_allcheckbox_button() {
		driver.switchTo().frame(allcheckbox);
		allcheckbox.click();
		
	}
	public void click_on_particularcheckbox_button() {
		particular_checkbox.click();
		
	}
	public void click_on_reportID_link() {
		reportID_link.click();
		
	}
	public void Select_Deleted_reportID_link() {
		delete_reportID.click();
		
	}
}
