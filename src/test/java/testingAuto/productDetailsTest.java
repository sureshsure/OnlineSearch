package testingAuto;

import org.testng.annotations.Test;

public class productDetailsTest {

	
	BasePage bp;
	productDetails pdp;
	
    public productDetailsTest() {
		bp = new BasePage();
		pdp = new productDetails();
	}
    
    @Test
    public void checkTweetShare()
    {
    	pdp.clickWomenTab();
    }
    
}
