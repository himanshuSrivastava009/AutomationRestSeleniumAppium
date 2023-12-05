package com.qa.selenium.base;

import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

public interface BasePageInterface {

    public WebDriver initDriver(String browserName) throws MalformedURLException;
    public Properties initProperties() throws IOException;
}
