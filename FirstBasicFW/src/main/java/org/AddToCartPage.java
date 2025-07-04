package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
    private WebDriver driver;

    public AddToCartPage(WebDriver driver){
        this.driver = driver;
    }
    private final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    public void addProductToCart(){
        WebElement addToCartButtonElement = driver.findElement(addToCartButton);
        addToCartButtonElement.click();
    }

}
