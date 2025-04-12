package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverProvider;

public class ShoppingStepDefinitions {

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Given("que navego a la página de shopping")
    public void queNavegoALaPáginaDeShopping() {
        
    }
}
