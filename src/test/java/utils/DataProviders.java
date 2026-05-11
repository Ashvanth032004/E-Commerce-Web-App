package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"ad2208@krce.ac.in", "Test@123"},
                {"wrongemail@example.com", "wrongpassword"}
        };
    }
}