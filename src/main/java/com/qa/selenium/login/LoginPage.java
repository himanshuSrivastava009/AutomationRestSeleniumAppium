package com.qa.selenium.login;

import com.qa.selenium.base.BasePage;
import com.qa.selenium.home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Properties;

public class LoginPage extends BasePage {

    public WebDriver driver;
    public Properties prop;


    public LoginPage(WebDriver driver, Properties prop) {

        this.driver = driver;
        this.prop = prop;
    }


    //By Locators for Login page

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");
    ArrayList<Boolean> loginOptions = new ArrayList<>();

    public String getLoginPageTitle() {

        String title = driver.getTitle();
        return title;

    }

    public ArrayList<Boolean> verifyLoginOptions() {

        loginOptions.add(driver.findElement(username).isDisplayed());
        loginOptions.add(driver.findElement(password).isDisplayed());
        return loginOptions;

    }

    public HomePage doLogin() throws InterruptedException {

        driver.findElement(username).sendKeys(prop.getProperty("username"));
        driver.findElement(password).sendKeys(prop.getProperty("password"));
        driver.findElement(loginButton).click();
        // homePage = new HomePage(driver);
        String title1 = driver.getTitle();
        Thread.sleep(5000);

        return new HomePage(driver);

    }


}
