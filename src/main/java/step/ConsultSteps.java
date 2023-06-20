package step;

import config.BaseClass;
import enums.MESSAGER;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.ConsultFormPage;
import pages.MainPageFactory;

import java.util.List;

public class ConsultSteps extends BaseClass {
    static final String mainUrl="https://kharkiv.ithillel.ua/";
    MainPageFactory mainPageFactory= PageFactory.initElements(driver,MainPageFactory.class);
    ConsultFormPage consultFormPage=PageFactory.initElements(driver,ConsultFormPage.class);

    static {
        if (driver==null){
            BaseClass.BeforeParent();
        }
    }
    @Before()
    public void start(){
        if(!driver.getCurrentUrl().equals(mainUrl)){
            driver.navigate().to(mainUrl);
        }
    }
    @When("I click consultation button")
    public void iClickConsultationButton() {
        System.out.println(driver.getCurrentUrl());
        mainPageFactory.clickButCons();
    }


    @And("Fill in the form")
    public void fillInTheForm(DataTable dataTable) {
        List<List<String>> data= dataTable.asLists(String.class);
        int line=1;
        List<String> list=data.get(line);
        consultFormPage.fillForm(list.get(0),list.get(1),list.get(4), MESSAGER.VIBER,list.get(5));
        System.out.println(data.get(1));
    }

    @Then("Check confirm button")
    public void checkConfirmButton() {
        Assert.assertFalse(consultFormPage.isConsultClickable());
    }
}
