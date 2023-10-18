package com.jobma.qa.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.JavascriptClicks;
import com.jobma.qa.util.WebDriverUtilities;

public class PositionsPage extends TestBase{

	//OR




	@FindBy(xpath="(//span[contains(text(),'Positions')])[3]")
	WebElement positionspagetext;


	@FindBy(xpath="((//input[contains(@name,'jobma_job_title')]))[1]")
	WebElement enterpositionherefield;


	@FindBy(xpath="(//button[normalize-space()='create'])[1]")
	WebElement createbtn;


	@FindBy(xpath="(//input[@placeholder='Search Position'])[1]")
	WebElement searchpositionfilter;


	@FindBy(xpath="(//i[@class='bi bi-search'])[2]")
	WebElement searchfilterbtn;


	@FindBy(xpath="(//i[@class='fa-solid fa-filter'])[1]")
	WebElement filterbtn;


	@FindBy(xpath="(//button[contains(@id,'dropdownMenuButton1')])[1]")
	WebElement actiondd;

	@FindBy(xpath="//ul[contains(@class,'dropdown-menu positionBtn show')]//li")
	List<WebElement> actionddlist ;

	@FindBy(xpath="(//span[@id='select2-theme(31065)-container'])[1]")
	WebElement themedd;

	@FindBy(xpath="(//span[@id='select2-theme(31065)-container'])[1]//li")
	List<WebElement> themeddlist ;

	@FindBy(xpath="(//span[contains(text(),'Quick Invite')])[1]")
	WebElement quickinvitebtn;

	@FindBy(xpath="(//a[@aria-label='Job Configuration'])[1]")
	WebElement jobconfigbtn;

	@FindBy(xpath="(//input[contains(@value,'Select Kit ') ])[1]")
	WebElement interviewkitdd;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> interviewkitddlist;

	@FindBy(xpath="(//button[@id='copyLink_0'])[1]")
	WebElement copylink;

	@FindBy(xpath="(//a[contains(text(),'Bulk invite')])[1]")
	WebElement bulkinvite;

	@FindBy(xpath="(//button[contains(@aria-label,'Job stats')])[1]")
	WebElement jobstat;

	@FindBy(xpath="(//h6[normalize-space()='Invite Candidate'])[1]")
	WebElement invitecandidatetext;

	@FindBy(xpath="(//input[@id='dp1681891908692'])[1]")
	WebElement interviewlinkexpirationdatefield;

	@FindBy(xpath="(//span[@id='select2-kitJQ-container'])[1]")
	WebElement interviewkitfieldonquickinvitemodule;

	@FindBy(xpath="(//input[@name='jobma_name[]'])[1]")
	WebElement candidatename;

	@FindBy(xpath="(//input[@name='jobma_email[]'])[1]")
	WebElement candidateemail;

	@FindBy(xpath="(//input[@name='jobma_phone[]'])[1]")
	WebElement phonenumberfield;

	@FindBy(xpath="(//input[@id='sms_notification'])[1]")
	WebElement smsnotificationcheckbox;

	@FindBy(xpath="(//button[normalize-space()='Add more'])[1]")
	WebElement addmorebtn;

	@FindBy(xpath="(//button[normalize-space()='Send Invitation'])[1]")
	WebElement sendinvitationbtn;

	@FindBy(xpath="(//i[contains(@class,'bi bi-x-lg')])[2]") //quick invite module cancel btn
	WebElement cancelbtn;

	@FindBy(xpath="(//input[contains(@name,'jobma_job_title')])[2]")
	WebElement createdjobtiletitle;
	
	@FindBy(xpath="//h6[contains(text(),'Clone Job Post')]")
	WebElement clonejobpagetext;

	//initialization of OR 

	public PositionsPage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}

	//actions 

	public void createJob() throws InterruptedException
	{
		enterpositionherefield.sendKeys(prop.getProperty("positionjob"));
		createbtn.click();
	
		Thread.sleep(5000);
		interviewkitdd.click();
		for(int i=0;i<interviewkitddlist.size();i++)
		{
			if(i==1)
			{
				interviewkitddlist.get(i).click(); 
			}
		}
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	Thread.sleep(3000);
		searchpositionfilter.sendKeys(prop.getProperty("positionjob"));
		searchfilterbtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String s = createdjobtiletitle.getAttribute("value");
		Assert.assertEquals(s, prop.getProperty("positionjob"));
		
		
		
		


	}

	public void quickInvite() throws InterruptedException, IOException
	{
		searchpositionfilter.clear();
		searchpositionfilter.sendKeys(prop.getProperty("positionjob"));
		searchfilterbtn.click();
		Thread.sleep(5000);
		quickinvitebtn.click();
		Thread.sleep(5000);
		candidatename.sendKeys(prop.getProperty("quickinvitecandidatename"));
		candidateemail.sendKeys(prop.getProperty("quickinvitecandidateemail"));
		Thread.sleep(3000);
		sendinvitationbtn.click();
		Thread.sleep(30000);
		tp = new TrackPage();
		jd = new JobmaDashboard();
		jd.clickOnApplicantModule();
		Thread.sleep(4000);
		jd.clickOnTrack();
		Thread.sleep(9000);
		tp.invitedCandidateOnTrackPage("quickinvitecandidateemail","positionjob");


	}
	

	public JobConfigurationPage clickOnJobConfiguration() throws IOException, InterruptedException
	{
		searchpositionfilter.sendKeys(prop.getProperty("positionjob"));
		searchfilterbtn.click();
	  Thread.sleep(3000);
		jobconfigbtn.click();
		Thread.sleep(3000);

		return new JobConfigurationPage();


	}
	
	public void cloneJob() throws InterruptedException
	{
		searchpositionfilter.sendKeys(prop.getProperty("positionjob"));
		searchfilterbtn.click();
	    Thread.sleep(3000);
	    actiondd.click();
	    for(int i=0;i<actionddlist.size();i++)
		{
	    	if(actionddlist.get(i).getText().contains("Clone Job"))
			{
	    		actionddlist.get(i).click();	
			}
		}
	    
	    WebDriverUtilities.wait(driver, 30, clonejobpagetext);
	    String s = clonejobpagetext.getText();
	    Assert.assertEquals(s,"Clone Job Post");
	    
	      
	    
	}
	
	public void copyLink()
	
	{
		String s =copylink.getAttribute("data-clipboard-text");
		
		driver.navigate().to(s);
	}
	
	public ScheduleInterviewPage bulkInvite() throws IOException, InterruptedException
	{
		searchpositionfilter.sendKeys(prop.getProperty("positionjob"));
		searchfilterbtn.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		if(bulkinvite.isDisplayed())
		{
			bulkinvite.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			sip = new ScheduleInterviewPage();
			sip.verifyConfigurations();
			
			
		}
		else
		{
			System.out.println("plan is professional and doesnot allow bulk invite");
		}
		return new ScheduleInterviewPage();
		
	}








}
