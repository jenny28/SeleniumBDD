package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.CheckoutInformationPage;
import pages.CheckoutOverviewPage;
import pages.ShoppingPage;
import pages.TopBarSection;
import utilities.WebDriverProvider;

public class CheckoutOverviewStepDefinitions {


    private final ShoppingPage shoppingPage = new ShoppingPage();
    private final TopBarSection topBar = new TopBarSection();
    private final CartPage cartPage = new CartPage();
    private CheckoutInformationPage chkInfoPage = new CheckoutInformationPage();
    private CheckoutOverviewPage chkOverviewPage = new CheckoutOverviewPage();


    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @When("ingreso a la interfaz overview")
    public void ingresoALaInterfazOverview() {
        shoppingPage.addToCart();
        topBar.openCart();
        cartPage.clickCheckout();
    }

    @Then("se verifica la UI de ckeckout overview")
    public void seVerificaLaUIDeCkeckoutOverview() {
        chkOverviewPage.verifyPage();
    }


    @And("clic en Continuar")
    public void clicEnContinuar() {
        chkInfoPage.clickContinue();
    }
}
