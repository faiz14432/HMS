package CodingWorld.Project02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_homepage {
	
	
	//Declaration
	@FindBy(xpath="//img[@src='assets/images/logo-light.png']")
	private WebElement logo;
	@FindBy(xpath="//button[@class='button-menu-mobile waves-effect waves-light']") // no semicolumn in findBy
	private WebElement button;
	
	//common property with the use of constructor
	
	WebDriver driver;
	
	public PF_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); // initElement to completely initialize the value
	}
	
	//usage
	
	public void logox()
	
	{
		Boolean check=logo.isDisplayed();
		if(check==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
	}
	
	public void buttonx()
	{
		button.click();
	}
	

}


