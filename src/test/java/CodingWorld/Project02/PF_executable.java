package CodingWorld.Project02;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PF_executable {
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://project1.qualibytes.com/backend/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		PF_LoginPage object = new PF_LoginPage(driver);
				
			   object.setusername();
			   object.setpassword();
			   object.clickable();
			   
	   PF_homepage object1 = new PF_homepage(driver);
	      object1.logox();
	      object1.buttonx();
	   
			   
	}

}

