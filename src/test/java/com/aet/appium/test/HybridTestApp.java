package com.aet.appium.test;

import com.aet.appium.AppiumSetup;
import io.appium.java_client.MobileDriver;
import org.junit.Before;
import org.junit.Test;

public class HybridTestApp {

    private MobileDriver mobileDriver;

    @Before
    public void configureServer() {
        mobileDriver = new AppiumSetup().prepareHybridAppiumServer();
    }

    @Test
    public void hybridTest() {

        System.out.println("Page Source : " + mobileDriver.getPageSource());

        for (String context : mobileDriver.getContextHandles()) {
            System.out.println("Contexts Available : " + context);
        }
    }
}
