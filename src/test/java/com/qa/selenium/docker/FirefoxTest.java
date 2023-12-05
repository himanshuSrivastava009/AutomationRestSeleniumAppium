package com.qa.selenium.docker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.URL;

public class FirefoxTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
      //  capabilities.setVersion("latest");
        URL gridUrl = new URL("http://localhost:4444/wd/hub");
        driver = new RemoteWebDriver(gridUrl, capabilities);
    }

    @Test
    public void testOnFirefox() {
        driver.get("https://www.amazon.com");
        // Your Firefox-specific test actions
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
