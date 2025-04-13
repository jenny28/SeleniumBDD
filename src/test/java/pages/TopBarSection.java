package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;

public class TopBarSection extends BasePage {

    private final By items = By.className("shopping_cart_badge");

    @Override
    public void verifyPage() {

    }

    public void verifyItemsSelected(int cantEsperada) {
        final var cantidadItems = find(items).getText();
        Assertions.assertEquals(Integer.parseInt(cantidadItems), cantEsperada);
    }
}
