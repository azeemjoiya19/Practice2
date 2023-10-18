package com.jobma.qa.test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.EvaluatePage;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;

public class EvaluatePageTest extends TestBase {

	public EvaluatePageTest() throws IOException {
		
		super();
		
	}
	
	@BeforeSuite
	public void setupEvaluatePage() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp = new LoginPage();
		jd = new JobmaDashboard();
		jd=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		 		ep = new EvaluatePage();
		jd.clickOnEvaluateModule();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
	}
	
	@Test(priority=1)
	public void evaluatePageTest() throws IOException
	{
		ep.evaluatePage();
	}
	
	@Test(priority=3)
	public void bulkDeleteTest()
	{
		ep.bulkDelete();
	}
	
	@Test(priority=2)
	public void  bulkShareTest() throws InterruptedException 
	{
	   ep.bulkShare();
	}
	
	@Test
	public void searchapplicantTest()
	{
		ep.searchApplicant();
	}
	@Test
	public void statusFilterTest()
	{
		ep.statusFilter();
	}
	
	
	

	
	
	

	@AfterSuite
	public void Close()
	{
		TestBase.closeBrowser();

	}
	
	

}
