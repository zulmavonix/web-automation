package org.vonix.transaction;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.vonix.Config;
import org.vonix.authentication.loginEmail;

import static java.lang.Character.toTitleCase;

public class EasyTradeBuy extends Config {

    static String nameCoin  = "bitcoin";
    static String amoutCoin = "0.2";


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
                                .findElement(By.xpath("//span[normalize-space()='" + nameCoin + "']"))));
    }

    private static WebElement selectCoinDiv() {
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


    public static void stepEasyTradeBuy() throws InterruptedException {
        loginEmail.stepLogin();
        buttonEasyTradeDashboard().click();
        dropDownSelectCoin().click();
        fieldSelectCoin().sendKeys(nameCoin);
        selectCoinDiv().click();
        fieldAmount().sendKeys(amoutCoin);
        buttonBuySell().click();
        Thread.sleep(2000);
        buttonConfirm().click();
    }
}