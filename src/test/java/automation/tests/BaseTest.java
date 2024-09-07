package automation.tests;

import automation.pages.*;
import automation.utils.ConfigReader;
import automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    HomePage homePage;
    GiftCardPage giftCardPage;
    MembershipPage membershipPage;
    MiscellaneousPage miscellaneousPage;
    ProductPage productPage;
    StyleHubPage styleHubPage;
    BeautyStopPage beautyStopPage;
    StoreNLogoutPage storeNLogoutPage;

    @BeforeMethod
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
        homePage = new HomePage();
        giftCardPage = new GiftCardPage();
        membershipPage = new MembershipPage();
        miscellaneousPage = new MiscellaneousPage();
        productPage = new ProductPage();
        styleHubPage = new StyleHubPage();
        beautyStopPage = new BeautyStopPage();
        storeNLogoutPage = new StoreNLogoutPage();
    }

    @AfterMethod
    public void cleanUp(){
//        DriverManager.getDriver().quit();
    }
}
