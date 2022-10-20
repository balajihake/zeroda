package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browser {
public static WebDriver openBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable notification");
	option.addArguments("headless");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	return driver;
	
	
}
}
