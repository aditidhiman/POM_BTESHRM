package Test;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ReportPage;
import TestBase.TestBase;

public class ReportTest  extends TestBase{
	ReportPage RP;
	LoginPage LP;
	
	public ReportTest() {
		super();
	}
	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		LP= new LoginPage(driver);
		LP.Enterdata_usersametextbox(prop.getProperty("user1"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		LP.Click_login_button();
		RP= new ReportPage(driver);
	}

	@Test(priority=1)
	public void check_functionalityof_dropdown_report() {
		RP.click_report();
	}
	@Test(priority=2)
	public void check_navigateto_viewreport() {
		RP.movecursor_toviewreport();
		RP.click_viewreport();
	}
	@Test(priority=3)
	public void check_navigateto_definereport() {
		RP.click_report();
		RP.movecursor_todefinereport();
		RP.click_definereport();
	}
}
