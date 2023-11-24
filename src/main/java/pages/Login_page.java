package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class Login_page {
	WebDriver driver;
	
	public Login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(xpath="//div[contains(@class,'menu__btn d-none')]//a[1]")
	private WebElement login;
	
	public void login_click() {
		
	}

}
