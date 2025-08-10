package com.nira.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import com.nira.utils.WaitUtils;
import org.openqa.selenium.By;

public class MobileEntryPage {
    private AndroidDriver<MobileElement> driver;
    private WaitUtils waitUtils;

    private By phoneInput = MobileBy.id("com.nirafinance.customer:id/phone_input");
    private By continueBtn = MobileBy.id("com.nirafinance.customer:id/continue_button");

    public MobileEntryPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public boolean isPhoneInputVisible() {
        return waitUtils.waitForVisibility(phoneInput, 10);
      }

    public void enterPhoneNumber(String phone) {
        MobileElement el = (MobileElement) driver.findElement(phoneInput);
        el.clear();
        el.sendKeys(phone);
    }

    public void tapContinue() {
        driver.findElement(continueBtn).click();
    }
}
