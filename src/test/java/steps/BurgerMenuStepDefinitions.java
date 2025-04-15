package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.Logs;
import utilities.WebDriverProvider;

public class BurgerMenuStepDefinitions {

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("verifico el botón About con url {string}")
    public void verificarBotónAbout(String url) {
        Logs.info("boton About");

    }
}
