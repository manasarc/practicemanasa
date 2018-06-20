package Scripts;

import org.testng.annotations.Test;

import Generic.Base_test;
import POM.DiamondNecklaces_page;
import POM.OnlineJewelleryHome_page;

public class Sort_diamondjewellery extends Base_test{
	@Test
	public void sortjewellery() throws InterruptedException{
		OnlineJewelleryHome_page h1=new OnlineJewelleryHome_page(driver);
		h1.verifyHomepage("Online Jewellery Shopping Store India");
		h1.clickjewelbtn();
		h1.mousehover();
		DiamondNecklaces_page d1=new DiamondNecklaces_page(driver);
		d1.verifyDiamondpage("Diamond Necklaces");
		d1.clicknextdaycheckbox();
		d1.clicksortby();
		d1.verifyElement1();
		d1.clickDiscountbtn();
	}
}
