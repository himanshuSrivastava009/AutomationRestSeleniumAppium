package com.qa.selenium.home;

import com.qa.selenium.base.BasePage;
import com.qa.selenium.checkout.CheckoutPage;
import com.qa.selenium.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    By burgerButton = By.xpath("//div[@class='bm-burger-button']");
    By menuWrapAllItems = By.xpath("//div[@class='bm-menu-wrap']//nav/a");

    By allItemsListedOnHomePage = By.xpath("//div[@id='inventory_container']//a/div");

    By addToCartInsideOption = By.xpath("//button[contains(text(),'Add to cart')]");

    By getCartItemCount = By.cssSelector("#shopping_cart_container .shopping_cart_badge");

    By getInsideTheCart = By.cssSelector("#shopping_cart_container>a.shopping_cart_link");

    List<WebElement> lisOfMenuWrapElements = new ArrayList<>();
    List<WebElement> lisOfItemsDisplayedOnHomepage = new ArrayList<>();

    WebDriver driver;
    LoginPage loginPage;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        loginPage = new LoginPage(driver, prop);
    }


    public String getHomePageTitle() {

        return driver.getTitle();
    }

    public boolean verifyBurgerButton() throws InterruptedException {

        Thread.sleep(2000);
        return driver.findElement(burgerButton).isDisplayed();

    }

    public List<WebElement> clickOnBurgerButtonAndGetAllElements() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(burgerButton));
        driver.findElement(burgerButton).click();
        Thread.sleep(3000);
        lisOfMenuWrapElements = driver.findElements(menuWrapAllItems);
        return lisOfMenuWrapElements;

    }


    public void clickOnItemsAndValidate() throws InterruptedException {

        for (int i = 0; i < lisOfMenuWrapElements.size(); i++) {


            if (!lisOfMenuWrapElements.get(i).getText().equalsIgnoreCase("All Items") &&
                    !lisOfMenuWrapElements.get(i).getText().equalsIgnoreCase("Logout")) {

                System.out.println("going to to click for i ===" + i);
                System.out.println(lisOfMenuWrapElements.get(i).getText());

                lisOfMenuWrapElements.get(i).click();
                Thread.sleep(2000);

                //Navigating back to the page
                System.out.println(driver.getTitle());
                driver.navigate().back();

                //handled stale Element Exception in 2 steps

                //1. Waiting for the element to be clickable

                System.out.println("Navigated Back and waiting for the burger button to be clickable");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(burgerButton));

                //Re-initializing the WebElements
                System.out.println("burger button is now clickable");
                driver.findElement(burgerButton).click();

                System.out.println("getting all the list of Items again inside the burger menu to avoid stale elem exception");
                lisOfMenuWrapElements = driver.findElements(menuWrapAllItems);
            }
        }
    }

    public void verifyLinks() throws IOException {


        for (int i = 0; i < lisOfMenuWrapElements.size(); i++) {

            String url = lisOfMenuWrapElements.get(i).getAttribute("href");
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();

            System.out.println(httpURLConnection.getResponseCode());
        }


    }

    public int getAllTheItemsListedOnHomePageAndAddToCart() {

        String cartItemCount = null;
        int totalCartItemCount = 0;
        int numberOfItemsDisplayed = 0;
        lisOfItemsDisplayedOnHomepage = driver.findElements(allItemsListedOnHomePage);
        for (int i = 0; i < lisOfItemsDisplayedOnHomepage.size(); i++) {

            System.out.println(" clicking on : " +lisOfItemsDisplayedOnHomepage.get(i).getText());
            numberOfItemsDisplayed ++;
            lisOfItemsDisplayedOnHomepage.get(i).click();
            elementsUtil.webDriverWaitForClick(addToCartInsideOption);
            driver.findElement(addToCartInsideOption).click();
            cartItemCount = driver.findElement(getCartItemCount).getText();
            totalCartItemCount++;

            //navigate back to the Home page
            driver.navigate().back();
            //wait for the visibility of elements
            elementsUtil.webDriverWaitForVisibility(allItemsListedOnHomePage);
            //clear the arraylist before re-initializing it to avoid duplication
            lisOfItemsDisplayedOnHomepage.clear();
            //re-initialize the elements to avaoid stale element ref exception
            lisOfItemsDisplayedOnHomepage = driver.findElements(allItemsListedOnHomePage);

        }
        System.out.println("Total number of Items in the cart = " +totalCartItemCount);
        System.out.println("Total number of items displayed = " +numberOfItemsDisplayed);
        return Integer.valueOf(cartItemCount);

    }

    public void getInsideTheCart() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(getInsideTheCart).click();
    }

    public CheckoutPage checkOut(){

       return new CheckoutPage(driver);
    }
}

