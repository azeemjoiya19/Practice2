package com.jobma.qa.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.DatePicker;
import com.jobma.qa.util.JavascriptClicks;
import com.jobma.qa.util.TakeScreenshotHandle;
import com.jobma.qa.util.WebDriverUtilities;

public class ScheduleInterviewPage extends TestBase {



	//OR

	@FindBy(xpath="(//span[contains(text(),'Setup an Interview')])[2]")
	WebElement pagetext;

	@FindBy(xpath=" (//button[normalize-space()='Invite candidates with job'])[1]")
	WebElement invitecandidatewithjobtab;

	@FindBy(xpath="(//button[normalize-space()='Invite candidates without job'])[1]")
	WebElement invitecandidatewithoutjob;

	@FindBy(xpath="(//a[normalize-space()='Application Options'])[1]")
	WebElement applicationoptionbtn;

	@FindBy(xpath="(//a[normalize-space()='Create a Job'])[1]")
	WebElement createajobbtn;

	@FindBy(xpath="(//input[@name='jobma_job_title'])[1]")
	WebElement jobtitlefield;

	@FindBy(xpath="(//input[@name='jobma_job_expiry_date'])[1]")
	WebElement expirationdate;

	@FindBy(xpath="(//textarea[@name='jobma_job_description'])[1]")
	WebElement jobdesc;

	@FindBy(xpath="(//button[normalize-space()='Save & Continue'])[1]")
	WebElement savecontinuebtn;



	@FindBy(xpath="//a[normalize-space()='Interview Schedule']")
	WebElement interviewschedulingbtn;



	@FindBy(xpath="(//span[@id='select2-job_id-container'])[1]")
	WebElement clickonjobdd;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> jobddlist; 

	@FindBy(xpath="(//a[normalize-space()='Pre-Recorded Video Interview'])[1]")
	WebElement prerecordedtab;

	@FindBy(xpath="(//a[@id='2'])[1]")
	WebElement liveinterviewtab;

	@FindBy(xpath="(//span[@id='select2-job_assessment_kit-container'])[1]")
	WebElement clickoninterviewkitdd;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> interviewkitddlist;

	@FindBy(xpath="(//input[@id='preRecordedDate'])[1]")
	WebElement interviewexpirationdate;

	@FindBy(xpath="(//i[@class='bi bi-chevron-down'])[1]")
	WebElement questioninkitviewbtn;

	@FindBy(xpath="(//input[@id='bulkInvitation'])[1]")
	WebElement bulkinvitechkbox;

	@FindBy(xpath="(//input[@class='form-control checkName'])[1]")
	WebElement  usernamefield;

	@FindBy(xpath="(//input[@placeholder='Enter Email Address'])[1]")
	WebElement emailadressfield;

	@FindBy(xpath="(//input[@id='jobma_phone'])[1]")
	WebElement phonenofield;

	@FindBy(xpath="(//button[normalize-space()='Add more'])[1]")
	WebElement addmorebtn;

	@FindBy(xpath="(//input[@id='jobseeker_signup_confirmation'])[1]")
	WebElement additionaldetailschkbox;

	@FindBy(xpath="(//input[@id='can_request_retake'])[1]")
	WebElement requestretakechkbox;

	@FindBy(xpath="(//input[@id='live_proctoring'])[1]")
	WebElement liveproctoringcheckbox;
	
	@FindBy(xpath="(//input[@id='ai_features'])[1]")
	WebElement transcriptioncheckbox;
	
	

	@FindBy(xpath="(//button[normalize-space()='Preview'])[1]")
	WebElement previewbtn;

	@FindBy(xpath="(//button[normalize-space()='Send'])[1]")
	WebElement sendbtn;

	@FindBy(xpath="(//span[@class='absolute-no'])[1]")
	WebElement publiclinktoggle;

	@FindBy(xpath="(//input[@type='text'])[12]")
	WebElement prerecordednotificationfield;

	@FindBy(xpath="(//small[normalize-space()='Copyright � Jobma LLC, 2023'])[1]")
	WebElement copyrightissue;

	@FindBy(xpath="(//input[@id='sms_notification'])[1]")
	WebElement smsnotificationchkbox;

	@FindBy(xpath="//span[contains(text(),'essayi')]")
	WebElement kit;

	@FindBy(xpath="(//h6[normalize-space()='Preview'])[1]")
	WebElement previewpagetext;

	@FindBy(xpath="(//input[@id='publicPreUrlJQ'])[1]")
	WebElement url;

	@FindBy(xpath="(//input[@id='option11'])[1]")
	WebElement summarymandatorycheckbox;

	@FindBy(xpath="(//input[@id='option22'])[1]")
	WebElement expoptionalcheckbox;

	@FindBy(xpath="(//input[@id='option31'])[1]")
	WebElement resumemandatorycheckbox;

	@FindBy(xpath="(//input[@id='option41'])[1]")
	WebElement docmandatorycheckbox;

	@FindBy(xpath="(//button[normalize-space()='Save'])[1]")
	WebElement applicationsavebtn;

	@FindBy(xpath="(//div[contains(text(),'Changes saved successfully')])[1]")
	WebElement savemessage;




	//	Initialization

	public ScheduleInterviewPage() throws IOException {
		PageFactory.initElements(driver, this);
	}


	//actions

	public void scheduleInterviewPage()
	{
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://testing.jobma.com/employer/setup-an-interview");
	}

	public void inviteWithJob() throws InterruptedException, IOException
	{
		clickonjobdd.click();
		Thread.sleep(3000);
		for(int i=0;i<jobddlist.size();i++)
		{
			if(jobddlist.get(i).getText().contains(prop.getProperty("jobtitle")))
			{

				jobddlist.get(i).click();
				break;
			}



		}

		Thread.sleep(1000);

		DatePicker.selectDateByJs(driver,interviewexpirationdate , "12/04/2024");
		usernamefield.sendKeys(prop.getProperty("candidatename"));
		emailadressfield.sendKeys(prop.getProperty("candidateemail"));
		Thread.sleep(9000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",sendbtn );
		Thread.sleep(3000);
		sendbtn.click();
		TakeScreenshotHandle.TakeScreenshot("invitation sent successfully");
		Thread.sleep(12000);

		jd = new JobmaDashboard();
		jd.clickOnApplicantModule();
		Thread.sleep(3000);
		tp =jd.clickOnTrack();
		Thread.sleep(9000);
		tp = new TrackPage();

		tp.invitedCandidateOnTrackPage("candidateemail","jobtitle"); //changes
		Thread.sleep(3000);

		//tp.clickOnFilterBtn();
		//	tp.selectJobFromFilter();
		//	Thread.sleep(3000);
		//	tp.clickOnInvitationLogBtn();
		//	Thread.sleep(9000);


		//		WebDriverUtilities w = new WebDriverUtilities();
		//	w.switchTabs(driver);


		//	tp.invitationmessage();





	}



	public void KitReleatedToJob() throws InterruptedException, IOException
	{
		clickonjobdd.click();
		Thread.sleep(3000);
		for(int i=0;i<jobddlist.size();i++)
		{
			if(jobddlist.get(i).getText().contains(prop.getProperty("jobtitle")))
			{


				jobddlist.get(i).click();
				break;
			}




		}
		Thread.sleep(3000);
		boolean flag =	kit.isDisplayed();
		Assert.assertTrue(flag);	
		TakeScreenshotHandle.TakeScreenshot("Kit related to selected job in dropdown");



	}

	public void mailPreviewBySelectingJob() throws InterruptedException
	{
		clickonjobdd.click();
		Thread.sleep(3000);
		for(int i=0;i<jobddlist.size();i++)
		{
			if(jobddlist.get(i).getText().contains(prop.getProperty("jobtitle")))
			{


				jobddlist.get(i).click();
				break;
			}




		}
		Thread.sleep(4000);	

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",previewbtn);
		Thread.sleep(9000);
		previewbtn.click();
		Thread.sleep(9000);
		boolean flag =previewpagetext.isDisplayed();
		System.out.println(flag);
		Assert.assertTrue(flag);

	}	

	public void mailPreviewWithoutSelectingJob() throws InterruptedException
	{Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",previewbtn);
	Thread.sleep(3000);
	previewbtn.click();
	Thread.sleep(4000);
	boolean flag =previewpagetext.isDisplayed();
	Assert.assertTrue(flag);
	}

	public void clickOnCreateAJob()
	{
		createajobbtn.click();
		jobtitlefield.sendKeys(prop.getProperty("jobtitlefromscheduleinterviewpage"));

		DatePicker.selectDateByJs(driver, expirationdate, "04/30/2025");
		jobdesc.sendKeys(prop.getProperty("jobdesc"));
		savecontinuebtn.click();

	}

	public void openLink() throws InterruptedException
	{
		clickonjobdd.click();
		Thread.sleep(3000);
		for(int i=0;i<jobddlist.size();i++)
		{
			if(jobddlist.get(i).getText().contains(prop.getProperty("jobtitle")))
			{


				jobddlist.get(i).click();
				break;
			}
		}

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",publiclinktoggle);
		Thread.sleep(3000);
		publiclinktoggle.click();
		Thread.sleep(3000);
		boolean flag =url.isDisplayed();
		Assert.assertTrue(flag);




	}

	public void inviteCandidateWithoutJOb() throws InterruptedException, IOException
	{Thread.sleep(2000);
	invitecandidatewithoutjob.click();
	Thread.sleep(3000);
	clickoninterviewkitdd.click();
	for(int i=0;i<interviewkitddlist.size();i++)
	{
		if(interviewkitddlist.get(i).getText().contains(prop.getProperty("kitname")))
		{


			interviewkitddlist.get(i).click();
			break;
		}
	}

	usernamefield.sendKeys(prop.getProperty("withoutjobcandidatename"));
	emailadressfield.sendKeys(prop.getProperty("withoutjobcandidateemail"));
	Thread.sleep(9000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",sendbtn );
	Thread.sleep(3000);
	sendbtn.click();
	Thread.sleep(12000);

	jd = new JobmaDashboard();
	jd.clickOnApplicantModule();
	Thread.sleep(3000);
	tp =jd.clickOnTrack();
	tp = new TrackPage();
	tp.invitedCandidatewithoutjobontrackpage();

	}

	public void appicationoption() throws InterruptedException, IOException
	{
		applicationoptionbtn.click();
		Thread.sleep(3000);
		summarymandatorycheckbox.click();
		expoptionalcheckbox.click();
		resumemandatorycheckbox.click();
		docmandatorycheckbox.click();
		Thread.sleep(3000);
		applicationsavebtn.click();
		Thread.sleep(1000);
		TakeScreenshotHandle.TakeScreenshot("applicationoptionsavemessage");
		boolean flag1=savemessage.isDisplayed();
		Assert.assertTrue(flag1);

	}
	
	public void selectJobFromDd(String jobname)
	{
		clickonjobdd.click();
		for(int i=0;i<jobddlist.size();i++)
		{
			if(jobddlist.get(i).getText().contains(jobname))
			{
				jobddlist.get(i).click();	
			}
		}
	}
	
	public void verifyConfigurations() throws InterruptedException
	{
		JavascriptClicks.javaScripthandle(additionaldetailschkbox);
		Thread.sleep(3000);	
		if(additionaldetailschkbox.isSelected()&&requestretakechkbox.isSelected())
		{
			System.out.println("config set properly for the job");
		}
		
		else
		{
			System.out.println("configuration for job is not set properly");
			Assert.assertFalse(false);
		}
		
	}
	
	




}