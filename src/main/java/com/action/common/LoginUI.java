package com.action.common;

import com.config.UrlConfig;
import com.page.LoginPage;

public class LoginUI extends UIParent {

    public LoginUI() {
        super();
    }

    public void login(String usernameStr, String passwordStr) {
        driver.manage().window().maximize();
        driver.get(UrlConfig.loginUrl);

        LoginPage.username(driver, 5).clear();
        LoginPage.username(driver, 5).sendKeys(usernameStr);

        LoginPage.password(driver, 5).clear();
        LoginPage.password(driver, 5).sendKeys(passwordStr);

        LoginPage.signIn(driver, 5).click();
    }
}
