package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static org.LoginPage.driver;

public class BaseTest {

    @BeforeTest
    public void intalizationOfDriver(){
        intalizeDriver("chrome");
        driver.manage().window().maximize();
        System.out.println("The window is maxmized");
        driver.get("https://www.saucedemo.com/");
    }

    @AfterTest
    private void teardown(){
        driver.quit();
    }

    public void intalizeDriver(String browserName) throws RuntimeException {
        try {
            String normalizedBrowserName = browserName.trim().toLowerCase();

            switch (normalizedBrowserName) {
                case "chrome":
                    driver = new ChromeDriver();
                    System.out.println("Initialized Chrome Driver."); // Added for clarity in console
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    System.out.println("Initialized Firefox Driver.");
                    break;

                case "internetexplorer":
                    driver = new InternetExplorerDriver();
                    System.out.println("Initialized Internet Explorer Driver.");
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    System.out.println("Initialized Edge Driver.");
                    break;

                default:
                    driver = new ChromeDriver();
                    System.out.println("No matching browser found or default selected. Initialized Chrome Driver.");
                    break;
            }
        } catch (Exception e) {
            System.err.println("Error initializing WebDriver: " + e.getMessage());
            driver = null ;
            throw new RuntimeException("Failed to initialize WebDriver for browser: " + browserName + ". Please check driver executables and browser installations.", e);

        }
    }
}
