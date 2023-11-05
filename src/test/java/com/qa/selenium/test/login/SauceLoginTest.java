package com.qa.selenium.test.login;

import com.qa.selenium.base.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SauceLoginTest extends BaseTest {

    ArrayList<Boolean> loginOptions = new ArrayList<>();
    @Test(priority = 1, description = "get the login page title")
    public void verifyLoginPageTitle() throws InterruptedException {

        String actualTitle = loginPage.getLoginPageTitle();
        System.out.println("Title is == " +actualTitle);
        Assert.assertEquals(actualTitle, "Swag Labs");
        Thread.sleep(3000);
    }

    @Test(priority = 2, description = "verify the Login Field's are present or not")
    public void verifyLoginPageOptions() throws InterruptedException {

       loginOptions = loginPage.verifyLoginOptions();
        for (int i=0;i<loginOptions.size();i++){
            System.out.println(loginOptions.get(i));
            Assert.assertTrue(true, String.valueOf(loginOptions.get(i)));

        }
        Thread.sleep(3000);
    }




}

