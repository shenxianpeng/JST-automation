package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
    private static WebElement element = null;

    //home page, GitHub logo element
    public static WebElement Logo(WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.position-relative.js-header-wrapper > div.header > div > a > svg")));
        return element;
    }

    //home page, your GitHub avatar
    public static WebElement Avatar(WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"user-links\"]/li[3]/a/img")));
        return element;
    }
}