package testingAuto;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dressPage extends BasePage {
	
	
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a")
	private WebElement dressTab;

	@FindBy(xpath = "//*[@for='layered_id_attribute_group_1']/a")
	private WebElement smallsize;

	@FindBy(xpath = "//*[@for='layered_id_attribute_group_2']/a")
	private WebElement mediumsize;

	@FindBy(xpath = "//*[@for='layered_id_attribute_group_3']/a")
	private WebElement largesize;
	
	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement totalProductCount;


	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> listProductCount;


	@FindBy(xpath = "//*[@class='product_list grid row']/li[1]//span[text()='Add to cart']")
	private WebElement addToCard;


	@FindBy(xpath = "//*[@class='product_list grid row']/li[1]")
	private WebElement addToCardHover;
	
	@FindBy(xpath = "//*[@class='shopping_cart']")
	private WebElement addToCardBtnHover;
	
	@FindBy(xpath = "//*[@class='cross']")
	private WebElement crossBtn;
	
	@FindBy(id = "cart_block_product_3_13_0")
	private WebElement productClick;
	
	@FindBy(xpath = "//*[@class='icon-twitter']")
	private WebElement tweet;
	
	
	@FindBy(id="layer_cart_product_title")
	private WebElement successText;


	Actions ac = new Actions(driver);
	
	public dressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement dresstab(){
		return dressTab;
	}
	
	public WebElement getSmallsize(){
		return smallsize;
	}
	
	public WebElement getMediumsize(){
		return mediumsize;
	}
	
	public WebElement getLargesize(){
		return largesize;
	}
	
	public WebElement tweetBtn(){
		return tweet;
	}

	public void clickDressTab()
	{
		dressTab.click();
	}
	
	public int getCountFromHeader()
	{
		/*String txt = totalProductCount.getText();
		String[] arr = txt.split(" ");
		txt = arr[2];
		int number = Integer.parseInt(txt);*/
		
		return Integer.parseInt(totalProductCount.getText().split(" ")[2]);
		
	}
	public int getCountFromproduct()
	{
		return listProductCount.size();
	}
	public String verifytext()
	{
		isElementVisible(successText);
		return successText.getText();
	}
	public void hoverAddToCard()
	{
		ac.moveToElement(addToCardHover).build().perform();
		addToCard.click();
	}
	public void hoverToAddCard()
	{
		ac.moveToElement(addToCardBtnHover).build().perform();
		productClick.click();
	}
	public void btnToCross()
	{
		ac.moveToElement(crossBtn).build().perform();
		crossBtn.click();
	}
}
