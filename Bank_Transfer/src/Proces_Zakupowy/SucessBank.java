package Proces_Zakupowy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SucessBank {

//*************************************************************************/
//						Potwierdzenie zamówienia    			          /
//***********************************************************************/

	
	public static void Sucess(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		String order = driver.findElement(By.cssSelector("p")).getText();
		order = order.replaceAll("\\D+",""); // wyciąganie cyfry z stringu
		System.out.println(order);
		assertEquals(driver.findElement(By.cssSelector("p")).getText(), "Your order # is: " + order + ".");
		assertEquals(driver.findElement(By.xpath("//main[@id='maincontent']/div[3]/div/div[2]/p[2]")).getText(), "We'll email you an order confirmation with details and tracking info.");
		assertEquals(driver.findElement(By.xpath("//div[@id='registration']/div[2]/p")).getText(), "You can track your order status by creating an account.");
		System.out.println("					*****************************************************");
		System.out.println("							Order - Sucess");
		System.out.println("					*****************************************************");
	}

}
