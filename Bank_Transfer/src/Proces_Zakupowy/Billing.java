package Proces_Zakupowy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Billing {


    //************************************************************/
    //						Billing							     /
    //**********************************************************/
	public static void Billing(WebDriver driver) throws InterruptedException {


		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    Thread.sleep(4000);
	    driver.findElement(By.id("customer-email")).click();
	    driver.findElement(By.id("customer-email")).clear();
	    driver.findElement(By.id("customer-email")).sendKeys("test@test.pl");
	    driver.findElement(By.cssSelector("div.loading-mask")).click();
	    Thread.sleep(4000);
	    System.out.println("		*****************************************************");
	    System.out.println("						Billing - Sucess");
	    System.out.println("		*****************************************************");
	}
}
