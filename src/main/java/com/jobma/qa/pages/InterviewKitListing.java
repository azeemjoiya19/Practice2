package com.jobma.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.TakeScreenshotHandle;

public class InterviewKitListing extends TestBase {

	//Object Repository of Interview Kit listing page

	@FindBy(xpath="//a[contains(@href,'https://testing.jobma.com/employer/assessment-library')]") //add new kit button
	WebElement addnewkitbtn;

	@FindBy(xpath="(//a[@class='btn btn-secondary btn-shadow mb-3 mb-lg-0'])[1]") //question library btn
	WebElement questionlibrary;

	@FindBy(xpath=" (//input[@id='searchBox'])[1]") //search box 
	WebElement searchbox;

	@FindBy(xpath=" (//i[@class='bi bi-grid'])[1]") //grid view button
	WebElement gridviewbtn;

	@FindBy(xpath="(//button[@id='eva-list-view-btn'])[1]") //list view btn
	WebElement listviewbtn;

	@FindBy(xpath="//span[@class='input-group-text form-icon px-4 searchJQ']")
	WebElement searchbtn;

	@FindBy(xpath="//span[contains(@class,'select2-results')]//ul//li")
	List<WebElement> statusdropdown;

	@FindBy(xpath="//span[contains(@id,'select2-interviewKitSelectStatus-container')]")
	WebElement kitstatus;

	@FindBy(xpath="(//span[contains(text(),'Interview kit listing')])[2]") //heading of interview kit listing page
	WebElement interviewkitlistingpageheading;

	//@FindBy(xpath="(//a[contains(@href,'https://testing.jobma.com/employer/interview-assessment-kit-add')])[1]") //create your own button
	//WebElement createyourownbtn;

	//@FindBy(xpath="//h6[contains(text(),'Pre Defined Interview Kit')]")
	//WebElement predefinedinterviewkit;

	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[3]")
	WebElement crossbtn;

	@FindBy(xpath="//input[@id='kitSearchBox']")
	WebElement predefinedsearchbox;

	@FindBy(xpath="(//span[@class='btn btn-light searchJQ'])[1]")
	WebElement searchbtnonpredefinedkit;

	@FindBy(xpath="(//button[normalize-space()='Next'])[1]")
	WebElement nextbtnonpredefinedkit;

	@FindBy(xpath="(//input[@id='default_kit_1'])[1]")
	WebElement cfokitcheckbox;


	@FindBy(xpath="(//a[contains(text(),'Edit')])[1]") //Kit edit on kit listing page
	WebElement  editkit;
	
	@FindBy(xpath="(//a[contains(@id,'jobListing')])[1]")
	WebElement Setupinterviewonkit;
	
	
	@FindBy(xpath="(//button[contains(@class,'btn btn-light btn-sm kit-preview-btn')])[1]")
	WebElement viewquestion;
	
	
	
	
	
	
	
	






	//Initializing the elements 

	public InterviewKitListing() throws IOException
	{
		PageFactory.initElements(driver, this);
	}

	//Actions on elements
	
	public void clickOnEdit()
	{
		editkit.click();
	}

	public void clickOnAddNewKitBtn() throws InterruptedException, IOException
	{
		addnewkitbtn.click();
		Thread.sleep(2000);
		TakeScreenshotHandle.TakeScreenshot("Add new kit page");
		Thread.sleep(3000);
	}
	public QuestionLibrary clickOnQuestionLibraryBtn() throws InterruptedException, IOException
	{
		questionlibrary.click();
		Thread.sleep(3000);
		return new QuestionLibrary();

	}
	public void clickOnListView() throws InterruptedException
	{
		listviewbtn.click();
		Thread.sleep(3000);
	}
	public void clickOnGridViewBtn() throws InterruptedException
	{
		gridviewbtn.click();
		Thread.sleep(3000);
	}

	public void searchFilter() throws InterruptedException
	{
		searchbox.sendKeys(prop.getProperty("kitname"));
		Thread.sleep(2000);
		searchbtn.click();
		Thread.sleep(3000);  //remove later just for demo
	}
	public void selectStatusDropDown() throws InterruptedException
	{
		kitstatus.click();

		List<WebElement> ls = statusdropdown;

		Thread.sleep(3000);
		for (int i = 0; i < ls.size(); i++) {
			System.out.println("dropdown text: " + ls.get(i).getText());


			if (ls.get(i).getText().contains(prop.getProperty("kitstatus"))) {


				ls.get(i).click();

				Thread.sleep(10000);

				break; 
			}


		}




	}

	public String interviewKitListingHeading()
	{
		String iklph=interviewkitlistingpageheading.getText();
		return iklph;
	}

/*	public AddNewInterviewKitPage clickOnCreateYourOwnKitBtn() throws IOException
	{
		createyourownbtn.click();

		return new AddNewInterviewKitPage();
	} */

	//07-04-2023

	 /*public AddNewInterviewKitPage clickonpredefinedInterviewKit() throws InterruptedException, IOException

	{


		predefinedinterviewkit.click();
		predefinedsearchbox.sendKeys(prop.getProperty("predefinedkit"));
		searchbtnonpredefinedkit.click();
		Thread.sleep(4000);
		cfokitcheckbox.click();
		Thread.sleep(5000);
		nextbtnonpredefinedkit.click();
		return new AddNewInterviewKitPage();








	} */






}
