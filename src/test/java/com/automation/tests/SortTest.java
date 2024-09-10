package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTest extends BaseTest{

    @Test
    public void verifyPriceLowToHighSort(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.hoverManOption();
        Assert.assertEquals(productPage.isShirtPageDisplayed(), "SHIRTS");
        productPage.sortOption();
        productPage.sortLowToHigh();
        Assert.assertTrue(sortPage.verifyProductDisplayedLowToHigh());
    }

    @Test
    public void verifyPriceHighToLowSort(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.hoverManOption();
        Assert.assertEquals(productPage.isShirtPageDisplayed(), "SHIRTS");
        productPage.sortOption();
        productPage.sortHighToLow();
        Assert.assertTrue(sortPage.verifyProductDisplayedHighToLow());
    }

    @Test
    public void  verifyDiscountHighToLowSort(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.hoverManOption();
        Assert.assertEquals(productPage.isShirtPageDisplayed(), "SHIRTS");
        productPage.sortOption();
        productPage.sortDiscount();
        sortPage.verifyProductDisplayedDiscountHighToLow();
    }

}
