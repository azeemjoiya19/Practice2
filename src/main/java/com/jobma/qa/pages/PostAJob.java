package com.jobma.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.DatePicker;
import com.jobma.qa.util.TakeScreenshotHandle;

public class PostAJob extends TestBase {


	@FindBy(xpath="(//input[@id='company_designation'])[1]")
	WebElement jobtitlefield;

	@FindBy(xpath="(//span[@id='select2-jobma_job_type-container'])[1]")
	WebElement clickonjobtypedd;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> jobtypeddlist ;

	@FindBy(xpath="(//input[@id='jobma_job_expiration_date'])[1]")
	WebElement jobexpirationdate;

	//(//input[@id='jobma_job_expiration_date'])[1]

	@FindBy(xpath="(//span[@id='select2-job_assessment_kit-container'])[1]")
	WebElement clickonselectinterviewkitdd;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> interviewkitddlist;



	@FindBy(xpath="(//a[normalize-space()='Additional Details'])[1]")
	WebElement jobtilefieldvalidation;

	@FindBy(xpath=" (//span[@id='jobma_job_expiration_date-error'])[1]")
	WebElement jobexpirationdatevalidation;

	@FindBy(xpath="(//span[@id='job_assessment_kit-error'])[1]")
	WebElement selectkitvalidation;

	@FindBy(xpath="(//span[@id='jobma_job_desc-error'])[1]")
	WebElement jobdescvalidation;

	@FindBy(xpath="(//a[normalize-space()='Additional Details'])[1]")
	WebElement additionaldetailtab;

	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement keywordsfield;

	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement qualificationfield;

	@FindBy(xpath="(//textarea[@placeholder='Select Functional Area'])[1]")
	WebElement clickonfunctionalareadd;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> functionalareaddlist;

	@FindBy(xpath="(//span[@aria-expanded='true'])[1]")
	WebElement selectanindustryfield;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> selectanindustryfieldddlist;

	//07-04-2023

	@FindBy(xpath="(//span[@id='select2-min_Exp-container'])[1]")
	WebElement clickonminexp;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> minexpddlist  ;

	@FindBy(xpath=" (//span[@id='select2-max_Exp-container'])[1]")
	WebElement clickonmaxexp;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> maxexpddlist ;

	@FindBy(xpath="(//input[@id='min_salary'])[1]")
	WebElement minsal;

	@FindBy(xpath="(//input[@id='max_salary'])[1]")
	WebElement maxsal;





	@FindBy(xpath="(//span[@id='select2-jobma_job_notice-container'])[1]")
	WebElement clickonafteravailable;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> listofafteravailable;

	@FindBy(xpath="(//input[@name='Doc'])[2]")
	WebElement choosefilebtn;

	@FindBy(xpath="(//span[@id='select2-jobma_job_salary_type-container'])[1]")
	WebElement clickoncompensation;



	@FindBy(xpath="//span[@class='select2-results']")
	List<WebElement> compensationddlist ;

	@FindBy(xpath="(//span[@id='select2-jobma_job_currency-container'])[1]")
	WebElement clickoncurrencydd;

	@FindBy(xpath="//span[@class='select2-results']")
	List<WebElement> listofcurrency ;

	@FindBy(xpath="(//button[normalize-space()='Start Recording'])[1]")
	WebElement startrecordingbtn;

	@FindBy(xpath="(//button[normalize-space()='Finish Recording'])[1]")
	WebElement finishrecordbtn;

	@FindBy(xpath="(//button[normalize-space()='Re-Record'])[1]")
	WebElement rerecordbtn;

	@FindBy(xpath="(//button[@class='btn btn-primary playRecord'])[1]")
	WebElement playbtn;

	@FindBy(xpath="(//a[normalize-space()='Remove'])[1]")
	WebElement removebtn;

	@FindBy(xpath="(//button[normalize-space()='Delete'])[1]")
	WebElement deletebtnonpopup;

	@FindBy(xpath="(//button[normalize-space()='Cancel'])[1]")
	WebElement cancelbtnonpopup;

	@FindBy(xpath="(//a[normalize-space()='Upload Video'])[1]")
	WebElement uploadvideobtn;

	@FindBy(xpath="(//input[@name='vidfile'])[1]")
	WebElement choosevideouploadbtn;

	@FindBy(xpath="(//a[normalize-space()='Address Details'])[1]")
	WebElement adressdetailtabbtn;

	@FindBy(xpath="(//textarea[@id='locality'])[1]")
	WebElement addressfield;

	@FindBy(xpath="(//input[@id='administrative_area_level_2'])[1]")
	WebElement cityfield;

	@FindBy(xpath="(//input[@id='administrative_area_level_1'])[1]")
	WebElement statefield;

	@FindBy(xpath="(//input[@id='country'])[1]")
	WebElement countryfield;

	@FindBy(xpath="(//input[@id='postal_code'])[1]")
	WebElement postalcode;

	@FindBy(xpath="(//span[@id='localityErr'])[1]")
	WebElement adressfieldvalidation;

	@FindBy(xpath="(//span[@id='administrative_area_level_2Err'])[1]")
	WebElement cityvalidation;

	@FindBy(xpath="(//span[@id='administrative_area_level_1Err'])[1]")
	WebElement statevalidation;

	@FindBy(xpath="(//button[normalize-space()='Add Location'])[1]")
	WebElement addlocbtn;

	@FindBy(xpath="(//a[normalize-space()='Company Details'])[1]")
	WebElement companydetailtab;

	@FindBy(xpath="(//textarea[@id='company_desc'])[1]")
	WebElement aboutcompanybox;

	@FindBy(xpath="(//input[@id='company_name'])[1]")
	WebElement companynamefield;

	@FindBy(xpath="(//input[@id='company_website'])[1]")
	WebElement companywebsite;

	@FindBy(xpath="(//input[@id='jobma_recruiter_name'])[1]")
	WebElement recruiterdetailsnamefiled;

	@FindBy(xpath="(//input[@id='jobma_recruiter_email'])[1]")
	WebElement emailfield;

	@FindBy(xpath="(//input[@id='recruiter_phone'])[1]")
	WebElement phonenumberfield;

	@FindBy(xpath="(//input[@id='recruiter_ext'])[1]")
	WebElement extensionnumberfield;

	@FindBy(xpath="(//button[normalize-space()='Next'])[1]")
	WebElement nextbtn;


	@FindBy(xpath="(//button[normalize-space()='Publish'])[1]")
	WebElement publishbtn;

	@FindBy(xpath="(//td[@class='active day'])[1]")
	WebElement date;

	@FindBy(xpath="html/body")
	WebElement jobma_Desc;	

	//Confirm message
	@FindBy(xpath="//div[@id='showmsg']//div[contains(text(),'')]")
	WebElement confirmmessgae;

	@FindBy(xpath="a[contains(text(),' Skip ')]")
	WebElement skipbtn;

	@FindBy(xpath="(//input[@type='file'])[1]")
	WebElement choosefileforjob;

	////a[contains(text(),' Skip ')]



	//initialization of OR

	public PostAJob() throws IOException
	{
		PageFactory.initElements(driver, this);
	}

	//Actions

	public boolean validationMessageOnJobTitle() throws InterruptedException, IOException
	{   Thread.sleep(3000);
	Actions a = new Actions(driver);


	a.moveToElement(publishbtn).build().perform();
	Thread.sleep(3000);
	publishbtn.click();
	Thread.sleep(3000);
	TakeScreenshotHandle.TakeScreenshot("validation message on title field");
	boolean flag=jobtilefieldvalidation.isDisplayed();
	return flag;

	}

	public boolean validationMessageOninterviewkitfield() throws InterruptedException
	{
		nextbtn.click();
		Thread.sleep(3000);
		boolean flag=selectkitvalidation.isDisplayed();
		return flag;

	}

	public boolean validationMessageOnjobdescfield() throws InterruptedException
	{  Actions a = new Actions(driver);


	a.moveToElement(nextbtn).perform();
	Thread.sleep(3000);
	nextbtn.click();
	Thread.sleep(3000);

	boolean flag=jobdescvalidation.isDisplayed();
	return flag;

	}

	public void postingJOb() throws InterruptedException, IOException

	{  



		Thread.sleep(7000);

		jobtitlefield.sendKeys(prop.getProperty("jobtitle"));
		clickonjobtypedd.click();
		Thread.sleep(4000);
		for(int i=0;i< jobtypeddlist.size();i++)
		{
			if (jobtypeddlist.get(i).getText().contains(prop.getProperty("jobtype")))
			{
				jobtypeddlist.get(i).click();
				break ;
			}
		}
		Thread.sleep(3000);
		DatePicker.selectDateByJs(driver,jobexpirationdate,"04/12/2023");


		Thread.sleep(5000);
		clickonselectinterviewkitdd.click();
		for(int i=0;i< interviewkitddlist.size();i++)
		{
			if (interviewkitddlist.get(i).getText().contains(prop.getProperty("titleofkit")))
			{
				interviewkitddlist.get(i).click();
				break ;
			}
		}

		driver.switchTo().frame(0);
		Thread.sleep(1000);
		jobma_Desc.sendKeys("This is JOb description");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();


		Thread.sleep(5000);
		publishbtn.click();
		Thread.sleep(5000);
		Assert.assertTrue(confirmmessgae.getText().contains("Job added successfully"));






	}

	public void jobPostingWithAdditionalDetails() throws InterruptedException, IOException
	{

		Thread.sleep(7000);

		jobtitlefield.sendKeys(prop.getProperty("jobtitle"));
		clickonjobtypedd.click();
		Thread.sleep(4000);
		for(int i=0;i< jobtypeddlist.size();i++)
		{
			if (jobtypeddlist.get(i).getText().contains(prop.getProperty("jobtype")))
			{
				jobtypeddlist.get(i).click();
				break ;
			}
		}
		Thread.sleep(3000);
		DatePicker.selectDateByJs(driver,jobexpirationdate,"04/12/2023");


		Thread.sleep(5000);
		clickonselectinterviewkitdd.click();
		for(int i=0;i< interviewkitddlist.size();i++)
		{
			if (interviewkitddlist.get(i).getText().contains(prop.getProperty("titleofkit")))
			{
				interviewkitddlist.get(i).click();
				break ;
			}
		}

		driver.switchTo().frame(0);
		Thread.sleep(1000);
		jobma_Desc.sendKeys("This is JOb description");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView;",additionaldetailtab);
		Thread.sleep(8000);
		additionaldetailtab.click();
		Thread.sleep(6000);

		keywordsfield.sendKeys(prop.getProperty("keywords"));
		Thread.sleep(1000);
		qualificationfield.sendKeys(prop.getProperty("qualifications"));
		Thread.sleep(1000);
		clickonfunctionalareadd.click();
		for(int i=0;i<functionalareaddlist.size();i++)
		{
			if ( functionalareaddlist.get(i).getText().contains(prop.getProperty("functionalarea")))
			{
				functionalareaddlist.get(i).click();
				break ;
			}
		}
		Thread.sleep(1000);

		/*selectanindustryfield.click();
		for(int i=0;i<selectanindustryfieldddlist.size();i++)
		{
			if ( selectanindustryfieldddlist.get(i).getText().contains(prop.getProperty("industry")))
			{
				selectanindustryfieldddlist.get(i).click();
				break ;
			}
		} */
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView;",clickonminexp);
		Thread.sleep(3000);
		clickonminexp.click();
		Thread.sleep(3000);
		for(int i=0;i<minexpddlist.size();i++)
		{
			if ( minexpddlist.get(i).getText().contains(prop.getProperty("minexp")))
			{
				minexpddlist.get(i).click();
				break ;
			}
		}
		Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView;",clickonmaxexp);
		Thread.sleep(3000);
		clickonmaxexp.click();
		Thread.sleep(1000);
		for(int i=0;i<maxexpddlist.size();i++)
		{
			if (maxexpddlist.get(i).getText().contains(prop.getProperty("maxexp")))
			{
				maxexpddlist.get(i).click();
				break ;
			}
		}
		Thread.sleep(1000);
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].scrollIntoView;",minsal);
		Thread.sleep(3000);
		minsal.sendKeys(prop.getProperty("minsal"));
		Thread.sleep(1000);
		maxsal.sendKeys(prop.getProperty("maxsal"));
		Thread.sleep(1000);
		clickonafteravailable.click();
		Thread.sleep(5000);
		for(int i=0;i<listofafteravailable.size();i++)
		{
			if (listofafteravailable.get(i).getText().contains(prop.getProperty("afteravailable")))
			{
				listofafteravailable.get(i).click();
				break ;
			}
		}

		clickoncompensation.click();
		Thread.sleep(3000);
		for(int i=0;i<compensationddlist.size();i++)
		{
			if (compensationddlist.get(i).getText().contains(prop.getProperty("compensation")))
			{
				compensationddlist.get(i).click();
				break ;
			}
		}

		clickoncurrencydd.click();
		Thread.sleep(3000);
		for(int i=0;i< listofcurrency.size();i++)
		{
			if ( listofcurrency.get(i).getText().contains(prop.getProperty("currency")))
			{
				listofcurrency.get(i).click();
				break ;
			}
		}

		Thread.sleep(3000);

		/*	choosefileforjob.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Autoitscripts\\scripts\\fileuploadscript2.exe");
		//Runtime.getRuntime().exec("C:/Autoitscripts/scripts/fileuploadscript2.exe");
		Thread.sleep(9000);

		 //Runtime.getRuntime().exec */

		Thread.sleep(3000);

		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		js4.executeScript("arguments[0].scrollIntoView;",startrecordingbtn);
		Thread.sleep(3000);
		startrecordingbtn.click();
		Thread.sleep(10000);
		finishrecordbtn.click();
		Thread.sleep(10000);

		nextbtn.click();
		Thread.sleep(10000);

		addressfield.sendKeys(prop.getProperty("address"));
		Thread.sleep(1000);
		cityfield.sendKeys(prop.getProperty("city"));
		Thread.sleep(1000);
		statefield.sendKeys(prop.getProperty("state"));
		Thread.sleep(1000);
		postalcode.sendKeys(prop.getProperty("postalcode"));
		Thread.sleep(1000);
		addlocbtn.click();
		Thread.sleep(2000);
		nextbtn.click();
		Thread.sleep(4000);

		publishbtn.click();

		/*		Thread.sleep(9000);

		monster = new  MonsterPagePostAJob();
	monster.clickOnSkip();

	Thread.sleep(5000);
		ilp = new InterviewLinkPage();
		Thread.sleep(5000);
		String interviewlinkpagetext =ilp.getPageText();
	Assert.assertEquals(interviewlinkpagetext, "Interview Link", "JOb added successfully");
		 */	
	}

	public void uploadfile() throws InterruptedException, IOException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView;",additionaldetailtab);
		Thread.sleep(8000);
		additionaldetailtab.click();

		Thread.sleep(3000);

		choosefileforjob.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Autoitscripts\\scripts\\fileuploadscript3.exe");
		//Runtime.getRuntime().exec("C:/Autoitscripts/scripts/fileuploadscript2.exe");
		Thread.sleep(9000);

	}








}
