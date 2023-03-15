package org.lev;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.lev.OnlinerConstant.BRAUN;
import static org.lev.OnlinerConstant.ERIKA;
import static org.lev.OnlinerConstant.MAESTRO;
import static org.lev.OnlinerConstant.ONLINER_HOME_PAGE;
import static org.testng.Assert.assertTrue;

public class OnlinerHairdryerPageTest extends BaseTest{

    @Test
    public void testToGetList_AllProductsAreBraun() {

        onlinerBasePage.openPage(ONLINER_HOME_PAGE);
        onlinerHomePage.switchToHairdryerList();
        hairdryersPage
                .clickAllBrands()
                .chooseLabelFromListIfLabelIsVisible(BRAUN)
                .closeLabelsWindow()
                .waitProductElements();
        List<WebElement> elements = hairdryersPage.getProductCards(BRAUN);

        Assert.assertTrue(hairdryersPage.isLabelHairdryer(elements, BRAUN));
    }

    @Test
    public void testToGetList_AllProductsAreErika() throws InterruptedException {

        onlinerBasePage.openPage(ONLINER_HOME_PAGE);

        onlinerHomePage.switchToHairdryerList();

        hairdryersPage
                .clickAllBrands()
                .chooseLabelFromListIfLabelIsVisible(ERIKA)
                .closeLabelsWindow()
                .waitProductElements();

        List<WebElement> elements = hairdryersPage.getProductCards(ERIKA);

        assertTrue(hairdryersPage.isLabelHairdryer(elements, ERIKA));
    }

    @Test
    public void testToGetList_AllProductsAreMaestro() throws InterruptedException {

        onlinerBasePage.openPage(ONLINER_HOME_PAGE);

        onlinerHomePage.switchToHairdryerList();

        hairdryersPage
                .clickAllBrands()
                .chooseLabelFromListIfLabelIsVisible(MAESTRO)
                .closeLabelsWindow()
                .waitProductElements();


        List<WebElement> elements = hairdryersPage.getProductCards(MAESTRO);

        assertTrue(hairdryersPage.isLabelHairdryer(elements, MAESTRO));
    }
}
