package org.lev;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.lev.OnlinerConstant.BRAUN;
import static org.lev.OnlinerConstant.ERIKA;
import static org.lev.OnlinerConstant.MAESTRO;
import static org.lev.OnlinerConstant.ONLINER_HOME_PAGE;
import static org.testng.Assert.assertTrue;

public class OnlinerHairdryerPageTest extends BaseTest{

    @Test
    public void testToGetBraunList_AllProductsAreBraun() throws InterruptedException {

        onlinerBasePage.openPage(ONLINER_HOME_PAGE);

        onlinerHomePage.switchToHairdryerList();

        hairdryersPage
                .clickAllBrands()
                .chooseLabelFromListIfLabelIsVisible(BRAUN)
                .closeLabelsWindow()
                .waitProductElements(BRAUN);

        /**
         * Вот тут я не разобрался с задачей (((
         * */
        Thread.sleep(1000);

        List<WebElement> elements = hairdryersPage.getProductCards(BRAUN);

        assertTrue(hairdryersPage.isLabelHairdryer(elements, BRAUN));
    }

    @Test
    public void testToGetBraunList_AllProductsAreErika() throws InterruptedException {

        onlinerBasePage.openPage(ONLINER_HOME_PAGE);

        onlinerHomePage.switchToHairdryerList();

        hairdryersPage
                .clickAllBrands()
                .chooseLabelFromListIfLabelIsVisible(ERIKA)
                .closeLabelsWindow()
                .waitProductElements(ERIKA);

        /**
         * Вот тут я не разобрался с задачей (((
         * */
        Thread.sleep(1000);

        List<WebElement> elements = hairdryersPage.getProductCards(ERIKA);

        assertTrue(hairdryersPage.isLabelHairdryer(elements, ERIKA));
    }

    @Test
    public void testToGetBraunList_AllProductsAreMaestro() throws InterruptedException {

        onlinerBasePage.openPage(ONLINER_HOME_PAGE);

        onlinerHomePage.switchToHairdryerList();

        hairdryersPage
                .clickAllBrands()
                .chooseLabelFromListIfLabelIsVisible(MAESTRO)
                .closeLabelsWindow()
                .waitProductElements(MAESTRO);

        /**
         * Вот тут я не разобрался с задачей (((
         * */
        Thread.sleep(1000);

        List<WebElement> elements = hairdryersPage.getProductCards(MAESTRO);

        assertTrue(hairdryersPage.isLabelHairdryer(elements, MAESTRO));
    }
}
