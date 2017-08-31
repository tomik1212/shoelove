package FirstFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import static org.testng.Assert.fail;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Header {
	protected WebDriver driver;
	  protected boolean acceptNextAlert = true;
	  protected StringBuffer verificationErrors = new StringBuffer();
	 
	  //variable
	  public String product_name = "Czerwone Balerinki Apparatus";
	  public String firstname = "test";
	  public String lastname = "test";
	  public String street = "test";
	  public String city = "test";
	  public String postcode = "11-111";
	  public String telephone = "123456789";
	  public String card_number = "4539 7103 8504 7754";
	  public String card_expm = "2";
	  public String card_expy = "2019";
	  public String card_cvv = "733";
	  public String baseUrl = "http://www.lp.shoelove.dev.gate-software.com/";

	@BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {

		System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
	    //driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
	  
	  

	@AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      AssertJUnit.fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
