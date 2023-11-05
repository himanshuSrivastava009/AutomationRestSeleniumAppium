package com.qa.selenium.base;

import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public interface BasePageInterface {

    public WebDriver initDriver(String browserName);
    public Properties initProperties() throws IOException;
}
