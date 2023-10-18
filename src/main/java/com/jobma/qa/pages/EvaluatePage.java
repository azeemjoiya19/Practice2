package com.jobma.qa.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.JavascriptClicks;
import com.jobma.qa.util.WebDriverUtilities;

public class EvaluatePage extends TestBase {

	//or

	@FindBy(xpath="(//span[@class='page-title h5 pe-0 pe-lg-3'][normalize-space()='Evaluate'])[2]")
	WebElement evaluatepagetext;


	@FindBy(xpath="(//a[@id='filter_button'])[1]")
	WebElement sharedinterviewbtn;

	@FindBy(xpath="(//input[@placeholder='Search Applicant'])[1]")
	WebElement applicantsearchfield;

	@FindBy(xpath="(//button[@class='btn btn-white searchJQ'])[1]")
	WebElement applicantfieldsearchbtn;

	@FindBy(xpath="(//button[@class='btn btn-danger-soft me-1 bulk_delete_invitationJQ'])[1]")
	WebElement bulkdeletebtn;

	@FindBy(xpath="(//button[@class='btn btn-light me-1 bulk_share_invitationJQ'])[1]")
	WebElement bulkshare;

	@FindBy(xpath="(//input[@id='group_name'])[1]")
	WebElement groupnamefield;

	@FindBy(xpath="(//button[normalize-space()='Save & Next'])[1]")
	WebElement saveandnextbtnonbulkshare;

	@FindBy(xpath="(//input[@id='email'])[1]")
	WebElement sendtofield;

	@FindBy(xpath="(//button[normalize-space()='Share'])[1]")
	WebElement sharebtn;

	@FindBy(xpath="(//button[normalize-space()='Filter'])[1]")
	WebElement filterbtn;

	@FindBy(xpath="(//input[contains(@class,'form-check-input form-check-input-sm form-check-input2 bulkSelectCheckbox bulkInvitationJQ ')])[1]")
	WebElement firstcheckbox;

	@FindBy(xpath="(//input[contains(@class,'form-check-input form-check-input-sm form-check-input2 bulkSelectCheckbox bulkInvitationJQ ')])[2]")
	WebElement secondcheckbox;
	
	@FindBy(xpath="(//input[contains(@class,'form-check-input form-check-input-sm form-check-input2 bulkSelectCheckbox bulkInvitationJQ ')])[3]")
	WebElement thirdcheckbox;
	
	@FindBy(xpath="(//input[contains(@class,'form-check-input form-check-input-sm form-check-input2 bulkSelectCheckbox bulkInvitationJQ ')])[4]")
	WebElement fourthcheckbox;

	@FindBy(xpath="(//button[@type='button'][normalize-space()='Evaluate'])[1]")
	WebElement evaluatebtn;

	@FindBy(xpath="(//button[@type='button'][normalize-space()='Add interview'])[1]")
	WebElement addinterviewbtn;

	@FindBy(xpath="(//a[@href='javascript:;'])[2]")
	WebElement indiviualsharebtn;

	@FindBy(xpath="(//button[@aria-label='Delete'])[1]")
	WebElement indiviualdelete ;

	@FindBy(xpath="(//button[normalize-space()='Yes'])[1]")
	WebElement bulkdeleteyesbtnonpopup;

	@FindBy(xpath="(//div[contains(text(),'Record deleted successfully')])[2]")
	WebElement successfullydeletedmessage;

	@FindBy(xpath="(//div[contains(text(),'Mail has been sent successfully.')])[2]")
	WebElement messagehasbeensentsuccessfully;
	
	@FindBy(xpath="(//span[contains(@class,'name')])[1]")
	WebElement firsttiletext;
	
	@FindBy(xpath="//li[contains(@class,'list-group-item candidate-list-item')]")
	List<WebElement>  evaluateTitles;

	public EvaluatePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}


	public void evaluatePage() throws IOException
	{
		String s =evaluatepagetext.getText();
		Assert.assertEquals(s, "Evaluate");

	}

	public void bulkDelete()
	
	
	{
		
		if(firstcheckbox.isEnabled())
		{
		firstcheckbox.click();
		}
		else
		{
			System.out.println("First candidate checkbox is disabled check if he is evaluated");
		}
		
		if(secondcheckbox.isEnabled())
		{
			secondcheckbox.click();
		}
		else
		{
			System.out.println("Second candidate is not yet evaluated ");
		}
		
		
		bulkdeletebtn.click();
		WebDriverUtilities.wait1(driver, 30, bulkdeleteyesbtnonpopup);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		bulkdeleteyesbtnonpopup.click();
		boolean flag = successfullydeletedmessage.isDisplayed();
		System.out.println(successfullydeletedmessage.getText());
		Assert.assertTrue(flag);


	}

	public void bulkShare() throws InterruptedException 
	
	{
		WebDriverUtilities.wait(driver, 30, thirdcheckbox);
		thirdcheckbox.click();
		JavascriptClicks.javaScripthandle(fourthcheckbox);
		Thread.sleep(2000);
		fourthcheckbox.click();
		bulkshare.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverUtilities.wait1(driver, 30,groupnamefield  );
		groupnamefield.clear();
		groupnamefield.sendKeys(prop.getProperty("bulksharegroupname"));
		saveandnextbtnonbulkshare.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sendtofield.sendKeys(prop.getProperty("groupsharemail"));
		sharebtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		boolean flag =  messagehasbeensentsuccessfully.isDisplayed();
		System.out.println( messagehasbeensentsuccessfully.getText());
		Assert.assertTrue(flag);

	}
	 
	
	public void searchApplicant()
	{
		String expected =firsttiletext.getText();
		applicantsearchfield.sendKeys(expected);
		applicantfieldsearchbtn.click();
		WebDriverUtilities.wait1(driver, 30, firsttiletext);
		String actual = firsttiletext.getText();
		Assert.assertEquals(actual,expected );
		
	}
	
	public void statusFilter()
	{
		for(int i=0;i<evaluateTitles.size();i++)
		{
			
		}
	}




}
