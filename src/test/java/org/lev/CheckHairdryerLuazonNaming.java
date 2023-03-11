package org.lev;

import org.testng.annotations.Test;

import static org.lev.Urls.ONLINER_HOME_PAGE;
import static org.testng.Assert.assertTrue;

public class CheckHairdryerLuazonNaming extends BaseTest {

    @Test
    public void testHairdryerNaming() {
        basePage
                .open(ONLINER_HOME_PAGE);

        onlinerHomePage
                .switchToHairdryerList();

        hairdryerCatalogPageLuazon
                .clickAllBrands()
                .chooseLuazon()
                .closeLabelsWindow();
        assertTrue(hairdryerCatalogPageLuazon.isLuazonHairdryer(hairdryerCatalogPageLuazon.getProductCards()));
    }
}
