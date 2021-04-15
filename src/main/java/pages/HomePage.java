package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    public AndroidDriver driver;
    public void HomePage(AndroidDriver driver){
        this.driver = driver;
    }

    public String getMenuButtonText(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement menuButton = (MobileElement) driver.findElementByXPath("menu-button");
        return menuButton.getText();
    }
}
