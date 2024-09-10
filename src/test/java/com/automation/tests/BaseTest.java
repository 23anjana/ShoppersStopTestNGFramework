package com.automation.tests;


import com.automation.pages.*;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
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
    ProductDetailsPage productDetailsPage;
    CartPage cartPage;
    SortPage sortPage;
    FilterPage filterPage;

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
        productDetailsPage = new ProductDetailsPage();
        cartPage = new CartPage();
        sortPage = new SortPage();
        filterPage = new FilterPage();

    }

    @AfterMethod
    public void cleanUp(){
//        DriverManager.getDriver().quit();
    }
}
