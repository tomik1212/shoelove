package ProcesZakupowy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import FirstFunctions.FirstFunctions;
import FirstFunctions.Header;
import Proces_Zakupowy.PaymentPayu;
import Proces_Zakupowy.SucessPayu;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Payu_Payment extends Header{

  @Test
  public void CashOnDelivery() throws Exception {  
	System.out.println("Payu Payment + : ");
	FirstFunctions.FirstFunctions(driver, baseUrl, product_name);
    PaymentPayu.Payu(driver, firstname, lastname, street, city, postcode, telephone, card_number, card_expm, card_expy, card_cvv);
    SucessPayu.Sucess(driver);
  }
   
}
