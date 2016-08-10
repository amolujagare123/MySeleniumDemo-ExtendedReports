package com.amol.selenium;


import com.relevantcodes.extentreports.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.amol.utilities.TakeScreenShot.takeScreenshot;


public class MyTest {

	WebDriver driver;

	



	@Test
	public void myTest() throws IOException {
         ExtentReports logger = new ExtentReports("c:\\MySeleniumDemo\\Extended-reports\\report.html", false);
        ExtentTest test = logger.startTest("Verify Page title", "to verify the page title");

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        test.log(LogStatus.INFO,"Browser is up and running");

        driver.get("http://learn-automation.com");
        test.log(LogStatus.INFO,"Application is up and running");

        String title = driver.getTitle();
        test.log(LogStatus.INFO,"Title Captured");

        Assert.assertTrue(title.contains("Selenium"));
        test.log(LogStatus.PASS,"title is verified");


        /*String img = test.addScreenCapture("E:\\Amol\\selenium\\reports.png");
        test.log(LogStatus.INFO, "Image", "Image example: " + img);


        */

        takeScreenshot(driver);
        test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));


        logger.endTest(test);
        logger.flush();
        driver.quit();
    }



    @Test
    public void myTest1() throws IOException {
        ExtentReports logger = new ExtentReports("c:\\MySeleniumDemo\\Extended-reports\\report.html", false);
        ExtentTest test = logger.startTest("Verify Tfleet Page title", "to verify the page title");

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        test.log(LogStatus.INFO,"Browser is up and running");

        driver.get("http://tfleet.in");
        test.log(LogStatus.INFO,"Application is up and running");

        String title = driver.getTitle();
        test.log(LogStatus.INFO,"Title Captured");

        try {
            Assert.assertTrue(title.contains("tfleet"));
            test.log(LogStatus.PASS,"title is verified");

        }
        catch (Throwable t)
        {
            test.log(LogStatus.FAIL,"Wrong title");
        }


        /*String img = test.addScreenCapture("E:\\Amol\\selenium\\reports.png");
        test.log(LogStatus.INFO, "Image", "Image example: " + img);


        */

        takeScreenshot(driver);
        test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));


        logger.endTest(test);
        logger.flush();
        driver.quit();
    }



}
