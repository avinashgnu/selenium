package basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AviNash {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.fb.com");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\lib\\chromedriver.exe"); //--->chrome browser path
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
