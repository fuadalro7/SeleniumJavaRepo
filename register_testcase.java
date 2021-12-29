package PHP_register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class register_testcase {
	WebDriver fuad_driver;
	WebElement IWebElement;
  @Test
  public void register_first_testcase() {
	  
	  fuad_driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[1]/div/div/form/label/input[1]")).click();
	  fuad_driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[1]/div/div/form/label/input[1]")).sendKeys("python/cpython");
	  fuad_driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[1]/div/div/form/label/input[1]")).sendKeys(Keys.ENTER);
	  fuad_driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[3]/div/ul/li[1]/div[2]/div[1]/div[1]")).click();
	  
	  
	  fuad_driver.findElement(By.cssSelector("#readme > div.Box-body.px-5.pb-5 > article > a:nth-child(2)")).isDisplayed();
	  fuad_driver.findElement(By.cssSelector("#readme > div.Box-body.px-5.pb-5 > article > a:nth-child(3)")).isDisplayed(); 
	  fuad_driver.findElement(By.cssSelector("#readme > div.Box-body.px-5.pb-5 > article > a:nth-child(4)")).isDisplayed();
	  fuad_driver.findElement(By.cssSelector("#readme > div.Box-body.px-5.pb-5 > article > a:nth-child(5)")).isDisplayed();	  
	  fuad_driver.findElement(By.cssSelector("#readme > div.Box-body.px-5.pb-5 > article > p:nth-child(6)")).isDisplayed();
	  
	  
	  System.out.println("Assessment is Passed By: Fuad F Abu Safi");

  }
  @BeforeClass
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	  fuad_driver=new ChromeDriver();
	  //fuad_driver=new GekoDriver();
	  //fuad_driver.get("http://automationpractice.com/");
	  fuad_driver.get("https://github.com/");
  }
  @AfterClass
  public void close_browser() {
	  //fuad_driver.close();
	  //fuad_driver.get("http://google.com/");
  }
}

