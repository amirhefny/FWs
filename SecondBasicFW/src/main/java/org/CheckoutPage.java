package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.LoginPage.driver;

public class CheckoutPage {

    private final By shoppingCartButton = By.xpath("//a[@class='shopping_cart_link']");
    private final By checkoutButton = By.id("checkout");
    private By firstnameField = By.id("first-name");
    private By lastnameField = By.name("lastName");
    private By postalCodeField = By.xpath("//input[@id='postal-code']");
    private final By continueButton = By.id("continue");

    public void shoppingCart() throws InterruptedException {
        WebElement shoppingCartButtonElement = driver.findElement(shoppingCartButton);
        shoppingCartButtonElement.click();
    }


    public void checkout(){
        WebElement addToCartButtonElement = driver.findElement(checkoutButton);
        addToCartButtonElement.click();
    }

    public void setFirstname(String firstname) {
        WebElement FirstnameFieldElement = driver.findElement(firstnameField);
        FirstnameFieldElement.sendKeys(firstname);
    }
    public void setLastname(String lastname) {
        WebElement lastnameElement = driver.findElement(lastnameField);
        lastnameElement.sendKeys(lastname);
    }
    public void setPostcode(String postcode) {
        WebElement postcodeFieldElement = driver.findElement(postalCodeField);
        postcodeFieldElement.sendKeys(postcode);
    }
    public void clickContinue() {
        WebElement continueButtonElement = driver.findElement(continueButton);
        continueButtonElement.click();
    }

}
