package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {

	@Test(groups="Two")
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");

		
		ob.executeScript("window.scrollBy(0,700)"); // scroll down
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-700)"); // scroll up
		Thread.sleep(3000);
		ob.quit();
	}
}
