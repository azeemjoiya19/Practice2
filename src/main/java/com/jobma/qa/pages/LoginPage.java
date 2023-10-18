package com.jobma.qa.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.WebDriverUtilities;

public class LoginPage extends TestBase{
	
	//Page Factory - object Repository
	
	@FindBy(xpath="(//input[@id='jobma_user_name'])[1]") //username 
	
	WebElement username ; 
	
	@FindBy(xpath="(//input[@id='password'])[1]") //password
	WebElement password;
	
	@FindBy(xpath="//span[text()='Login to your account']") //login btn
	WebElement loginbtn;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgotyourpassword;
	
	@FindBy(xpath="(//a[contains(text(),'Privacy Policy')])[1]")
	WebElement privacypolicylink;
	
	@FindBy(xpath="(//img[@id='header-logo'])[2]")
	WebElement headerlogo;
	
	
	
	//initializing the page object
	
	public LoginPage() throws  IOException
	{
		PageFactory.initElements(driver, this);
	}
	//Actions 
	
	/*public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}*/
	public JobmaDashboard login(String un, String pwd) throws IOException, InterruptedException
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		Actions action = new Actions(driver);
		action.moveToElement(loginbtn).build().perform();
		loginbtn.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(900));
	
		//Thread.sleep(10000);
		String dashboardtitle =driver.getTitle();
		System.out.println(dashboardtitle);
		Assert.assertEquals(dashboardtitle, "Jobma");
		
	
		return  new JobmaDashboard() ;
		
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public void forgetPass()
	{
	     forgotyourpassword.click();   
	}
	public boolean jobmaLogo()
	{
		 return headerlogo.isDisplayed();
	}
	
	public void clickOnPrivacyPolicy()
	{
		privacypolicylink.click();
	}
	
	
	
	

}
