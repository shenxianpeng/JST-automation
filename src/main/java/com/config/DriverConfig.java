package com.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        //set your local chrome driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xshen\\Workspace\\autotest\\Selenium\\Selenium WebDriver\\Google Chrome Driver\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.logfile", "C:\\Users\\xshen\\Workspace\\autotest\\Selenium\\Selenium WebDriver\\Google Chrome Driver\\chromedriver_win32\\chromedriver.log");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }

    public static void close() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
