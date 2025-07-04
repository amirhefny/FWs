package org.example;

import org.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.LoginPage.driver;

public class LoginTest extends BaseTest{
    public static LoginPage loginpage = new LoginPage(); ;

    @Test(alwaysRun = true, priority = 1)
    private void loginSuccessfully(){
        loginpage.setUsername("standard_user");
        loginpage.setPassword("secret_sauce");
        loginpage.clickLogin();
        Assert.assertEquals(driver.getTitle(),"Swag Labs","Failed to login");
    }

    @Test(alwaysRun = true, priority = 2)
    private void loginFailed(){
        loginpage.setUsername("standard_user");
        loginpage.setPassword("pass");
        loginpage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
    }

}
