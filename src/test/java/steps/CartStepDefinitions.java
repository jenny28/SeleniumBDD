package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.ShoppingPage;
import pages.TopBarSection;
import utilities.Logs;
import utilities.WebDriverProvider;

public class CartStepDefinitions {

    private final ShoppingPage shoppingPage = new ShoppingPage();
    private CartPage cartPage = new CartPage();
    private TopBarSection topBarSection = new TopBarSection();

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @When("ingreso a la interfaz carrito de compra")
    public void ingresoALaInterfazCarritoDeCompra() {
        Logs.info("verificar UI carrito de compra");
        shoppingPage.addToCart();
        topBarSection.openCart();
    }

    @Then("se muestra la UI carrito de compra")
    public void seMuestraLaUICarritoDeCompra() {
        cartPage.verifyPage();
    }
}
