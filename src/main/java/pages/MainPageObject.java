package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObject {
    private WebDriver driver;
    private By consultButton = By.id("btn-consultation-hero");
    private By formConsultation = By.id("form-consultation");
    private By contactsButton = By.xpath("//li[@class=\"site-nav-menu_item\"]");

    public MainPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getConsultButton() {
        return driver.findElement(consultButton);
    }

    public boolean isEnabledFormConsultation() {
        return driver.findElement(formConsultation).isEnabled();
    }

    public WebElement getContactsButton() {
        return driver.findElement(contactsButton);
    }
}
