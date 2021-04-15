import org.junit.Test;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest{
    String email = "max@twic.ai";
    String password = "foobar";

    @Test
    public void loginSuccessful(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //System.out.println("This is driver "+driver);
        LoginPage loginpage = new LoginPage(driver);

        loginpage.positiveLogin(email, password);
       // HomePage homepage = new HomePage();
       //Assert.assertEquals(loginpage.getMenuButtonText(), "  ");
    }
}
