package com.verify.case01;

import com.action.case01.Login;
import com.action.common.Parent;
import com.config.UserConfig;
import org.testng.annotations.Test;

public class verifyLogin extends Parent {

    public verifyLogin() {
        super(UserConfig.Username, UserConfig.Passoword);
    }

    @Test
    public void verifyLogin() throws InterruptedException {
        new Login(login).verifyLogin();
    }
}
