package com.qa.selenium.docker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.net.URL;

public class ChromeTest {
    private WebDriver driver;

//    @BeforeMethod
//    public void setUp() throws Exception {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setBrowserName("firefox");
//        capabilities.setVersion("latest");
//        URL gridUrl = new URL("http://localhost:4444");
//        driver = new RemoteWebDriver(gridUrl, capabilities);
//    }
//
//    @Test
//    public void testOnChrome() {
//        driver.get("https://www.amazon.com");
//        // Your Chrome-specific test actions
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    @Test(dataProvider = "mydata")
    public void consumeData(String username, String password){
        System.out.println("username is = " +username +" and password = " +password);
    }

  @DataProvider(name = "mydata")
    public Object[][] getData(){

      return new Object[][]{
              {"test123", "test@123"},
              {"jerry","themouse@123"}
      };
  }


}
