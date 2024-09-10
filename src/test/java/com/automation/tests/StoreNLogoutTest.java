package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreNLogoutTest extends BaseTest {

    @Test
    public void printTheStoresOfACity() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnStoreIcon();
        Assert.assertEquals(storeNLogoutPage.isOnStorePage(), "Stores & Events");
        storeNLogoutPage.chooseCity();
        storeNLogoutPage.printStoreNames();
    }

    @Test
    public void verifyLogoutFunctionality() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnStoreIcon();
        Assert.assertEquals(storeNLogoutPage.isOnStorePage(), "Stores & Events");
        storeNLogoutPage.clickOnLogoutLink();
        Assert.assertTrue(storeNLogoutPage.isLogoutConfirmButtonVisible());
        storeNLogoutPage.confirmLogout();
        Assert.assertEquals(storeNLogoutPage.isLogoutSuccessful(), "You have been logged out!!");
    }
}
