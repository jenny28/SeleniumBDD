package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;

public class CheckoutCompleteSection extends BasePage {

    private By titleOrden = By.cssSelector("h2[data-test='complete-header']");
    private By btnHome = By.id("back-to-products");

    @Override
    public void verifyPage() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(titleOrden).isDisplayed()),
                () -> Assertions.assertTrue(find(btnHome).isDisplayed())
        );
    }
}
