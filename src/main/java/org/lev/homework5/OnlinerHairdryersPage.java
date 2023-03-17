package org.lev.homework5;

import org.lev.onliner.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlinerHairdryersPage extends BasePage {

    public OnlinerHairdryersPage(WebDriver driver) {
        super(driver);
    }

    protected By hairdryersBrands = By.xpath("//div[@class='schema-filter-control__item']/span[text()='167']/..");
    protected By noProducts = By.xpath("//span[@class='schema-filter-button__sub schema-filter-button__sub_main'][contains(text(), 'Нет товаров')]");
    protected By foundSomeProducts = By.xpath("//span[@class='schema-filter-button__sub schema-filter-button__sub_main'][contains(text(), 'Найдено')]");

    public OnlinerHairdryersPage clickAllBrands() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, 700)");
        WebElement element = driver.findElement(hairdryersBrands);
        waitElementIsVisible(element).click();
        return this;
    }

    public OnlinerHairdryersPage chooseLabelFromListIfLabelIsVisible(String label) {
        By labelXpath = By.xpath("//span[text()='" + label + "']");
        WebElement element = driver.findElement(labelXpath);
        waitElementIsVisible(element).click();
        return this;
    }

    public OnlinerHairdryersPage closeLabelsWindow() {
        driver.findElement(hairdryersBrands).click();
        return this;
    }

    public OnlinerHairdryersPage waitProductElements() {
        driver.findElement(noProducts);
        driver.findElement(foundSomeProducts);
        return this;
    }

    public List<WebElement> getProductCards(String label) {
        return driver.findElements(createProductLocator(label));
    }

    private By createProductLocator(String label) {
        String xpath = "//span[@data-bind='html: product.extended_name || product.full_name'][contains(text(), '"
                + label + "')]";
        return By.xpath(xpath);
    }

    public boolean isLabelHairdryer(List<WebElement> elements, String label) {
        for (WebElement element : elements) {
            if (!element.getText().contains(label)) {
                return false;
            }
        }
        return true;
    }
}
