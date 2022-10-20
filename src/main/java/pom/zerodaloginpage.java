package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodaloginpage {
	@FindBy (xpath="//input[@id='userid']")private WebElement userId;
	@FindBy (xpath="//input[@id='password']")private WebElement password;
	@FindBy (xpath="//button[@type='submit']")private WebElement login;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	@FindBy (xpath="//input[@type='password']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	
	
	public zerodaloginpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void enterUserId(String user) {
		userId.sendKeys(user);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickLogin() {
		login.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnsignup() {
		signup.click();
	}
	public void enterPin(String pinNumber) {
      
	pin.sendKeys(pinNumber);	
	}
	public void clickonsubmit() {
		submit.click();
	}
}


