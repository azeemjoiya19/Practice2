package com.jobma.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.InterviewKitListing;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;

public class InterviewKitListingTest extends TestBase {

	InterviewKitListing interviewkitlisting ;
	JobmaDashboard dashboard;
	LoginPage lp;
	public  InterviewKitListingTest()throws IOException {

		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp = new LoginPage();
		dashboard=lp.login(prop.getProperty("username"),prop.getProperty("password"));
		interviewkitlisting =dashboard.clickOnCreateanInterviewBtn();
		interviewkitlisting = new InterviewKitListing();

	}
	/*@Test(priority=8)
	public void clickOnAddNewKitBtnTest() throws InterruptedException, IOException
	{
		interviewkitlisting.clickOnAddNewKitBtn();
		//driver.switchTo().frame(0);
		Thread.sleep(3000);
		interviewkitlisting.clickOnCreateYourOwnKitBtn();

		Thread.sleep(3000);
	} */

	@Test(priority=2)
	public void clickOnQuestionLibraryBtnTest() throws InterruptedException, IOException
	{
		interviewkitlisting.clickOnQuestionLibraryBtn();
	}

	@Test(priority=3)
	public void clickOnListViewBtnTest() throws InterruptedException
	{
		interviewkitlisting.clickOnListView();
	}

	@Test(priority=4)
	public void clickOnGridViewBtnTest() throws InterruptedException
	{
		interviewkitlisting.clickOnGridViewBtn();
	}
	@Test(priority=5)
	public void searchFilterTest() throws InterruptedException
	{
		interviewkitlisting.searchFilter();
	}

	@Test(priority=6)
	public void selectStatusDropDownTest() throws InterruptedException
	{
		interviewkitlisting.selectStatusDropDown();
	}

/*	@Test(priority=7)
	public void clickOnCreateYourOwnKitBtnTest() throws InterruptedException, IOException
	{    interviewkitlisting.clickOnAddNewKitBtn();
	//driver.switchTo().frame(0);
	Thread.sleep(3000);
	interviewkitlisting.clickOnCreateYourOwnKitBtn();

	}
	
	*/

	
	/*@Test(priority=1)
	public void clickonpredefinedInterviewKitTest() throws InterruptedException, IOException
	{
		interviewkitlisting.clickOnAddNewKitBtn();
		Thread.sleep(3000);
		interviewkitlisting.clickonpredefinedInterviewKit();



	}
	
	*/


	@AfterMethod
	public void Close()
	{
		TestBase.closeBrowser();

	}

}
