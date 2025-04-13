package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.TopBarSection;
import utilities.WebDriverProvider;

public class TopBarStepDefinitions {

    private final TopBarSection topbar = new TopBarSection();

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("el checkout muestra {int} elementos")
    public void verifyItemsSelected(int cant) {
        topbar.verifyItemsSelected(cant);
    }
}
