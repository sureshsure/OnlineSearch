package testingAuto;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends BasePage {

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[1]/a")
	private WebElement womenTab;

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a")
	private WebElement dressTab;

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[3]/a")
	private WebElement tshirtTab;

	@FindBy(xpath = "//*[@class='navigation_page']")
	private WebElement womenTabObject;

	@FindBy(xpath = "//span[@class='cat-name']")
	private WebElement dressTabObject;

	@FindBy(xpath = "//span[@class='cat-name']")
	private WebElement tshirtTabObject;

	@FindBy(id = "newsletter-input")
	private WebElement emailObject;

	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement success;

	public homepage() {
		PageFactory.initElements(driver, this);
	}
	 

	public WebElement getwomenTab() {
		return womenTab;

	}

	public WebElement getdressTab() {
		return dressTab;

	}

	public WebElement gettshirtTab() {
		return tshirtTab;

	}

	public WebElement getEmail() {
		return emailObject;

	}

	public void btnWomanTab() {
		womenTab.click();
	}

	public void btnDressTab() {
		dressTab.click();
	}

	public void btnTshirtTab() {
		tshirtTab.click();
	}

	public WebElement objectWomenTab() {
		return womenTabObject;
	}

	public WebElement objectdressTab() {
		return dressTabObject;
	}

	public WebElement objecttshirtTab() {
		return tshirtTabObject;
	}

	public String Emailsuccess() {
		return success.getText();
	}

	public void settextnewsLetter(String email) {
		setEmail(emailObject, email);
	}
	
	

}
