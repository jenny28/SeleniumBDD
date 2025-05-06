package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class CartPage extends BasePage {

    private final By titleQT = By.cssSelector("div[data-test='cart-quantity-label']");
    private final By descProduct = By.cssSelector("div[data-test='cart-desc-label']");
    private final By titleCart = By.cssSelector("div[data-test='cart-desc-label']");
    private final By btnContinueShopping = By.id("continue-shopping");
    private final By btnCheckout = By.id("checkout");

    @Override
    public void verifyPage() {
        Logs.info("Verificar página de Carrito de compras");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(titleQT).isDisplayed()),
                () -> Assertions.assertTrue(find(descProduct).isDisplayed()),
                () -> Assertions.assertTrue(find(titleCart).isDisplayed()),
                () -> Assertions.assertTrue(find(btnContinueShopping).isDisplayed()),
                () -> Assertions.assertTrue(find(btnCheckout).isDisplayed())
        );
    }

    public void clickCheckout() {
        find(btnCheckout).click();
    }

}
