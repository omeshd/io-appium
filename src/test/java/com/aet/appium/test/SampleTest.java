package com.aet.appium.test;

import com.aet.appium.AppiumSetup;
import io.appium.java_client.MobileDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * The type Sample test.
 */
public class SampleTest {

    private MobileDriver mobileDriver;

    @Before
    public void configureServer() {
        mobileDriver = new AppiumSetup().initializeAppiumServer();
    }

    @Test
    public void testCalculation() {

        System.out.println("Contexts Available : " + mobileDriver.getContext());
        System.out.println("Page Source : " + mobileDriver.getPageSource());

        WebElement txtUsername = mobileDriver.findElement(By.id("com.test.sample.play:id/txtUsername"));
        WebElement txtPassword = mobileDriver.findElement(By.id("com.test.sample.play:id/txtPassword"));
        WebElement btnLogin = mobileDriver.findElement(By.id("com.test.sample.play:id/btnLogin"));

        txtUsername.sendKeys("admin");
        mobileDriver.hideKeyboard();
        txtPassword.sendKeys("admin");
        mobileDriver.hideKeyboard();
        btnLogin.click();

    }
}
