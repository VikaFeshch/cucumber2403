package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatePage {
    @FindBy(name = "certificate")
    WebElement inpNumCertificate;
    @FindBy(xpath = "//button[contains(@class, \"btn btn-submit -submit certificate-check_submit\")]")
    WebElement buttonCheck;
    @FindBy(id = "certificateCheckForm")
    WebElement checkFormMessage;

    WebDriver driver;

    public CertificatePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }


    public void inputNumCert(String num){
        inpNumCertificate.sendKeys(num);
    }
    public void clButCheck(){
        buttonCheck.click();
    }


    public boolean checkcertifChekForm() throws Exception {
        int i = 0;
        boolean result=false;
        while (true) {
            if (driver.getCurrentUrl().contains("view")) {
                result = true;
                break;
            }
            if (checkFormMessage.getAttribute("class").contains("invalid")) {
                result = false;
                break;
            }
            try {
                Thread.sleep(1000);
                i++;
                if (i > 10) {
                    throw new Exception("Out of time wait certificate cheker");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
