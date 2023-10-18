package com.jobma.qa.test;

import java.awt.AWTException;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.JobConfigurationPage;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.pages.PositionsPage;
import com.jobma.qa.util.WebDriverUtilities;

public class PositionsPageTest  extends TestBase{
	

	public PositionsPageTest() throws IOException {
		super();

	}

	@BeforeSuite
	public void setup() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp= new LoginPage();
		lp.login(prop.getProperty("username"),prop.getProperty("password"));
		jd= new JobmaDashboard();
		pp = new PositionsPage();
		pp =jd.clickOnPositions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}

	@Test(priority=1)
	public void createJobTest() throws InterruptedException
	{
		pp.createJob();
	}
	@Test(priority=2)
	public void quickInviteTest() throws InterruptedException, IOException
	{
		pp.quickInvite();
	}
	
	@Test(priority=3)
	public void jobConfigurationPageDisplayTest() throws IOException, InterruptedException
	{
		driver.get("https://testing.jobma.com/employer/positions-listing");
		Thread.sleep(5000);
		jcp = pp.clickOnJobConfiguration();
		Thread.sleep(4000);
		jcp = new JobConfigurationPage();
		jcp.jobConfigurationPageDisplay();
		
		
	}



	@Test(priority=4)
	public void setConfigurationTest() throws IOException, InterruptedException
	{ 
		driver.get("https://testing.jobma.com/employer/positions-listing");
		Thread.sleep(3000);
		jcp =pp.clickOnJobConfiguration();
		Thread.sleep(5000);
		jcp = new JobConfigurationPage();
		jcp.setConfiguration();
	}
	
	@Test(priority=5)
	public void addQuestionBtnTest1() throws IOException, InterruptedException
	{ 
		driver.get("https://testing.jobma.com/employer/positions-listing");
		pp = new PositionsPage();
		jcp =pp.clickOnJobConfiguration();
		jcp.addQuestionBtnTest();
	}
	
	

	@Test(priority=6)
	public void clickOnCancelBtnOnJobConfigurationPageTest() throws IOException, InterruptedException
	{   
		driver.get("https://testing.jobma.com/employer/positions-listing");
		pp = new PositionsPage();
		jcp =pp.clickOnJobConfiguration();
		jcp.clickOnCancelBtnOnJobConfigurationPage();
	}

	@Test(priority=7)
	public void clickOnAddNewInterviewKitBtnTest() throws IOException, InterruptedException
	{ 
		driver.get("https://testing.jobma.com/employer/positions-listing");
		pp = new PositionsPage();
		jcp =pp.clickOnJobConfiguration();
		jcp.clickOnAddInterviewKitBtn();
	}
	
	

	@Test(priority=8)
	public void clickOnAddMoreAboutPositionTest() throws IOException, InterruptedException, AWTException
	{
		driver.get("https://testing.jobma.com/employer/positions-listing");
		pp = new PositionsPage();
		jcp =pp.clickOnJobConfiguration();
		jcp.clickOnAddMoreAboutPosition();
	}
	
	@Test(priority=9)
	public void cloneJobTest() throws IOException, InterruptedException
	
	{
		pp.cloneJob();
		
	}

 /*	@Test
	public void copyLinkTest()
	{
		pp.copyLink();
	}
	
	@Test
	public void bulkInviteTest() throws IOException, InterruptedException
	{
		pp.bulkInvite();
	}
	
	*/

	@AfterSuite
	public void Close()
	{
		TestBase.closeBrowser();

	} 




}
