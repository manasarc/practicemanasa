package Scripts;

import org.testng.annotations.Test;

import Generic.Base_test;
import POM.Account_Details_Page;
import POM.GemStoneEarrings_page;
import POM.OnlineJewelleryHome_page;
import POM.ShoppingBag_Page;
import POM.The_Priyanka_HeartEarrings_Page;

public class Buyjewellery extends Base_test{
	@Test
	public void jewellerybuy() throws InterruptedException{
		OnlineJewelleryHome_page m1=new OnlineJewelleryHome_page(driver);
		m1.clickeariringlink();
		m1.clickgemstoneearbtn();
		GemStoneEarrings_page g1=new GemStoneEarrings_page(driver);
		g1.verifycurrentTitle("Gemstone Earrings ");
		g1.clickSortbypricebtn();
		g1.verifyElement2();
		g1.clickPricerange4btn();
		g1.clickViewdetailsbtn();
		The_Priyanka_HeartEarrings_Page p1=new The_Priyanka_HeartEarrings_Page(driver);
		p1.verifycurrentTitle1("The Priyanka Heart Earrings");
		p1.clickBuynowbtn();
		ShoppingBag_Page s1=new ShoppingBag_Page(driver);
		s1.verifycurrentTitle("Shopping Bag");
		s1.clickPlaceorderbtn();
		Account_Details_Page a1=new Account_Details_Page(driver);
		a1.verifycurrentTitle1("Account Details");
	}}