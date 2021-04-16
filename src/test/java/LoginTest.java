import org.junit.Test;
import pages.LoginPage;
import pages.ReadAndWriteExcelDataPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest{
    //String email = "max@twic.ai";
    //String password = "foobar";

    @Test
    public void loginSuccessful() throws IOException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //System.out.println("This is driver "+driver);
        LoginPage loginpage = new LoginPage(driver);
        ReadAndWriteExcelDataPage data = new ReadAndWriteExcelDataPage();
        String email = data.readData(2, 0);
        String password = data.readData(2, 1);
        loginpage.positiveLogin(email, password);
       // HomePage homepage = new HomePage();
       //Assert.assertEquals(loginpage.getMenuButtonText(), "  ");
    }
}
