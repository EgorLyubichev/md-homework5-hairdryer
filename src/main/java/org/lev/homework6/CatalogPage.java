package org.lev.homework6;

import org.lev.onliner.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;
import static org.lev.constants.OnlinerConstant.ACCESSORIES;
import static org.lev.constants.OnlinerConstant.COMPUTERS_AND_NETS;

public class CatalogPage extends BasePage {
    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public CatalogPage clickComputersSection() {
        driver.findElement(COMPUTERS_AND_NETS).click();
        return this;
    }

    public CatalogPage scrollDown180(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, 180)");
        return this;
    }

    public CatalogPage clickAccessories(){
        new WebDriverWait(driver, ofSeconds(4))
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(ACCESSORIES)));
        driver.findElement(ACCESSORIES).click();
        return this;
    }
}
