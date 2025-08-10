package com.nira.utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    private AndroidDriver<MobileElement> driver;

    public WaitUtils(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public boolean waitForVisibility(By locator, int seconds) {
        try {
            new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
