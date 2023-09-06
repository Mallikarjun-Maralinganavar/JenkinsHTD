package JenkinsHTD.SeleniumJenkins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSelenium {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.Google.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
  }
}
