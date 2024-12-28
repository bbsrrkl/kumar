package kumar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAnnotations {

	@Test
	public void login()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys("prasanna.biswal");
		driver.findElement(By.name("passwd")).sendKeys("123456");
		driver.findElement(By.name("proceed")).click();	
	}
}
