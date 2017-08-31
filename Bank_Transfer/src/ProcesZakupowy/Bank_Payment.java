package ProcesZakupowy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import FirstFunctions.FirstFunctions;
import FirstFunctions.Header;
import Proces_Zakupowy.PaymentBankTransfer;

import Proces_Zakupowy.SucessBank;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bank_Payment extends Header{
	
  @Test
  public void CashOnDelivery() throws Exception {	
	System.out.println("Bank Transfer Payment + : ");
	FirstFunctions.FirstFunctions(driver, baseUrl, product_name);
    PaymentBankTransfer.PaymentBankTransfer(driver, firstname, lastname, street, city, postcode, telephone);
    SucessBank.Sucess(driver);
  }

  
  @Test
  public void InPost() throws Exception {  
	System.out.println("Bank Transfer Payment + : ");
	FirstFunctions.FirstFunctions(driver, baseUrl, product_name);
	 PaymentBankTransfer.PaymentBankTransfer(driver, firstname, lastname, street, city, postcode, telephone);
	 SucessBank.Sucess(driver);
  }
  

}
