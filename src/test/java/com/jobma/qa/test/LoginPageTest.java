package com.jobma.qa.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.util.TakeScreenshotHandle;

public class LoginPageTest extends TestBase  {
	public LoginPageTest() throws IOException {
		
		super();
	}




	LoginPage lp = new LoginPage() ;
	TestBase tb;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException 
	{

	TestBase.intialize();
	lp  = new LoginPage();

	}
	
	@Test
	public void clickOnPrivacyPolicyTest() throws IOException
	{
		lp = new LoginPage();
		lp.clickOnPrivacyPolicy();
		
	}

	
	@Test(priority=1)
	public void loginPageValidateTest()
	{
		
		
		String title = lp.validateLoginPageTitle();
		Assert.assertEquals(title, "Login");
	}
	
	@Test(priority=3,dataProvider="getData")
	public void loginTest() throws IOException, InterruptedException
	{
		
		lp.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test(priority=4)
	public void forgetPasswordLink() throws IOException
	{
		
		lp.forgetPass();
	}
	
	@Test(priority=2)
	public void jobmaLogoTest() throws IOException
	{
		
		boolean flag=lp.jobmaLogo();
		Assert.assertTrue(flag);
		
	}
	

	
	
	
	
	@AfterMethod
	public void Close()
	{
		TestBase.closeBrowser();
		
	}
	

}

