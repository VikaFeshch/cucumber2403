package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ConfigurationWebDriver {
    public static WebDriver driver = null;

    static public WebDriver createDriver(WebDrivers webDrivers) {

        switch (webDrivers) {
            case CHROME -> createChrome();
            case CHROME_INCOGNITO -> createChromeIncognito();
            case FIREFOX -> createFireFox();
        }
        return driver;
    }

    private static void createFireFox() {
    }

    private static void createChromeIncognito() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
