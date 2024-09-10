package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCardTest extends BaseTest {

    @Test
    public void verifyUserIsOnGiftCardPage() {
        homePage.openWebsite();
        homePage.clickOnStoreIcon();
        giftCardPage.clickOnGiftCardLink();
        Assert.assertEquals("Gift Card/EGV", giftCardPage.isOnGIftCardPage());
    }

    @Test
    public void userAddsAGiftCardToBag() {
        homePage.openWebsite();
        homePage.clickOnStoreIcon();
        giftCardPage.clickOnGiftCardLink();
        giftCardPage.clickOnFirstGiftCard();
        giftCardPage.addToBag();
        giftCardPage.fillDetails();
    }

    @Test
    public void verifyIfGiftCardIsAddedToBag() {
        homePage.openWebsite();
        homePage.clickOnStoreIcon();
        giftCardPage.clickOnGiftCardLink();
        giftCardPage.clickOnFirstGiftCard();
        giftCardPage.addToBag();
        giftCardPage.fillDetails();
        giftCardPage.clickOnViewBag();
        Assert.assertTrue(giftCardPage.isProductAddedToBag());
    }

    @Test
    public void userRemovesTheGiftCardFromBag() {
        homePage.openWebsite();
        homePage.clickOnStoreIcon();
        giftCardPage.clickOnGiftCardLink();
        giftCardPage.clickOnFirstGiftCard();
        giftCardPage.addToBag();
        giftCardPage.fillDetails();
        giftCardPage.clickOnViewBag();
        Assert.assertTrue(giftCardPage.isProductAddedToBag());
        giftCardPage.removeFromBag();
    }

    @Test
    public void verifyIfTheGiftCardIsRemovedFromBag() {
        homePage.openWebsite();
        homePage.clickOnStoreIcon();
        giftCardPage.clickOnGiftCardLink();
        giftCardPage.clickOnFirstGiftCard();
        giftCardPage.addToBag();
        giftCardPage.fillDetails();
        giftCardPage.clickOnViewBag();
        Assert.assertTrue(giftCardPage.isProductAddedToBag());
        giftCardPage.removeFromBag();
        Assert.assertEquals(ConfigReader.getConfigValue("remove.message"), giftCardPage.isRemoveSuccessful());
    }
}
