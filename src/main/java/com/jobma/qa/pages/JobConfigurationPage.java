package com.jobma.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.JavascriptClicks;
import com.jobma.qa.util.WebDriverUtilities;

public class JobConfigurationPage extends TestBase {



	//OR

	@FindBy(xpath="(//span[contains(text(),'Job Configuration')])[2]")
	WebElement jobconfigurationpagetext;

	@FindBy(xpath="(//a[normalize-space()='Add More About Position'])[1]")
	WebElement addmoreaboutpositionbtn;

	@FindBy(xpath="(//button[@class='btn btn-primary btn-shadow savebutton'])[1]")
	WebElement savebtn;

	@FindBy(xpath="(//button[normalize-space()='ADD INTERVIEW KIT'])[1]")
	WebElement Addinterviewkitbtn;

	@FindBy(xpath="(//button[normalize-space()='Add Question'])[1]")
	WebElement addquestionbtn;
	//add question module
	@FindBy(xpath="(//textarea[@id='video_data'])[1]")
	WebElement addquestionmodulevideotext;

	@FindBy(xpath="(//button[normalize-space()='MCQ'])[1]")
	WebElement mcqbtn;

	@FindBy(xpath="(//button[normalize-space()='Essay'])[1]")
	WebElement essaybtn;

	@FindBy(xpath="(//button[normalize-space()='Essay'])[1]")
	WebElement audiobtn;

	@FindBy(xpath="(//button[normalize-space()='Video'])[1]")
	WebElement videobtn;

	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[3]") //add question module cancel btn
	WebElement cancelcrossbtn;

	@FindBy(xpath="(//button[@class='btn btn-light btn-shadow me-1 text-reset'])[1]")
	WebElement cancelbtn;

	@FindBy(xpath="(//button[@class='btn btn-primary btn-shadow addCustomeQuestionJQ'])[1]")
	WebElement savequesbtn;

	@FindBy(xpath="(//input[@id='notifications'])[1]")
	WebElement emailnotificationfield;

	@FindBy(xpath="(//button[normalize-space()='Add'])[1]")
	WebElement addnotificationemailbtn;

	@FindBy(xpath="(//input[@id='option11'])[1]")
	WebElement summarymandatory;

	@FindBy(xpath="(//input[@id='option12'])[1]")
	WebElement summaryoptional;

	@FindBy(xpath="(//input[@id='option12'])[1]")
	WebElement summaryoff;

	@FindBy(xpath="(//input[@id='option21'])[1]")
	WebElement expmandatory;

	@FindBy(xpath="(//input[@id='option31'])[1]")
	WebElement resumemandatory;

	@FindBy(xpath="(//input[@id='option41'])[1]")
	WebElement docmandatory;

	@FindBy(xpath="(//input[@id='jobseeker_signup_confirmation'])[1]")
	WebElement resume;

	@FindBy(xpath="(//input[@id='can_request_retake'])[1]")
	WebElement requestretake;

	@FindBy(xpath="(//input[contains(@class,'form-check-input ai_features')])[1]")
	WebElement aifeaturecheckbox;

	@FindBy(xpath="(//input[@class='form-check-input live_proctoring'])[1]")
	WebElement liveproctoringcheckbox;

	@FindBy(xpath="(//button[@id='ResetButton'])[1]")
	WebElement pagecancelbtn;

	@FindBy(xpath="(//button[contains(@class,'btn btn-primary me-2 savebutton')])[1]")
	WebElement bottomsavebtn;

	@FindBy(xpath="(//textarea[@id='mcq_data'])[1]")
	WebElement mcqtextarea;

	@FindBy(xpath="(//input[@id='options1'])[1]")
	WebElement mcqoption1;

	@FindBy(xpath="(//input[@id='options1'])[2]")
	WebElement mcqoption2;

	@FindBy(xpath="(//button[normalize-space()='Add Another Option'])[1]")
	WebElement addonotheroptionbtn;

	@FindBy(xpath="(//input[@id='options1'])[3]")
	WebElement mcqoption3;

	@FindBy(xpath="(//input[@id='radioNoLabel1'])[1]")
	WebElement firstoptionradiobtn;
	
	@FindBy(xpath="(//h6[normalize-space()='Edit Job Post'])[1]")
	WebElement editjobtext;
	
	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[2]")
	WebElement cancelbtnoneditmodule;




	//initializing OR

	public JobConfigurationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	//actions
	
	public void jobConfigurationPageDisplay()
	{
		String s = jobconfigurationpagetext.getText();
		Assert.assertEquals(s,"Job Configuration");
	}


	public void setConfiguration() throws InterruptedException, IOException
	{
		JavascriptClicks.javaScripthandle(emailnotificationfield);
		Thread.sleep(3000);
		emailnotificationfield.sendKeys(prop.getProperty("notificationemail"));
		addnotificationemailbtn.click();

		JavascriptClicks.javaScripthandle(summarymandatory);
		Thread.sleep(3000);

		if(summarymandatory.isSelected())
		{
			System.out.println("summary is mandatory checkbox already selected ");
		}
		else
		{
			summarymandatory.click();
		}
		JavascriptClicks.javaScripthandle(resumemandatory);
		Thread.sleep(3000);
		if(resumemandatory.isSelected()) 
		{
			System.out.println("resume is mandatory already selected");
		}
		else
		{
			resumemandatory.click();
		}

		if(docmandatory.isSelected()) 
		{
			System.out.println("document  is mandatory already selected");
		}
		else
		{
			docmandatory.click();
		}

		if(resume.isSelected()) 
		{
			System.out.println("resume   is  already selected");
		}
		else
		{
			resume.click();
		}

		if(requestretake.isSelected()) 
		{
			System.out.println("resume   is  already selected");
		}
		else
		{
			requestretake.click();
		}

	/*	if(aifeaturecheckbox.isEnabled()) 
		{
			if(aifeaturecheckbox.isSelected()) 
			{
				System.out.println("AI is enabled for the job");

			}

			else 
			{
				aifeaturecheckbox.click();	
			}
		}
		else
		{
			System.out.println("AI is not requested for the account");
		}

		if(liveproctoringcheckbox.isEnabled()) 
		{
			if(liveproctoringcheckbox.isSelected()) 
			{
				System.out.println("Live proctoring is enabled for the job");

			}

			else 
			{
				liveproctoringcheckbox.click();	
			}
		}
		else
		{
			System.out.println("live proctoring  is not requested for the account");
		}  
		
  */


		JavascriptClicks.javaScripthandle(bottomsavebtn);
		Thread.sleep(2000);

		bottomsavebtn.click();

		Thread.sleep(5000);
		jd = new JobmaDashboard();

		jd.clickOnSetupInterviewModule();
		Thread.sleep(3000);
		jd.clickOnScheduleInterviewBtn();
		Thread.sleep(9000);
		sip = new ScheduleInterviewPage();
		sip.selectJobFromDd(prop.getProperty("positionjob"));
		Thread.sleep(3000);
		sip.verifyConfigurations();



	}

	public void addQuestionBtnTest()
	{   WebDriverUtilities.wait(driver, 20, addquestionbtn);
	addquestionbtn.click();
	WebDriverUtilities.wait(driver, 20, addquestionmodulevideotext);

	addquestionmodulevideotext.click();
	addquestionmodulevideotext.sendKeys("This is video question 31");

	savequesbtn.click();
	WebDriverUtilities.wait(driver, 20, addquestionbtn);
	addquestionbtn.click();
	WebDriverUtilities.wait(driver, 20, mcqbtn);
	mcqbtn.click();
	mcqtextarea.click();
	mcqtextarea.sendKeys("This is added MCQ question in kit");
	mcqoption1.sendKeys("option1");
	mcqoption2.sendKeys("option2");
	addonotheroptionbtn.click();
	mcqoption3.sendKeys("option3");
	firstoptionradiobtn.click();
	savequesbtn.click();



	}
	
	public void clickOnCancelBtnOnJobConfigurationPage() throws InterruptedException
	{
		JavascriptClicks.javaScripthandle(pagecancelbtn);
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriverUtilities.wait(driver,40,pagecancelbtn );
		pagecancelbtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String s =driver.getCurrentUrl();
		Assert.assertEquals(s, "https://testing.jobma.com/employer/positions-listing");
	}
	
	public InterviewKitListing clickOnAddInterviewKitBtn() throws IOException
	{
		 Addinterviewkitbtn.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 ikl= new InterviewKitListing();
		 String t = ikl.interviewKitListingHeading();
		 System.out.println(t);
		 Assert.assertEquals(t, "Interview kit listing");
		 return new InterviewKitListing();
	}
	
	public void clickOnAddMoreAboutPosition() throws InterruptedException, AWTException
	{
		addmoreaboutpositionbtn.click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		cancelbtnoneditmodule.click();
		boolean flag =editjobtext.isDisplayed();
		Assert.assertTrue(flag);
		
		
	}
	





}
