package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

WebDriver driver;
	
	
	
	public AccountCreation()
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//body[1]/div[2]/section[1]/div[3]/div[1]/div[3]/div[1]/div[1]")
	WebElement estimatedfee;
	/*
	 * @FindBy(
	 * xpath="//label[text()='Select Phone Type']//following-sibling::select")
	 * WebElement phonedrpbox;
	 * 
	 * @FindBy(xpath="//label[text()='Primary ID Type']//following-sibling::select")
	 * WebElement primaryiddrpdwn;
	 * 
	 * @FindBy(
	 * xpath="//label[contains(text(),'Secondary ID ')]//following-sibling::select")
	 * WebElement secondaryiddrpdwn;
	 * 
	 * @FindBy(xpath="//*[@id=\"isCustomerCheckedTAndC\"]") WebElement chkbox;
	 * 
	 * 
	 * @FindBy(xpath="//*[@id=\"next-page\"]") WebElement submitbutn;
	 */
	
	public void setEstimatedFee(String fee)
	{
		//logger.info("in estimated fee");
		estimatedfee.sendKeys(fee);
	}
	
	
	/*
	 * public void selectphonedrpbox() { phonedrpbox.click(); }
	 * 
	 * public void selectprimaryid () { primaryiddrpdwn.click(); } public void
	 * selectsecondary () { secondaryiddrpdwn.click(); }
	 * 
	 * public void fillfee() { estimatedfee.sendKeys("1000"); }
	 * 
	 * public void phonedrpbox() { Select drp1=new Select(phonedrpbox);
	 * drp1.selectByVisibleText("Home Phone"); } public void primaryiddrpbox() {
	 * Select drp1=new Select(primaryiddrpdwn);
	 * drp1.selectByVisibleText("DRIVERS LICENSE"); } public void
	 * secondaryiddrpbox() { Select drp1=new Select(secondaryiddrpdwn);
	 * drp1.selectByVisibleText("US PASSPORT"); } public void chkboxselection() {
	 * chkbox.click(); } public void submitbutnclick() { submitbutn.click();; }
	 */
}
