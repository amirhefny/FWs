package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.LoginPage.driver;


public class AddToCartPage {
    private final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    public void addProductToCart(){
        WebElement addToCartButtonElement = driver.findElement(addToCartButton);
        addToCartButtonElement.click();
        System.out.println("Product added to the cart");
    }

}
