package org.example;

import org.AddToCartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.example.LoginTest.loginpage;

public class AddToCartTest extends BaseTest{
    AddToCartPage addToCartPage =new AddToCartPage();


    @Test(alwaysRun = true, priority = 1)
    private void addToCart(){
        addToCartPage.addProductToCart();
    }
}
