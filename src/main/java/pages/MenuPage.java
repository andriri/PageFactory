package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{
	
	//public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		//this.driver = driver;
		super(driver);	//constructor
		PageFactory.initElements(driver, this);
	}
	
	
	
	/*Alta abordare de a declara "My account" link din Keyfood
	 *FindBy vs public By
	 *  
	 * public By myAccountLink = By.linkText("My Account");
	 * driver.findElement(myAccountLink);
	 * 
	 */
	
	@FindBy(linkText = "My account")
	public WebElement myAccountLink;

}
