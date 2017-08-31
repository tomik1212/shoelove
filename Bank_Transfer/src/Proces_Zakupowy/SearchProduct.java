package Proces_Zakupowy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct {

	 //************************************************************/
    //						SearchProduct      				     /
    //**********************************************************/
	
	public static void SearchProduct(WebDriver driver, String name) {

		driver.findElement(By.id("search")).click();
	    driver.findElement(By.id("search")).clear();
	    driver.findElement(By.id("search")).sendKeys(name);
	    driver.findElement(By.cssSelector("button.action.search")).click();
	    System.out.println("*****************************************************");
	    System.out.println("		SearchProduct - Sucess");
	    System.out.println("*****************************************************");
	}
}
