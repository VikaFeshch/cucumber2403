package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmptySteps {
    @When("sout my name")
    public void soutMyName() {
        System.out.println("Vika");
    }

    @And("sout my surname")
    public void soutMySurname() {
        System.out.println("Feshch");
    }

    @Then("sout my age")
    public void soutMyAge() {
        System.out.println("45");
    }

    @When("sout my name {string}")
    public void soutMyName(String name) {
        System.out.println(name);
    }

    @And("sout my surname {string} and surname my daughter {string}")
    public void soutMySurnameAndSurnameMyDaughter(String mySurname, String dSurname) {
        System.out.println("my surname "+ mySurname+" my daughter's surname "+dSurname);
    }
}
