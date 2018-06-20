package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_page;

public class ShoppingBag_Page extends Base_page{
	@FindBy(xpath="//a[.='Place Order ']")
	private WebElement placeorderbtn;
	public ShoppingBag_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickPlaceorderbtn(){
		placeorderbtn.click();
	}
	public void verifycurrentTitle(String title){
		verifyTitle(title);
	}
	
}
