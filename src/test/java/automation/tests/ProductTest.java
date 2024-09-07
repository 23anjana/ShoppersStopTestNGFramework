package automation.tests;

import automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void verifySearchForProductUsingSearchBar() {
        homePage.openWebsite();
        homePage.clickOnSearchBar();
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("search.product.keyword"));
        Assert.assertTrue(productPage.isResultPageDisplayed());
    }

    @Test
    public void verifyChooseTheTrendingSearch() {
        homePage.openWebsite();
        homePage.clickOnSearchBar();
        homePage.trendingSearchProduct();
        Assert.assertTrue(productPage.isTrendingSearchResultDisplayed());
    }

    @Test
    public void verifyChooseThePopularBrandSearch() {
        homePage.openWebsite();
        homePage.clickOnSearchBar();
        homePage.popularBrand();
        Assert.assertTrue(productPage.isPopularBrandsResultDisplayed());
    }
}
