package com.qa.selenium.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class CheckoutPage {

    WebDriver driver;
    HashMap<String, String> orderDetails;


    //By Locators for Checkout
    By checkout = By.cssSelector("button#checkout");
    By checkoutPageTitle = By.xpath("//span[@class='title' and contains(text(),'Checkout: Your Information')]");

    By firstName = By.cssSelector("#first-name");
    By lastName = By.cssSelector("#last-name");

    By postalCode = By.cssSelector("#postal-code");

    By continueButton = By.cssSelector("#continue");

    By errorMessage = By.xpath("//div[@class='error-message-container error']//h3[contains(text(),'Error: First Name is required')]");

    By closingTheErrorButton = By.xpath("//div[@class='error-message-container error']//button");

    By finish = By.cssSelector("#finish");

    By orderStatusMessage = By.xpath("//div[@id='checkout_complete_container']/h2/following-sibling::div");
    By orderSuccessMessage = By.xpath("//div[@id='checkout_complete_container']/h2");

    By backToHomeAfterOrder = By.cssSelector("#back-to-products");

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }

    public String performCheckOut() {

        driver.findElement(checkout).click();
        return driver.findElement(checkoutPageTitle).getText();

    }

    public void enterTheDetailsAndContinue(String fName, String lName, String pCode) {

        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(postalCode).sendKeys(pCode);
        driver.findElement(continueButton).click();

    }

    /**
     * @return
     */
    public HashMap<String, String> closeTheDeal() {

        orderDetails = new HashMap<>();
        driver.findElement(finish).click();
        orderDetails.put("Success Message", driver.findElement(orderSuccessMessage).getText());
        orderDetails.put("Status Message", driver.findElement(orderStatusMessage).getText());
        return orderDetails;

    }

    /**
     * @return
     */
    public String backToHomeAfterOderIsCompleted() {

        driver.findElement(backToHomeAfterOrder);
        return driver.getTitle();
    }

    //error Handling

    /**
     * get the error message
     * when user does not enter any details
     * and click on continue button
     *
     * @return
     */
    public String performContinueWithoutDetails() {

        driver.findElement(continueButton).click();
        return driver.findElement(errorMessage).getText();

    }

    /**
     * Should give false as the error button is closed
     *
     * @return
     */
    public boolean cancelErrorMessageButton() {

        System.out.println(performContinueWithoutDetails());
        driver.findElement(closingTheErrorButton).click();
        return driver.findElement(errorMessage).isDisplayed();
    }


}
