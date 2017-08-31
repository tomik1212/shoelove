package Proces_Zakupowy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SucessPayu {

//*************************************************************************/
//						Potwierdzenie zamówienia    			          /
//***********************************************************************/

	
	public static void Sucess(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div/p")).getText(), "Transakcja została zlecona do realizacji.");
		System.out.println("					*****************************************************");
		System.out.println("							Order - Sucess");
		System.out.println("					*****************************************************");
	}

}
