package tests.orders;

import org.testng.annotations.Test;
import tests.BaseTest;

public class OrderTest extends BaseTest {

    @Test(description = "Place order")
    public void placeOrder() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops()
                .addLaptopToCart();
    }

    @Test(description = "Place phone order")
    public void placePhoneOrder() {
        homePage
                .navigateToPhones()
                .navigateToPhones()
                .adPhoneToCart();
    }

    @Test(description = "Place monitor order")
    public void placeMonitorOrder() {
        homePage
                .navigateToMonitors()
                .navigateToMonitors()
                .addMonitorToCart();
    }

    @Test(description = "Place order")
    public void placeOrderWithNewCustomer() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops()
                .addLaptopToCart();
    }

    @Test(description = "Place order")
    public void placeOrderWithFreeShipping() {
        homePage
                .navigateToLaptops()
                .navigateToLaptopsLaptops()
                .addLaptopToCart();
    }
}
