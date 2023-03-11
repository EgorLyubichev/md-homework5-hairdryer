package org.lev;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HairdryerCatalogPageBraun extends BasePage {

    public HairdryerCatalogPageBraun(WebDriver driver) {
        super(driver);
    }

    By hairdryersBrands = By.cssSelector(".schema-filter-control__item");
    By braunLabel = By.xpath("//span[text()='Braun']");
    By products = By.xpath("//div[@class='schema-product__title']/a[@class='js-product-title-link']/span");

    public HairdryerCatalogPageBraun clickAllBrands() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, 700)");
        driver.findElement(hairdryersBrands).click();
        return this;
    }

    public HairdryerCatalogPageBraun chooseBraun() {
        driver.findElement(braunLabel).click();
        return this;
    }

    public HairdryerCatalogPageBraun closeLabelsWindow() {
        driver.findElement(hairdryersBrands).click();
        return this;
    }

    public List<WebElement> getProductCards() {
        return driver.findElements(products);
    }

    public boolean isBraunHairdryer(List<WebElement> elements) {
        for (WebElement element : elements) {
            if (!element.getText().contains("Braun")) {
                return false;
            }
        }
        return true;
    }


}
