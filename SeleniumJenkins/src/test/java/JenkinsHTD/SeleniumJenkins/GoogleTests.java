package JenkinsHTD.SeleniumJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTests {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
}
