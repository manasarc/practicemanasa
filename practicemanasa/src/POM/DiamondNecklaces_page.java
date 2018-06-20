package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_page;

public class DiamondNecklaces_page extends Base_page {
	
	@FindBy(xpath="//span[@class='view-by-wrap title style-outline i-right']")
	private WebElement sortbybtn;
	@FindBy(xpath="//label [@for='filter_ndd']/span")
	private WebElement nextdaycheckbox;
	
	@FindBy(xpath="//a[.='Price High to Low ']")
	private WebElement discountbtn;

	public DiamondNecklaces_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clicknextdaycheckbox(){
		nextdaycheckbox.click();
		}
	public void clicksortby(){
		sortbybtn.click();
		}
	public void clickDiscountbtn(){
		
		discountbtn.click();
	}
	public void verifyDiamondpage(String Diamondnecktitle) {
	     verifyTitle(Diamondnecktitle);
	}
	public void verifyElement1()
	{           verifyElement(sortbybtn);
	}
}
