package Technical_Assessment_02.orangehrmTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangehrmTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  	
	  	String url = driver.getCurrentUrl();
	  	
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div"));
		
		WebElement useElement = driver.findElement(RelativeLocator.with(By.tagName("input")).below(element));
		useElement.sendKeys("Admin");
		
		WebElement passWard = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		passWard.sendKeys("admin123");
		
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.name("password"))).click();
		
		Assert.assertNotEquals(url, driver.getCurrentUrl());
		
  }
  @Test (dependsOnMethods = "f")
  public void f1() throws InterruptedException {		
		
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  Thread.sleep(3000);
	  Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver.getCurrentUrl());
  }
}
