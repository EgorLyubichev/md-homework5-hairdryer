package org.lev;

import org.lev.driversConfig.DriverConnector;
import org.lev.onliner.BasePage;
import org.lev.onliner.OnlinerHairdryersPage;
import org.lev.onliner.OnlinerHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

    protected WebDriver driver = DriverConnector.getChromeDriver();
    protected BasePage onlinerBasePage = new BasePage(driver);
    protected OnlinerHomePage onlinerHomePage = new OnlinerHomePage(driver);
    protected OnlinerHairdryersPage hairdryersPage = new OnlinerHairdryersPage(driver);

    @AfterTest(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}