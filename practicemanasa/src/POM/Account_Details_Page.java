package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_page;

public class Account_Details_Page extends Base_page{

	public Account_Details_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void verifycurrentTitle1(String title){
		verifyTitle(title);
		}
}
