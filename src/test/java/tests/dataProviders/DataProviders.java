package tests.dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "products")
    public Object[][] products() {
        return new Object[][]{
                {"samsung"}, {"motorola"}, {"dell"}, {"hp monitor"}, {"iphone 13 max"}
        };
    }
}
