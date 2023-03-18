package org.lev.homework6test;

import org.lev.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.lev.constants.OnlinerConstant.ACCESSORIES;
import static org.lev.constants.OnlinerConstant.APPLIANCES;
import static org.lev.constants.OnlinerConstant.AUTO;
import static org.lev.constants.OnlinerConstant.BEAUTIFUL;
import static org.lev.constants.OnlinerConstant.BUILDING;
import static org.lev.constants.OnlinerConstant.COMPUTERS_AND_NETS;
import static org.lev.constants.OnlinerConstant.CPU;
import static org.lev.constants.OnlinerConstant.CPU_NAME;
import static org.lev.constants.OnlinerConstant.DRAM;
import static org.lev.constants.OnlinerConstant.DRAM_NAME;
import static org.lev.constants.OnlinerConstant.ELECTRONICS;
import static org.lev.constants.OnlinerConstant.FAN;
import static org.lev.constants.OnlinerConstant.FAN_NAME;
import static org.lev.constants.OnlinerConstant.FOR_CHILDREN;
import static org.lev.constants.OnlinerConstant.HDD;
import static org.lev.constants.OnlinerConstant.HDD_NAME;
import static org.lev.constants.OnlinerConstant.HOUSE;
import static org.lev.constants.OnlinerConstant.LAPTOPS_COMPUTERS_MONITORS;
import static org.lev.constants.OnlinerConstant.LEFT_COLUMN;
import static org.lev.constants.OnlinerConstant.MOTHERBOARD;
import static org.lev.constants.OnlinerConstant.MOTHERBOARD_NAME;
import static org.lev.constants.OnlinerConstant.NET_APPLIANCES;
import static org.lev.constants.OnlinerConstant.ONLINER_CATALOG_PAGE;
import static org.lev.constants.OnlinerConstant.PRICE_EXPRESSION;
import static org.lev.constants.OnlinerConstant.PRODUCTS_NUMBER_EXPRESSION;
import static org.lev.constants.OnlinerConstant.SSD;
import static org.lev.constants.OnlinerConstant.SSD_NAME;
import static org.lev.constants.OnlinerConstant.VIDEOCARD;
import static org.lev.constants.OnlinerConstant.VIDEOCARD_NAME;
import static org.testng.Assert.assertTrue;

public class CatalogTest extends BaseTest {

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

    @Test(
            testName = "Наличие основных разделов в меню.",
            dataProvider = "mainCatalogSections")
    public void testMainSectionsOfCatalog(By sectionPath, String text) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(sectionPath).isDisplayed());
        soft.assertEquals(driver.findElement(sectionPath).getText(), text);
        soft.assertAll();
    }

    @Test(testName = "Наличие вертикальной колонки слева.")
    public void testLeftColumnIsExist() {
        catalogPage
                .clickComputersSection()
                .scrollDown180();
        assertTrue(driver.findElement(LEFT_COLUMN).isDisplayed());
    }

    @DataProvider(name = "ComputerSections")
    public static Object[][] getComputerCategoryPath() {
        return new Object[][]{
                {LAPTOPS_COMPUTERS_MONITORS, "Ноутбуки, компьютеры, мониторы"},
                {NET_APPLIANCES, "Сетевое оборудование"},
                {ACCESSORIES, "Комплектующие"}
        };
    }

    @Test(
            testName = "Компьютеры и сети: наличие подраздела",
            dataProvider = "ComputerSections"
    )
    public void testComputerSectionIsExist(By path, String text) {
        catalogPage
                .clickComputersSection()
                .scrollDown180();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(path).isEnabled());
        soft.assertEquals(driver.findElement(path).getAttribute("innerText"), text);
        soft.assertAll();
    }

    @DataProvider(name = "AccessoriesSubCategories")
    public static Object[][] getAccessoriesSubCategory() {
        return new Object[][]{
                {VIDEOCARD, VIDEOCARD_NAME},
                {CPU, CPU_NAME},
                {MOTHERBOARD, MOTHERBOARD_NAME},
                {DRAM, DRAM_NAME},
                {FAN, FAN_NAME},
                {SSD, SSD_NAME},
                {HDD, HDD_NAME}
        };
    }

    @Test(
            testName = "Комплектующие: наличие названия, количества товаров, мин.цена",
            dataProvider = "AccessoriesSubCategories")
    public void testAccessoriesSections(By path, String name) {
        catalogPage
                .clickComputersSection()
                .scrollDown180()
                .clickAccessories();
        WebElement element = driver.findElement(path);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(element));

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(element.isDisplayed());
        soft.assertTrue(element.getAttribute("innerHTML").contains(name));

        Pattern pattern = Pattern.compile(PRODUCTS_NUMBER_EXPRESSION);
        Matcher matcher = pattern.matcher(driver.findElement(path).getAttribute("innerHTML"));
        soft.assertTrue(matcher.find());

        Pattern pattern2 = Pattern.compile(PRICE_EXPRESSION);
        Matcher matcher2 = pattern2.matcher(driver.findElement(path).getAttribute("innerHTML"));
        soft.assertTrue(matcher2.find());

        soft.assertAll();
    }
}
