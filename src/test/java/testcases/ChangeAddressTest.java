package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChangeBillingAddressPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SettingsTabPage;
import testdata.DataProviderTestNG;

import java.util.Map;

public class ChangeAddressTest extends BaseTest{
    @Test(dataProvider = "GetSheetData", dataProviderClass = DataProviderTestNG.class)
    public void editAddress(Map<String, String> sheet){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SettingsTabPage settingsTabPage = new SettingsTabPage(driver);
        ChangeBillingAddressPage addressPage = new ChangeBillingAddressPage(driver);

        loginPage.positiveLogin(sheet.get("Email"), sheet.get("Password"));
        homePage.clickSettingsTab();
        settingsTabPage.clickProfile();

        addressPage.enterAddressLine1(sheet.get("Line1"));
        addressPage.enterAddressLine2(sheet.get("Line2"));
        addressPage.scrollPageuptoSaveButton();
        addressPage.enterCity(sheet.get("City"));
        addressPage.enterZipcode(sheet.get("ZipCode"));
        addressPage.clickState();
        addressPage.selectState(sheet.get("State"));
        addressPage.clickSaveAddressButton();
    }
}
