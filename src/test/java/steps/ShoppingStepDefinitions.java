package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ShoppingPage;
import utilities.WebDriverProvider;

public class ShoppingStepDefinitions {

    private final LoginPage loginPage = new LoginPage();
    private final ShoppingPage shoppingPage = new ShoppingPage();

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("verifico la UI de la interfaz de shopping")
    public void verificoLaUIDeLaInterfazDeShopping() {
        shoppingPage.verificarUIshopping();
    }
}
