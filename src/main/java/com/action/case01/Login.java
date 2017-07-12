package com.action.case01;

import com.action.common.Print;
import com.action.common.LoginUI;
import com.page.HomePage;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class Login {

    private WebDriver driver = null;

    public Login(LoginUI login) {
        super();
        driver = login.getDriver();
    }

    public void verifyLogin() throws InterruptedException {
        assertEquals (HomePage.Logo(driver,5).isDisplayed(),true);
        Print.successMessage();
    }

}
