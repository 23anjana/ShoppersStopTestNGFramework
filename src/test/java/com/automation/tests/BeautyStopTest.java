package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BeautyStopTest extends BaseTest {

    @Test
    public void verifyProductPageIsDisplayed() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnStyleHubLink();
        Assert.assertTrue(styleHubPage.isStyleHubPageDisplayed());
        beautyStopPage.clickOnBeautyStopLink();
        beautyStopPage.chooseProductCategory();
        Assert.assertTrue(beautyStopPage.isResultPageDisplayed());
    }

    @Test
    public void verifyAProductCanBeAddedToBag() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnStyleHubLink();
        Assert.assertTrue(styleHubPage.isStyleHubPageDisplayed());
        beautyStopPage.clickOnBeautyStopLink();
        beautyStopPage.searchProduct(ConfigReader.getConfigValue("beauty.stop.search"));
        Assert.assertTrue(beautyStopPage.isResultPageDisplayed());
        beautyStopPage.clickOnFirstProduct();
        beautyStopPage.addProductToCart();
        Assert.assertTrue(beautyStopPage.isProductAddedToCart());
        beautyStopPage.clickOnCartIcon();
        beautyStopPage.clickToAddQuantity();
        Assert.assertTrue(beautyStopPage.isQuantityUpdated());
        beautyStopPage.removeProduct();
        Assert.assertTrue(beautyStopPage.isProductSuccessfullyRemoved());
        beautyStopPage.clickOnGetShoppingButton();
        Assert.assertTrue(beautyStopPage.isSSBeautyHomePageDisplayed());
    }
}
