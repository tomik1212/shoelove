package Proces_Zakupowy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentBankTransfer {
	
	
	 //************************************************************/
    //						PaymentBankTransfer				     /
    //**********************************************************/
    
	
	
	public static void PaymentBankTransfer(WebDriver driver, String firstname, String lastname, String street, String city, String postcode, String telephone) throws InterruptedException{
		Thread.sleep(3500);
	    assertEquals(driver.findElement(By.xpath("//div[@id='checkout-payment-method-load']/div/div/div[2]/div/label/span")).getText(), "Bank Transfer Payment");
	    assertEquals(driver.findElement(By.xpath("//div[@id='checkout-payment-method-load']/div/div/div[3]/div/label/span")).getText(), "Payu.pl");

	    driver.findElement(By.id("banktransfer")).click();

	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[2]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[2]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[2]/div/input")).sendKeys(firstname);

	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[3]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[3]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[3]/div/input")).sendKeys(lastname);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/fieldset/div/div[1]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/fieldset/div/div[1]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/fieldset/div/div[1]/div/input")).sendKeys(street);

	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[5]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[5]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[5]/div/input")).sendKeys(city);

	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[7]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[7]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[7]/div/input")).sendKeys(postcode);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[9]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[9]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[9]/div/input")).sendKeys(telephone);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[8]/div/select")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[8]/div/select/option[162]")).click();

	    //Update
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]")).click();   
		Thread.sleep(3000);
	    //Place Order
	    driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
		Thread.sleep(5000);
		System.out.println("				*****************************************************");
	    System.out.println("						PaymentBankTransfer - Sucess");
	    System.out.println("				*****************************************************");
	}
}
