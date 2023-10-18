package com.jobma.qa.util;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jobma.qa.base.TestBase;

public class JavascriptClicks extends TestBase {

	public JavascriptClicks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void javaScripthandle(WebElement ele)
	{
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
	}
	
	

}
