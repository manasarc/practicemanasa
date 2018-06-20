package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_page;

public class The_Priyanka_HeartEarrings_Page extends Base_page{

	@FindBy(xpath="//input[@id='buy-now']")
	private WebElement buynowbtn;
	
	public The_Priyanka_HeartEarrings_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void verifycurrentTitle1(String title){
		verifyTitle(title);
	}
	public void clickBuynowbtn(){
		buynowbtn.click();
	}	
}
