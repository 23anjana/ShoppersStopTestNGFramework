package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void verifyIfHomePageDisplayed() {
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @Test
    public void verifySearchForProductUsingSearchBar() {
        homePage.openWebsite();
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("search.product.keyword"));
    }

    @Test
    public void chooseTheTrendingSearch() {
        homePage.openWebsite();
        homePage.clickOnSearchBar();
        homePage.trendingSearchProduct();
    }

    @Test
    public void chooseThePopularBrandSearch() {
        homePage.openWebsite();
        homePage.clickOnSearchBar();
        homePage.popularBrand();
    }
}
