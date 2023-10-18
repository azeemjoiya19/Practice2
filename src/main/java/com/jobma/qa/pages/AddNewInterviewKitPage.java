package com.jobma.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class AddNewInterviewKitPage extends TestBase {





	@FindBy(xpath="(//span[contains(text(),'Add New Interview Kit')])[2]") // pageText
	WebElement addnewkitpagetitletext;

	@FindBy(xpath="(//input[@id='kit_title'])[1]") //kit title field
	WebElement kittitle ;

	@FindBy(xpath=" (//input[@id='chkinterview_2'])[1]") //flexible kit radio btn
	WebElement flexiblekit ;

	@FindBy(xpath="(//input[@id='chkinterview'])[1]") // timed kit radio button
	WebElement  timedkit;

	@FindBy(xpath="(//input[@id='answer_duration'])[1]") //answer duration field for timed
	WebElement timedanswerdurationbox;

	@FindBy(xpath=" (//button[normalize-space()='Set Time'])[1]")  //set time btn
	WebElement settimebtn;

	@FindBy(xpath=" (//button[normalize-space()='Add Slide'])[1]")
	WebElement addslidebtn;

	@FindBy(xpath="(//button[normalize-space()='Slide Library'])[1]") //add slide btn
	WebElement slidelibbtn;

	@FindBy(xpath="(//button[normalize-space()='Add Welcome Note'])[1]") //add welcome note btn
	WebElement welcomenotebtn;

	@FindBy(xpath="(//button[normalize-space()='Add Exit Note'])[1]") // Add exit note btn
	WebElement exitnotebtn;

	@FindBy(xpath="(//button[@id='qtype_1'])[1]") //Add video question btn
	WebElement videoquesbtn;

	@FindBy(xpath="(//button[normalize-space()='MCQ'])[1]") //Add mcq question btn
	WebElement mcqquesbtn;

	@FindBy(xpath="(//button[normalize-space()='Essay'])[1]") //add essay question btn
	WebElement essayquesbtn;

	@FindBy(xpath="(//button[@id='qtype_4'])[1]")  //Add audio question btn
	WebElement audioquesbtn;

	@FindBy(xpath="(//a[@type='button'])[1]") //question lib btn
	WebElement queslibbtn;

	@FindBy(xpath="(//textarea[@id='data'])[1]")  //text area box of all question
	WebElement textareaofallques;

	@FindBy(xpath=" (//button[@class='btn btn-secondary btn-shadow me-1 cancelJQ'])[1]") //cancel btn
	WebElement cancelbtn;

	@FindBy(xpath="(//input[@id='options1'])[1]")   //mcq first option text area
	WebElement mcqoptiontextarea1;

	@FindBy(xpath="(//input[@id='options1'])[2]")  //mcq second option text area
	WebElement mcqoptiontextarea2;

	@FindBy(xpath=" (//button[normalize-space()='Add another option'])[1]") //Add onother option field
	WebElement addanotheroptionbtn;

	@FindBy(xpath="(//input[@id='options1'])[3]")
	WebElement mcqoptiontextarea3;

	@FindBy(xpath="(//input[@id='options1'])[4]")
	WebElement mcqoptiontextarea4;

	@FindBy(xpath=" (//input[@id='options1'])[5]")
	WebElement mcqoptiontextarea5;

	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[8]")
	WebElement extraoptioncancelbtn1;

	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[9]")
	WebElement extraoptioncancelbtn2;

	@FindBy(xpath="(//i[@class='bi bi-x-lg'])[10]")
	WebElement extraoptioncancelbtn3;

	@FindBy(xpath="(//input[@id='radioNoLabel1'])[1]")
	WebElement mcqoption1;

	@FindBy(xpath="(//input[@id='radioNoLabel1'])[2]")
	WebElement mcqoption2;

	@FindBy(xpath="(//input[@id='radioNoLabel1'])[3]")
	WebElement  mcqoption3;

	@FindBy(xpath="(//input[@id='radioNoLabel1'])[4]")
	WebElement mcqoption4;

	@FindBy(xpath="(//input[@id='radioNoLabel1'])[5]")
	WebElement mcqoption5;



	@FindBy(xpath="//span[@id='select2-takes_1-container']")  //click on retake dd
	WebElement clickonretakesdd;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")  //list of retakes
	List<WebElement> retakedd;

	@FindBy(xpath="//span[@id='select2-thinkTime1-container']") //click on think time dd
	WebElement clickonthinktimedd;

	@FindBy(xpath="//span[@class='select2-results']//ul//li") //list of think time dd
	List<WebElement>  thinktimedd;

	@FindBy(xpath="//span[@id='select2-timeDuration1-container']")  //click on answer duration dd
	WebElement clickonanswerduration;

	@FindBy(xpath="//span[@class='select2-results']//ul//li")  //list of answer duration 
	List<WebElement> answerdurationdd ;

	@FindBy(xpath="//small[contains(text(),'Copyright � Jobma LLC, 2023')]") //copyright text
	WebElement copyrighttext;

	@FindBy(xpath="(//button[normalize-space()='SAVE'])[1]") // question save button
	WebElement questionsavebtn;

	@FindBy(xpath="(//button[normalize-space()='SAVE'])[1]") // slide save button/welcome note save button
	WebElement slidesavebtn;



	@FindBy(xpath="//button[contains(text(),'Save Kit')]") // kit save button
	WebElement kitsavebtn;

	@FindBy(xpath="(//textarea[@id='data'])[1]") // slide text area
	WebElement slidetextarea;

	@FindBy(xpath=" (//textarea[@id='intro_desc'])[1]") // welcome note text area
	WebElement welcomenotetextarea;

	@FindBy(xpath="(//textarea[@id='exit_desc'])[1]") // exit note text area
	WebElement exitnotetextarea;

	@FindBy(xpath="(//button[contains(text(),'Add Media')])[1]") // Add media button video 
	WebElement addmediavideobtn;

	@FindBy(xpath="(//a[normalize-space()='Add Video'])[1]") //add video button
	WebElement videomediabtn;

	@FindBy(xpath=" (//button[normalize-space()='Record Video'])[1]")
	WebElement recordvideobtn;

	@FindBy(xpath="(//button[@class='btn btn-secondary mx-1 my-2 strtRecord'])[1]")
	WebElement startrecordingbtn;

	@FindBy(xpath=" (//button[normalize-space()='Finish Recording'])[1]")
	WebElement  finishrecordingbtn;

	@FindBy(xpath="(//button[normalize-space()='Re-Record'])[1]")
	WebElement  recordbtn;

	@FindBy(xpath="(//button[normalize-space()='Play'])[1]")
	WebElement  playbtn;

	@FindBy(xpath="(//button[@class='btn btn-danger videoRef'])[1]")
	WebElement  deleterecordedvideobtn;

	@FindBy(xpath="(//button[normalize-space()='Add Video'])[1]")
	WebElement  addrecordeduploadedvideobtn; //Add video button after recording
	//or uploading



	@FindBy(xpath="(//button[contains(text(),'Add Media')])[2]")
	WebElement  addmediamcq;

	@FindBy(xpath="(//a[normalize-space()='Add Audio'])[1]")
	WebElement addaudiobtn;

	@FindBy(xpath="(//button[normalize-space()='Record Audio'])[1]")
	WebElement recordaudiobtn;


	@FindBy(xpath="(//button[@id='btn-start-recording'])[1]")
	WebElement startrecordingaudiobtn;


	@FindBy(xpath="(//button[normalize-space()='Stop Recording'])[1]")
	WebElement stoprecordingaudiobtn;

	@FindBy(xpath="(//button[@id='btn-pause-recording'])[1]")
	WebElement pausebtn;

	@FindBy(xpath="(//button[normalize-space()='Resume Recording'])[1]")
	WebElement resumerecordingbtn;

	@FindBy(xpath=" (//button[normalize-space()='Re-record'])[1]")
	WebElement rerecordbtn;

	@FindBy(xpath="(//button[@onclick='removeSelectedAudio(event)'])[1]")
	WebElement deleterecordedaudiobtn;

	@FindBy(xpath="(//button[normalize-space()='Add Audio'])[1]")
	WebElement addaudiomediabtn;

	@FindBy(xpath="(//button[contains(text(),'Add Media')])[3]")
	WebElement addmediaonthirdquestion;

	@FindBy(xpath="(//button[@class='btn btn-primary-soft2 mx-1 my-2 videoUploadJQ'])[1]")
	WebElement uploadvideobtn;

	@FindBy(xpath="(//input[@name='vidfile'])[1]")
	WebElement browsebtn;

	@FindBy(xpath="(//button[normalize-space()='Edit'])[1]") // edit button on first question of kit
	WebElement editbtnonquestion1;

	@FindBy(xpath="(//button[contains(text(),'Edit')])[2]") // edit button on second question of kit
	WebElement editbtnonquestion2;

	@FindBy(xpath="(//button[normalize-space()='Edit'])[3]") // edit button on third question of kit
	WebElement editbtnonquestion3;

	@FindBy(xpath="(//button[normalize-space()='Edit'])[4]") // edit button on four question of kit
	WebElement editbtnonquestion4;

	@FindBy(xpath="(//button[normalize-space()='Edit'])[5]") // edit button on five question of kit
	WebElement editbtnonquestion5;

	@FindBy(xpath="(//button[@type='button'][normalize-space()='Delete'])[5]") // delete button on  question of kit
	WebElement deletebtn;

	@FindBy(xpath="(//input[@class='form-check-input'])[4]") // option checkbox button on first question of kit
	WebElement optioncheckbox;

	@FindBy(xpath="(//i[@class='bi bi-trash3'])[1]") // 
	WebElement deleteBtnWelcomeNote;

	@FindBy(xpath="(//button[normalize-space()='Cancel'])[1]") // cancel btn on delete pop-up of delete welcome note
	WebElement cancelBtnOnPopup;

	@FindBy(xpath="(//button[@class='btn btn-danger delete_exit_btn'])[1]") // pop-up delete btn for welcome/exit note
	WebElement deleteBtnOnPopup;

	@FindBy(xpath="(//i[@class='bi bi-pencil'])[1]") // 
	WebElement editWelcomeNoteBtn;

	@FindBy(xpath="(//h6[contains(text(),'Welcome Note')])[2]") // 
	WebElement welcomenotetext;

	@FindBy(xpath="//span[contains(text(),'Add Media')]") // 
	WebElement addmediabtnonwelcomeexitnote;

	@FindBy(xpath="(//h6[contains(text(),'Exit Note')])[2]") // 
	WebElement exitnotetext;

	@FindBy(xpath="(//button[@id='deleteExitJQ'])[1]") // 
	WebElement deletebtnexitnote;

	@FindBy(xpath="(//i[@class='bi bi-pencil'])[2]") // 
	WebElement editexitnotebtn;



























	//initialization of OR
	public AddNewInterviewKitPage() throws IOException {

		PageFactory.initElements(driver, this);
	}

	//Actions 

	public String AddNewKitTitle()
	{
		String pagetext =addnewkitpagetitletext.getText();
		return pagetext;
	}

	public void setKitTitle()
	{
		kittitle.sendKeys(prop.getProperty("titleofkit"));
	}

	public void defaultFirstKit() throws InterruptedException, IOException, AWTException
	{   
		kittitle.sendKeys(prop.getProperty("titleofkit"));
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		//videoquesbtn.click();
		//Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("videoquestion"));
		textareaofallques.click();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	//	Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		questionsavebtn.click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(4000);

		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",mcqquesbtn);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(5000);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		mcqquesbtn.click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("mcqquestion"));
		textareaofallques.click();
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		mcqoptiontextarea1.sendKeys(prop.getProperty("option1"));
		mcqoptiontextarea2.sendKeys(prop.getProperty("option2"));

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);

		JavascriptExecutor js10 =(JavascriptExecutor)driver;
		js10.executeScript("arguments[0].scrollIntoView();",addanotheroptionbtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000); 
		addanotheroptionbtn.click(); 
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);


		mcqoptiontextarea3.sendKeys(prop.getProperty("option3"));
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000);


		JavascriptExecutor js15 =(JavascriptExecutor)driver;
		js15.executeScript("arguments[0].scrollIntoView();",mcqoption1);
		Thread.sleep(4000);
		mcqoption1.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);

		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);


		JavascriptExecutor js11 =(JavascriptExecutor)driver;
		js11.executeScript("arguments[0].scrollIntoView();",essayquesbtn);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		essayquesbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("essayquestion"));
		textareaofallques.click();

		JavascriptExecutor js4 =(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);

		JavascriptExecutor js5 =(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView();",audioquesbtn);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		audioquesbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(1000);
		textareaofallques.sendKeys(prop.getProperty("audioquestion"));
		textareaofallques.click();

		JavascriptExecutor js6 =(JavascriptExecutor)driver;
		js6.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();


		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);

		JavascriptExecutor js16 =(JavascriptExecutor)driver;
		js16.executeScript("arguments[0].scrollIntoView();",addslidebtn);
		Thread.sleep(5000);
		addslidebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		JavascriptExecutor js17 =(JavascriptExecutor)driver;
		js17.executeScript("arguments[0].scrollIntoView();",slidetextarea);
		Thread.sleep(5000);

		slidetextarea.sendKeys(prop.getProperty("slide1"));

		JavascriptExecutor js7 =(JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		slidesavebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		JavascriptExecutor js18 =(JavascriptExecutor)driver;
		js18.executeScript("arguments[0].scrollIntoView();",welcomenotebtn);
		Thread.sleep(5000);
		welcomenotebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000);
		welcomenotetextarea.sendKeys(prop.getProperty("welcomenote"));

		JavascriptExecutor js8 =(JavascriptExecutor)driver;
		js8.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		slidesavebtn.click(); //click on save button of welcome note
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);



		Thread.sleep(3000);
		JavascriptExecutor js12 =(JavascriptExecutor)driver;
		js12.executeScript("arguments[0].scrollIntoView();",addmediavideobtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		addmediavideobtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		videomediabtn.click();
		
		
		
		
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		recordvideobtn.click();
		Thread.sleep(3000);
		
	/*	Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/

		//	ChromeOptions option = new ChromeOptions();
		//	option.addArguments("disable-notifications");
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(10000);
		startrecordingbtn.click();
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(12000);
		finishrecordingbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(12000);
		addrecordeduploadedvideobtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		JavascriptExecutor js13 =(JavascriptExecutor)driver;
		js13.executeScript("arguments[0].scrollIntoView();",addmediamcq);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		addmediamcq.click();
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		addaudiobtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(6000);
		recordaudiobtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(6000);
		startrecordingaudiobtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(10000);
		stoprecordingaudiobtn.click();
		Thread.sleep(10000);
		addaudiomediabtn.click();

		//upload code
		/*	JavascriptExecutor js14 = (JavascriptExecutor)driver;
		js14.executeScript("arguments[0].scrollIntoView();", addmediaonthirdquestion);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		addmediaonthirdquestion.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000);
		videomediabtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		uploadvideobtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		browsebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Autoitscripts\\AutoitFileUploadScript.exe");//giving an exception handle it
		Thread.sleep(20000);
		addrecordeduploadedvideobtn.click();

		//C:\Autoitscripts\scripts\fileuploadscript2 */







		// queslibbtn.click();
		JavascriptExecutor js3 =(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].scrollIntoView();",kitsavebtn);
		Thread.sleep(5000);
		kitsavebtn.click();




	}

	/*public void flexibleSecondKit()
	{ 

		 flexiblekit.click();
		 kittitle.sendKeys(prop.getProperty("titleofkit"));
		Thread.sleep(2000);
		//videoquesbtn.click();
		//Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("videoquestion"));
		textareaofallques.click();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(5000);
		questionsavebtn.click();
		//Thread.sleep(5000);

		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",mcqquesbtn);
		Thread.sleep(5000);
		mcqquesbtn.click();
		Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("mcqquestion"));
		textareaofallques.click();
		Thread.sleep(5000);
		mcqoptiontextarea1.sendKeys(prop.getProperty("option1"));
		mcqoptiontextarea2.sendKeys(prop.getProperty("option2"));
		Thread.sleep(3000);

		JavascriptExecutor js10 =(JavascriptExecutor)driver;
		js10.executeScript("arguments[0].scrollIntoView();",addanotheroptionbtn);
		Thread.sleep(3000); 
		addanotheroptionbtn.click(); 
		Thread.sleep(4000);
		mcqoptiontextarea3.sendKeys(prop.getProperty("option3"));
		Thread.sleep(2000);
		mcqoption1.click();
		Thread.sleep(4000);

		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(4000);
		questionsavebtn.click();
		Thread.sleep(4000);


		JavascriptExecutor js11 =(JavascriptExecutor)driver;
		js11.executeScript("arguments[0].scrollIntoView();",essayquesbtn);
		Thread.sleep(5000);
		essayquesbtn.click();
		Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("essayquestion"));
		textareaofallques.click();

		JavascriptExecutor js4 =(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(5000);
		questionsavebtn.click();
		Thread.sleep(5000);

		JavascriptExecutor js5 =(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView();",audioquesbtn);
		Thread.sleep(5000);
		audioquesbtn.click();
		Thread.sleep(1000);
		textareaofallques.sendKeys(prop.getProperty("audioquestion"));
		textareaofallques.click();

		JavascriptExecutor js6 =(JavascriptExecutor)driver;
		js6.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(5000);
		questionsavebtn.click();
		Thread.sleep(5000);
		addslidebtn.click();
		Thread.sleep(5000);
		slidetextarea.sendKeys(prop.getProperty("slide1"));

		JavascriptExecutor js7 =(JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		Thread.sleep(5000);
		slidesavebtn.click();
		Thread.sleep(5000);
		welcomenotebtn.click();
		Thread.sleep(3000);
		welcomenotetextarea.sendKeys(prop.getProperty("welcomenote"));

		JavascriptExecutor js8 =(JavascriptExecutor)driver;
		js8.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		Thread.sleep(5000);
		slidesavebtn.click(); //click on save button of welcome note
		Thread.sleep(5000);
		exitnotebtn.click();
		Thread.sleep(5000);
		exitnotetextarea.sendKeys(prop.getProperty("exitnote"));
		Thread.sleep(4000);
		JavascriptExecutor js9 =(JavascriptExecutor)driver;
		js9.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		Thread.sleep(4000);
		slidesavebtn.click();

		// queslibbtn.click();
		JavascriptExecutor js3 =(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].scrollIntoView();",kitsavebtn);
		Thread.sleep(5000);
		kitsavebtn.click();


	}*/

	public void clickEditBtnOnKit() throws InterruptedException
	{
		
		
		/*kittitle.sendKeys(prop.getProperty("titleofkit"));
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		//videoquesbtn.click();
		//Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("videoquestion"));
		textareaofallques.click();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		questionsavebtn.click();
		Thread.sleep(4000);

		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",mcqquesbtn);
		Thread.sleep(5000);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		mcqquesbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("mcqquestion"));
		textareaofallques.click();
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		mcqoptiontextarea1.sendKeys(prop.getProperty("option1"));
		mcqoptiontextarea2.sendKeys(prop.getProperty("option2"));

		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);

		JavascriptExecutor js10 =(JavascriptExecutor)driver;
		js10.executeScript("arguments[0].scrollIntoView();",addanotheroptionbtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000); 
		addanotheroptionbtn.click(); 
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		mcqoptiontextarea3.sendKeys(prop.getProperty("option3"));
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000);
		mcqoption1.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);

		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);


		JavascriptExecutor js11 =(JavascriptExecutor)driver;
		js11.executeScript("arguments[0].scrollIntoView();",essayquesbtn);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		essayquesbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("essayquestion"));
		textareaofallques.click();

		JavascriptExecutor js4 =(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);

		JavascriptExecutor js5 =(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView();",audioquesbtn);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		audioquesbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(1000);
		textareaofallques.sendKeys(prop.getProperty("audioquestion"));
		textareaofallques.click();

		JavascriptExecutor js6 =(JavascriptExecutor)driver;
		js6.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();
		Thread.sleep(5000);


		JavascriptExecutor js7 =(JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",editbtnonquestion1);
		Thread.sleep(5000);
		editbtnonquestion1.click();
		Thread.sleep(5000);
		boolean flag=textareaofallques.isDisplayed();

		return flag; */




	}

	public void clickOnDeleteBtnOnQuestion() throws InterruptedException
	{
		kittitle.sendKeys(prop.getProperty("titleofkit"));
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		//videoquesbtn.click();
		//Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("videoquestion"));
		textareaofallques.click();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		questionsavebtn.click();
		Thread.sleep(4000);

		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();",mcqquesbtn);
		Thread.sleep(5000);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		mcqquesbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("mcqquestion"));
		textareaofallques.click();
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		mcqoptiontextarea1.sendKeys(prop.getProperty("option1"));
		mcqoptiontextarea2.sendKeys(prop.getProperty("option2"));

		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);

		//	JavascriptExecutor js10 =(JavascriptExecutor)driver;
		//	js10.executeScript("arguments[0].scrollIntoView();",addanotheroptionbtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		//	Thread.sleep(3000); 
		//	addanotheroptionbtn.click(); 
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		//	Thread.sleep(4000);
		//	mcqoptiontextarea3.sendKeys(prop.getProperty("option3"));
		//	//driver.manage().timeouts().implicitlyWait(50, seconds);
		//	Thread.sleep(3000);
		mcqoption1.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);

		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);


		JavascriptExecutor js11 =(JavascriptExecutor)driver;
		js11.executeScript("arguments[0].scrollIntoView();",essayquesbtn);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		essayquesbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("essayquestion"));
		textareaofallques.click();

		JavascriptExecutor js4 =(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);

		JavascriptExecutor js5 =(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView();",audioquesbtn);
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		audioquesbtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(1000);
		textareaofallques.sendKeys(prop.getProperty("audioquestion"));
		textareaofallques.click();

		JavascriptExecutor js6 =(JavascriptExecutor)driver;
		js6.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		questionsavebtn.click();
		Thread.sleep(5000);

		JavascriptExecutor js7 =(JavascriptExecutor)driver;
		js7.executeScript("arguments[0].scrollIntoView();",deletebtn);
		Thread.sleep(5000);
		deletebtn.click();

	}

	public boolean selectOptionalCheckBox() throws InterruptedException
	{
		kittitle.sendKeys(prop.getProperty("titleofkit"));
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		//videoquesbtn.click();
		//Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("videoquestion"));
		textareaofallques.click();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		questionsavebtn.click();
		Thread.sleep(4000);
		optioncheckbox.click();
		Thread.sleep(4000);
		boolean flag1 = optioncheckbox.isSelected();
		return flag1;

	}



	public boolean deleteWelcomeNote() throws InterruptedException
	{

		kittitle.sendKeys(prop.getProperty("titleofkit"));
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		welcomenotebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000);
		welcomenotetextarea.sendKeys(prop.getProperty("welcomenote"));

		JavascriptExecutor js8 =(JavascriptExecutor)driver;
		js8.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		slidesavebtn.click(); //click on save button of welcome note
		Thread.sleep(5000);
		deleteBtnWelcomeNote.click();
		Thread.sleep(5000);
		deleteBtnOnPopup.click();
		Thread.sleep(5000);
		boolean flag=welcomenotebtn.isEnabled();
		return flag;






	}
	public boolean editWelcomeNoteBtn() throws InterruptedException
	{
		kittitle.sendKeys(prop.getProperty("titleofkit"));
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		welcomenotebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000);
		welcomenotetextarea.sendKeys(prop.getProperty("welcomenote"));

		JavascriptExecutor js8 =(JavascriptExecutor)driver;
		js8.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);

		JavascriptExecutor js9 =(JavascriptExecutor)driver;
		js9.executeScript("arguments[0].scrollIntoView();",editWelcomeNoteBtn);
		Thread.sleep(3000);
		editWelcomeNoteBtn.click();
		Thread.sleep(5000);
		boolean flag=welcomenotetext.isDisplayed();
		return flag;

	}
	//07-04-2023

	public boolean addMediaBtnWelcomeNote() throws InterruptedException
	{

		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView();",welcomenotebtn);
		Thread.sleep(5000);
		welcomenotebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(3000);
		welcomenotetextarea.sendKeys(prop.getProperty("welcomenote"));

		JavascriptExecutor js8 =(JavascriptExecutor)driver;
		js8.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);

		JavascriptExecutor js3 =(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].scrollIntoView();",editWelcomeNoteBtn);
		Thread.sleep(5000);
		editWelcomeNoteBtn.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",addmediabtnonwelcomeexitnote);
		Thread.sleep(3000);
		addmediabtnonwelcomeexitnote.click();
		Thread.sleep(3000);
		boolean flag =videomediabtn.isDisplayed();
		return flag;



	}

	public boolean deleteExitNote() throws InterruptedException
	{

		kittitle.sendKeys(prop.getProperty("titleofkit"));
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		//videoquesbtn.click();
		//Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("videoquestion"));
		textareaofallques.click();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		questionsavebtn.click();
		Thread.sleep(4000);
		exitnotebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		exitnotetextarea.sendKeys(prop.getProperty("exitnote"));
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		JavascriptExecutor js9 =(JavascriptExecutor)driver;
		js9.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		slidesavebtn.click();
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		deletebtnexitnote.click();
		Thread.sleep(4000);
		deleteBtnOnPopup.click();
		boolean flag =exitnotebtn.isEnabled();
		return flag;



	}

	public boolean editExitNoteBtn() throws InterruptedException
	{
		kittitle.sendKeys(prop.getProperty("titleofkit"));
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(2000);
		//videoquesbtn.click();
		//Thread.sleep(5000);
		textareaofallques.sendKeys(prop.getProperty("videoquestion"));
		textareaofallques.click();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",questionsavebtn);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		questionsavebtn.click();
		Thread.sleep(4000);
		exitnotebtn.click();
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(5000);
		exitnotetextarea.sendKeys(prop.getProperty("exitnote"));
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		JavascriptExecutor js9 =(JavascriptExecutor)driver;
		js9.executeScript("arguments[0].scrollIntoView();",slidesavebtn);
		//driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		slidesavebtn.click();
		//	driver.manage().timeouts().implicitlyWait(50, seconds);
		Thread.sleep(4000);
		editexitnotebtn.click();
		Thread.sleep(4000);
		boolean flag =exitnotetext.isDisplayed();
		return flag;



	}
	public void savePredefinedKit() throws IOException, InterruptedException
	{     ikl = new InterviewKitListing();
	//ikl.clickonpredefinedInterviewKit();
	Thread.sleep(5000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",kitsavebtn);
	Thread.sleep(5000);
	kitsavebtn.click();


	}




}








