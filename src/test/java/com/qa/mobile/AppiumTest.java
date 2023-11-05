package com.qa.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {

    @Test
    public void launchApp() throws IOException, InterruptedException {

        By openMenu = By.xpath("//android.view.ViewGroup[@content-desc='open menu']");
        By about = By.xpath("//android.widget.TextView[@text='About']");
        By androidWidgetView = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView[1]");
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("emulator-5554");
        options.setApp("/Users/swati/Downloads/Demo.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        Thread.sleep(3000);

        System.out.println(driver.currentActivity());

        driver.findElement(openMenu).click();
        Thread.sleep(5000);

        System.out.println(driver.currentActivity());
        driver.findElement(about).click();
        Thread.sleep(5000);

        System.out.println(driver.currentActivity());

       String text =  driver.findElement(androidWidgetView).getText();
        System.out.println(text);

        System.out.println(driver.currentActivity());

       File outputFilePath  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(outputFilePath, new File("/Users/swati/Documents/HimashuRestAssured/AutomationRestSelenium/ScreenShot"+System.currentTimeMillis()+".png"));
        Thread.sleep(5000);

        System.out.println(driver.currentActivity());

        /***
         * take screen shot only when fail
         * Take screenshot only when passes
         * Re-run only failed test cases
         * Re-run only passed test cases
         * Touch Action is appium
         * Popup's in appium
         * Alert in appium
         * navigate forward and backward in appium
         * get the app name or the current page name
         */
        driver.quit();
    }
}
