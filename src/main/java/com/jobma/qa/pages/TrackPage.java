package com.jobma.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;

public class TrackPage  extends TestBase{
	
	

	//OR
	
	@FindBy(xpath="(//button[normalize-space()='Invitation Logs'])[1]")
	WebElement invitationlogbtn;
	
	@FindBy(xpath="(//span[contains(text(),'Invitation sent Successfully.')])[1]")
	WebElement invitationsentmessage;
	
	@FindBy(xpath="(//button[normalize-space()='Filter'])[1]")
	WebElement fiterbtn;
	
	@FindBy(xpath="(//span[@id='select2-job_track_list-container'])[1]")
	WebElement selectjobdd;
	
	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> selectjobddlist;
	
	@FindBy(xpath="(//input[@id='invitation_applied_data'])[1]")
	WebElement appliedbtndate;
	
	@FindBy(xpath="(//span[@id='select2-select_status-container'])[1]")
	WebElement statusdd;
	
	@FindBy(xpath="//span[@class='select2-results']//ul//li")
	List<WebElement> statusddlist;
	
	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[2]")
	WebElement cancelbtn;
	
	@FindBy(xpath="(//input[@id='search_value'])[1]")
	WebElement applicantsearch;
	
	@FindBy(xpath="(//span[@class='label-tag label-tag-sm bg-warning-soft'][normalize-space()='Invited'])[1]")
	WebElement invited;
	
	@FindBy(xpath="(//span[@class='label-tag label-tag-sm bg-warning-soft'])[1]")
	WebElement candidateontrackpage;
	
	@FindBy(xpath="(//i[@class='bi bi-search'])[2]")
	WebElement clickonsearchbtn;
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-secondary btn-shadow me-1 mb-2  mb-lg-0')])[2]")
	WebElement setupinterviewbtn;
	
	@FindBy(xpath="(//div[contains(@id,'msg')])[4]")
	WebElement Cantaccessmessage;
	
	
	
	
	public TrackPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnInvitationLogBtn()
	{
		invitationlogbtn.click();
	}
	
	public void invitationmessage() throws InterruptedException
	{Thread.sleep(3000);
		boolean flag = invitationsentmessage.isDisplayed();
		System.out.println(invitationsentmessage.getText());
		Assert.assertTrue(flag);
	}
	

	//changes done in parameters
	public void selectJobFromFilter(String s1) throws InterruptedException
	{
		fiterbtn.click();
		Thread.sleep(2000);
		selectjobdd.click();
		for(int i=0;i<selectjobddlist.size();i++)
		{
			if(selectjobddlist.get(i).getText().contains(prop.getProperty(s1)))
			{
				selectjobddlist.get(i).click();
				break;
			}
			
		}
		cancelbtn.click();
		
		
	}
	//changes done by me bypassing string 
	public void invitedCandidateOnTrackPage(String s,String y) throws InterruptedException
	{
		applicantsearch.sendKeys(prop.getProperty(s));
		clickonsearchbtn.click();
		Thread.sleep(3000);
		//tp = new TrackPage();
		
		selectJobFromFilter(y);
		Thread.sleep(3000);
		boolean flag=candidateontrackpage.isDisplayed();
		Assert.assertTrue(flag);
	
	}
	
	public void invitedCandidatewithoutjobontrackpage() throws InterruptedException
	{
		applicantsearch.sendKeys(prop.getProperty("withoutjobcandidateemail"));
		clickonsearchbtn.click();
		Thread.sleep(3000);
		boolean flag=candidateontrackpage.isDisplayed();
		Assert.assertTrue(flag);
	}

	
	
	

}
