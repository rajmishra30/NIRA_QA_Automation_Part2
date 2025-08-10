package com.nira.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import com.nira.utils.WaitUtils;
import org.openqa.selenium.By;

public class OTPPage {
    private AndroidDriver<MobileElement> driver;
    private WaitUtils waitUtils;

    private By otpInput = MobileBy.id("com.nirafinance.customer:id/otp_input");
    private By verifyBtn = MobileBy.id("com.nirafinance.customer:id/verify_button");

    public OTPPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public boolean isOTPInputVisible() {
        return waitUtils.waitForVisibility(otpInput, 10);
      }

    public void enterOTP(String otp) {
        MobileElement el = (MobileElement) driver.findElement(otpInput);
        el.clear();
        el.sendKeys(otp);
    }

    public void tapVerify() {
        driver.findElement(verifyBtn).click();
    }
}
