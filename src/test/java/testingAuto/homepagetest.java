package testingAuto;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.WebDriver.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homepagetest {
	
	homepage home;
	BasePage bp;
	
	public homepagetest() {
		home = new homepage();
		bp = new BasePage();
	}
	
    int value = new Random().nextInt(500);
    String email = "sureshsure"+value+"@gmail.com";
	
	@Test
	public void verfyTabs()
	{
		Assert.assertTrue(home.getwomenTab().isDisplayed());
	    Assert.assertTrue(home.getdressTab().isDisplayed());
	    Assert.assertTrue(home.gettshirtTab().isDisplayed());
		
	}
	@Test
	public void verfynavigate()
	{
		home.btnWomanTab();
		Assert.assertTrue(bp.elementFound(home.objectWomenTab()));
	    bp.navigateBack();
	    home.btnDressTab();
	    Assert.assertTrue(bp.getTitlte().contains("Dresses"));
	    bp.navigateBack();
	    home.btnTshirtTab();
	    Assert.assertTrue(home.objecttshirtTab().isDisplayed());
	    bp.navigateBack();
	}
	
	@Test
	public void verfyNewsletter()
	{
		home.settextnewsLetter(email);
		Assert.assertTrue(home.Emailsuccess().contains("successfully "));	
		
	}
	
}
