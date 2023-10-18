package com.jobma.qa.base;

import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jobma.qa.pages.AddNewInterviewKitPage;
import com.jobma.qa.pages.AddSubAccountPricing;
import com.jobma.qa.pages.ApplicationEvaluate;
import com.jobma.qa.pages.EvaluatePage;
import com.jobma.qa.pages.InterviewKitListing;
import com.jobma.qa.pages.InterviewLinkPage;
import com.jobma.qa.pages.JobConfigurationPage;
import com.jobma.qa.pages.JobmaDashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.pages.MonsterPagePostAJob;
import com.jobma.qa.pages.PositionsPage;
import com.jobma.qa.pages.PostAJob;
import com.jobma.qa.pages.QuestionLibrary;
import com.jobma.qa.pages.ScheduleInterviewPage;
import com.jobma.qa.pages.SettingsPage;
import com.jobma.qa.pages.SubAccount;
import com.jobma.qa.pages.SubscriptionPage;
import com.jobma.qa.pages.TrackPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver ;
	public static Properties prop;
	public static Point loc ;
	public static TestBase tb ;
	public LoginPage lp ;
	public JobmaDashboard jd; 
	public InterviewKitListing ikl;
	public  QuestionLibrary ql;
	public AddNewInterviewKitPage anikp;
	public PostAJob paj;
	public  InterviewLinkPage ilp ;
	public MonsterPagePostAJob monster;
	public ScheduleInterviewPage  sip;
	public TrackPage tp;
	public PositionsPage pp;
	public JobConfigurationPage jcp;
	public EvaluatePage ep;
	public SubAccount sa;
	public AddSubAccountPricing sapp;
	public SubscriptionPage sp;
	public ApplicationEvaluate ae;
	public SettingsPage settings;


	public TestBase() throws IOException  //Constructor for test Base Class
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/apple/Documents/Automation/jobma-azeem/src/main/java/com/jobma/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public static void intialize() throws InterruptedException {

		String browsername=prop.getProperty("browser");

		if(browsername.equals("chrome")) {
			
			
			
			

			WebDriverManager.chromedriver().setup();
			
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			driver=new ChromeDriver();
		}

		else if(browsername.equals("")) {

			WebDriverManager.edgedriver().setup();

			driver=new EdgeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		


	}

	public static void closeBrowser() {
		//driver = new ChromeDriver();
		driver.close();
	}



}
