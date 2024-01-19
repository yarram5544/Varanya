package BasicLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void chromebrowser() {
	  
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://facebook.com");
	  
	  
  }
  @Test 
 public void login() {
	
	 driver.findElement(By.name("email")).sendKeys("8367554433");
	 driver.findElement(By.id("pass")).sendKeys("asdad");
	 
	 
	 
 }

 
}
