package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    private static WebElement element = null;

    public static WebElement username(WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('login_field')")));
        return element;
    }

    public static WebElement password(WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('password')")));
        return element;
    }

    public static WebElement signIn(WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[3]")));
        return element;
    }
}
