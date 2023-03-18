package org.lev.homework6;

import org.lev.onliner.MobileBasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.lev.constants.OnlinerConstant.ACCESSORIES;
import static org.lev.constants.OnlinerConstant.COMPUTERS_AND_NETS;

public class MobileCatalogPage extends MobileBasePage {
    public MobileCatalogPage(WebDriver mobileDriver) {
        super(mobileDriver);
    }

    public MobileCatalogPage clickComputersSection() {
        mobileDriver.findElement(COMPUTERS_AND_NETS).click();
        return this;
    }

    public MobileCatalogPage clickAccessories(){


        new WebDriverWait(mobileDriver, Duration.ofSeconds(4))
                .until(ExpectedConditions.elementToBeClickable(mobileDriver.findElement(ACCESSORIES)));
         mobileDriver.findElement(ACCESSORIES).click();
         mobileDriver.findElement(ACCESSORIES).click();

        return this;
    }
}
