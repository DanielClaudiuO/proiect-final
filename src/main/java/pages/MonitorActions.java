package pages;

import actions.Actions;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import util.CustomLogger;

import java.time.Duration;

public class MonitorActions extends Actions {

    private static final Logger LOG = CustomLogger.INSTANCE.getLogger(MonitorActions.class);

    private final By addToCart = By.xpath("//body/div[6]/div[4]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[7]/div[1]/form[1]/input[3]");
    private final By addToLiked = By.xpath("//a[contains(text(),'Adauga la wishlist')]");

    public CartPage addMonitorToCart(){
        LOG.info("Add monitor to cart");
        mouseActions.clickOn(addToCart);
        wait.waitFor(Duration.ofSeconds(3));
        return new CartPage();
    }

    public LikePage addMonitorToLike(){
        LOG.info("Add monitor to like");
        mouseActions.clickOn(addToLiked);
        wait.waitFor(Duration.ofSeconds(3));
        return new LikePage();
    }

}
