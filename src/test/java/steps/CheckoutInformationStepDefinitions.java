package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.CheckoutInformationPage;
import pages.ShoppingPage;
import pages.TopBarSection;
import utilities.WebDriverProvider;

public class CheckoutInformationStepDefinitions {

    private final ShoppingPage shoppingPage = new ShoppingPage();
    private CheckoutInformationPage chkInfoPage = new CheckoutInformationPage();
    private CartPage cartPage = new CartPage();
    private final TopBarSection topbar = new TopBarSection();

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("se verifica la UI de ckeckout information")
    public void seVerificaLaUI() {
        chkInfoPage.verifyPage();
    }


    @And("completo el {string} , {string} , {string}")
    public void completeCheckoutInformation(String name, String lastName, String zoneCode) {
        chkInfoPage.InfoCheckout(name, lastName, zoneCode);
    }


    @When("ingreso a la interfaz checkout information")
    public void ingresoALaInterfazCheckoutInformation() {
        shoppingPage.addToCart();
        topbar.openCart();
        cartPage.clickCheckout();
    }
}
