package org.lev;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HairdryerCatalogPageLuazon extends BasePage {

    public HairdryerCatalogPageLuazon(WebDriver driver) {
        super(driver);
    }

    By hairdryersBrands = By.xpath("//div[@class='schema-filter-control__item']/span[text()='167']");
    By luazonLabel = By.xpath("//span[text()='Luazon']");
    By products = By.xpath("//div[@class='schema-product__title']/a[@class='js-product-title-link']/span");
    By innerWindowLabels = By.xpath("//div[@class='schema-filter-popover__inner']");

    public HairdryerCatalogPageLuazon clickAllBrands() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, 700)");
        driver.findElement(hairdryersBrands).click();
        return this;
    }

    public HairdryerCatalogPageLuazon chooseLuazon() {
        List<WebElement> elements = driver.findElements(innerWindowLabels);
        WebElement innerWindow = elements.get(0);
        Actions actions = new Actions(driver);
        actions.moveToElement(innerWindow);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, 300)");
        driver.findElement(luazonLabel).click();
        return this;
    }

    public HairdryerCatalogPageLuazon closeLabelsWindow() {
        driver.findElement(hairdryersBrands).click();
        return this;
    }

    public List<WebElement> getProductCards() {
        return driver.findElements(products);
    }

    public boolean isLuazonHairdryer(List<WebElement> elements) {
        for (WebElement element : elements) {
            if (!element.getText().contains("Luazon")) {
                return false;
            }
        }
        return true;
    }
}
