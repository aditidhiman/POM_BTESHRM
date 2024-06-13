package Test;

import java.io.IOException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ReportPage;
import Pages.define_reportPage;
import Pages.view_reportPage;
import TestBase.TestBase;

public class define_reportTest extends TestBase {
	view_reportPage VP;
	ReportPage RP;
	LoginPage LP;
	define_reportPage DP;
	public define_reportTest() {
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
		RP.movecursor_todefinereport();
		RP.click_definereport();
		DP= new define_reportPage(driver);
	}
	@Test(priority=1)
	public void check_addbutton_functionality() {
		driver.switchTo().frame("rightMenu");
		DP.click_add_button();
	}
	@Test(priority=2)
	public void check_backbutton_functionality() {
		DP.click_back_button();
	}
	@Test(priority=3)
	public void check_searchfor_functionality() {
		DP.Enter_searchfor(prop.getProperty("ReportID"));
	}
	@Test(priority=4)
	public void check_searchby_ID_functionality() {
		DP.Enter_searchby_ID();
	}
	@Test(priority=5)
	public void check_searchby_name_functionality() {
		DP.Enter_searchby_Name();
	}
	@Test(priority=6)
	public void Reset_functionality() { 
		DP.click_resetbutton();
	}
	@Test(priority=7)
	public void check_searchfunctionality_Validcredential() {
		DP.Enter_searchfor(prop.getProperty("ReportID"));
		DP.Enter_searchby_Name();
		DP.click_searchbutton();
	}
	@Test(priority=8)
	public void check_searchfunctionality_withoutinput(){
		DP.click_resetbutton();
		DP.click_searchbutton();
	}
	@Test(priority=9)
	public void check_searchfunctionality_withoutSearchBy_enterReportNameinSearchfor() {
		DP.Enter_searchfor(prop.getProperty("Reportname"));
		DP.click_searchbutton();
	}
	@Test(priority=10)
	public void check_searchfunctionality_withoutSearchBy_enterReportIDinSearchfor() {
		DP.click_resetbutton();
		DP.Enter_searchfor(prop.getProperty("ReportID"));
		DP.click_searchbutton();
	}
	@Test(priority=11)
	public void check_searchfunctionality_invalid_ID_credential() {
		DP.click_resetbutton();
		DP.Enter_searchby_ID();
		DP.Enter_searchfor(prop.getProperty("invalidReportID"));
		DP.click_searchbutton();
	}
	@Test(priority=12)
	public void check_searchfunctionality_invalid_NAME_credential() {
		DP.click_resetbutton();
		DP.Enter_searchby_Name();
		DP.Enter_searchfor(prop.getProperty("invalidReportname"));
		DP.click_searchbutton();
	}
	@Test(priority=13)
	public void check_searchfunctionality_IDselect_onSearchBy_enterReportNameinSearchfor() {
		DP.click_resetbutton();
		DP.Enter_searchby_ID();
		DP.Enter_searchfor(prop.getProperty("Reportname"));
		DP.click_searchbutton();
	}
	@Test(priority=14)
	public void check_searchfunctionality_Nameselect_onSearchBy_enterReportIDinSearchfor() {
		DP.click_resetbutton();
		DP.Enter_searchby_Name();
		DP.Enter_searchfor(prop.getProperty("ReportID"));
		DP.click_searchbutton();
	}
	@Test(priority=15)
	public void check_deletebutton_functionality() {
		DP.click_resetbutton();
       DP.Select_Deleted_reportID_link();
		DP.click_delete_button();
	}
	@Test(priority=16)
	public void check_allcheckbox_functionality() {
		DP.click_on_allcheckbox_button();
	}
	@Test(priority=17)
	public void check_particularcheckbox_functionality() {
		
		DP.click_on_particularcheckbox_button();
	}
	@Test(priority=18)
	public void check_functionality_of_ReportIDlink_by_click_ReportID() {
		DP.click_on_reportID_link();
	}
	
}
