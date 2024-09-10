package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiscellaneousTest extends BaseTest {

    @Test
    public void userScrollsDownAndClicksOnUpArrow() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        miscellaneousPage.scrollDownAndClickOnUpArrow();
    }

    @Test
    public void verifyIfThePageScrolledUp() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        Assert.assertTrue(miscellaneousPage.isPageScrolledUp());
    }

    @Test
    public void userClicksOnRightArrow() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("miscellaneous.search_1"));
        productPage.isResultPageDisplayed();
        miscellaneousPage.clickOnRightArrow();
    }

    @Test
    public void verifyIfUserIsNavigatedToTheNextPage() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("miscellaneous.search_1"));
        productPage.isResultPageDisplayed();
        miscellaneousPage.clickOnRightArrow();
        Assert.assertTrue(miscellaneousPage.isOnNextPageOfResult());
    }

    @Test
    public void userClicksOnLeftArrow() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("miscellaneous.search_1"));
        productPage.isResultPageDisplayed();
        miscellaneousPage.clickOnRightArrow();
        Assert.assertTrue(miscellaneousPage.isOnNextPageOfResult());
        miscellaneousPage.clickOnLeftArrow();
    }

    @Test
    public void verifyIfUserIsOnThePreviousPage() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("miscellaneous.search_1"));
        productPage.isResultPageDisplayed();
        miscellaneousPage.clickOnRightArrow();
        Assert.assertTrue(miscellaneousPage.isOnNextPageOfResult());
        miscellaneousPage.clickOnLeftArrow();
        Assert.assertTrue(miscellaneousPage.isOnNextPageOfResult());
    }

    @Test
    public void userClicksOnTheDesiredPage() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("miscellaneous.search_1"));
        productPage.isResultPageDisplayed();
        miscellaneousPage.clickOnDesiredPage();
    }

    @Test
    public void verifyUserIsOnTheDesiredPage() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("miscellaneous.search_1"));
        productPage.isResultPageDisplayed();
        miscellaneousPage.clickOnDesiredPage();
        Assert.assertTrue(miscellaneousPage.isOnNextPageOfResult());
    }

    @Test
    public void printsTheEstimationInformationOnToTheConsole() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("miscellaneous.search_2"));
        productPage.isResultPageDisplayed();
        miscellaneousPage.clicksOnTheProduct();
        miscellaneousPage.inputsPinCode();
        miscellaneousPage.displayEstimationInformation();
    }

    @Test
    public void verifyIfClickingOnWebsiteLogoNavigatesBackToHomePage() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("miscellaneous.search_2"));
        productPage.isResultPageDisplayed();
        miscellaneousPage.clickOnWebSiteLogoLink();
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @Test
    public void verifyACategoryAtTheBottomCanBeSelected() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnCategoryListAtPageBottom();
        Assert.assertTrue(productPage.isBottomCategoryResultPageDisplayed());
    }

    @Test
    public void verifyHelpNSupportFunctionality() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnHelpNSupport();
        Assert.assertTrue(miscellaneousPage.isOnHelpNSupportPage());
        miscellaneousPage.searchQuery(ConfigReader.getConfigValue("query"));
        miscellaneousPage.displayQueryAnswer();
        miscellaneousPage.clickOnPlusSignForQueryDetail();
        miscellaneousPage.displayQueryAnswer();
    }

    @Test
    public void verifyUserCanChooseBrands(){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        miscellaneousPage.chooseLetter(ConfigReader.getConfigValue("brand.letter"));
        miscellaneousPage.chooseBrand(ConfigReader.getConfigValue("brand.letter"));
        Assert.assertTrue(miscellaneousPage.verifyBrandPageDisplayed(ConfigReader.getConfigValue("brand.letter")));

    }

}
