package org.vonix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Config {

    public static WebDriver driver;

    public static void getDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/zulma/Documents/Project/Vonix/WebApp/browserdriver/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    public static WebDriverWait webDriverWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait;
    }


    String url  = "https://dev.vonix.id/";

    public void configureBrowser() {
        getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }

    public void quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}