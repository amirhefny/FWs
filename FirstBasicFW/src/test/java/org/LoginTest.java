package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver= new ChromeDriver();;
    LoginPage loginpage = new LoginPage(driver);
    @BeforeClass
    private void setUp(){
        driver.manage().window().maximize();
    }
    @BeforeMethod
    private void goToURL(){
        driver.get("https://www.saucedemo.com/");
    }

    @Test(alwaysRun = true, priority = 1)
    private void loginSuccessfully(){
        loginpage.setUsername("standard_user");
        loginpage.setPassword("secret_sauce");
        loginpage.clickLogin();
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }
    @Test(alwaysRun = true, priority = 2)
    private void loginFailed(){
        loginpage.setUsername("standard_user");
        loginpage.setPassword("pass");
        loginpage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");
    }

    @AfterClass
    private void teardown(){
        driver.quit();
    }
}
