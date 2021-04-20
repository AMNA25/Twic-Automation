package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SettingsTabPage {
    private AndroidDriver<AndroidElement> driver;
    public SettingsTabPage(AndroidDriver driver){
        this.driver = driver;
    }

    MobileBy settings = new MobileBy.ByAccessibilityId("UserSettingsScreen");
    MobileBy profileEmail = new MobileBy.ByAccessibilityId("email-address");
    MobileBy profile = new MobileBy.ByAccessibilityId("profile");

    public void clickSettingsTab(){
        driver.findElement(settings).click();
    }
    public void clickProfile(){
        driver.findElement(profile).click();
    }

    public String getProfileEmailText(){
        MobileElement profileEmailText = driver.findElement(profileEmail);
        return profileEmailText.getText();
    }
}
