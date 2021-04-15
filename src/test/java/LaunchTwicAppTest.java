import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LaunchTwicAppTest {

    public static AndroidDriver driver;
    //static WebDriverWait wait = new WebDriverWait(driver, 5);


    public static void main(String[] args) {

        try {
            launchTwic();
            signIn();

        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void launchTwic() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        Properties prop = new Properties();

        capabilities.setCapability("deviceName", "Redmi 9");
        String PLATFORM_NAME = prop.getProperty("android.platform");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        // capabilities.setCapability("platformName", "android");
        capabilities.setCapability("appPackage", "ai.twic.twicapp");
        capabilities.setCapability("appActivity", "ai.twic.twicapp.MainActivity");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("app", "D:\\\\android apks\\\\app-release-2403-21-01.apk");
        capabilities.setCapability("udid", "04bcdc430404");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        System.out.println("Application Started...");
    }
    public static void signIn(){
        System.out.println(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement signInManually = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"sign-in-manually\"]/android.view.ViewGroup/android.view.ViewGroup");
        //WebElement element = driver.findElement(new By.ByXPath("//android.view.ViewGroup[@content-desc=\"sign-in-manually\"]/android.view.ViewGroup/android.view.ViewGroup"));
       // wait.until(ExpectedConditions.visibilityOf(signInManually)).click();

        signInManually.click();

    }
}


