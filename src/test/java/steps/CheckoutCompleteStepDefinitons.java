package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompleteSection;
import utilities.WebDriverProvider;

public class CheckoutCompleteStepDefinitons {

    private CheckoutCompleteSection chkComplete = new CheckoutCompleteSection();


    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("se verifica la UI de ckeckout complete")
    public void seVerificaLaUIDeCkeckoutComplete() {
        chkComplete.verifyPage();
    }
}
