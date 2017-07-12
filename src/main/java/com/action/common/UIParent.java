package com.action.common;

import com.config.DriverConfig;
import org.openqa.selenium.WebDriver;

public class UIParent {
    protected WebDriver driver = null;

    public UIParent() {
        driver = DriverConfig.getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeDriver() {
        DriverConfig.close();
    }
}
