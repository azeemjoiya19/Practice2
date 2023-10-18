package com.jobma.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class ApplicationEvaluate extends TestBase {
	
	//or
	@FindBy(xpath="//a[contains(@class,'btn btn-primary-soft2 btn-block')]")
	WebElement Scheduleinterviewbtn;
	
	public ApplicationEvaluate() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	

}
