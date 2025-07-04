package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    private By userNameField = By.xpath("//input[@id='user-name']");
    private By passwordField = By.xpath("//input[@id='password']");
    private final By loginButton = By.xpath("//input[@name='login-button']");



    public void setUsername(String username) {
        WebElement userNameFieldElement = driver.findElement(userNameField);
        userNameFieldElement.sendKeys(username);
    }
    public void setPassword(String password) {
        WebElement passwordFieldElement = driver.findElement(passwordField);
        passwordFieldElement.sendKeys(password);
    }
    public void clickLogin() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }
}
