package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    static public WebDriver driver;
    @BeforeClass
    public static void BeforeParent(){
        driver = ConfigurationWebDriver.createDriver(WebDrivers.CHROME_INCOGNITO);
        // static public WebDriver driver = ConfigurationWebDriver.createDriver(WebDrivers.CHROME);
    }
    @AfterClass
    public static void AfterParent() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

}
