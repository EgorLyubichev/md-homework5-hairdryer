package org.lev;

import org.lev.driversConfig.DriverConnector;
import org.lev.homework6.MobileCatalogPage;
import org.lev.onliner.MobileBasePage;
import org.openqa.selenium.WebDriver;

public class MobileBaseTest {

    protected WebDriver mobileDriver = DriverConnector.getChromeDriverIPhoneEmulation();

    protected MobileBasePage mobileBasePage = new MobileCatalogPage(mobileDriver);
    protected MobileCatalogPage mobileCatalogPage = new MobileCatalogPage(mobileDriver);

}
