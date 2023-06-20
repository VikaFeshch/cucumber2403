package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaProgramPage {

    By coachesShowAllButton = By.id("coachesShowAllButton");
    By coachesListItem = By.className("coach-list_item");
    By coachName= By.className("coach-card_name");

    WebDriver driver;

    public JavaProgramPage(WebDriver driver){
        this.driver = driver;
    }

}
