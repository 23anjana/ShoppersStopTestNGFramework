package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
    @Test
    public void verifyPricesAreCorrectInCartPage(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.searchItem(ConfigReader.getConfigValue("product.first_name"));
        Assert.assertEquals(productPage.productPageDisplayed(), ConfigReader.getConfigValue("product.first_name"));
        Assert.assertEquals(productPage.isProductPageDisplayed(), "FILTERS");
        productPage.chooseProduct();
        productPage.chooseSize();
        giftCardPage.addToBag();
        productDetailsPage.clickCloseButton();
        Assert.assertEquals(productDetailsPage.productAddedSuccessfully(), "Product added to your cart successfully");
        homePage.searchItem(ConfigReader.getConfigValue("product.second_name"));
        Assert.assertEquals(productPage.productPageDisplayed(), ConfigReader.getConfigValue("product.second_name"));
        Assert.assertEquals(productPage.isProductPageDisplayed(), "FILTERS");
        productPage.chooseProduct();
        giftCardPage.addToBag();
        productDetailsPage.clickCloseButton();
        Assert.assertEquals(productDetailsPage.productAddedSuccessfully(), "Product added to your cart successfully");
        cartPage.clickBagIcon();
        Assert.assertTrue(cartPage.isCartPageDisplayed());
        Assert.assertTrue(cartPage.isFinalPriceIsMatchingWithItemTotalPrice());
    }
}
