package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage{
    private AndroidDriver<AndroidElement> driver;

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
        System.out.println(this.driver);
    }
    MobileBy manuallySignInButton = new MobileBy.ByAccessibilityId("sign-in-manually");
    MobileBy emailInput = new MobileBy.ByAccessibilityId("work-email-field");
    MobileBy nextbutton = new MobileBy.ByAccessibilityId("work-email-button");
    MobileBy passwordInput = new MobileBy.ByAccessibilityId("password-field");
    MobileBy logInButton = new MobileBy.ByAccessibilityId("login-button");
    MobileBy invalidEmail = new MobileBy.ByAccessibilityId("work-email-field-error");
    MobileBy invalidPassword = new MobileBy.ByAccessibilityId("password-field-error");


    public void clickSignInManuallyButton(){

        MobileElement signInManually = driver.findElement(manuallySignInButton);
        signInManually.click();
    }
    public void enterEmail(String email){

        MobileElement emailField = driver.findElement(emailInput);
        emailField.sendKeys(email);
    }
    public void clickNextButton(){

        MobileElement nextButton = driver.findElement(nextbutton);
        nextButton.click();
    }
    public void enterPassword(String password){

        MobileElement passwordField = driver.findElement(passwordInput);
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){

        MobileElement loginButton = driver.findElement(logInButton);
        loginButton.click();
    }
    public String invalidEmailMessage(){
        MobileElement message = driver.findElement(invalidEmail);
        return message.getText();
    }
    public String incorrectPasswordMessage(){
        MobileElement message = driver.findElement(invalidPassword);
        return message.getText();
    }
    public void positiveLogin(String email, String password){
        clickSignInManuallyButton();
        enterEmail(email);
        clickNextButton();
        enterPassword(password);
        clickLoginButton();
    }
    public void invalidEmailLogin(String email){
        clickSignInManuallyButton();
        enterEmail(email);
    }
    public void unregisteredEmailLogin(String email){
        clickSignInManuallyButton();
        enterEmail(email);
        clickNextButton();
    }
    public void incorrectPasswordLogin(String email, String password){
        clickSignInManuallyButton();
        enterEmail(email);
        clickNextButton();
        enterPassword(password);
        clickLoginButton();
    }
}
