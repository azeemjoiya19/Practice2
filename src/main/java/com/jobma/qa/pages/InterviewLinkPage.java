package com.jobma.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class InterviewLinkPage  extends TestBase{


	//OR

	@FindBy(xpath="(//span[contains(text(),'Interview Link')])[3]")
	WebElement interviewlinktext;
	
	@FindBy(xpath="(//button[contains(text(),'Setup Interview')])[1]")
	WebElement Setupinterviewbtn;

	//initialization of OR 

	public InterviewLinkPage() throws IOException 
	{
       PageFactory.initElements(driver, this);
	}

	//action 
	
	public String getPageText()
	{
		String s = interviewlinktext.getText();
		return s;
	}






}
