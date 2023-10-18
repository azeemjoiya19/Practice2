package com.jobma.qa.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.JavascriptClicks;
import com.jobma.qa.util.WebDriverUtilities;

public class SubAccount extends TestBase {

	//OR

	@FindBy(xpath="(//span[contains(text(),'Sub Accounts')])[3]")
	WebElement  subaccountpagetext;

	@FindBy(xpath="//span[contains(text(),'Job Approval Authority')]")
	WebElement  jobapprovalauthority;

	@FindBy(xpath="//span[contains(@class,'select2-results')]//ul//li")
	List<WebElement>   jobapprovalauthoritylist;

	@FindBy(xpath="//span[contains(text(),'Select Account Status ')]")
	WebElement  selectaccountstatusfilterclick;


	@FindBy(xpath="//span[contains(@class,'select2-results')]//ul//li")
	List<WebElement> selectaccountstatuslist  ;

	@FindBy(xpath="(//input[@id='searchBox'])[1]")
	WebElement  searchbox;

	@FindBy(xpath="(//i[@class='bi bi-search'])[2]")
	WebElement  searchboxbtn;

	@FindBy(xpath="(//button[normalize-space()='Add sub user'])[1]")
	WebElement  addsubuserbtn;

	@FindBy(xpath="(//input[@id='first_name'])[1]")
	WebElement  subusernamefield;

	@FindBy(xpath="(//input[@id='email'])[1]")
	WebElement  subuseremailfield;

	@FindBy(xpath="(//input[@id='password'])[1]")
	WebElement  subuserpasswordfield;

	@FindBy(xpath="(//input[@id='confirm_password'])[1]")
	WebElement  subuserconfirmpasswordfield;

	@FindBy(xpath="(//input[@id='approval_authority'])[1]")
	WebElement  approvalauthoritycheckbox;


	@FindBy(xpath="(//button[normalize-space()='Add Account'])[1]")
	WebElement  addaccountbutton;

	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[3]")
	WebElement  newsubusercancelmodulebtn;

	@FindBy(xpath="(//button[normalize-space()='Permissions'])[1]")
	WebElement  permissionsbtn;

	@FindBy(xpath="(//button[@type='button'][normalize-space()='View'])[1]")
	WebElement  viewbtn;

	@FindBy(xpath="(//button[@id='activeDeactive_106025'])[1]")
	WebElement  deactivatebtn;

	@FindBy(xpath="(//button[@type='button'][normalize-space()='Delete'])[1]")
	WebElement  deletebtn;

	@FindBy(xpath="(//a[@aria-label='Access Account'][normalize-space()='Access Account'])[1]")
	WebElement  accessaccountbtn;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[1]")
	WebElement  evaluatecandidatepermissioncheckbox;


	@FindBy(xpath="(//input[contains(@id,'clone_')])[2]")
	WebElement  managesubaccountcheckbox;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[3]")
	WebElement  invitecandidatecheckbox;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[4]")
	WebElement  integrationcheckbox;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[5]")
	WebElement  interviewlistingcheckbox;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[6]")
	WebElement  companyprofilecheckbox;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[7]")
	WebElement  companyvideocheckbox;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[8]")
	WebElement  interviewkitcheckbox;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[9]")
	WebElement  ratingparameters;

	@FindBy(xpath="(//input[contains(@id,'clone_')])[10]")
	WebElement  interviewbranding;

	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[2]")
	WebElement permissioncanvascancelbtn;

	@FindBy(xpath="//h6[contains(text(),'Add subaccount')]")
	WebElement addsubusermoduletitletext;

	@FindBy(xpath="//div[contains(text(),'Sub user added successfully.')]")
	WebElement subusersuccessmessage;

	@FindBy(xpath="(//h6[@class='offcanvas-title'])[1]")
	WebElement permissionoffcanvas;

	@FindBy(xpath="//div[contains(text(),'Permission changed successfully!')]")
	WebElement permissionchangedsuccessfullmessage;

	@FindBy(xpath="(//div[@id='msg'])[1]")
	WebElement permissiondeniedmessage;

	@FindBy(xpath="(//li[contains(@class,'aside-nav-item')] )[3]//span")
	List<WebElement> applicantslist;

	@FindBy(xpath="//a[contains(text(),'Click here')]")
	WebElement clickherebtn;

	@FindBy(xpath="//ul[contains(@class,'aside-bar-nav')]//li")
	List<WebElement> sidebarmenu;

	@FindBy(xpath="(//div[contains(@id,'msg')])[4]") //permission denied message for Invite candidate from position bulk invite
	WebElement Permissiondenied;

	@FindBy(xpath="//h6[contains(text(),'Limit to add more sub accounts has been reached')]")
	WebElement subaccountLimitreachedpopup;

	@FindBy(xpath="//a[contains(text(),'Add')]") //Add subaccount
	WebElement AddSubAccountlimitbtn;



	public	SubAccount() throws IOException
	{
		PageFactory.initElements(driver, this);
	}	

	//Actions 

	public void verifySubAccountPage()
	{
		String s =subaccountpagetext.getText();
		Assert.assertEquals(s, "Sub Accounts");

	}

	public void addSubUser() throws IOException, InterruptedException
	{
		addsubuserbtn.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try 
		{
			if(subaccountLimitreachedpopup.isDisplayed())
			{
				AddSubAccountlimitbtn.click();
				sapp = new AddSubAccountPricing();
				sapp.addSubAccountLimit();	

				jd = new JobmaDashboard();

				WebDriverUtilities.wait1(driver, 50, jd.clickonsubaccount);
				jd.clickonsubaccount.click();
				WebDriverUtilities.wait1(driver, 50, addsubuserbtn);
				addsubuserbtn.click();
				//	WebDriverUtilities.wait1(driver, 30, sa.addsubusermoduletitletext);

			}
		}
		catch(Exception e)
		{
			System.out.println("SubAccount limit not require to add");
		}

		WebDriverUtilities.wait1(driver, 30, addsubusermoduletitletext);
		subusernamefield.sendKeys(prop.getProperty("subusername"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		subuseremailfield.sendKeys(prop.getProperty("subuseremail"));
		subuserpasswordfield.sendKeys(prop.getProperty("subuserpasswordfield"));
		subuserconfirmpasswordfield.sendKeys(prop.getProperty("subuserconfirmpasswordfield"));
		//approvalauthoritycheckbox.click();
		addaccountbutton.click();
		WebDriverUtilities.wait(driver,30, subusersuccessmessage);
		boolean flag = subusersuccessmessage.isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Subaccount created successfully");


	}

	public void permissionsButton()
	{
		searchbox.sendKeys(prop.getProperty("subuseremail"));
		searchboxbtn.click();
		WebDriverUtilities.wait(driver, 30, permissionsbtn);
		permissionsbtn.click();
		WebDriverUtilities.wait(driver, 50, permissionoffcanvas );
		boolean flag = permissionoffcanvas.isDisplayed();
		Assert.assertTrue(flag);
		permissioncanvascancelbtn.click();

		System.out.println("Permission offcanvas displayed successfully");

	}

	public void permissionDeniedEvaluateCandidate() throws IOException, InterruptedException
	{     searchbox.clear();
	searchbox.sendKeys(prop.getProperty("subuseremail"));
	searchboxbtn.click();
	WebDriverUtilities.wait(driver, 30, permissionsbtn);
	permissionsbtn.click();
	WebDriverUtilities.wait(driver, 30, evaluatecandidatepermissioncheckbox);
	Thread.sleep(1000);
	if(evaluatecandidatepermissioncheckbox.isSelected())
	{
		evaluatecandidatepermissioncheckbox.click();
	}
	else
	{
		System.out.println("Permission to evaluate not given already");
	}


	WebDriverUtilities.wait(driver, 20, permissionchangedsuccessfullmessage);
	boolean flag=permissionchangedsuccessfullmessage.isDisplayed();
	Assert.assertTrue(flag);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebDriverUtilities.wait(driver, 100, permissioncanvascancelbtn);
	Thread.sleep(3000);
	permissioncanvascancelbtn.click();
	accessaccountbtn.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	jd = new JobmaDashboard();
	jd.clickOnEvaluateBtn();
	WebDriverUtilities.wait(driver, 30,  permissiondeniedmessage);
	boolean flag1= permissiondeniedmessage.isDisplayed();
	Assert.assertTrue(flag1);
	System.out.println("Permission to evaluate denied successfully from dashboard");
	jd.clickonapplicants.click();
	for(int i=1;i<applicantslist.size();i++)

	{
		if(applicantslist.get(i).getText().contains("Evaluate"))
		{
			System.out.println("Emplyer dont have permission to evaluate but he is able to evaluate from applicants");
		}
		else
		{
			Assert.assertTrue(true);
		}
	}

	JavascriptClicks.javaScripthandle(jd.evaluatebtnatawaitingdecision);
	WebDriverUtilities.wait(driver,30, jd.evaluatebtnatawaitingdecision);
	boolean m =WebDriverUtilities.checkElementIsClickable(jd.evaluatebtnatawaitingdecision);
	Assert.assertFalse(m);
	JavascriptClicks.javaScripthandle(jd.evaluatebtnatrecentapplicants);
	WebDriverUtilities.wait(driver,30, jd.evaluatebtnatrecentapplicants);
	boolean n =WebDriverUtilities.checkElementIsClickable(jd.evaluatebtnatrecentapplicants);
	Assert.assertFalse(n);

	/*Thread.sleep(4000);
		boolean flag2 = jd.evaluatebtnatawaitingdecision.isEnabled();
		Assert.assertFalse(flag2);
		JavascriptClicks.javaScripthandle(jd.evaluatebtnatrecentapplicants);
		WebDriverUtilities.wait(driver,30, jd.evaluatebtnatrecentapplicants);
	boolean flag3 =	jd.evaluatebtnatrecentapplicants.isEnabled();
	Assert.assertFalse(flag3); */


	}

	public void manageSubaccountPermissionDenied() throws IOException, InterruptedException
	{
		clickherebtn.click();
		jd.clickOnSubaccountsModule();
		WebDriverUtilities.wait1(driver, 30, subaccountpagetext);

		searchbox.sendKeys(prop.getProperty("subuseremail"));
		searchboxbtn.click();

		permissionsbtn.click();
		WebDriverUtilities.wait1(driver, 30, permissionoffcanvas);
		
		
		WebDriverUtilities.wait(driver, 30,managesubaccountcheckbox );
		Thread.sleep(2000);
		managesubaccountcheckbox.click();
		WebDriverUtilities.wait(driver, 20, permissionchangedsuccessfullmessage);
		boolean flag=permissionchangedsuccessfullmessage.isDisplayed();
		Assert.assertTrue(flag);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverUtilities.wait(driver, 100, permissioncanvascancelbtn);
		Thread.sleep(3000);
		permissioncanvascancelbtn.click();
		accessaccountbtn.click();
		for(int i = 0;i<sidebarmenu.size();i++)
		{
			//System.out.println(sidebarmenu.get(i).getText());
			if(sidebarmenu.get(i).getText().contains("subaccount"))
			{
				System.out.println("Subaccount still assessible please check it");
			}
			else
			{
				System.out.println("Subaccount is not visible");


			}


		}

	}
	public void inviteCandidatePermissiondenied() throws IOException, InterruptedException
	{
		clickherebtn.click();
		jd.clickOnSubaccountsModule();
		WebDriverUtilities.wait1(driver, 30, subaccountpagetext);

		searchbox.sendKeys(prop.getProperty("subuseremail"));
		searchboxbtn.click();

		permissionsbtn.click();
		WebDriverUtilities.wait1(driver,30 , permissionoffcanvas );
		WebDriverUtilities.wait(driver,30 , evaluatecandidatepermissioncheckbox );
		Thread.sleep(2000);
		evaluatecandidatepermissioncheckbox.click();
		Thread.sleep(5000);
		WebDriverUtilities.wait(driver, 30,invitecandidatecheckbox);

		System.out.println("Dis selecting Invite Candidate permission for Subaccount");
		//	WebDriverUtilities.wait(driver, 30,invitecandidatecheckbox);
		invitecandidatecheckbox.click();


		WebDriverUtilities.wait(driver, 20, permissionchangedsuccessfullmessage);
		boolean flag1=permissionchangedsuccessfullmessage.isDisplayed();
		Assert.assertTrue(flag1);
		System.out.println("Checking permission changed for Invite from Subaccount");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverUtilities.wait(driver, 100, permissioncanvascancelbtn);
		Thread.sleep(3000);
		permissioncanvascancelbtn.click();
		accessaccountbtn.click();
		System.out.println("Access into subaccount and Checking position module candidate invite options");
		WebDriverUtilities.wait1(driver, 30, jd.clickonpositions);
		pp = new PositionsPage();
		pp=jd.clickOnPositions();
		WebDriverUtilities.wait1(driver, 30, pp.positionspagetext);
		try {
			System.out.println("Checking Quick invite is disabled or not");
			boolean flag2 = pp.quickinvitebtn.isDisplayed();
			Assert.assertFalse(flag2);
		}
		catch(Exception e) {
			System.out.println("Quick invite is Disabled Successfully from subaccount from Position Page");
			Assert.assertTrue(true);

		}
		//	boolean flag2 = pp.quickinvitebtn.isDisplayed();
		//	Assert.assertFalse(flag2);

		try {
			System.out.println("Checking Bulk invite disabled ");
			pp.bulkinvite.click();
			WebDriverUtilities.wait1(driver,30 , Permissiondenied);
			boolean f=Permissiondenied.isDisplayed();
			Assert.assertTrue(f, Permissiondenied.getText());


		}

		catch(Exception e)
		{
			System.out.println("Plan doesnot have bulk invite functionality ");

			String s = jd.plantext.getText();
			if(s.equals("Essential Plan"))
			{
				System.out.println("For essential plan bulk invite is not activated");
			} 



		}

		System.out.println("Checking Candidate invite from Interview Kit , Setup interview");
		jd = new JobmaDashboard();
		jd.clickonsetupinterview.click();
		WebDriverUtilities.wait1(driver, 30, jd.interviewkitbtn);
		jd.interviewkitbtn.click();
		ikl= new InterviewKitListing();
		WebDriverUtilities.wait1(driver, 30, ikl.Setupinterviewonkit);
		ikl.Setupinterviewonkit.click();
		WebDriverUtilities.wait1(driver, 40, jd.dashboardtext);

		boolean flag2 = jd.dashboardtext.isDisplayed();
		Assert.assertTrue(flag2);
		System.out.println("Subaccount user not able to Invite from Kit successfull");
		System.out.println("Checking Setup interview button in interview link page");
		jd.clickonsetupinterview.click();
		WebDriverUtilities.wait1(driver, 30, jd.interviewlinkbtn);
		jd.interviewlinkbtn.click();
		ilp = new InterviewLinkPage();
		WebDriverUtilities.wait1(driver, 30, ilp.interviewlinktext); 
		try
		{
			ilp.Setupinterviewbtn.click();
		}

		catch(Exception e)
		{
			Assert.assertTrue(true);
			System.out.println("Setupinterview button in interview link Successfully disabled");
		}
		/*	 jd.clickonapplicants.click();
		 WebDriverUtilities.wait1(driver, 20, jd.track);
		 jd.track.click();
		 tp = new TrackPage();
		 WebDriverUtilities.wait1(driver, 20, tp.setupinterviewbtn);
		 tp.setupinterviewbtn.click();
		 boolean  b = tp.Cantaccessmessage.isDisplayed();
		 Assert.assertTrue(b);
		 jd.clickonapplicants.click();
		 WebDriverUtilities.wait(driver, 20, jd.evaluate);
		 jd.evaluate.click();
		 ep = new EvaluatePage();
		 WebDriverUtilities.wait1(driver, 90, ep.evaluatebtn );
		 ep.evaluatebtn.click();
		 ae = new ApplicationEvaluate();
		 JavascriptClicks.javaScripthandle(ae.Scheduleinterviewbtn);
		 WebDriverUtilities.wait1(driver, 40, ae.Scheduleinterviewbtn);
		 ae.Scheduleinterviewbtn.click(); */
        jd.companylogo.click();
        Thread.sleep(2000);
        WebDriverUtilities.wait(driver, 30, jd.dashboardscheduleinterview);
        
		jd.dashboardscheduleinterview.click();
		WebDriverUtilities.wait1(driver, 30, jd.cantaccessmessage);
		boolean flag3 = jd.cantaccessmessage.isDisplayed();
		Assert.assertTrue(flag3);

		jd.quicklinks.click();
		WebDriverUtilities.wait(driver, 30, jd.Setupinterviewquicklinks);
		jd.Setupinterviewquicklinks.click();
		WebDriverUtilities.wait(driver, 30, jd.cantaccessmessage);
		boolean flag4 = jd.cantaccessmessage.isDisplayed();
		Assert.assertTrue(flag4);





	}

	public void integrationPermissionDenied() throws InterruptedException, IOException
	{
		jd = new JobmaDashboard();
		clickherebtn.click();
		jd.clickOnSubaccountsModule();
		WebDriverUtilities.wait1(driver, 30, subaccountpagetext);

		searchbox.sendKeys(prop.getProperty("subuseremail"));
		searchboxbtn.click();

		permissionsbtn.click();
		WebDriverUtilities.wait1(driver,30 , permissionoffcanvas);
		WebDriverUtilities.wait(driver,30 ,integrationcheckbox );
		Thread.sleep(1000);
		integrationcheckbox.click();
		WebDriverUtilities.wait1(driver, 20, permissionchangedsuccessfullmessage);
		boolean flag=permissionchangedsuccessfullmessage.isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Checking permission changed for integration from Subaccount");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverUtilities.wait(driver, 100, permissioncanvascancelbtn);
		Thread.sleep(3000);
		permissioncanvascancelbtn.click();
		accessaccountbtn.click();
		System.out.println("Access into subaccount ");
		WebDriverUtilities.wait(driver, 30, jd.clickonintegrationmodule);
		jd.clickonintegrationmodule.click();
		try
		{
			boolean flag1 = jd.integrationbtn.isDisplayed();
			Assert.assertFalse(flag1);
			System.out.println("Integration permission is not given Still integration is displayed");
		}
		catch(Exception e)
		{
			Assert.assertTrue(true);
		}

	}

	public void interviewListingPermissionDenied() throws IOException, InterruptedException
	{
		jd = new JobmaDashboard();
		clickherebtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		jd.clickOnSubaccountsModule();
		WebDriverUtilities.wait1(driver, 30, subaccountpagetext);

		searchbox.sendKeys(prop.getProperty("subuseremail"));
		searchboxbtn.click();

		permissionsbtn.click();
		WebDriverUtilities.wait1(driver,30 , permissionoffcanvas);
		WebDriverUtilities.wait(driver,30 , integrationcheckbox);
		Thread.sleep(2000);
		
		integrationcheckbox.click();
		Thread.sleep(4000);
		interviewlistingcheckbox.click();
		WebDriverUtilities.wait1(driver, 20, permissionchangedsuccessfullmessage);
		boolean flag=permissionchangedsuccessfullmessage.isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Checking permission changed for integration from Subaccount");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverUtilities.wait(driver, 100, permissioncanvascancelbtn);
		Thread.sleep(3000);
		permissioncanvascancelbtn.click();
		accessaccountbtn.click();
		WebDriverUtilities.wait(driver,60,jd.clickonintegrationmodule);
		jd.clickonintegrationmodule.click();
		try 
		{
			boolean flag1= jd.integrationlisting.isDisplayed();
			Assert.assertFalse(true);
		}
		catch(Exception e)
		{
			Assert.assertTrue(true);
		}
		
		
	/*	for(int i = 0;i<sidebarmenu.size();i++)
		{
			//System.out.println(sidebarmenu.get(i).getText());
			if(sidebarmenu.get(i).getText().contains("Integrations"))
			{
				System.out.println("Integration still assessible please check it");
				SoftAssert softassert = new SoftAssert();
				softassert.assertTrue(false);
				softassert.assertAll();

			}
			else
			{
				Assert.assertTrue(true);
			}

		}*/


	}
	
	public void companyProfilePermissionDenied() throws IOException
	{
		jd = new JobmaDashboard();
		clickherebtn.click();
		jd.clickOnSubaccountsModule();
		WebDriverUtilities.wait1(driver, 30, subaccountpagetext);

		searchbox.sendKeys(prop.getProperty("subuseremail"));
		searchboxbtn.click();

		permissionsbtn.click();
		WebDriverUtilities.wait1(driver,30 , permissionoffcanvas);
		WebDriverUtilities.wait(driver,30 , companyprofilecheckbox);
		
		companyprofilecheckbox.click();
		WebDriverUtilities.wait1(driver, 20, permissionchangedsuccessfullmessage);
		boolean flag=permissionchangedsuccessfullmessage.isDisplayed();
		Assert.assertTrue(flag);
		jd.dashboardsettings.click();
		settings = new SettingsPage();
		WebDriverUtilities.wait1(driver, 100,settings.settingstext );
		try {
		JavascriptClicks.javaScripthandle(settings.savechangesbtn);
		boolean flag1  = settings.savechangesbtn.isDisplayed();
		Assert.assertFalse(flag1);
		
		
		}
		catch(Exception e)
		{
			Assert.assertTrue(true);
		}
		
	}
}
