package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {


	WebDriver driver;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
	WebElement Application1;
	
	
	
	
	@FindBy(xpath="//a[text()=\"New Application\"][1]")
	WebElement newapplication;

	
		
	public void clickApplication()
	{
		Actions act=new Actions(driver);
		act.moveToElement(Application1).build().perform();;
	}
	
	public void newApplication()
	{
		 newapplication.click();
	}
	
	

}
