package com.jobma.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.InterviewKitListing;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.pages.QuestionLibrary;

public class QuestionLibraryTest extends TestBase {
	

	public QuestionLibraryTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void set() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp = new LoginPage();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		jd = new JobmaDashboard();
		jd.clickOnCreateanInterviewBtn();
		Thread.sleep(3000);
		 ikl = new InterviewKitListing();
		  ql = new QuestionLibrary();
		ql = ikl.clickOnQuestionLibraryBtn();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void clickOnBackBtnTest() throws InterruptedException
	{
		ql.clickOnBackBtn();
		Thread.sleep(3000);
	      String  heading =ikl.interviewKitListingHeading();
	      Assert.assertEquals(heading, "Interview kit listing");
		
	}
	
	@Test(priority=3)
	public void searchBoxTest() throws InterruptedException
	{
		ql.searchBox();
	}
	
	@Test(priority=1)
	public void clickOnSelectTypeddTest() throws InterruptedException
	{
		ql.clickOnSelectTypedd();
	}
	
	@Test(priority=4)
	public void clickOnDataListTest() throws InterruptedException
	{
		ql.clickOnDataList();
		Thread.sleep(3000);
	}
	

	@AfterMethod
	public void Close()
	{
		TestBase.closeBrowser();

	}
	

}
