package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    public void loginTest(){
        driver.get("https://automationexercise.com");
        driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
