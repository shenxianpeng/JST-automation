package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SettingsPage {
    private static WebElement element = null;

    //home page, click your avatar will display Settings button
    public static WebElement Settings (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"user-links\"]/li[3]/div/div/a[5]")));
        return element;
    }

    //header
    public static WebElement Public_profile (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2")));
        return element;
    }

    /*Settings page button element*/
    public static WebElement Account (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[2]")));
        return element;
    }

    public static WebElement Emails (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[3]")));
        return element;
    }

    public static WebElement Notifications (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[4]")));
        return element;
    }

    public static WebElement Billing (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[5]")));
        return element;
    }

    //SSH and GPG keys
    public static WebElement SSHKeys (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[6]")));
        return element;
    }

    public static WebElement Security (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[7]")));
        return element;
    }

    public static WebElement Blocked_users (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[8]")));
        return element;
    }

    public static WebElement Repositories (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[9]")));
        return element;
    }

    public static WebElement Organizations (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[10]")));
        return element;
    }

    public static WebElement Saved_replies (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[11]")));
        return element;
    }

    public static WebElement Authorized_OAuth_Apps (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[12]")));
        return element;
    }

    public static WebElement Authorized_GitHub_Apps (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[13]")));
        return element;
    }


    public static WebElement Installed_GitHub_Apps (WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav/a[14]")));
        return element;
    }
}