package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.utils.SeleniumWrappers;

public class MyAccountPage  extends SeleniumWrappers{
	
	
	public MyAccountPage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "username")
	public WebElement userField;
	
	@FindBy(id = "password")
	public WebElement passField;
	
	@FindBy(css = "button[name='login']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']");
	public WebElement loginBtn;
	
	public void loginInApp(String username, String password) {
		
		//putem declara si aici elementele, dar e mai logic sa le punem in SeleniumWrappers
		// deoarece refolosim obiectele si tot ce include clasa respectiva
		
		//WebDriverWait.class.
		//userField.clear();
		//userField.sendKeys(username);
		
		sendKeys(userField, username);
		sendKeys(userField, password);
		click(loginBtn);
		
	}
	
}
