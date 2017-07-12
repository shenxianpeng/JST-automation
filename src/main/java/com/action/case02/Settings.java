package com.action.case02;

import com.action.common.LoginUI;
import com.action.common.Print;
import com.page.HomePage;
import com.page.LoginPage;
import com.page.SettingsPage;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.AssertJUnit.assertEquals;

public class Settings {

    private WebDriver driver = null;

    public Settings(LoginUI login) {
        super();
        driver = login.getDriver();
    }

    public void verifyOpenSettings() throws InterruptedException {
        HomePage.Avatar(driver,5).click();
        SettingsPage.Settings(driver,10).click();

        //assert open settings page success
        assertEquals(SettingsPage.Public_profile(driver,5).getText(),"Public profile");

        Print.successMessage();
    }

    public void verifySettingsPageMemu() throws InterruptedException {
        assertEquals(SettingsPage.Account(driver,5).getText(),"Account");
        assertEquals(SettingsPage.Emails(driver,5).getText(),"Emails");
        assertEquals(SettingsPage.Notifications(driver,5).getText(),"Notifications");
        assertEquals(SettingsPage.Billing(driver,5).getText(),"Billing");
        assertEquals(SettingsPage.SSHKeys(driver,5).getText(),"SSH and GPG keys");
        assertEquals(SettingsPage.Security(driver,5).getText(),"Security");
        assertEquals(SettingsPage.Blocked_users(driver,5).getText(),"Blocked users");
        assertEquals(SettingsPage.Repositories(driver,5).getText(),"Repositories");
        assertEquals(SettingsPage.Organizations(driver,5).getText(),"Organizations");
        assertEquals(SettingsPage.Saved_replies(driver,5).getText(),"Saved replies");
        assertEquals(SettingsPage.Authorized_OAuth_Apps(driver,5).getText(),"Authorized OAuth Apps");
        assertEquals(SettingsPage.Authorized_GitHub_Apps(driver,5).getText(),"Authorized GitHub Apps");

        Print.successMessage();
    }


}
