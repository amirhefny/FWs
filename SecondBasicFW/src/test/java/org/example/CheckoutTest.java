package org.example;

import org.CheckoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.LoginPage.driver;


public class CheckoutTest extends BaseTest{
    CheckoutPage checkoutpage = new CheckoutPage();

    @Test(alwaysRun = true)
    private void checkoutSuccessfully() throws InterruptedException {
        checkoutpage.shoppingCart();
        checkoutpage.checkout();
        checkoutpage.setFirstname("omar");
        checkoutpage.setLastname("Zidan");
        checkoutpage.setPostcode("424324");
        checkoutpage.clickContinue();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/checkout-step-two.html","The check out not complete successfully");
    }
}
