package org.lev.homework6test;

import org.openqa.selenium.By;

public interface CatalogPageTestInterface {

    void openCatalogPage();

    void testMainSectionsOfCatalog(By sectionPath, String text);

    void testComputerSectionIsExist(By path, String text);

    void testAccessoriesSections(By path, String name);
}
