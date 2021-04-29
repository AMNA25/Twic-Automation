package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import utils.Scroll;

public class ChangeBillingAddressPage{
    private AndroidDriver<AndroidElement> driver;
    public ChangeBillingAddressPage(AndroidDriver driver){
        this.driver = driver;
    }

    MobileBy addressLine1 = new MobileBy.ByAccessibilityId("line1");
    MobileBy addressLine1Error = new MobileBy.ByAccessibilityId("line1-error");
    MobileBy addressLine2 = new MobileBy.ByAccessibilityId("line2");
    MobileBy city = new MobileBy.ByAccessibilityId("city");
    MobileBy cityError = new MobileBy.ByAccessibilityId("city-error");
    MobileBy zipCode = new MobileBy.ByAccessibilityId("zip");
    MobileBy zipError = new MobileBy.ByAccessibilityId("zip-error");
    MobileBy saveAddressButton = new MobileBy.ByAccessibilityId("change-address-save-button");
    MobileBy getSaveAddressButtonDisabled = new MobileBy.ByAccessibilityId("change-address-save-button-disabled");

    public void enterAddressLine1(String addressLine11){
        MobileElement address1 = driver.findElement(addressLine1);
      //  address1.clear();
        address1.sendKeys(addressLine11);
    }
    public String getLine1ErrorText(){
        MobileElement message = driver.findElement(addressLine1Error);
        return message.getText();
    }
    public void enterAddressLine2(String addressLine22){
        MobileElement address2 = driver.findElement(addressLine2);
        address2.clear();
        address2.sendKeys(addressLine22);
    }
    public void scrollPageuptoSaveButton(){
       MobileElement saveButton = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().description(\"change-address-save-button\"));"));
    }

    public void enterCity(String city1){

        MobileElement cityy = driver.findElement(city);
        cityy.sendKeys(city1);

    }
    public String getCityErrorText(){
        MobileElement message = driver.findElement(cityError);
        return message.getText();
    }
    public void enterZipcode(String zipcode){
          MobileElement zipCodee = driver.findElement(zipCode);
          zipCodee.sendKeys(zipcode);

    }
    public String getZipcodeErrorText(){
        MobileElement message = driver.findElement(zipError);
        return message.getText();
    }
    public void clickState(){
        MobileElement state = driver.findElementByXPath("//android.widget.EditText[@content-desc=\"zip\"]//following::android.widget.EditText");
        state.click();
    }
    public void selectState(String state){
        MobileElement state1 = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\""+state+"\"));"));
        state1.click();
    }


    public void clickSaveAddressButton(){
        driver.findElement(saveAddressButton).click();
    }
    public void isSaveAddressButtonDisabled(){
        driver.findElement(getSaveAddressButtonDisabled).isDisplayed();
    }
}
