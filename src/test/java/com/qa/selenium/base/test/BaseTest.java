package com.qa.selenium.base.test;

import com.qa.selenium.base.BasePage;

import com.qa.selenium.home.HomePage;
import com.qa.selenium.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public static BasePage basePage;
    public static WebDriver driver;
    public static Properties prop;
    public static LoginPage loginPage;

    public static HomePage homePage;



    @BeforeSuite
    public void doSetup() throws IOException {

        System.out.println("In Base Test , @Before Class");
        basePage = new BasePage();
        driver = basePage.initDriver("firefox");
        prop = basePage.initProperties();
        loginPage = new LoginPage(driver, prop);
        homePage = new HomePage(driver);


    }

    @AfterSuite
    public void tearDown() {
        System.out.println("In Base Test , @AfterTest");
        driver.quit();
    }
}
