package org.lev.constants;

import org.openqa.selenium.By;

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
    By ACCESSORIES = By.xpath("//div[@class='catalog-navigation-list__aside-title'][contains(text(), 'Комплектующие')]");

    /*Accessories category*/
    By VIDEOCARD = By.xpath("//a[@href='https://catalog.onliner.by/videocard']");
    String VIDEOCARD_NAME = "Видеокарты";

    By CPU = By.xpath("//a[@href='https://catalog.onliner.by/cpu']");
    String CPU_NAME = "Процессоры";

    By MOTHERBOARD = By.xpath("//a[@href='https://catalog.onliner.by/motherboard']");
    String MOTHERBOARD_NAME = "Материнские платы";

    By DRAM = By.xpath("//a[@href='https://catalog.onliner.by/dram']");
    String DRAM_NAME = "Оперативная память";

    By FAN = By.xpath("//a[@href='https://catalog.onliner.by/fan']");
    String FAN_NAME = "Системы охлаждения";

    By SSD = By.xpath("//a[@href='https://catalog.onliner.by/ssd']");
    String SSD_NAME = "SSD";

    By HDD = By.xpath("//a[@href='https://catalog.onliner.by/hdd']");
    String HDD_NAME = "Жесткие диски";

    String PRODUCTS_NUMBER_EXPRESSION = "[\\d]*[\\,]*[\\d]+[\\s]{1}[Товаров]";
    String PRICE_EXPRESSION = "[от][\\s]{1}[\\d]+[\\,]*[\\d]*";

}
