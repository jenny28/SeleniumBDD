package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class TopBarSection extends BasePage {

    private final By itemCount = By.cssSelector("span[data-test='shopping-cart-badge']");
    private final By burgenMenuButton = By.id("react-burger-menu-btn");

    @Override
    public void verifyPage() {

    }

    public void verifyItemsSelected(int cantEsperada) {
        Logs.info("verificar cantidad esperada");
        final var cantidadItems = find(itemCount).getText();
        Assertions.assertEquals(Integer.parseInt(cantidadItems), cantEsperada);
    }
}
