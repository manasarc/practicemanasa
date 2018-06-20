package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_page;

public class OnlineJewelleryHome_page extends Base_page  {
	public Actions act;
	@FindBy(xpath="(//a[@title='Jewellery'])[1]")
	private WebElement jewellink;
	@FindBy(xpath="(//a[@href='https://www.bluestone.com/jewellery/diamond-necklaces.html'])[2]")
	private WebElement diamondjewellink;
	@FindBy(xpath="(//a[@title='Earrings'])[1]")
	private WebElement earringslink;
	@FindBy(xpath="(//span[.='Gemstone'])[2]")
	private WebElement gemstoneearbtn;
	
	
	public OnlineJewelleryHome_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void verifyHomepage(String hptitle) {
		verifyTitle(hptitle);
	}

	
public void clickjewelbtn(){
	act=new Actions(driver);
	act.moveToElement(jewellink).perform();
	act.pause(3000);
}
public void mousehover(){
	act.moveToElement(diamondjewellink).click().perform();
}
public void clickeariringlink(){
	act=new Actions(driver);
	act.moveToElement(earringslink).perform();
	act.pause(3000);
}
public void clickgemstoneearbtn(){
	act.moveToElement(gemstoneearbtn).click().perform();
}



}
