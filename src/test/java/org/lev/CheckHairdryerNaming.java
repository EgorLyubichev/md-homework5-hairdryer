package org.lev;

import org.testng.annotations.Test;

import static org.lev.Urls.ONLINER_HOME_PAGE;
import static org.testng.Assert.assertTrue;

public class CheckHairdryerNaming extends BaseTest {

    @Test
    public void testHairdryerNaming() throws InterruptedException {
        basePage
                .open(ONLINER_HOME_PAGE);

        onlinerHomePage
                .switchToHairdryerList();

        hairdryerCatalogPage
                .clickAllBrands()
                .chooseBraun()
                .closeLabelsWindow();
        assertTrue(hairdryerCatalogPage.isBraunHairdryer(hairdryerCatalogPage.getProductCards()));
    }
}
