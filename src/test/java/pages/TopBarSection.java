package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class TopBarSection extends BasePage {

    private final By itemCount = By.cssSelector("span[data-test='shopping-cart-badge']");
    private final By burgenMenuButton = By.id("react-burger-menu-btn");
    private final By botonAbout = By.id("about_sidebar_link");

    @Override
    public void verifyPage() {

    }

    public void verifyItemsSelected(int cantEsperada) {
        Logs.info("verificar cantidad esperada");
        final var cantidadItems = find(itemCount).getText();
        Assertions.assertEquals(Integer.parseInt(cantidadItems), cantEsperada);
    }

    public void openBurgerMenu() {
        find(burgenMenuButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException interruptedException) {
            Logs.error("InterruptedException : %s", interruptedException.getLocalizedMessage());
        }
    }

    public void verificarBotonAbout(String url) {
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(botonAbout).isDisplayed(), "boton about desplegado"),
                () -> Assertions.assertTrue(find(botonAbout).isEnabled(), "boton habilitadp"),
                () -> Assertions.assertEquals(find(botonAbout).getDomAttribute("href"), url)
        );

    }
}
