package com.jobma.qa.test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;

public class JobmaDashboardTest extends TestBase {

	TestBase tb;

	LoginPage lp ;
	JobmaDashboard jd;



	public  JobmaDashboardTest()throws IOException {

		super();
	}

	@BeforeMethod
	public void SettingsTest() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp = new LoginPage();
		jd = new JobmaDashboard();
		jd=lp.login(prop.getProperty("username"),prop.getProperty("password"));

	}

	@Test(priority=1)
	public void verifyCompanyLogoTest() throws IOException
	{

		boolean flag = jd.verifyCompanyLogo();
		Assert.assertTrue(flag);

	}

	@Test(priority=2)
	public void clickOnPositionsTest() throws InterruptedException, IOException
	{
		jd.clickOnPositions();
	}

	@Test(priority=3)
	public void clickOnSetupInterviewModuleTest()
	{
		jd.clickOnSetupInterviewModule();
	}
	@Test(priority=4)
	public void clickOnApplicantModuleTest()
	{
		jd.clickOnApplicantModule();
	}
	
	@Test
	public void clickOnEvaluateMOduleTest() throws IOException
	{
		jd.clickOnEvaluateModule();
	}
	@Test(priority=5)

	public void clickOnSubaccountsModuleTest() throws IOException
	{
		jd.clickOnSubaccountsModule();
	}

	@Test(priority=6)
	public void clickOnReportsModuleTest()
	{
		jd.clickOnReportsModule();
	}
	@Test(priority=7)
	public void clickOnIntegrationModuleTest()
	{
		jd.clickOnIntegrationModule();
	}
	@Test(priority=8)
	public void clickOnBillingsModuleTest() throws InterruptedException
	{
		jd.clickOnBillingsModule();
	}
	@Test(priority=9)
	public void clickOnCreditsBtnTest() throws InterruptedException
	{
		jd.clickOnCreditsBtn();
	}
	@Test(priority=10)
	public void clickOnGetstartedBtnTest() throws InterruptedException
	{
		jd.clickOnGetstartedBtn();
	}
	@Test(priority=11)
	public void clickOnPlanBtnTest()
	{
		jd.clickOnPlanBtn();
	}
	@Test(priority=11)
	public void clickOnScheduleInterviewBtnTest() throws InterruptedException, IOException
	{
		jd.clickOnScheduleInterviewBtn();
	}
	@Test(priority=12)
	public void clickOnCreateanInterviewBtnTest() throws IOException 
	{
		jd.clickOnCreateanInterviewBtn();
	}
	@Test(priority=13)
	public void clickOnTrackInterviewsBtnTest()
	{
		jd.clickOnTrackInterviewsBtn();
	}
	@Test(priority=14)
	public void clickOnEvaluateBtnTest()
	{
		jd.clickOnEvaluateBtn();
	}
	@Test(priority=15)
	public void clickOnViewallBtnOfInterviewsInvitationsTest()
	{
		jd.clickOnViewallBtnOfInterviewsInvitations();
	}
	@Test(priority=16)
	public void clickOnViewallOfPostedJobsTest() throws InterruptedException
	{
		jd.clickOnViewallOfPostedJobs();
	}
	@Test(priority=17)
	public void clickOnViewallOfRecentInvitationsTest() throws InterruptedException
	{
		jd.clickOnViewallOfRecentInvitations();
	}
	@Test(priority=18)
	public void clickOnViewallOfUcomingInterviewsTest() throws InterruptedException
	{
		jd.clickOnViewallOfUcomingInterviews();
	}
	@Test(priority=19)
	public void clickOnViewallOfRecentApplicantsTest() throws InterruptedException
	{
		jd.clickOnViewallOfRecentApplicants();
	}
	@Test(priority=20)
	public void clickOnViewallOfAwitingDecisonsTest() throws InterruptedException
	{
		jd.clickOnViewallOfAwitingDecisons();
	}
	@Test(priority=21)

	public void clickOnViewallOfRecentActivityTest() throws InterruptedException
	{
		jd.clickOnViewallOfRecentActivity();
	}
	@Test(priority=22)
	public void clickOnSchedulingToolTest() throws InterruptedException
	{
		jd.clickOnSchedulingTool();
	} 


	@AfterMethod
	public void Close()
	{
		TestBase.closeBrowser();

	}

}
