package Test;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ReportPage;
import Pages.view_reportPage;
import TestBase.TestBase;

public class view_reportTest extends TestBase {
	view_reportPage VP;
	ReportPage RP;
	LoginPage LP;
	public view_reportTest() {
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
		RP.click_report();
		RP.movecursor_toviewreport();
		RP.click_viewreport();
		VP= new view_reportPage(driver);
	}
	@Test(priority=1)
	public void check_searchfor_functionality() {
		driver.switchTo().frame("rightMenu");
		VP.Enter_searchfor(prop.getProperty("ReportID"));
	}
	@Test(priority=2)
	public void check_searchby_ID_functionality() {
		VP.Enter_searchby_ID();
	}
	@Test(priority=3)
	public void check_searchby_name_functionality() {
		VP.Enter_searchby_Name();
	}
	@Test(priority=4)
	public void Reset_functionality() { 
		VP.click_resetbutton();
	}
	@Test(priority=5)
	public void check_searchfunctionality_Validcredential() {
		VP.Enter_searchfor(prop.getProperty("ReportID"));
		VP.Enter_searchby_Name();
		VP.click_searchbutton();
	}
	@Test(priority=6)
	public void check_searchfunctionality_withoutinput(){
		VP.click_resetbutton();
		VP.click_searchbutton();
	}
	@Test(priority=7)
	public void check_searchfunctionality_withoutSearchBy_enterReportNameinSearchfor() {
		VP.Enter_searchfor(prop.getProperty("Reportname"));
		VP.click_searchbutton();
	}
	@Test(priority=8)
	public void check_searchfunctionality_withoutSearchBy_enterReportIDinSearchfor() {
		VP.click_resetbutton();
		VP.Enter_searchfor(prop.getProperty("ReportID"));
		VP.click_searchbutton();
	}
	@Test(priority=9)
	public void check_searchfunctionality_invalid_ID_credential() {
		VP.click_resetbutton();
		VP.Enter_searchby_ID();
		VP.Enter_searchfor(prop.getProperty("invalidReportID"));
		VP.click_searchbutton();
	}
	@Test(priority=10)
	public void check_searchfunctionality_invalid_NAME_credential() {
		VP.click_resetbutton();
		VP.Enter_searchby_Name();
		VP.Enter_searchfor(prop.getProperty("invalidReportname"));
		VP.click_searchbutton();
	}
	@Test(priority=11)
	public void check_searchfunctionality_IDselect_onSearchBy_enterReportNameinSearchfor() {
		VP.click_resetbutton();
		VP.Enter_searchby_ID();
		VP.Enter_searchfor(prop.getProperty("Reportname"));
		VP.click_searchbutton();
	}
	@Test(priority=12)
	public void check_searchfunctionality_Nameselect_onSearchBy_enterReportIDinSearchfor() {
		VP.click_resetbutton();
		VP.Enter_searchby_Name();
		VP.Enter_searchfor(prop.getProperty("ReportID"));
		VP.click_searchbutton();
	}
}
