package com.jobma.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class MonsterPagePostAJob extends TestBase {
	
	
	@FindBy(xpath="a[contains(text(),' Skip ')]")
	WebElement skipbtn;

	public MonsterPagePostAJob() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public InterviewLinkPage clickOnSkip() throws IOException
	{
		 skipbtn.click();
		 return new InterviewLinkPage();
	}
	

}
