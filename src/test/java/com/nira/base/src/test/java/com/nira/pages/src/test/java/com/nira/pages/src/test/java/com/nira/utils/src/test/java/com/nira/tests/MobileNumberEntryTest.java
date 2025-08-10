package com.nira.tests;

import com.nira.base.BaseTest;
import com.nira.pages.MobileEntryPage;
import com.nira.pages.OTPPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileNumberEntryTest extends BaseTest {

    @Test
    public void testValidMobileNumberEntry() throws Exception {
        MobileEntryPage entryPage = new MobileEntryPage(driver);
        Assert.assertTrue(entryPage.isPhoneInputVisible(), "Phone input not visible");

        String phone = "9876543210";
        entryPage.enterPhoneNumber(phone);
        entryPage.tapContinue();

        OTPPage otpPage = new OTPPage(driver);
        Assert.assertTrue(otpPage.isOTPInputVisible(), "OTP screen not displayed after valid phone entry");
    }
}
