package automation.tests;

import automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MembershipTest extends BaseTest {

    @Test
    public void verifyFirstCitizenClubMembershipFunctionality() {
        homePage.openWebsite();
        homePage.clickOnStoreIcon();
        membershipPage.clickOnMembershipLink();
        Assert.assertEquals(membershipPage.isMembershipPage(), "Membership Details & Benefits");
        membershipPage.clickOnBuyNowLink();
        membershipPage.readProductDescription();
        giftCardPage.addToBag();
        giftCardPage.clickOnViewBag();
        giftCardPage.removeFromBag();
        Assert.assertEquals(giftCardPage.isRemoveSuccessful(), ConfigReader.getConfigValue("remove.message"));
        membershipPage.clickOnGetShoppingButton();
        Assert.assertTrue(membershipPage.isBackToHomePage());
    }
}
