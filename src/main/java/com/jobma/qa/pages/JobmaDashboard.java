package com.jobma.qa.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.JavascriptClicks;
import com.jobma.qa.util.WebDriverUtilities;

public class JobmaDashboard extends TestBase {

	JavascriptExecutor js =(JavascriptExecutor)driver;
	@FindBy(xpath="(//img[@class='brand-logo '])[1]") // company logo
	WebElement companylogo;

	/*@FindBy(xpath="//i[@class='bi bi-gear nav-icon-size']") // settings icon
	WebElement settings;*/

	@FindBy(xpath="//span[contains(text(),'Positions')]") //positions
	WebElement clickonpositions;

	@FindBy(xpath="(//span[contains(text(),'Setup Interview')])[1]") //setupinterview
	WebElement clickonsetupinterview;

	@FindBy(xpath="(//span[contains(text(),'Interview Link')])[1]")
	WebElement interviewlinkbtn;

	@FindBy(xpath="//span[contains(text(),'Applicants')]")// clickonapplicant module
	WebElement clickonapplicants;

	@FindBy(xpath="(//span[normalize-space()='Evaluate'])[1]") //evaluate in applicants module
	WebElement evaluate;

	@FindBy(xpath="//span[normalize-space()='Track']")
	WebElement track;

	@FindBy(xpath="(//span[contains(text(),'Sub Accounts')])[1]") //click on subaccount
	WebElement clickonsubaccount;


	@FindBy(xpath="(//span[contains(text(),'Reports')])[1]") // click on reports
	WebElement clickonreports;

	@FindBy(xpath="(//span[contains(text(),'Integrations')])[1]") //click on integration
	WebElement clickonintegrationmodule;

	@FindBy(xpath="(//span[contains(text(),'Integrations')])[2]")
	WebElement integrationbtn;

	@FindBy(xpath="//span[contains(text(),'Interview Listing')]")
	WebElement integrationlisting;

	@FindBy(xpath="//span[contains(text(),'Billing')]") //click on billing
	WebElement clickonbilling;

	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[1]") //click on credits button
	WebElement clickoncreditplussymbol ;

	@FindBy(xpath="(//a[normalize-space()='Get started'])[1]") // getstared button
	WebElement clickongetstarted ;

	@FindBy(xpath="(//a[normalize-space()='Professional Plan'])[1]") //change to dyanamic xpath 
	WebElement clickonplan;

	@FindBy(xpath="(//span[normalize-space()='Schedule Interview'])[1]") // schedule interview btn
	WebElement clickonscheduleinterviewbtn;


	@FindBy(xpath="//div[contains(text(),'Create an interview')]")  //create an interview 
	WebElement clickoncreateaninterview ;

	@FindBy(xpath="//div[contains(text(),'Track Interviews')]") //track interview
	WebElement clickontrackinterview ;

	@FindBy(xpath="//div[contains(text(),'Evaluate')]") //click on evaluate
	WebElement clickonevaluate ;

	@FindBy(xpath="(//a[contains(text(),'View All')])[1]") //click on view all of interview and invitation
	WebElement clickonviewallofInterviewInvitation ;

	@FindBy(xpath="(//a[contains(text(),'View All')])[2]") //click on view all of posted jobs
	WebElement clickonviewallofpostedjobs;


	@FindBy(xpath="(//a[contains(text(),'View All')])[3]") //view all of recent invitation
	WebElement clickonviewallofrecentinvitations;

	@FindBy(xpath="//div[contains(text(),'Selected')]") // selected
	WebElement clickonselected;

	@FindBy(xpath="//div[contains(text(),'On Hold')]") // on hold
	WebElement clickonhold;

	@FindBy(xpath="//div[contains(text(),'Pending')]") //pending
	WebElement clickonpending;

	@FindBy(xpath="//div[contains(text(),'Rejected')]") //rejected
	WebElement clickonrejected;

	@FindBy(xpath="//div[contains(text(),'Shortlisted')]") //shortlisted
	WebElement clickonshortlisted;

	@FindBy(xpath="(//a[contains(text(),'View All')])[4]") //view all of upcoming interview
	WebElement clickonviewallofupcominginterviews;

	@FindBy(xpath="(//a[contains(text(),'View All')])[5]") //view all of recent applicants
	WebElement clickonviewallofrecentapplicants;

	@FindBy(xpath="(//a[contains(text(),'View All')])[6]") //view all of awaiting decison
	WebElement clickonviewallofawaitingdecison;

	@FindBy(xpath="(//a[contains(text(),'View All')])[7]") //view all of recent activity
	WebElement clickonviewallofrecentactivity;

	@FindBy(xpath="//a[contains(text(),'Scheduling Tool')]") //Scheduling Tool
	WebElement clickonSchedulingTool;

	@FindBy(xpath="(//span[contains(text(),'Positions')])[3]")
	WebElement positionpagetext;

	@FindBy(xpath="(//span[contains(text(),'Interview Kit')])[1]")
	WebElement interviewkitbtn;

	@FindBy(xpath="(//span[contains(text(),'Post a Job')])[1]")
	WebElement postajobbtn;

	@FindBy(xpath="(//a[contains(text(),'Evaluate')])[1]")
	WebElement evaluatebtnatawaitingdecision;

	@FindBy(xpath="(//a[contains(text(),'Evaluate')])[5]")
	WebElement evaluatebtnatrecentapplicants;

	@FindBy(xpath="//a[contains(@id,'theme-switch')]")
	WebElement plantext;

	@FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
	WebElement dashboardtext;

	@FindBy(xpath="(//div[contains(@id,'msg')])[4]")
	WebElement cantaccessmessage;

	@FindBy(xpath="(//i[contains(@class,'bi bi-link-45deg nav-icon-size2')])[2]")
	WebElement quicklinks;


	@FindBy(xpath="(//span[contains(text(),'Setup Interview')])[2]")
	WebElement Setupinterviewquicklinks;

	@FindBy(xpath="//a[contains(text(),'Schedule Interview')]")
	WebElement dashboardscheduleinterview;
	
	@FindBy(xpath="//i[contains(@class,'bi bi-gear nav-icon-size')]")
	WebElement dashboardsettings;
	
	









	//initialization of Object repository

	public JobmaDashboard() throws  IOException
	{
		PageFactory.initElements(driver, this);
	}



	public boolean verifyCompanyLogo()
	{
		return companylogo.isDisplayed();

	}

	public PositionsPage clickOnPositions() throws InterruptedException, IOException
	{
		clickonpositions.click();
		Thread.sleep(3000);
		String positiontext=positionpagetext.getText();
		System.out.println(positiontext);
		Assert.assertEquals(positiontext, "Positions");

		return new PositionsPage();




	}

	public void clickOnSetupInterviewModule()
	{
		clickonsetupinterview.click();

	}

	public void clickOnApplicantModule()
	{
		clickonapplicants.click();
	}

	public EvaluatePage clickOnEvaluateModule() throws IOException
	{

		clickonapplicants.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		clickonevaluate.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

		return new EvaluatePage();

	}

	public TrackPage clickOnTrack() throws IOException
	{
		track.click();
		return new TrackPage();
	}


	public SubAccount clickOnSubaccountsModule() throws IOException
	{
		clickonsubaccount.click();

		return  new SubAccount();
	}

	public void clickOnReportsModule()
	{
		clickonreports.click();
	}

	public void clickOnIntegrationModule()
	{
		clickonintegrationmodule.click();
	}

	public void clickOnBillingsModule() throws InterruptedException
	{
		clickonbilling.click();

	}

	public void clickOnCreditsBtn() throws InterruptedException
	{
		js.executeScript("arguments[0].scrollIntoView();",clickoncreditplussymbol);
		Thread.sleep(3000);
		clickoncreditplussymbol.click();

	}

	public void clickOnGetstartedBtn() throws InterruptedException
	{
		clickongetstarted.click();

	}

	public void clickOnPlanBtn()
	{
		clickonplan.click();
	}

	public ScheduleInterviewPage clickOnScheduleInterviewBtn() throws InterruptedException, IOException
	{ 

		clickonscheduleinterviewbtn.click();
		Thread.sleep(5000);
		return new ScheduleInterviewPage();

	}

	public InterviewKitListing clickOnCreateanInterviewBtn() throws IOException
	{
		clickoncreateaninterview.click();
		return new InterviewKitListing();
	}

	public void clickOnTrackInterviewsBtn()
	{
		clickontrackinterview.click();
	}

	public void clickOnEvaluateBtn()
	{
		clickonevaluate.click();

	}

	public void clickOnViewallBtnOfInterviewsInvitations()
	{
		clickonviewallofInterviewInvitation.click();
	}

	public void clickOnViewallOfPostedJobs() throws InterruptedException
	{
		js.executeScript("arguments[0].scrollIntoView();",clickonviewallofpostedjobs);
		Thread.sleep(4000);
		clickonviewallofpostedjobs.click();
	}

	public void clickOnViewallOfRecentInvitations() throws InterruptedException
	{
		js.executeScript("arguments[0].scrollIntoView();",clickonviewallofrecentinvitations);
		Thread.sleep(4000);
		clickonviewallofrecentinvitations.click();
	}

	public void clickOnViewallOfUcomingInterviews() throws InterruptedException
	{
		js.executeScript("arguments[0].scrollIntoView();",clickonviewallofupcominginterviews);
		Thread.sleep(4000);
		clickonviewallofupcominginterviews.click();
	}

	public void clickOnViewallOfRecentApplicants() throws InterruptedException
	{

		js.executeScript("arguments[0].scrollIntoView();",clickonviewallofrecentapplicants);
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickonviewallofrecentapplicants.click();
	}
	public void clickOnViewallOfAwitingDecisons() throws InterruptedException
	{ 
		js.executeScript("arguments[0].scrollIntoView();",clickonviewallofawaitingdecison);
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickonviewallofawaitingdecison.click();
	}

	public void clickOnViewallOfRecentActivity() throws InterruptedException
	{
		js.executeScript("arguments[0].scrollIntoView();",clickonviewallofrecentactivity);
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickonviewallofrecentactivity.click();
	}

	public void clickOnSchedulingTool() throws InterruptedException
	{
		js.executeScript("arguments[0].scrollIntoView();",clickonSchedulingTool);
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickonSchedulingTool.click();
	}

	public PostAJob clickOnPostAJobBtn() throws InterruptedException, IOException
	{


		postajobbtn.click();

		return new PostAJob();

	}

	public void clickOnEvaluatebtnOfAwaitingDecision()
	{
		JavascriptClicks.javaScripthandle(evaluatebtnatawaitingdecision);
		WebDriverUtilities.wait(driver, 50, evaluatebtnatawaitingdecision);
		evaluatebtnatawaitingdecision.click();


	}











}
