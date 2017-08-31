package Proces_Zakupowy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {

	 //************************************************************/
    //						Cart							     /
    //**********************************************************/
    
	public static void Cart(WebDriver driver) throws InterruptedException {
		driver.findElement(By.cssSelector("a.action.showcart")).click();
	    driver.findElement(By.id("attribute140")).click();
	    driver.findElement(By.cssSelector("span.counter.qty")).click();
	    driver.findElement(By.cssSelector("a.action.viewcart > span > span")).click();

	    String prise = driver.findElement(By.cssSelector("td.col.subtotal > span.price-excluding-tax > span.cart-price > span.price")).getText(); // pobieranie ceny poduktu

	    
	    prise = prise.replaceAll("\\D+",""); // wyciąganie cyfry z stringu
	    int prisei = Integer.parseInt(prise); //zamiana stringu na intiger
	    prisei = ( prisei * 2 );
	    String result = Float.toString(((prisei*0.01f))); //zmiana z float na string 
	    
	
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/div/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/div/input")).sendKeys("2");
	    driver.findElement(By.xpath("(//button[@name='update_cart_action'])[2]")).click();
	    Thread.sleep(4000);
	    	    
	    String prise2 = driver.findElement(By.cssSelector("strong > span.price")).getText(); // pobieranie zwiększonejceny poduktu
	    prise2 = prise.replaceAll("\\D+",""); // wyciąganie cyfry z stringu
	    int prisei2 = Integer.parseInt(prise); //zamiana stringu na intiger
	    String result2 = Float.toString(((prisei*0.01f))); //zmiana z float na string 
	    
	    assertEquals(result2, result,"Cena po podwojeniu ilości: ");
	    System.out.println("			*****************************************************");
	    System.out.println("					Cart - Sucess");
	    System.out.println("			*****************************************************");
	}
}
