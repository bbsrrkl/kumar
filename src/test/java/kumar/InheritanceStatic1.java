package kumar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InheritanceStatic1 {

public static String browser="chrome";
public static String url="http://facebook.com";
public static WebDriver driver;

public static void initialization()
{
	if (browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	else if(browser.equals("FF"))
	{
		WebDriverManager.chromedriver().setup();
		 driver = new FirefoxDriver();
	}
	driver.get("http://facebook.com");
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
public void login()
{
	
}

}
