package Proces_Zakupowy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {


    //************************************************************/
    //						AddToCart							     /
    //**********************************************************/
	
	public static void AddToCart(WebDriver driver, String name) throws InterruptedException {
		
		driver.findElement(By.id("attribute140")).click();
	    driver.findElement(By.cssSelector("option[value=\"43\"]")).click();
	    driver.findElement(By.id("product-addtocart-button")).click();
	    Thread.sleep(15000);
	    assertEquals(driver.findElement(By.xpath("//main[@id='maincontent']/div/div[2]/div/div/div")).getText(), "You added " + name + " to your shopping cart.");
	    try {
	      assertEquals(driver.findElement(By.xpath("//main[@id='maincontent']/div/div[2]/div/div/div")).getText(), "You added " + name + " to your shopping cart.");
	    } catch (Error e) {
	     // verificationErrors.append(e.toString());
	    }
	    for (int second = 0;; second++) {
	    	if (second >= 60) fail("timeout");
	    	//try { if ("You added Czerwone Balerinki Apparatus to your shopping cart.".equals(driver.findElement(By.xpath("//main[@id='maincontent']/div/div[2]/div/div")).getText())) break; } catch (Exception e) {}
	    	try { if ("You added "+ name +" to your shopping cart.".equals(driver.findElement(By.xpath("//main[@id='maincontent']/div/div[2]/div/div")).getText()) != null) break; } catch (Exception e) {}
	    	
	    }
    	System.out.println("		*****************************************************");
	    System.out.println("				AddToCart - Sucess");
	    System.out.println("		*****************************************************");
	}


}
