package com.qa.selenium.elementutil;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
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

    public WebElement getWebElement(By locator) {

        return driver.findElement(locator);
    }

    public void moveToElementAndPerformAction(By locator) {

        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(locator)).build().perform();
    }

    public void sendKeysUsingAction(By locator, String value) {

        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(locator)).sendKeys(value).build().perform();
    }

    public void holdAndReleaseUsingAction(By source, By destination) {
        Actions actions = new Actions(driver);
        actions.clickAndHold().moveToElement(getWebElement(source)).release(getWebElement(destination)).build().perform();

    }

    public void selectByVisibleText(By locator, String visibleText) {

        Select select = new Select(getWebElement(locator));
        select.selectByVisibleText(visibleText);
    }

    public void selectByID(By locator, int index) {

        Select select = new Select(getWebElement(locator));
        select.selectByIndex(index);
    }

    public void selectByValue(By locator, String value) {

        Select select = new Select(getWebElement(locator));
        select.selectByValue(value);
    }

    public void takeScreenShot() throws IOException {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File("/Users/swati/Documents/HimashuRestAssured/AutomationRestSelenium/ScreenShot" + System.currentTimeMillis() + ".png"));

    }
}
