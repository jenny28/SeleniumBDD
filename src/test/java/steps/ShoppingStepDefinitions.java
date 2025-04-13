package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ShoppingPage;
import utilities.Logs;
import utilities.WebDriverProvider;

public class ShoppingStepDefinitions {

    private final LoginPage loginPage = new LoginPage();
    private final ShoppingPage shoppingPage = new ShoppingPage();

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("verifico la UI de la interfaz de shopping")
    public void verificoLaUIDeLaInterfazDeShopping() {
        Logs.info("verificar UI shopping");
        shoppingPage.verifyPage();
    }

    @When("agrego todos los items al carrito de compra")
    public void addToCart() {
        Logs.info("agregar los items al carrito");
        shoppingPage.addToCart();

    }
}
