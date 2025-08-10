# NIRA_QA_Automation_Part2

## What this repo contains
- Two sample Appium + TestNG automated tests (Java) for the NIRA app:
  - MobileNumberEntryTest (valid mobile)
  - OTPVerificationTest (valid OTP)

## How to run (if you want to execute locally)
Prerequisites:
- JDK 11+, Maven, Appium server running at http://127.0.0.1:4723
- Android SDK + emulator or device connected
- Update capabilities in code or use capabilities.json

Commands:
- mvn test

## OTP handling (demo)
- The OTP test uses a placeholder method `getTestOTP()` which returns a static OTP.
- For real execution, replace getTestOTP() with:
  - test OTP from dev/test backend or
  - read SMS from emulator via `adb` or
  - use a test hook provided by backend

## Notes for submission
- This is a sample project for the assignment; tests are structured and ready to run after configuring local environment.
