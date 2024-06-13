package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class ReportPage extends TestBase {
	WebDriver driver;
	Actions ac;
	@FindBy(xpath="//li[@id='report']")
	WebElement report;
	@FindBy(xpath="//span[text()='View Reports']")
	WebElement view_report;
	@FindBy(xpath="//span[text()='Define Reports']")
	WebElement define_report;
	public  ReportPage(WebDriver driver){
		this.driver=driver;
		this.ac=new Actions(driver);
		PageFactory.initElements(driver, this);
}

	public void click_report() {
		report.click();
	}
	public void click_viewreport() {
		view_report.click();
	}
	public void  click_definereport() {
		define_report.click();
	}
	public void movecursor_toviewreport() {
		ac.moveToElement(report).build().perform();
	}
	public void movecursor_todefinereport() {
		ac.moveToElement(report).build().perform();
	}
}
