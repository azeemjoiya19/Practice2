package com.jobma.qa.util;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jobma.qa.base.TestBase;

public class DatePicker extends TestBase {
	
	public DatePicker() throws IOException {
		
		
	}

	public static void selectDateByJs(WebDriver driver,WebElement element,String date)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		
	}

}
