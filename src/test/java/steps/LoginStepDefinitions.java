package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Logs;
import utilities.WebDriverProvider;

public class LoginStepDefinitions {

    private final LoginPage loginPage = new LoginPage();

    private String urlActual;

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Given("que ingreso a la página {string}")
    public void ingresarSistema(String url) {
        getDriver().get(url);
    }


    @Then("el sistema muestra la interfaz de login")
    public void verificarInterfazLogin() {
        loginPage.verifyPage();
    }


    @Then("se verifica el ingreso al sistema")
    public void verificarIngresoSistema() {
        loginPage.verificarIngresoSistema();
    }

    @And("el sistema muestra la url {string}")
    public void verificarURL(String URLesperada) {
        loginPage.verificarURL(URLesperada);
    }

    @Then("el sistema muestra mensaje de error {string}")
    public void verificarMensajeError(String mensaje) {
        Logs.info("mensaje de error");
        loginPage.loginUserNoOKMessage(mensaje);
    }

    @When("ingreso el usuario {string} y password {string}")
    public void verificarLoginUser(String username, String password) {
        Logs.info("verificar login user");
        loginPage.verificarLogin(username, password);
    }
}
