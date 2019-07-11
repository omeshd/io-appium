package com.aet.appium;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author omesh
 * The type Appium setup.
 */
public class AppiumSetup {

//    private MobileDriver mobileDriver;
    private AndroidDriver mobileDriver;

    /**
     * Initialize appium server mobile driver.
     *
     * @return the mobile driver
     */
    public AndroidDriver initializeAppiumServer() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD, "Nexus_5X_API_27");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
//        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.test.sample.play.activity.LoginActivity");
//        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_DURATION, "80000");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\Aeturnum\\appium-demo\\app-debug.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\appmobileTesting.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        try {
            mobileDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return mobileDriver;
    }

    /**
     * Prepare hybrid appium server mobile driver.
     *
     * @return the mobile driver
     */
    public MobileDriver prepareHybridAppiumServer() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD, "Nexus_5X_API_27");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//        desiredCapabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\Aeturnum\\hybridApp2.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        try {
            mobileDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return mobileDriver;
    }
}
