package com.automation.tests;

import com.automation.utils.ConfigReader;
import com.automation.utils.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTest extends BaseTest{

    @Test(dataProvider = "Brand Name data",dataProviderClass = DataProviderClass.class)
    public void verifyUserCanFilterProductsByBrandNames(String brandName){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.hoverWomenOption();
        Assert.assertEquals(productPage.isEthnicDressPageDisplayed(), "ETHNIC DRESSES");
        filterPage.clicksOnFilterOptions(brandName);
        Assert.assertTrue(filterPage.isProductPageBasedOnBrandsDisplayed(brandName));
    }

    @Test(dataProvider = "Category Name",dataProviderClass = DataProviderClass.class)
    public void verifyUserCanFilterProductsByCategories(String filterOption,String filterCategory){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.searchProductFromSearchBar(ConfigReader.getConfigValue("filter.product_1"));
        Assert.assertTrue(productPage.isResultPageDisplayed());
        filterPage.clicksOnFilterOptions(filterOption);
        filterPage.searchOnFilterSearchBar(filterCategory);
        filterPage.clicksOnSearchResults();
        Assert.assertEquals(filterPage.isFilteredPageDisplayed(filterCategory),filterCategory);

    }


}
