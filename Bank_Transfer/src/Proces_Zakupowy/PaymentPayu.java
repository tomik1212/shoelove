package Proces_Zakupowy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPayu {
	
	
	 //************************************************************/
    //						PaymentPayu				     /
    //**********************************************************/
    
	
	
	public static void Payu(WebDriver driver, String firstname, String lastname, String street, String city, String postcode, String telephone, String card_number, String card_expm, String card_expy, String card_cvv) throws InterruptedException{
		Thread.sleep(3000);
	    assertEquals(driver.findElement(By.xpath("//div[@id='checkout-payment-method-load']/div/div/div[2]/div/label/span")).getText(), "Bank Transfer Payment");
	    assertEquals(driver.findElement(By.xpath("//div[@id='checkout-payment-method-load']/div/div/div[3]/div/label/span")).getText(), "Payu.pl");

	    driver.findElement(By.id("orba_payupl")).click();
	    Thread.sleep(3500);
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[2]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[2]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[2]/div/input")).sendKeys(firstname);

	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[3]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[3]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[3]/div/input")).sendKeys(lastname);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/fieldset/div/div[1]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/fieldset/div/div[1]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/fieldset/div/div[1]/div/input")).sendKeys(street);

	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[5]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[5]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[5]/div/input")).sendKeys(city);

	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[7]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[7]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[7]/div/input")).sendKeys(postcode);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[9]/div/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[9]/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[9]/div/input")).sendKeys(telephone);
	    
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[8]/div/select")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/form/fieldset/div[8]/div/select/option[162]")).click();

	    //Update
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form[2]/fieldset/div[1]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]")).click();   
		Thread.sleep(7000);
	    
		//Place Order
	    driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[3]/div[2]/div[4]/div/button")).click();
	    						
	    Thread.sleep(5000);
	   
		//Payu 
		driver.findElement(By.id("button_pu")).click(); 
		Thread.sleep(3000);
		
		//Metod Pay
		driver.findElement(By.xpath("//*[@id=\"card_style\"]/input")).click();
		
		driver.findElement(By.id("card-number")).click(); 
		driver.findElement(By.id("card-number")).clear(); 
		driver.findElement(By.id("card-number")).sendKeys(card_number); 
		
		driver.findElement(By.id("card-expm")).click(); 
		driver.findElement(By.id("card-expm")).clear(); 
		driver.findElement(By.id("card-expm")).sendKeys(card_expm); 
		
		driver.findElement(By.id("card-expy")).click(); 
		driver.findElement(By.id("card-expy")).clear(); 
		driver.findElement(By.id("card-expy")).sendKeys(card_expy); 
		
		driver.findElement(By.id("card-cvv")).click(); 
		driver.findElement(By.id("card-cvv")).clear(); 
		driver.findElement(By.id("card-cvv")).sendKeys(card_cvv); 
		
		//Pay
		driver.findElement(By.id("invokePay")).click(); 
		
			
		System.out.println("				*****************************************************");
	    System.out.println("						PaymentBankTransfer - Sucess");
	    System.out.println("				*****************************************************");
	}
}
