package testingAuto;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetails extends BasePage {
	
	
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a")
	private WebElement womenTab;
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]")
	private WebElement hoverProduct1;
	
	public productDetails()
	{
		PageFactory.initElements(driver, this);
	}
     
	Actions ac = new Actions(driver);
		
	
		
	public void clickWomenTab()
	{
		womenTab.click();
	}
	public void clickProduct1() {
		ac.moveToElement(hoverProduct1).build().perform();
		
	}
	
}
