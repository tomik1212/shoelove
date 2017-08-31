package Proces_Zakupowy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	 //************************************************************/
    //						ProductPage        				     /
    //**********************************************************/
	
	public static void ProductPage(WebDriver driver) {
	    driver.findElement(By.cssSelector("img.photo.image")).click();
	    System.out.println("*****************************************************");
	    System.out.println("			ProductPage - Sucess");
	    System.out.println("*****************************************************");
	}
	
	
}
