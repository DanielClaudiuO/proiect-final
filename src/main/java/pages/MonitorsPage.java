package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

public class MonitorsPage extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(MonitorsPage.class);

    private final By monitorsButton = By.xpath("//body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]");

    public MonitorActions navigateToMonitors() {
        LOG.info("Navigate to monitors");
        mouseActions.clickOn(monitorsButton);
        return new MonitorActions();
    }
}
