package pages;

import enums.MESSAGER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsultFormPage {
    @FindBy(id = "input-name-consultation")
    WebElement name;
    @FindBy(id = "input-email-consultation")
    WebElement email;
    @FindBy(id = "input-tel-consultation")
    WebElement phone;
    @FindBy(xpath = "//button[@data-name=\"tg\"]")
    WebElement telegramBut;
    @FindBy(xpath = "//input[@name=\"tg\"]")
    WebElement telegramInp;
    @FindBy(xpath = "//button[@data-name=\"vb\"]")
    WebElement viberBut;
    @FindBy(xpath = "//input[@name=\"db\"]")
    WebElement viberInp;
    @FindBy(id = "listbox-btn-input-course-consultation")
    WebElement butInpCourse;
    @FindBy(xpath = "//input[@class=\"listbox_search-input\"]")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"form-consultation\"]/div[1]/footer/div[2]/button")
    WebElement button;

    public void fillForm(String name, String email, String phone, MESSAGER messager, String course){
        this.name.sendKeys(name);
        this.email.sendKeys(email);
        this.phone.sendKeys(phone);
        switch (messager){
            case TELEGRAM -> {
                telegramBut.click();
                this.telegramInp.sendKeys();
            }
            case VIBER -> {
                viberBut.click();
                this.viberInp.sendKeys(phone);
            }
        }
        this.butInpCourse.click();
        this.search.sendKeys(course);
        this.search.sendKeys(Keys.DOWN);
        this.search.sendKeys(Keys.ENTER);
        this.butInpCourse.click();
    }

    public boolean isConsultClickable(){
        return button.isEnabled();
    }
}
