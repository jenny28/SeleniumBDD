package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class ShoppingPage extends BasePage {

    private final By titleSwagTab = By.className("app_logo");
    private final By titleProducts = By.className("title");
    private final By inputSelect = By.className("product_sort_container");
    private final By listItems = By.className("inventory_list");
    private final By btnCheckout = By.id("shopping_cart_container");
    private final By btnBurgerMenu = By.id("react-burger-menu-btn");

    @Override
    public void verifyPage() {

    }

    public void verificarUIshopping() {
        Logs.info("verificar ui página shopping");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(titleSwagTab).isDisplayed(), "título swag"),
                () -> Assertions.assertTrue(find(titleProducts).isDisplayed(), "título products"),
                () -> Assertions.assertTrue(find(inputSelect).isDisplayed(), "input select"),
                () -> Assertions.assertTrue(find(listItems).isDisplayed(), "list items"),
                () -> Assertions.assertTrue(find(btnCheckout).isDisplayed(), "btn checkout"),
                () -> Assertions.assertTrue(find(btnBurgerMenu).isDisplayed(), "btn burger menu")
        );
    }
}
