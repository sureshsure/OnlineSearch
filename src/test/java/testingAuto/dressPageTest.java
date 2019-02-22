package testingAuto;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dressPageTest {

	dressPage dp;
	BasePage bp;

	public dressPageTest() {
		dp = new dressPage();
		bp = new BasePage();
	}

	
	 @Test public void verifydresspage() { dp.clickDressTab();
	  Assert.assertTrue(dp.getSmallsize().isDisplayed());
	  Assert.assertTrue(dp.getMediumsize().isDisplayed());
	  Assert.assertTrue(dp.getLargesize().isDisplayed()); bp.navigateBack(); }
	  
	  @Test public void verifyCountOfProduct() { dp.clickDressTab();
	  Assert.assertEquals(dp.getCountFromHeader(), dp.getCountFromproduct()); }
	 

	@Test
	public void verifyAddToCard()

	{
		dp.clickDressTab();
		dp.hoverAddToCard();
		Assert.assertTrue(dp.verifytext().contains("Printed"));
		dp.btnToCross();
		dp.hoverToAddCard();
		Assert.assertTrue(dp.tweetBtn().isDisplayed());

	}

}
