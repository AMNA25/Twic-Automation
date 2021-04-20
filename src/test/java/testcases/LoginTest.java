package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import pages.ProfilePage;
import pages.SettingsTabPage;
import testcases.BaseTest;
import testdata.NegativeLoginData;
import testdata.PositiveLoginData;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginTest extends BaseTest {

    @Test(priority = 1, dataProviderClass = PositiveLoginData.class, dataProvider = "PositiveLogin")
    public void loginSuccessful(String email, String password) {
        LoginPage loginpage = new LoginPage(driver);
        SettingsTabPage settingsPage = new SettingsTabPage(driver);
        loginpage.positiveLogin(email, password);
        settingsPage.clickSettingsTab();
      //  Assert.assertEquals(settingsPage.getProfileEmailText(), email);
    }

    @Test(priority = 2, dataProviderClass = NegativeLoginData.class, dataProvider = "InvalidEmail")
    public void loginWithInvalidEmail(String email){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.invalidEmailLogin(email);
        assertThat(loginPage.invalidEmailMessage(), anyOf(containsString("Invalid e-mail address"), containsString("e-mail address not found.")));
    }

    @Test(priority = 3, dataProviderClass = NegativeLoginData.class, dataProvider = "UnregisteredEmail")
    public void loginWithUnregisteredEmail(String email){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.unregisteredEmailLogin(email);
        assertThat(loginPage.invalidEmailMessage(), anyOf(containsString("Invalid e-mail address"), containsString("e-mail address not found.")));
    }

    @Test(priority = 4, dataProviderClass = NegativeLoginData.class, dataProvider = "InvalidPassword")
    public void loginWithIncorrectPassword(String email, String password){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.incorrectPasswordLogin(email, password);
        Assert.assertEquals(loginPage.incorrectPasswordMessage(), "Incorrect password.");
    }

}
