package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_page;

public class GemStoneEarrings_page extends Base_page {

@FindBy(xpath="(//i [@class='icon-ion-chevron-down'])[1]")
private WebElement sortbypricebtn;
@FindBy(xpath="//span[@data-p='jewellery@filter@gemstone-earrings-rs+30000+to+rs+40000!!']")
private WebElement pricerange4btn;
@FindBy(xpath="//img[@src='https://climg6.bluestone.com/f_webp,c_scale,w_515,b_rgb:f0f0f0/giproduct/BISA0132D13_RAA18DIG6ROQUXXXX_ABCD00-PICS-00004-1024-10950.png']")
private WebElement viewdetailsbtn;

public GemStoneEarrings_page(WebDriver driver) {
	super(driver);
PageFactory.initElements(driver, this);
}
public void clickSortbypricebtn(){
	sortbypricebtn.click();
}
public void clickPricerange4btn(){
	pricerange4btn.click();
}
public void verifyElement2()
{           verifyElement(sortbypricebtn);
}
public void clickViewdetailsbtn(){
	viewdetailsbtn.click();
}

public void verifycurrentTitle(String title){
	verifyTitle(title);
}


}

