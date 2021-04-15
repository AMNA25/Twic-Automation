import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pages.HomePage;
import pages.LoginPage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest{
    String email = "max@twic.ai";
    String password = "foobar";

    @Test
    public void loginSuccessful(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //System.out.println("This is driver "+driver);
        LoginPage loginpage = new LoginPage(driver);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginpage.clickSignInManuallyButton();
        //loginpage.positiveLogin(email, password);
        /*loginpage.clickSignInManuallyButton();
        loginpage.enterEmail(email);
        loginpage.clickNextButton();
        loginpage.enterPassword(password);
        loginpage.clickLoginButton();
        loginpage.getMenuButtonText();*/
       // HomePage homepage = new HomePage();
       //Assert.assertEquals(loginpage.getMenuButtonText(), "  ");
    }



}
