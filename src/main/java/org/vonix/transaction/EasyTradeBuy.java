package org.vonix.transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.vonix.Config;
import org.vonix.authentication.loginEmail;

public class EasyTradeBuy extends Config {

    private static WebElement buttonEasyTradeDashboard() {
        return webDriverWait()
                .until(ExpectedConditions
                        .elementToBeClickable(driver
                                .findElement(By.xpath("//button[normalize-space()='Easy Trade']"))));
    }

    private static WebElement dropDownSelectCoin() {
        return webDriverWait()
                .until(ExpectedConditions
                        .elementToBeClickable(driver
                                .findElement(By.xpath("//div[@class='content__select-pair']"))));
    }

    private static WebElement fieldSelectCoin() {
        return webDriverWait()
                .until(ExpectedConditions
                        .elementToBeClickable(driver
                                .findElement(By.xpath("//input[@class='vx-input with-icon']"))));
    }


    private static WebElement selectCoin() {
        return webDriverWait()
                .until(ExpectedConditions
                        .elementToBeClickable(driver
                                .findElement(By.xpath("(//div[@class='modal-select-crypto__item'])[1]"))));
    }

    public static WebElement fieldAmount() {
        return webDriverWait()
                .until(ExpectedConditions
                        .elementToBeClickable(driver
                                .findElement(By.xpath("//div[@class='input-crypto__amount__content__user-input']//input"))));
    }

    public static WebElement buttonBuySell() {
        return webDriverWait()
                .until(ExpectedConditions
                        .elementToBeClickable(driver
                                .findElement(By.xpath("//button[@class='vx-btn-md vx-btn-primary bd-2 with-icon dark-mode']"))));
    }

    public static WebElement buttonConfirm() {
        return webDriverWait()
                .until(ExpectedConditions
                        .elementToBeClickable(driver
                                .findElement(By.xpath("//button[@class='vx-btn-md vx-btn-primary bd-2 with-icon dark-mode']"))));
    }



    private static String inputNameCoin(String nameCoin) { return nameCoin; }

    private static String inputAmoutCoin(String amountCoin) { return amountCoin; }


    public static void stepEasyTradeBuy(String nameCoin, String amountCoin, String Email, String Password) throws InterruptedException {
        loginEmail.stepLogin(Email, Password);
        buttonEasyTradeDashboard().click();
        dropDownSelectCoin().click();
        fieldSelectCoin().sendKeys(inputNameCoin(nameCoin));
        selectCoin().click();
        fieldAmount().sendKeys(inputAmoutCoin(amountCoin));
        Thread.sleep(2000);
        buttonBuySell().click();
        Thread.sleep(2000);
        buttonConfirm().click();
    }
}
