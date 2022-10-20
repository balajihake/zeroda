package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.browser;
import pom.zerodaloginpage;
import utility.Screenshot;
import utility.Zerodafindelements;
import utility.parametrization;

@Listeners(utility.Listeners.class)

public class zerodaloginpagetest extends Zerodafindelements {


@BeforeMethod
public void openChrome() {
	driver=browser.openBrowser();
}
@Test
public void validateZerodalogin() throws EncryptedDocumentException, IOException, InterruptedException {
	zerodaloginpage zerodaLoginpage =new zerodaloginpage(driver);
	zerodaLoginpage.enterUserId(parametrization.getExcalSheet(0, 1, "credentials"));
	zerodaLoginpage.enterPassword(parametrization.getExcalSheet(1, 1, "credentials"));
	zerodaLoginpage.clickLogin();
	Thread.sleep(2000);
	zerodaLoginpage.enterPin(parametrization.getExcalSheet(2, 1, "credentials"));
	zerodaLoginpage.clickonsubmit();
	
	
}

@Test
public void signUp() {
	zerodaloginpage z = new zerodaloginpage(driver);
	z.clickOnsignup();
}
@Test(dependsOnMethods= {"validateZerodalogin"})
public void forgot() {
	zerodaloginpage z = new zerodaloginpage(driver);
	z.clickOnForgot();
}
}
