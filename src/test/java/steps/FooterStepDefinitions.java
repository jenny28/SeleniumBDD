package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.FooterSection;
import utilities.WebDriverProvider;

public class FooterStepDefinitions {

    private final FooterSection footer = new FooterSection();

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("se verifica la red de facebook {string} , de twitter {string} y de linkedln {string} en el footer")
    public void seVerificaLaRedDeFacebookDeTwitterYDeLinkedln(String urlFB, String urlTwitter, String urlLinkeln) {
        footer.verificarRedesSociales(urlFB, urlTwitter, urlLinkeln);
    }
}
