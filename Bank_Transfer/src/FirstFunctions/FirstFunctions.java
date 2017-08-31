package FirstFunctions;

import org.openqa.selenium.WebDriver;

import Proces_Zakupowy.AddToCart;
import Proces_Zakupowy.Billing;
import Proces_Zakupowy.Cart;
import Proces_Zakupowy.OpenBrowser;
import Proces_Zakupowy.ProductPage;
import Proces_Zakupowy.SearchProduct;

public class FirstFunctions {
	
	public static void FirstFunctions(WebDriver driver, String baseUrl, String product_name ) throws InterruptedException {
	    OpenBrowser.OpenBrowser(driver, baseUrl);
	    SearchProduct.SearchProduct(driver, product_name);
	    ProductPage.ProductPage(driver);
	    AddToCart.AddToCart(driver, product_name);
	    Cart.Cart(driver);
	    Billing.Billing(driver);
	}
}
