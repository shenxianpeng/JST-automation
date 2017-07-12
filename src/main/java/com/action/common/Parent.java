package com.action.common;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent {
    protected LoginUI login;
    protected String username;
    protected String password;

    public Parent(String usernameStr, String passwordStr) {
        this.username = usernameStr;
        this.password = passwordStr;
    }

    @BeforeMethod
    public void login() {
        login = new LoginUI();
        login.login(username, password);
    }

    @AfterMethod
    public void close() {
        login.closeDriver();
    }
}
