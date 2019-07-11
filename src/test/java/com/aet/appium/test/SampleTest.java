package com.aet.appium.test;

import com.aet.appium.AppiumSetup;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

/**
 * The type Sample test.
 */
public class SampleTest {

    private AndroidDriver mobileDriver;

    @Before
    public void configureServer() {
        mobileDriver = new AppiumSetup().initializeAppiumServer();
    }

    /**
     * Test login application.
     */
    @Test
    public void testLoginApplication() {

        System.out.println("Contexts Available : " + mobileDriver.getContext());
        System.out.println("Page Source for " + mobileDriver.currentActivity() + " : \n" + mobileDriver.getPageSource());

        MobileElement txtUsername = (MobileElement) mobileDriver.findElement(By.id("com.test.sample.play:id/txtUsername"));
        MobileElement txtPassword = (MobileElement) mobileDriver.findElement(By.id("com.test.sample.play:id/txtPassword"));
        MobileElement btnLogin = (MobileElement) mobileDriver.findElement(By.id("com.test.sample.play:id/btnLogin"));

        txtUsername.sendKeys("admin");
        mobileDriver.hideKeyboard();
        txtPassword.sendKeys("admin");
        mobileDriver.hideKeyboard();
        btnLogin.click();

        /** wait for next activity to launch */
        mobileDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("Page Source for " + this.mobileDriver.currentActivity() + " : \n" + this.mobileDriver.getPageSource());

        MobileElement imageButton2 = (MobileElement) this.mobileDriver.findElement(By.id("com.test.sample.play:id/imageButton2"));
        imageButton2.click();

    }

    /**
     * Test krypton guru spinner element.
     */
    @Test
    public void testKryptonGuruSpinnerElement() {

        System.out.println("Contexts Available : " + mobileDriver.getContext());
        System.out.println("Page Source for " + mobileDriver.currentActivity() + " : \n" + mobileDriver.getPageSource());

        MobileElement txtUsername = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextUserName"));
        MobileElement txtPassword = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextPassword"));
        MobileElement btnLogin = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnLogin"));

        txtUsername.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        txtPassword.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        btnLogin.click();

        /** wait for next activity to launch */
        mobileDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("Page Source for " + this.mobileDriver.currentActivity() + " : \n" + this.mobileDriver.getPageSource());

        MobileElement selectionBtn = (MobileElement) this.mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnGoSelections"));
        selectionBtn.click();

        MobileElement planetSelect = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/spinner1"));
        planetSelect.click();

        MobileElement selector = (MobileElement) mobileDriver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Earth\")");
        selector.click();

        System.out.println(selector.getText());
    }


    /**
     * Test expandable list elements.
     */
    @Test
    public void testExpandableListElements() {

        System.out.println("Contexts Available : " + mobileDriver.getContext());
        System.out.println("Page Source for " + mobileDriver.currentActivity() + " : \n" + mobileDriver.getPageSource());

        MobileElement txtUsername = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextUserName"));
        MobileElement txtPassword = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextPassword"));
        MobileElement btnLogin = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnLogin"));

        txtUsername.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        txtPassword.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        btnLogin.click();

        /** wait for next activity to launch */
        mobileDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("Page Source for " + this.mobileDriver.currentActivity() + " : \n" + this.mobileDriver.getPageSource());

        MobileElement expandableBtn = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnGoExpandableList"));
        expandableBtn.click();

        MobileElement expandableSelector = (MobileElement) mobileDriver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Animals\")");
        expandableSelector.click();

        MobileElement dolphinSelector = (MobileElement) mobileDriver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Dolphin\")");
        dolphinSelector.click();

        System.out.println(dolphinSelector.getText());
    }

    /**
     * Test date time picker element.
     */
    @Test
    public void testDateTimePickerElement() {

        System.out.println("Contexts Available : " + mobileDriver.getContext());
        System.out.println("Page Source for " + mobileDriver.currentActivity() + " : \n" + mobileDriver.getPageSource());

        MobileElement txtUsername = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextUserName"));
        MobileElement txtPassword = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextPassword"));
        MobileElement btnLogin = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnLogin"));

        txtUsername.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        txtPassword.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        btnLogin.click();

        /** wait for next activity to launch */
        mobileDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("Page Source for " + this.mobileDriver.currentActivity() + " : \n" + this.mobileDriver.getPageSource());

        MobileElement dateTimeControlBtn = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnGoDateTime"));
        dateTimeControlBtn.click();

        MobileElement nextMonthBtn = (MobileElement) mobileDriver.findElement(By.id("android:id/next"));
        nextMonthBtn.click();

        MobileElement daySelector = (MobileElement) mobileDriver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").textContains(\"14\")");
        daySelector.click();

        MobileElement prevMonthBtn = (MobileElement) mobileDriver.findElement(By.id("android:id/prev"));
        prevMonthBtn.click();
        daySelector.click();

        MobileElement yearSelectorDd = (MobileElement) mobileDriver.findElement(By.id("android:id/date_picker_header_year"));
        yearSelectorDd.click();

        mobileDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String calendarYearElement = findCalendarYearElement("2002");
        System.out.println("Year Found : " + calendarYearElement);
    }

    @Test
    public void handleHandGestures() {

        System.out.println("Contexts Available : " + mobileDriver.getContext());
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
    }

    /**
     * Handle seek bar.
     */
    @Test
    public void handleSeekBar() {

        System.out.println("Contexts Available : " + mobileDriver.getContext());
        System.out.println("Page Source for " + mobileDriver.currentActivity() + " : \n" + mobileDriver.getPageSource());

        MobileElement txtUsername = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextUserName"));
        MobileElement txtPassword = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextPassword"));
        MobileElement btnLogin = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnLogin"));

        txtUsername.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        txtPassword.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        btnLogin.click();

        /** wait for next activity to launch */
        mobileDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MobileElement miscBtn = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnGoMisc"));
        miscBtn.click();

        MobileElement seekBar = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/seekBar1"));

        TouchAction touchAction = new TouchAction(mobileDriver);

        int xAxisStartPoint = seekBar.getLocation().getX();
        int xAxisEndPoint = xAxisStartPoint + seekBar.getSize().getWidth();
        int yAxis = seekBar.getLocation().getY();

        touchAction.press(point(xAxisStartPoint,yAxis)).moveTo(point(xAxisEndPoint-1,yAxis)).release().perform();

    }

    /**
     * Handle time functionality.
     */
    @Test
    public void handleTimeFunctionality() {

        System.out.println("Contexts Available : " + mobileDriver.getContext());
        System.out.println("Page Source for " + mobileDriver.currentActivity() + " : \n" + mobileDriver.getPageSource());

        MobileElement txtUsername = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextUserName"));
        MobileElement txtPassword = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/editTextPassword"));
        MobileElement btnLogin = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnLogin"));

        txtUsername.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        txtPassword.sendKeys("krypton");
        mobileDriver.hideKeyboard();
        btnLogin.click();

        /** wait for next activity to launch */
        mobileDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MobileElement dateTimeControlBtn = (MobileElement) mobileDriver.findElement(By.id("com.krypton.demoapplication:id/btnGoDateTime"));
        dateTimeControlBtn.click();

        // hour : android:id/hours
        // minutes : android:id/minutes
        // am/pm : android:id/am_label & android:id/pm_label
        // clock radial picker : android:id/radial_picker
        // hour click : class = android.widget.RadialTimePickerView$RadialPickerTouchHelper & desc 0, 1 ... 11

        mobileDriver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.RadialTimePickerView$RadialPickerTouchHelper\").description(\"1\")").click();

        /** wait for next activity to launch */
        mobileDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        mobileDriver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.RadialTimePickerView$RadialPickerTouchHelper\").description(\"55\")").click();

        mobileDriver.findElement(By.id("android:id/am_label")).click();
    }

    //Vertical Swipe by percentages
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = mobileDriver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);

        new TouchAction(mobileDriver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    /**
     * Find calendar year element.
     *
     * @param searchYear the search year
     * @return the string
     */
    public String findCalendarYearElement(String searchYear) {

        List elementsByAndroidUIAutomator;
        String year = "";
        boolean elementFound = false;

        boolean searchYearIsGt = false;
        boolean searchYearIsLt = false;
        int searchingYear = Integer.parseInt(searchYear);

        List checkElementsForSearchYear = mobileDriver.findElements(By.id("android:id/text1"));

        for (Object obj : checkElementsForSearchYear) {
            AndroidElement androidElement = (AndroidElement) obj;

            if (searchingYear > Integer.parseInt(androidElement.getText())) {
                searchYearIsGt = true;
            } else {
                searchYearIsLt = true;
            }
        }

        while (!elementFound) {
            try {
                elementsByAndroidUIAutomator = mobileDriver.findElements(By.id("android:id/text1"));

                for (Object obj : elementsByAndroidUIAutomator) {
                    AndroidElement androidElement = (AndroidElement) obj;

                    if (androidElement.getText().equals(searchYear)) {
                        year = androidElement.getText();
                        androidElement.click();
                        elementFound = true;
                        break;
                    }
                }

                if (!elementFound) {
                    if (searchYearIsLt)
                        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/date_picker_year_picker\")).flingBackward()");
                        mobileDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    if (searchYearIsGt)
                        mobileDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/date_picker_year_picker\")).flingForward()");
                        mobileDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                } else {
                    return year;
                }

            } catch(Exception e) {

                mobileDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                elementsByAndroidUIAutomator = mobileDriver.findElements(By.id("android:id/text1"));
                System.out.println(elementsByAndroidUIAutomator);
            }
        }

        return "Year not found...";
    }

    /**
     * Test click button when visible.
     */
    @Test
    public void testClickButtonWhenVisible() {

        try{
            MobileElement mobileElement =  (MobileElement) mobileDriver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.test.sample.play:id/btnLogin\")");
            WebDriverWait wait = new WebDriverWait(mobileDriver, 10);
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            boolean isElementPresent = mobileElement.isDisplayed();
            if (isElementPresent) {
                System.out.println("Element found");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
