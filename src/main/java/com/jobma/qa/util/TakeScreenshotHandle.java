package com.jobma.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.jobma.qa.base.TestBase;

public class TakeScreenshotHandle extends TestBase {

	public TakeScreenshotHandle() throws IOException {

		
	}

	public  static void  TakeScreenshot(String filename) throws IOException  {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE); //stored in ram
		File dest = new  File("C:\\Jobma_Project\\Jobma_Project\\jobma_A\\Screenshot/"+filename+".jpg"); //stored in system
	FileUtils.copyFile(file, dest);
	}

	
		
	}
	
	
	
	


