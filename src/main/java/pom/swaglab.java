package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class swaglab {
	@FindBy (xpath="//input[@id='user-name']")private WebElement userid;
    @FindBy (xpath="//input[@type='password']")private WebElement password;
    @FindBy (xpath="//input[@type='submit']")private WebElement submit;
    
}
