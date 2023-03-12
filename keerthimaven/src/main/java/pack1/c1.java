package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		System.out.println(ob.getTitle());
		ob.quit();
	}
	

}

//file=> new=> project=> maven=> maven project->create a simple=> groupid, artifactid,=> name=> finish
//rightclciked=> project=> new=> package=> name=> class=> name=> finish
// pom.xml=>dependencies tag
// mvnrepository.com=> selenium hq server standalone=> 3.141.59=> copy => paste it between dependencies tag, save 