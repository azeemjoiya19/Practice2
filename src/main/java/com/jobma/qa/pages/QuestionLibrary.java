package com.jobma.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jobma.qa.base.TestBase;

public class QuestionLibrary extends TestBase {



	//Object repository of question library page 

	@FindBy(xpath="(//i[@class='bi bi-arrow-left-square'])[2]") //back btn 
	WebElement backbtn;

	@FindBy(xpath="//input[@id='searchBox']")  // search box
	WebElement searchbox;

	@FindBy(xpath="//span[contains(text(),'Select type')]")  //question type dropdown
	WebElement selecttype;

	@FindBy(xpath="//span[@class='select2-results']//ul//li") //    //list of question type
	List<WebElement> selecttypelist;

	@FindBy(xpath="//span[@id='select2-showRecordJQ-container']") // click on data list
	WebElement list;

	@FindBy(xpath="//span[@class='select2-results']//ul//li") 
	List<WebElement> listofdata;

	@FindBy(xpath="(//i[contains(@class,'bi bi-search')])[2]")
	WebElement searchbtn;

	//initialization of elements
	public QuestionLibrary() throws IOException {
		PageFactory.initElements(driver, this);
	}


	//Actions

	public void clickOnBackBtn() throws InterruptedException
	{
		backbtn.click();
		
	}

	public void searchBox() throws InterruptedException
	{
		searchbox.sendKeys(prop.getProperty("questionlibsearchbox"));
		searchbtn.click();
		Thread.sleep(3000);
	}

	public void clickOnSelectTypedd() throws InterruptedException
	{
		selecttype.click();
		for(int i=0;i<selecttypelist.size();i++)
		{
			System.out.println("select list has" +selecttypelist.get(i).getText());
			if(selecttypelist.get(i).getText().contains("Coding"))
			{
				Thread.sleep(3000);
				selecttypelist.get(i).click();
				Thread.sleep(4000);
				break;
			}
		}



	}

	public void clickOnDataList()
	{
		list.click();

		for(int i=0;i<listofdata.size();i++) 
		{
			System.out.println("list elements" + listofdata.get(i).getText());
			
				System.out.println("Amount of data to be " +listofdata.get(i).getText());
				if(listofdata.get(i).getText().contains("20"))
				{
					listofdata.get(i).click();	
				}
			}
		}





	}
