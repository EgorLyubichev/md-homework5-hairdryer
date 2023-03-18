package org.lev;

import org.lev.driversConfig.DriverConnector;
import org.lev.homework6.CatalogPage;
import org.lev.onliner.BasePage;
import org.lev.homework5.OnlinerHairdryersPage;
import org.lev.homework5.OnlinerHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

    protected WebDriver driver = DriverConnector.getChromeDriver();
    protected BasePage onlinerBasePage = new BasePage(driver);
    protected OnlinerHomePage onlinerHomePage = new OnlinerHomePage(driver);
    protected OnlinerHairdryersPage hairdryersPage = new OnlinerHairdryersPage(driver);
    protected CatalogPage catalogPage = new CatalogPage(driver);

    @AfterTest(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}