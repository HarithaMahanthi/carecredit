package testcases;

import org.testng.annotations.Test;

import pageobjects.AccountCreation;
import pageobjects.HomePage;
import testbase.BaseClass;

public class Tc001_Homepage extends BaseClass {
	
	
	
	@Test	
	public  void test_accout_Apply() {
		
		logger.info(" Starting TC_001_Homepage ");
		driver.get("https://qwww.carecreditprovidercenter.com/BC_CC_Demo/cc-htmls/apply-two.html");
		logger.info(" homepage launched ");
		
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		
		hp.clickApplication();
		logger.info(" homepage application tab ");
		hp.newApplication();
		logger.info(" application form launched ");
		
		AccountCreation ac=new AccountCreation();
		
		ac.setEstimatedFee("1000");
		logger.info(" estimation fee filled ");
		
		/*
		 * ac.phonedrpbox(); logger.info(" dropbox phonelaunched ");
		 * 
		 * ac.primaryiddrpbox(); logger.info(" primaryid dropdown launched ");
		 * 
		 * ac.secondaryiddrpbox(); logger.info(" secondary drpdown launched ");
		 * 
		 * ac.chkboxselection(); logger.info(" checkbox selected ");
		 * 
		 * ac.submitbutnclick(); logger.info(" appluication submited page changed ");
		 */
		
	}
	
	
	

}
