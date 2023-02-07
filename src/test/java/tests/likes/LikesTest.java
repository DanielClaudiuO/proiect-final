package tests.likes;

import org.testng.annotations.Test;
import tests.BaseTest;

public class LikesTest extends BaseTest {

    @Test(description = "Add laptop like")
    public void addLaptopLike() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops()
                .addLaptopToLike();
    }

    @Test(description = "add phone like")
    public void addPhoneLike() {
        homePage
                .navigateToPhones()
                .navigateToPhones()
                .addPhoneToLike();
    }

    @Test(description = "add monitor like")
    public void addMonitorLike() {
        homePage
                .navigateToMonitors()
                .navigateToMonitors()
                .addMonitorToLike();
    }


}
