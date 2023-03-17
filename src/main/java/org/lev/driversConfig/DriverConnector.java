package org.lev.driversConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import static java.time.Duration.ofSeconds;

public class DriverConnector {
    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

//        Map<String, String> props = new HashMap<String, String>();
//        props.put("deviceName", "iPhone 12 Pro");
//        chromeOptions.setExperimentalOption("mobileEmulation",props);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(4));
        driver.manage().timeouts().pageLoadTimeout(ofSeconds(8));
        return driver;
    }
}