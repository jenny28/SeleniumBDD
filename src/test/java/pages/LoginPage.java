package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class LoginPage extends BasePage {

    private String urlActual;

    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By pageTitle = By.className("login_logo");
    private final By productTitle = By.className("title");
    private final By messageError = By.cssSelector("h3[data-test='error']");

    @Override
    public void verifyPage() {
        Logs.info("Verificar página de login");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(usernameInput).isDisplayed(), "input username"),
                () -> Assertions.assertTrue(find(passwordInput).isDisplayed(), "input password"),
                () -> Assertions.assertTrue(find(loginButton).isDisplayed(), "login button"),
                () -> Assertions.assertTrue(find(pageTitle).isDisplayed(), "título del login")
        );
    }

    public void verificarLogin(String username, String password) {
        Logs.info("escribo el username");
        find(usernameInput).sendKeys(username);
        Logs.info("escribo password");
        find(passwordInput).sendKeys(password);
        Logs.info("hago click");
        find(loginButton).click();
    }

    public void verificarIngresoSistema() {
        Logs.info("verificar ingreso al sistema");
        Assertions.assertTrue(find(productTitle).isDisplayed());
    }

    public void loginUserNoOKMessage(String mensajeEsperado) {
        Logs.info("verifico mensaje de error");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(messageError).isDisplayed()),
                () -> Assertions.assertEquals(find(messageError).getText(), mensajeEsperado)
        );
    }

}
