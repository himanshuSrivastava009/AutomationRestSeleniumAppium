package com.qa.selenium.elementutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsUtil {

    WebDriverWait wait;
    WebDriver driver;

    //Initialize Constructor From Base Test and pass the WebDriver using initDriver from Base Class
    public ElementsUtil(WebDriver driver) {

        this.driver = driver;

    }

    public void webDriverWaitForClick(By locator) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void webDriverWaitForVisibility(By locator) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
