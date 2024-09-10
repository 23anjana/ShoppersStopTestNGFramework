package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BagTest extends BaseTest{

    @Test
    public void verifyAddToBagAndRemoveFromBagFunctionality(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.searchItem(ConfigReader.getConfigValue("product.name"));
        Assert.assertEquals(productPage.productPageDisplayed(), ConfigReader.getConfigValue("product.name").toUpperCase());
        productPage.chooseProduct();
        productDetailsPage.clickSizeChart();
        productDetailsPage.chooseSize();
        productDetailsPage.clickCloseButton();
        giftCardPage.addToBag();
        Assert.assertEquals(productDetailsPage.productAddedSuccessfully(), "Product added to your cart successfully");
        productDetailsPage.clickCloseButton();
        productDetailsPage.clicksRemoveIcon();
        Assert.assertEquals(giftCardPage.isRemoveSuccessful(), "Product removed from your cart successfully");
    }
}
