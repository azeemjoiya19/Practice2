package com.jobma.qa.test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.pages.SubAccount;
import com.jobma.qa.util.WebDriverUtilities;

public class SubAccountTest extends TestBase {

	public SubAccountTest() throws IOException {
		super();
		
	}
	
	@BeforeSuite
	public void Setup() throws InterruptedException, IOException
	{
		TestBase.intialize();
		lp = new LoginPage();
		
		jd=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		jd = new JobmaDashboard();
		sa = new SubAccount();
		sa=jd.clickOnSubaccountsModule();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
			
	}
	
	@Test(priority=1)
	public void verifySubAccountPageTest()
	{
		sa.verifySubAccountPage();
	}
	
	@Test(dependsOnMethods="verifySubAccountPageTest")
	public void addSubUserTest() throws IOException, InterruptedException
	{
		sa.addSubUser();
	}
	
	@Test(priority=3)
	public void permissionBtnTest()
	{
		sa.permissionsButton();
	}
	
	@Test(priority=4)
	public void permissionDeniedEvaluateCandidateTest() throws IOException, InterruptedException
	{
		sa.permissionDeniedEvaluateCandidate();
	}
	
	@Test(priority=5)
	public void manageSubaccountPermissionDeniedTest() throws IOException, InterruptedException
	{
		sa.manageSubaccountPermissionDenied();
	}
	
	@Test(priority=6)
	public void inviteCandidatePermissionDeniedTest() throws IOException, InterruptedException
	{
		sa.inviteCandidatePermissiondenied();
	}
	
	@Test(priority=7)
	public void integrationPermissionDeniedTest() throws InterruptedException, IOException
	{
		sa.integrationPermissionDenied();
	}
	
	@Test(priority=8)
	public void interviewListingPermissionDeniedTest() throws IOException, InterruptedException
	{
		sa.interviewListingPermissionDenied();
	}
	
	@Test(priority=9)
	public void companyProfilePermissionDeniedTest() throws IOException, InterruptedException
	{
		sa.companyProfilePermissionDenied();
	}
	
	
	
	
	
	
	
	@AfterSuite
	public void close()
	{
		TestBase.closeBrowser();
	}
	

}
