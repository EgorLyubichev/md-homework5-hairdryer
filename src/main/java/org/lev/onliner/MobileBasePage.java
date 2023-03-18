package org.lev.onliner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobileBasePage {
    protected WebDriver mobileDriver;

    public MobileBasePage(WebDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
    }

    public boolean openPage(String url){
        mobileDriver.get(url);
        return true;
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(mobileDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
