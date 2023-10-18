package com.jobma.qa.test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.AddNewInterviewKitPage;
import com.jobma.qa.pages.InterviewKitListing;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;

public class AddNewInterviewKitPageTest extends TestBase {

	public AddNewInterviewKitPageTest() throws IOException
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp = new LoginPage();
		jd =lp.login(prop.getProperty("username"), prop.getProperty("password"));
		jd = new JobmaDashboard();
		ikl  =jd.clickOnCreateanInterviewBtn();
		ikl = new InterviewKitListing();
		Thread.sleep(4000);
		ikl.clickOnAddNewKitBtn();
		Thread.sleep(3000);
	//	anikp=ikl.clickOnCreateYourOwnKitBtn();
		anikp = new AddNewInterviewKitPage();
	}

	@Test(priority=1)
	public void firstKitTest() throws InterruptedException, IOException, AWTException
	{  
		anikp.defaultFirstKit();
	}

	@Test(priority=2)
	public void clickEditBtnOnKitTest() 
	{
	    
	}

	@Test(priority=8)
	public void clickOnDeleteBtnOnQuestionTest() throws InterruptedException
	{
		anikp.clickOnDeleteBtnOnQuestion();
	}

	@Test(priority=7)
	public void selectOptionalCheckBoxTest() throws InterruptedException
	{
		boolean flag1 =anikp.selectOptionalCheckBox();
		Assert.assertTrue(flag1);
	}

	@Test(priority=6)
	public void deleteWelcomeNoteTest() throws InterruptedException
	{
		boolean flag =anikp.deleteWelcomeNote();
		Assert.assertTrue(flag);

	}

	@Test(priority=5)
	public void editWelcomeNoteBtnTest() throws InterruptedException
	{
		boolean flag =anikp.editWelcomeNoteBtn();
		Assert.assertTrue(flag);
	}

	@Test(priority=2)
	public void addMediaBtnWelcomeNoteTest() throws InterruptedException
	{
		boolean flag=anikp.addMediaBtnWelcomeNote();
		Assert.assertTrue(flag);
	}

	@Test(priority=3)
	public void deleteExitNoteTest() throws InterruptedException 
	{
		boolean flag =anikp.deleteExitNote();
		Assert.assertTrue(flag);
	}

	@Test(priority=4)
	public void  editExitNoteBtnTest() throws InterruptedException
	{
		boolean flag=anikp.editExitNoteBtn();
		Assert.assertTrue(flag);
	}


	/*	@Test(priority=1)
    public void savePredefinedKitTest() throws IOException, InterruptedException
    {
		anikp.savePredefinedKit();

    }*/

	
	@AfterMethod
	public void close()
	{
		TestBase.closeBrowser();
	}


}
