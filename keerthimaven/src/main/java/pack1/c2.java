package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {
	
	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		ob.switchTo().frame(0);
		File s1 = ob.getScreenshotAs(OutputType.FILE);
		//FileUtils=> apache directory studio common io 
		FileUtils.copyFile(s1, new File("C:\\Users\\hp\\eclipse-workspace\\keerthimaven\\screen\\b.png"));
		ob.findElementById("datepicker").click();
		
		//selecting month and year
		for(int i=0;i<2;i++)
		{
			ob.findElementByCssSelector("#ui-datepicker-div > div > a.ui-datepicker-next.ui-corner-all > span").click();
		}
		//date selection
		ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(7) > a").click();
	    
		File s2 = ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s2, new File("C:\\Users\\hp\\eclipse-workspace\\keerthimaven\\screen\\a.png"));
		Thread.sleep(3000);
	ob.quit();
	}

}
