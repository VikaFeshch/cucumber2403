package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainPageFactory {
    @FindBy(id = "btn-consultation-hero")
    public WebElement consultButton;
    @FindBy(id = "form-consultation")
    WebElement formConsult;
    @FindBy(xpath = "//li[@class=\"socials-list_item\"]")
    List<WebElement> socialList;

    public boolean isEnabledFormConsultation() {
        return formConsult.isEnabled();
    }
    public void clickButCons(){
        consultButton.click();
    }
    public List<String> getSocialLink(){
        List<String> stringList=new ArrayList<>();
        for (WebElement element:socialList){
            stringList.add(element.findElement(By.tagName("a")).getAttribute("href"));
        }
        return stringList;
    }

}
