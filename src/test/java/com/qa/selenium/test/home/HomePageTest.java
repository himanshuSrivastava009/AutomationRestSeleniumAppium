package com.qa.selenium.test.home;

import com.qa.selenium.base.test.BaseTest;
import com.qa.selenium.home.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class HomePageTest extends BaseTest {

    HomePage homePage;
    List<WebElement> displayedValues;

    @Test(priority = 1, description = "Login to the application and Get Home page")
    public void performLogin() throws InterruptedException {

        homePage = loginPage.doLogin();
        if (homePage != null) {

            Assert.assertTrue(true, "Home page object is not Null");
        }

    }

    @Test(priority = 2, description = "get the Home page Title")
    public void getHomePageTitle() {

        String homePageTitle = homePage.getHomePageTitle();
        System.out.println("Home page Title == " + homePageTitle);
        Assert.assertEquals(homePageTitle, "Swag Labs");
    }

    @Test(priority = 3, description = "Verify Menu Burger item is visible")
    public void verifyMenuBurgerVisibility() throws InterruptedException {

        boolean displayed = homePage.verifyBurgerButton();
        System.out.println("menu item displayed === " + displayed);
        Assert.assertEquals(true, displayed);
    }

    @Test(priority = 4, description = "click on the menu burger and get all the listed items ")
    public void getAllMenuBurgerItems() throws InterruptedException {

        displayedValues = homePage.clickOnBurgerButtonAndGetAllElements();
        System.out.println("menu item displayed === " + displayedValues);
        for (int i = 0; i < displayedValues.size(); i++) {

            String value = displayedValues.get(i).getText();
            System.out.println(+i + ": " + value);


        }
    }

    @Test(enabled = false, priority = 4, description = "Click on All the Elements in Menu Wrap items and Get Title")
    public void verifyAllElementsByClick() throws InterruptedException {

        homePage.clickOnItemsAndValidate();

    }

    @Test(enabled = true, priority = 5, description = "Click on All the Elements in Menu Wrap items and Get Title")
    public void verifyLinks() throws InterruptedException, IOException {

        homePage.verifyLinks();

    }

    @Test(priority = 6, description = "Verify if Element is getting added to the cart")
    public void verifyAddToCart() {

        int cartValue = homePage.getAllTheItemsListedOnHomePageAndAddToCart();
        System.out.println("Total number of items added to cart is == " + cartValue);


    }

    @Test(priority = 7, description = "Verify if Element is getting added to the cart")
    public void goToCart() throws InterruptedException {

         homePage.getInsideTheCart();
        System.out.println("Inside The cart");


    }



}


