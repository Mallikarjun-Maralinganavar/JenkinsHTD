package JenkinsHTD.SeleniumJenkins;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.beust.ah.A;

public class AssertSelenium {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(), "Selenium - Search");
  }
}
