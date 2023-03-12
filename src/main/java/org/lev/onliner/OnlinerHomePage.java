package org.lev.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlinerHomePage extends BasePage {

    public OnlinerHomePage(WebDriver driver) {
        super(driver);
    }

    By hairdryerLink = By.xpath("//a[@href='https://catalog.onliner.by/hairdryer']");

    public OnlinerHomePage switchToHairdryerList() {
        driver.findElement(hairdryerLink).click();
        return this;
    }
}
