package org.lev.onliner;

import org.openqa.selenium.WebDriver;

public class MobileBasePage {
    protected WebDriver mobileDriver;

    public MobileBasePage(WebDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
    }

    public boolean openPage(String url){
        mobileDriver.get(url);
        return true;
    }
}
