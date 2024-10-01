package CodingWorld.Project02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class PF_LoginPage {
	
	//Page object Module = Page Factory class = static method = init method
	// init method is use to complete initialization of a web Element
	// init method is going to be use in the constructor.
	//syntax @findBy (attributename='value')
	//Annotation is going to be use above the particular webelement or datamember which consist of the address of that element
    // we are not using semicolumn in annotation
	
	//declaration 
	@FindBy(xpath="//input[@id='emailaddress']") // partial initialization
	private WebElement email;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	@FindBy(xpath="//button[@name='admin_login']")
	private WebElement login;
	
	// common properties along with the constructor
	
	WebDriver driver;
	public PF_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
		//usage
		
		public void setusername()
		{
			email.sendKeys("admin@mail.com");
		}
		
		public void setpassword()
		{
			pass.sendKeys("Password@123");
		}
		
		public void clickable()
		{
			login.click();
		}
}



