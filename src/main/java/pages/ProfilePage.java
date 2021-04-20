package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ProfilePage {
    private AndroidDriver<AndroidElement> driver;
    public ProfilePage(AndroidDriver driver){
        this.driver = driver;
    }

    MobileBy oldPassword = new MobileBy.ByAccessibilityId("Old Password");
    MobileBy newPassword = new MobileBy.ByAccessibilityId("New Password");
    MobileBy confirmNewPassword = new MobileBy.ByAccessibilityId("Confirm New Password");
//    MobileBy savePasswordButton = new MobileBy.ByAccessibilityId("");
    MobileBy addressLine1 = new MobileBy.ByAccessibilityId("Address Line 1");
    MobileBy addressLine2 = new MobileBy.ByAccessibilityId("Address Line 2");
    MobileBy city = new MobileBy.ByAccessibilityId("City");
   // MobileBy zipCode = new MobileBy.ByAccessibilityId("");
   // MobileBy state = new MobileBy.ByAccessibilityId("");
    MobileBy saveAddressButton = new MobileBy.ByAccessibilityId("");

    public void enterOldPassword(String oldPassword1){
        driver.findElement(oldPassword).sendKeys(oldPassword1);
    }
    public void enterNewPassword(String newPassword1){
        driver.findElement(newPassword).sendKeys(newPassword1);
    }
    public void enterConfirmNewPassword(String confirmNewPassword1){
        driver.findElement(confirmNewPassword).sendKeys(confirmNewPassword1);
    }
   /* public void clickSavePasswordButton(){
        driver.findElement(savePasswordButton).click();
    }*/
    public void enterAddressLine1(String addressLine11){
        MobileElement address1 = driver.findElement(addressLine1);
        address1.clear();
        address1.sendKeys(addressLine11);
    }
    public void enterAddressLine2(String addressLine22){
        MobileElement address2 = driver.findElement(addressLine2);
        address2.clear();
        address2.sendKeys(addressLine22);
    }
    public void enterCity(String city1){
        MobileElement cityy = driver.findElement(city);
        cityy.clear();
        cityy.sendKeys(city1);
    }
  /*  public void enterZipcode(String zipcode){
        MobileElement zipCodee = driver.findElement(zipCode);
        zipCodee.clear();
        zipCodee.sendKeys(zipcode);
    }*/
    public void clickSaveAddressButton(){
        driver.findElement(saveAddressButton).click();
    }


}

