package org.lev.homework6;

import org.lev.onliner.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.lev.constants.OnlinerConstant.ACCESSORIES;
import static org.lev.constants.OnlinerConstant.COMPUTERS_AND_NETS;
import static org.lev.constants.OnlinerConstant.LEFT_COLUMN;

public class OnlinerCatalogPage extends BasePage {

    public OnlinerCatalogPage(WebDriver driver) {
        super(driver);
    }


    public OnlinerCatalogPage clickComputersAndNets(){
        WebElement element = driver.findElement(COMPUTERS_AND_NETS);
        element.click();
        return this;
    }

    public OnlinerCatalogPage scrollDown180(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, 180)");
        return this;
    }

    public WebElement getLeftColumn(){
        WebElement element = null;
        element = driver.findElement(LEFT_COLUMN);
        return element;
    }

    public WebElement getComputersAndNetsCategory(By path) {
        clickComputersAndNets();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, 180)");
        WebElement element = driver.findElement(path);
        return element;
    }

    public OnlinerCatalogPage openAccessoriesCategory() throws InterruptedException {
        getComputersAndNetsCategory(ACCESSORIES);
        return this;

    }
}
