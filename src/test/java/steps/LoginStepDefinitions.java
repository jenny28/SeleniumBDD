package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.CommonFlows;
import utilities.Logs;
import utilities.WebDriverProvider;

public class LoginStepDefinitions {

    private final LoginPage loginPage = new LoginPage();
    private final CommonFlows common = new CommonFlows();


    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Given("que ingreso a la página {string}")
    public void ingresarPagina(String url) {
        Logs.info("ingreso a la página");
        common.goTOLoginPage(url);
    }

    @Then("el sistema muestra la interfaz de login")
    public void verificarInterfazLogin() {
        loginPage.verifyPage();
    }

    @When("obtengo la url del navegador")
    public void obtenerUrlActual() {
        Logs.info("obtener URl actual");
        common.currentUrl();
    }

    @Then("verifico que la url actual es la misma a {string}")
    public void verificarURLactual(String URLesperada) {
        common.verificarURL(URLesperada);
    }

    @Then("se verifica el ingreso al sistema")
    public void verificarIngresoSistema() {
        loginPage.verificarIngresoSistema();
    }

    @Then("el sistema muestra mensaje de error {string}")
    public void verificarMensajeError(String mensaje) {
        Logs.info("mensaje de error");
        loginPage.loginUserNoOKMessage(mensaje);
    }

    @When("ingreso el usuario {string} y password {string}")
    public void verificarLogin(String username, String password) {
        Logs.info("verificar login user");
        loginPage.verificarLogin(username, password);
    }
}
