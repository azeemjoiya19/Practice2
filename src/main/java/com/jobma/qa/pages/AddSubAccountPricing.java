package com.jobma.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.JavascriptClicks;
import com.jobma.qa.util.WebDriverUtilities;

public class AddSubAccountPricing extends TestBase {
	
	//OR
	
	@FindBy(xpath="(//h5[normalize-space()='Add Subaccount'])[1]")
	WebElement Addsubaccounttext;
	
	@FindBy(xpath="(//input[@id='full-name'])[1]")
	WebElement namefield;
	
	@FindBy(xpath="(//input[@id='cc_number'])[1]")
	WebElement cardnumber;
	
	@FindBy(xpath="(//input[@id='cvv'])[1]")
	WebElement cvv;
	
	@FindBy(xpath="(//button[@class='btn btn-primary text-uppercase mt-2 px-5 px-md-6 payNow'])[1]")
	WebElement paynowbtn;
	
	
	public AddSubAccountPricing() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void addSubaccountPageText()
	{
		String s = Addsubaccounttext.getText();
		Assert.assertEquals(s, "Add Subaccount");
	}
	
	public SubscriptionPage addSubAccountLimit() throws InterruptedException, IOException
	{
		namefield.sendKeys("Azeem");
		cardnumber.sendKeys("4111111111111111");
		JavascriptClicks.javaScripthandle(cvv);
		WebDriverUtilities.wait1(driver,20,cvv);
		cvv.sendKeys("123");
		JavascriptClicks.javaScripthandle(paynowbtn);
		WebDriverUtilities.wait(driver,50,paynowbtn);
		Thread.sleep(3000);
		paynowbtn.click();
		return  new SubscriptionPage() ;
		
		
		
		
	}
	
	
	
	
	

}
