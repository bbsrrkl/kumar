package kumar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys("prasanna.biswal");
		driver.findElement(By.name("passwd")).sendKeys("123456");
		WebElement login=driver.findElement(By.name("proceed"));
	explicitWait(driver,20,login);
	}

public static void  explicitWait(WebDriver driver,int timeout,WebElement locator)
{
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
wait.until(ExpectedConditions.elementToBeClickable(locator));
locator.click();
}
public static  void takeScreenShot(WebDriver driver,String filepath)

{
//File 	file=(TakesScreenshot)driver.	
}
}
