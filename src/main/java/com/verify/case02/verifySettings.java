package com.verify.case02;

import com.action.case02.Settings;
import com.action.common.Parent;
import com.config.UserConfig;
import org.testng.annotations.Test;

public class verifySettings extends Parent {

    public verifySettings() {
        super(UserConfig.Username, UserConfig.Passoword);
    }

    @Test
    public void verifyLogin() throws InterruptedException {
        new Settings(login).verifyOpenSettings();
        new Settings(login).verifySettingsPageMemu();
    }
}
