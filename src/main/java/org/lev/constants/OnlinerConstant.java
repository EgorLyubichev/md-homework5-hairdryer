package org.lev.constants;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public interface OnlinerConstant {

    String ONLINER_HOME_PAGE = "https://www.onliner.by/";
    String ONLINER_CATALOG_PAGE = "https://catalog.onliner.by/";

    String BRAUN = "Braun";
    String ERIKA = "Erika";
    String MAESTRO = "Maestro";

    /*Main catalog sections*/
    By ELECTRONICS = By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(), 'Электроника')]");
    By COMPUTERS_AND_NETS = By.xpath("//span[contains(text(), 'Компьютеры и')]");
    By APPLIANCES = By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(), 'Бытовая')]");
    By BUILDING = By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(), 'Стройка')]");
    By HOUSE = By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(), 'Дом')]");
    By AUTO = By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(), 'Авто')]");
    By BEAUTIFUL = By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(), 'Красота')]");
    By FOR_CHILDREN = By.xpath("//span[@class='catalog-navigation-classifier__item-title-wrapper'][contains(text(), 'Детям')]");

    By LEFT_COLUMN = By.xpath("//div[contains(text(), 'Хранение')]/../..");

    /*Computers and nets category*/
    By LAPTOPS_COMPUTERS_MONITORS = By.xpath("//div[@class='catalog-navigation-list__aside-title'][contains(text(), 'Ноутбуки')][contains(text(), 'мониторы')]");
    By NET_APPLIANCES = By.xpath("//div[contains(text(), 'Сетевое')]");
    By ACCESSORIES = By.xpath("//div[@class='catalog-navigation-list__aside-title'][contains(text(), ' Комплектующие')][1]");

    /*Accessories category*/
    By VIDEOCARD = By.xpath("//a[@href='https://catalog.onliner.by/videocard']");
    Map<String, String> VIDEOCARD_FIELDS = Map.of(
            "name", "Видеокарты",
            "volume","1,447 товаров",
            "price","от 87,00 р.");

    By CPU = By.xpath("//a[@href='https://catalog.onliner.by/cpu']");
    Map<String, String> CPU_FIELDS = Map.of(
            "name", "Процессоры",
            "volume","1,247 товаров",
            "price","от 20,80 р.");

    By MOTHERBOARD = By.xpath("//a[@href='https://catalog.onliner.by/motherboard']");
    Map<String, String> MOTHERBOARD_FIELDS = Map.of(
            "name", "Материнские платы",
            "volume","1,985 товаров",
            "price","от 120,00 р.");

    By DRAM = By.xpath("//a[@href='https://catalog.onliner.by/dram']");
    Map<String, String> DRAM_FIELDS = Map.of(
            "name", "Оперативная память",
            "volume","3,475 товаров",
            "price","от 27,90 р.");

    By FAN = By.xpath("//a[@href='https://catalog.onliner.by/fan']");
    Map<String, String> FAN_FIELDS = Map.of(
            "name", "Системы охлаждения",
            "volume","2,523 товара",
            "price","от 1,39 р.");

    By SSD = By.xpath("//a[@href='https://catalog.onliner.by/ssd']");
    Map<String, String> SSD_FIELDS = Map.of(
            "name", "SSD",
            "volume","3,607 товаров",
            "price","от 25,60 р.");

    By HDD = By.xpath("//a[@href='https://catalog.onliner.by/hdd']");
    Map<String, String> HDD_FIELDS = Map.of(
            "name", "Жесткие диски",
            "volume","906 товаров",
            "price","от 47,46 р.");



}
