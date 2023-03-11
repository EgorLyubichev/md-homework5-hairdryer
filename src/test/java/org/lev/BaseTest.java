package org.lev;

import org.lev.driversConfig.DriverConnector;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

    protected WebDriver driver = DriverConnector.getChromeDriver();
    protected BasePage basePage = new BasePage(driver);
    protected OnlinerHomePage onlinerHomePage = new OnlinerHomePage(driver);
    protected HairdryerCatalogPageBraun hairdryerCatalogPage = new HairdryerCatalogPageBraun(driver);

    @AfterTest(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}