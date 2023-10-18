package com.jobma.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class SettingsPage extends TestBase {
	
	//OR
	
	@FindBy(xpath="(//span[contains(text(),'Settings')])[1]")
	WebElement settingstext;
	
	@FindBy(xpath="//button[contains(@id,'save_company_profile_btn')]") //save changes company profile
	WebElement savechangesbtn;
	
	public SettingsPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	

}
