package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class LoginPage{
    private AndroidDriver<AndroidElement> driver;

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
        System.out.println(this.driver);
    }
    MobileBy By = new MobileBy.ByAccessibilityId("sign-in-manually");
    MobileBy By1 = new MobileBy.ByAccessibilityId("work-email-field");
    MobileElement signInManually = driver.findElementByAccessibilityId("sign-in-manually");


    public void clickSignInManuallyButton(){

        MobileElement signInManually = driver.findElement(By);
        System.out.println(signInManually);
        signInManually.click();

    }
    public void enterEmail(String email){

        MobileElement emailField = driver.findElementByAccessibilityId("work-email-field");
        emailField.sendKeys(email);
    }
    public void clickNextButton(){

        MobileElement nextButton = driver.findElement(By1);
        nextButton.click();
    }
    public void enterPassword(String password){

        MobileElement passwordField = driver.findElementByAccessibilityId("password-field");
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){

        MobileElement loginButton = driver.findElementByAccessibilityId("login-button");
        loginButton.click();
    }
    public String getMenuButtonText(){

        MobileElement menuButton = driver.findElementByAccessibilityId("menu-button");
        return menuButton.getText();
    }
    public void positiveLogin(String email, String password){
        clickSignInManuallyButton();
        enterEmail(email);
        clickNextButton();
        enterPassword(password);
        clickLoginButton();
        getMenuButtonText();
    }

   /* @AndroidFindBy (accessibility = "sign-in-manually")
    public MobileElement signInManually;*/
   // AndroidElement sign = driver.findElementByAccessibilityId("sign-in-manually");


 /*   public void clickSignInManuallyButton(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement signInManually = driver.findElementByAccessibilityId("sign-in-manually");
            MobileElement emailField = driver.findElementByAccessibilityId("work-email-field");
            public void clickSignInManuallyButton(){
                signInManually.click();
            }
            public void enterEmail(){
                emailField.click();
            }


            System.out.println("try");
        }catch (Exception e) {
            System.out.println("catch");
            System.out.println(e.getMessage());
        }
    }*/

    //Properties properties = new Properties();




   /* //__ELEMENT LOCATORS__
    MobileElement signInManually = (MobileElement) driver.findElementByAccessibilityId("sign-in-manually");
    MobileElement emailMeMagicLinkButton = (MobileElement) driver.findElementByAccessibilityId("email-magic-link");
    MobileElement emailField = (MobileElement) driver.findElementByAccessibilityId("work-email-field");
    MobileElement nextButton = (MobileElement) driver.findElementByAccessibilityId("work-email-button");
    MobileElement passwordField = (MobileElement) driver.findElementByAccessibilityId("password-field");
    MobileElement resetPasswordButton = (MobileElement) driver.findElementByAccessibilityId("");
    MobileElement loginButton = (MobileElement) driver.findElementByXPath("login-button");

    //__ELEMENT ACTIONS__

    public void clickSignInManuallyButton(){
        signInManually.click();
        //wait.until(ExpectedConditions.visibilityOf(signInManually)).click();
    }
    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
    }
   public void clickNextButton(){
        wait.until(ExpectedConditions.visibilityOf(nextButton)).click();
    }
    public void enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }
    public HomePage clickLoginButton(){
        loginButton.click();
        //wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
        return new HomePage();
    }*/


    //__Convenience Method__


}
