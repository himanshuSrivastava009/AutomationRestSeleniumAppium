package com.qa.selenium.test.checkout;

import com.qa.selenium.base.test.BaseTest;
import com.qa.selenium.checkout.CheckoutPage;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CheckoutTest extends BaseTest {

    CheckoutPage checkoutPage;
    HashMap<String, String> status;

    @Test(priority = 1, description = "proceed to checkout after adding all the products to the cart")
    public void performCheckout() {

        checkoutPage = homePage.checkOut();
        String title = checkoutPage.performCheckOut();
        System.out.println("Title of Checkout page is " + title);
    }

    @Test(priority = 2)
    public void enterTheDetails() throws InterruptedException {

        Thread.sleep(3000);
        checkoutPage.enterTheDetailsAndContinue(prop.getProperty("firstName")
                , prop.getProperty("lastName")
                , prop.getProperty("postalCode"));

    }

    @Test(priority = 3)
    public void checkOutAndCloseTheDeal() {

      status =  checkoutPage.closeTheDeal();
      //Iterator hashmap tp get key & value
       for( Map.Entry<String,String> entry: status.entrySet()){

           System.out.println(entry.getKey() + " = " + entry.getValue());
       }

    }

    @Test(priority = 4)
    public void backToHomePage(){

        System.out.println(checkoutPage.backToHomeAfterOderIsCompleted());
    }

}
