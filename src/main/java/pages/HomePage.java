package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import reporting.ExtentManager;
import util.CustomLogger;

public class HomePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(HomePage.class);
    private final By searchBar = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/span[1]/input[2]");

    private final By laptopCategoryButton = By.xpath("//a[contains(text(),'Laptopuri si Tablete')]");
    private final By monitorCategoryButton = By.xpath("//body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]");
    private final By phonesCategoryButton = By.xpath("//a[contains(text(),'Telefoane mobile si Accesorii')]");
    public HomePage searchProduct(String product) {
        LOG.info("Search product: {}", product);
        keyboardActions.clearTheText(searchBar);
        keyboardActions.typeText(searchBar, product);
        keyboardActions.typeText(searchBar, String.valueOf(Keys.ENTER));
        return this;
    }

    public LaptopsTabletsSoftwarePage navigateToLaptops(){
        LOG.info("Navigate to laptops category");
        mouseActions.clickOn(laptopCategoryButton);
        return new LaptopsTabletsSoftwarePage();
    }

    public MonitorsPage navigateToMonitors(){
        LOG.info("Navigate to laptops category");
        mouseActions.clickOn(monitorCategoryButton);
        return new MonitorsPage();
    }

    public PhonesPage navigateToPhones(){
        LOG.info("Navigate to laptops category");
        mouseActions.clickOn(phonesCategoryButton);
        return new PhonesPage();
    }
}
