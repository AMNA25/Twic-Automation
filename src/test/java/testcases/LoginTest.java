package testcases;
import org.junit.jupiter.api.Order;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ReadAndWriteExcelDataPage;
import testcases.BaseTest;
import testdata.PositiveLoginData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

    @Test(priority = 1, dataProviderClass = PositiveLoginData.class, dataProvider = "PositiveLogin")
    public void loginSuccessful(String email, String password) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        LoginPage loginpage = new LoginPage(driver);
        loginpage.positiveLogin(email, password);
       // HomePage homepage = new HomePage();
       //Assert.assertEquals(loginpage.getMenuButtonText(), "  ");
    }

}
