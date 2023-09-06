package JenkinsHTD.SeleniumJenkins;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AssertSelenium {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new EdgeDriver();
	  driver.get("https://www.bing.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("Selenium",Keys.ENTER);
	  
	 
  }
  @Test 
  public void f1() {
	  String tital = driver.getTitle();
	  //System.out.println(tital);
	  assertEquals("tital", "Selenium - Search");
  }
  @AfterMethod
  public void close() {
	  driver.quit();
  }
}
