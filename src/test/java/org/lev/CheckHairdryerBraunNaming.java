package org.lev;

import org.testng.annotations.Test;

import static org.lev.Urls.ONLINER_HOME_PAGE;
import static org.testng.Assert.assertTrue;

public class CheckHairdryerBraunNaming extends BaseTest {

    @Test
    public void testHairdryerNaming() throws InterruptedException {
        basePage
                .open(ONLINER_HOME_PAGE);

        onlinerHomePage
                .switchToHairdryerList();

        hairdryerCatalogPageBraun
                .clickAllBrands()
                .chooseBraun()
                .closeLabelsWindow();
        assertTrue(hairdryerCatalogPageBraun.isBraunHairdryer(hairdryerCatalogPageBraun.getProductCards()));
    }
}
