package Proces_Zakupowy;

import org.openqa.selenium.WebDriver;

public class OpenBrowser {
	public static void OpenBrowser(WebDriver driver, String baseUrl) {
		driver.get(baseUrl);
		System.out.println("*****************************************************");
		System.out.println("	OpenBrowser - Sucess");
		System.out.println("*****************************************************");
	}
}
