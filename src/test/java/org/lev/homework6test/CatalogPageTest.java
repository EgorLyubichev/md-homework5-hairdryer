package org.lev.homework6test;

import org.lev.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.lev.constants.OnlinerConstant.ACCESSORIES;
import static org.lev.constants.OnlinerConstant.APPLIANCES;
import static org.lev.constants.OnlinerConstant.AUTO;
import static org.lev.constants.OnlinerConstant.BEAUTIFUL;
import static org.lev.constants.OnlinerConstant.BUILDING;
import static org.lev.constants.OnlinerConstant.COMPUTERS_AND_NETS;
import static org.lev.constants.OnlinerConstant.ELECTRONICS;
import static org.lev.constants.OnlinerConstant.FOR_CHILDREN;
import static org.lev.constants.OnlinerConstant.HOUSE;
import static org.lev.constants.OnlinerConstant.LAPTOPS_COMPUTERS_MONITORS;
import static org.lev.constants.OnlinerConstant.NET_APPLIANCES;
import static org.lev.constants.OnlinerConstant.ONLINER_CATALOG_PAGE;
import static org.testng.Assert.assertEquals;

public class CatalogPageTest extends BaseTest {

    @BeforeMethod
    public void openCatalogPage() {
        onlinerBasePage.openPage(ONLINER_CATALOG_PAGE);
    }

    @DataProvider(name = "mainCatalogSections")
    public static Object[][] getMainCategoryPath() {
        return new Object[][]{
                {ELECTRONICS, "Электроника"},
                {COMPUTERS_AND_NETS, "Компьютеры и сети"},
                {APPLIANCES, "Бытовая техника"},
                {BUILDING, "Стройка и ремонт"},
                {HOUSE, "Дом и сад"},
                {AUTO, "Авто и мото"},
                {BEAUTIFUL, "Красота и спорт"},
                {FOR_CHILDREN, "Детям и мамам"}
        };
    }

    @Test(dataProvider = "mainCatalogSections")
    public void testMainSections(By categoryTag, String categoryName) {
        WebElement element = driver.findElement(categoryTag);
        assertEquals(element.getText(), categoryName);
    }

    @Test
    public void testComputersAndNetsCategory() {
        onlinerCatalogPage
                .clickComputersAndNets()
                .scrollDown180();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(onlinerCatalogPage.getLeftColumn());
        softAssert.assertTrue(onlinerCatalogPage.getLeftColumn().isDisplayed());
        softAssert.assertAll();
    }

    @DataProvider(name = "ComputerSections")
    public static Object[][] getComputerCategoryPath(){
        return new Object[][]{
                {LAPTOPS_COMPUTERS_MONITORS, "Ноутбуки, компьютеры, мониторы"},
                {NET_APPLIANCES, " Сетевое оборудование "},
                {ACCESSORIES, "Комплектующие"}
        };
    }

    @Test(dataProvider = "ComputerCategories")
    public void testComputersAndNetsCategories(By path, String text) {
        WebElement element = onlinerCatalogPage.getComputersAndNetsCategory(path);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(element.isDisplayed());
        softAssert.assertEquals(element.getText(), text);
        softAssert.assertAll();
    }

    @Test
    public void testAccessoriesCategory() throws InterruptedException {
        onlinerCatalogPage.openAccessoriesCategory();
        Thread.sleep(5000);
    }

    @Test
    public void test() {
        onlinerCatalogPage
                .clickComputersAndNets()
                .scrollDown180();
        WebElement element = driver.findElement(NET_APPLIANCES);
        System.out.println(element.getText());


    }
}
