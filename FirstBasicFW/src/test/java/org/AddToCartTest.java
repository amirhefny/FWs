package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest {
    private WebDriver driver= new ChromeDriver();;
    AddToCartPage addToCartPage = new AddToCartPage(driver);
    LoginPage loginpage = new LoginPage(driver);


    @BeforeClass
    private void setUp(){
        driver.manage().window().maximize();
    }
    @BeforeMethod
    private void goToURLAndLogin(){
        driver.get("https://www.saucedemo.com/");
        loginpage.setUsername("standard_user");
        loginpage.setPassword("secret_sauce");
        loginpage.clickLogin();
    }
    @Test(alwaysRun = true, priority = 1)
    private void addToCart(){
        addToCartPage.addProductToCart();
    }
    @AfterClass
    private void teardown(){
        driver.quit();
    }
}
