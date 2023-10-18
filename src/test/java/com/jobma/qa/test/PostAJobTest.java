package com.jobma.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.pages.PostAJob;
import com.jobma.qa.util.TakeScreenshotHandle;

public class PostAJobTest extends TestBase {

	public PostAJobTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp= new LoginPage();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		jd = new JobmaDashboard();
		jd.clickOnSetupInterviewModule();
		Thread.sleep(3000);
		paj =jd.clickOnPostAJobBtn();
		paj = new PostAJob();


	}

	@Test(priority=4)
	public void validationMessageOnJobTitleTest() throws InterruptedException, IOException
	{   
		

		boolean flag=paj.validationMessageOnJobTitle();
		Thread.sleep(3000);
		Assert.assertTrue(flag);



	}

	@Test(priority=5)
	public void validationMessageOnInterviewkitfieldTest() throws InterruptedException, IOException
	{   
		

		boolean flag=paj.validationMessageOninterviewkitfield();
		Thread.sleep(3000);
		Assert.assertTrue(flag);

	}

	@Test(priority=3)
	public void validationMessageOnjobdescfieldTest() throws InterruptedException, IOException
	{   
		
		boolean flag=paj.validationMessageOnjobdescfield();
		Thread.sleep(3000);
		Assert.assertTrue(flag);

	}

	@Test(priority=2)
	public void postingJObTest() throws InterruptedException, IOException
	{
		
		Thread.sleep(3000);
		paj.postingJOb();
	}
	
	@Test(priority=6)
	public void jobPostingWithAdditionalDetailsTest() throws InterruptedException, IOException
	{
		
		Thread.sleep(3000);
		paj.jobPostingWithAdditionalDetails();
	}


	@Test(priority=1)
	public void uploadfileTest() throws InterruptedException, IOException
	{
		
		Thread.sleep(3000);
		paj.uploadfile();
	}

	@AfterMethod
	public void Close()
	{
		TestBase.closeBrowser();

	}



}
