package com.qa.mobile;

import io.qameta.allure.testfilter.TestPlanV1_0;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ScreenshotListner implements ITestListener {
//    @Override
//    public void onTestFailure(ITestResult result) {
//        // Add logic to take a screenshot when a test fails
//        // You can use the Appium driver to capture the screenshot
//        // and save it to a specified location.
//        File outputFilePath  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileHandler.copy(outputFilePath, new File("/Users/swati/Documents/HimashuRestAssured/AutomationRestSelenium/ScreenShot"+System.currentTimeMillis()+".png"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

}
