package testcases;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {
    public AndroidDriver driver;

    @BeforeMethod
    public void setUpAppium () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        setDesiredCapabilitiesForAndroid(capabilities);
    }


    private void setDesiredCapabilitiesForAndroid(DesiredCapabilities desiredCapabilities) throws MalformedURLException {
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "ai.twic.twicapp");
        desiredCapabilities.setCapability("appActivity", "ai.twic.twicapp.MainActivity");
        desiredCapabilities.setCapability("platformVersion", "10");
       // desiredCapabilities.setCapability("automationName", "UiAutomator1");
        desiredCapabilities.setCapability("app", "D:\\\\android apks\\\\app-release-2403-21-01.apk");
        desiredCapabilities.setCapability("udid", "04bcdc430404");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url, desiredCapabilities);
        System.out.println("Application Started...");

    }
    @AfterMethod
    public void quitDriver(){
        if(driver!= null)
        driver.quit();
    }


}
