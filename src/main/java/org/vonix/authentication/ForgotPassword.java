package org.vonix.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.vonix.Config;

public class ForgotPassword extends Config {

    private static WebElement buttonForgotPassword() {
        return driver.findElement(By.xpath("//a[@href='/forgot-password']"));
    }

    private static WebElement fieldForgotEmail() {
        return driver.findElement(By.xpath("//input[@type='Email']"));
    }

    private static WebElement buttonResetPassword() {
        return driver.findElement(By.xpath("//button[normalize-space()='Reset Password']"));
    }

    public static WebElement textForgotSuccess() {
        return driver.findElement(By.xpath("//h1[normalize-space()='Check Your Email!']"));
    }

    private static String inputForgotEmail(String Email) { return Email; }

    public static void stepForgotPassword(String Email) {
        Config openBrowser      = new Config();
        openBrowser.configureBrowser();
        loginEmail buttonLogin  = new loginEmail();

        buttonLogin.publicButtonLogin().click();
        buttonForgotPassword().click();
        fieldForgotEmail().sendKeys(inputForgotEmail(Email));
        buttonResetPassword().click();
    }
}
