package step;

import config.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CertificatePage;

public class CheckCertSteps extends BaseClass {
    static final String CertUrl="https://certificate.ithillel.ua/";
    CertificatePage certificatePage = new CertificatePage(driver);

    static {
        if (driver==null){
            BaseClass.BeforeParent();
        }
    }
    @Before("@ChCS")
    public void start(){
        if(!driver.getCurrentUrl().equals(CertUrl)){
            driver.navigate().to(CertUrl);
        }
    }

    @When("send certificate {string}")
    public void sendCertificate(String numCert) {
        certificatePage.inputNumCert(numCert);
        certificatePage.clButCheck();
    }

   @Then("checking result {string}")
    public void checkingResult(String expected) throws Exception {
        Assert.assertEquals(Boolean.valueOf(expected),certificatePage.checkcertifChekForm());
    }
}
