package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StyleHubTest extends BaseTest {

    @Test
    public void verifyWomenFashionFeatureWorks() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnStyleHubLink();
        Assert.assertTrue(styleHubPage.isStyleHubPageDisplayed());
        styleHubPage.clickOnFirstGuide();
        styleHubPage.clickOnStyleGuideLink();
        Assert.assertTrue(styleHubPage.isStyleGuidePageDisplayed());
        styleHubPage.clickOnHomeIcon();
        Assert.assertTrue(styleHubPage.isStyleHubPageDisplayed());
    }

    @Test
    public void verifyWatchesFeatureWorks() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnStyleHubLink();
        Assert.assertTrue(styleHubPage.isStyleHubPageDisplayed());
        styleHubPage.clickOnWatchesLink();
        Assert.assertTrue(styleHubPage.isWatchesGuidePageDisplayed());
        styleHubPage.clickOnFirstWatchGuideLink();
        Assert.assertTrue(styleHubPage.isGuideDescriptionPageDisplayed());
        styleHubPage.clickOnHomeIcon();
        Assert.assertTrue(styleHubPage.isStyleHubPageDisplayed());
    }

    @Test
    public void verifyGuidesCanBeSearchedUsingSearchBar() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnStyleHubLink();
        Assert.assertTrue(styleHubPage.isStyleHubPageDisplayed());
        styleHubPage.search(ConfigReader.getConfigValue("style.hub.search"));
        Assert.assertTrue(styleHubPage.isResultPageDisplayed());
        styleHubPage.clickOnFirstSearchResultLink();
        Assert.assertTrue(styleHubPage.isGuideDescriptionPageDisplayed());
        styleHubPage.clickOnHomeIcon();
        Assert.assertTrue(styleHubPage.isStyleHubPageDisplayed());
    }
}
