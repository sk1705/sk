package extentt;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class e1 {

	//create an object for extent report
	// pass path 
	// add dependency code
	// logs
	
	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public  void startTest()
	{
	//creating an object for extent reports class, pass path as input, globally
	report = new ExtentReports("C:\\Users\\hp\\eclipse-workspace\\keerthimaven\\src\\main\\java\\extentt\\d.html");
	// test start ,finish, loging
	test = report.startTest("e1");
    test.log(LogStatus.ERROR,"it may fail");
	test.log(LogStatus.INFO,"in before class");

	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\hp\\Documents\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	Assert.assertEquals(driver.getTitle(),"Google");
	test.log(LogStatus.PASS,"Test case passed ");
	test.setDescription("this is about google");
	driver.quit();

	}

	@AfterClass
	public void endTest()
	{
	test.log(LogStatus.INFO,"in after class");
	report.endTest(test);
	report.flush();
	}


}
