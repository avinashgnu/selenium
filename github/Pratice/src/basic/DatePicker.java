package basic;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DatePicker {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("http://www.redbus.in");
	  driver.findElement(By.id("txtSource")).sendKeys("Amalapuram");
	  driver.findElement(By.id("txtDestination")).sendKeys("Hyderabad");
	  driver.findElement(By.id("txtOnwardCalendar")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='rbcal_txtOnwardCalendar']/table[1]/tbody/tr[7]/td[5]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\lib\\chromedriver.exe"); //--->chrome browser path
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
	 
  }

}
