package com.amol.selenium;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.amol.utilities.TakeScreenShot.takeScreenshot;

/**
 * Created by amol on 10/08/2016.
 */
public class scrrenSotTest {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
    driver.get("http://tfleet.in/");
        takeScreenshot(driver);




}


}
