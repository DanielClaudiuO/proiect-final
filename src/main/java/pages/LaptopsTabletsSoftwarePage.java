package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

public class LaptopsTabletsSoftwarePage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(LaptopsTabletsSoftwarePage.class);
    private final By laptopsLaptopsButton = By.xpath("//body/div[6]/div[4]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]");

    public LaptopsPage navigateToLaptopsLaptops() {
        LOG.info("Navigate to laptops");
        mouseActions.clickOn(laptopsLaptopsButton);
        return new LaptopsPage();
    }
}
