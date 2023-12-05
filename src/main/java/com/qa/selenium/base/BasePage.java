package com.qa.selenium.base;

import com.qa.selenium.elementutil.ElementsUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

public class BasePage implements BasePageInterface {

    public WebDriver driver;
    public WebDriverWait wait;

    public Properties prop;

    public static ElementsUtil elementsUtil;

    @Override
    public WebDriver initDriver(String browserName) throws MalformedURLException {

        if (browserName.equalsIgnoreCase("Chrome")) {


            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            //  capabilities.setVersion("latest");
            URL gridUrl = new URL("http://localhost:4444/wd/hub");
            driver = new RemoteWebDriver(gridUrl, capabilities);
        } else if (browserName.equalsIgnoreCase("fireFox")) {


            //driver = new FirefoxDriver();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("firefox");
            //  capabilities.setVersion("latest");
            URL gridUrl = new URL("http://localhost:4444/wd/hub");
            driver = new RemoteWebDriver(gridUrl, capabilities);
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //initialize Elements Util
        elementsUtil = new ElementsUtil(driver);

        return driver;
    }

    @Override
    public Properties initProperties() throws IOException {

        prop = new Properties();
        File file = new File("/Users/swati/Documents/HimashuRestAssured/AutomationRestSelenium/config.property");
        prop.load(Files.newInputStream(file.toPath()));
        return prop;

    }
}
