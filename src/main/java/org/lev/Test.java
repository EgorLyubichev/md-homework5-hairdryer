package org.lev;

import org.lev.driversConfig.DriverConnector;
import org.lev.onliner.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.lev.constants.OnlinerConstant.ONLINER_CATALOG_PAGE;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        final By NET_APPLIANCES = By.xpath("//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']");
        final By NET_APPLIANCES2 = By.xpath("//div[@class='catalog-navigation-list__aside-title'][contains(text(), 'Сетевое')]");

        WebDriver driver = DriverConnector.getChromeDriver();
        BasePage page = new BasePage(driver);
        page.openPage(ONLINER_CATALOG_PAGE);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'Компьютеры и')]"));

        element.click();

        try{
            WebElement element1 = driver.findElement(NET_APPLIANCES);
            System.out.println(element1.getText());
        }catch(Exception e){
            System.out.println(e.getMessage() + "\n" + e.getCause());
        }


        WebElement element3 = driver.findElement(NET_APPLIANCES2);
        System.out.println(element3.getText());

    }
}
