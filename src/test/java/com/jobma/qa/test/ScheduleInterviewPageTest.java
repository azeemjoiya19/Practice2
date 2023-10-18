package com.jobma.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.pages.ScheduleInterviewPage;

public class ScheduleInterviewPageTest extends TestBase {

	public ScheduleInterviewPageTest() throws IOException {
		//super();


	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp= new LoginPage();
		lp.login(prop.getProperty("username"),prop.getProperty("password"));
		jd= new JobmaDashboard();
		jd.clickOnSetupInterviewModule();
		Thread.sleep(3000);
		sip =jd.clickOnScheduleInterviewBtn();
		sip= new ScheduleInterviewPage();
	}

	@Test(priority=5)
	public void scheduledInterviewPageDisplayedTest()
	{
		sip.scheduleInterviewPage();
	}

	@Test(priority=2)
	public void inviteWithJobTest() throws InterruptedException, IOException
	{
		sip.inviteWithJob();
	}

	@Test(priority=7)
	public void KitReleatedToJobTest() throws InterruptedException, IOException
	{
		sip.KitReleatedToJob();
	}

	@Test(priority=8)
	public void mailPreviewBySelectingJobTest() throws InterruptedException
	{
		sip.mailPreviewBySelectingJob();
	}

	@Test(priority=6)
	public void mailPreviewWithoutSelectingJOb() throws InterruptedException
	{
		sip.mailPreviewWithoutSelectingJob();
	}

	@Test(priority=4)
	public void clickOnCreateAJobTest()
	{
		sip.clickOnCreateAJob();
	}

	@Test(priority=3)
	public void openLinkTest() throws InterruptedException
	{
		sip.openLink();
	}

	@Test(priority=1)
	public void inviteCandidateWithoutJObTest() throws InterruptedException, IOException
	{
		sip.inviteCandidateWithoutJOb();
	}

	@Test
	public void applicationOptionTest() throws InterruptedException, IOException
	{
		sip.appicationoption();
	}
	



	@AfterMethod
	public void Close()
	{
		TestBase.closeBrowser();

	} 

}
