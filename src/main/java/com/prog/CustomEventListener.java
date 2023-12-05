package com.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CustomEventListener extends AbstractWebDriverEventListener {

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Before navigating to: " + url);
        System.out.println("before navgate"+driver.getTitle());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("Clicked on: " + element.toString());
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        System.out.println("Exception occurred: " + throwable.getMessage());
    }



    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();
       // driver = new CustomEventListener(); // Register the event listener
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        CustomEventListener customEventListener = new CustomEventListener();
        eventDriver.register(customEventListener);
        eventDriver.get("https://www.amazon.com");
        WebElement link = eventDriver.findElement(By.linkText("Login"));
        link.click();

        eventDriver.quit();
    }
}

