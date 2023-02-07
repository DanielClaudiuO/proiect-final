package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class PhonesPage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(PhonesPage.class);

    private final By phonesButton = By.xpath("//body/div[6]/div[4]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]");

    public PhonesActions navigateToPhones() {
        LOG.info("Navigate to phones");
        mouseActions.clickOn(phonesButton);
        return new PhonesActions();
    }
}
