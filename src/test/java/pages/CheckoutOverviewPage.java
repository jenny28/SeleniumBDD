package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;

public class CheckoutOverviewPage extends BasePage {

    private By titlePayment = By.cssSelector("div[data-test='payment-info-label']");
    private By titleShipping = By.cssSelector("div[data-test='shipping-info-label']");
    private By titlePrice = By.cssSelector("div[data-test='total-info-label']");
    private By btnCancel = By.id("cancel");
    private By btnFinish = By.id("finish");

    @Override
    public void verifyPage() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(titlePayment).isDisplayed()),
                () -> Assertions.assertTrue(find(titlePrice).isDisplayed()),
                () -> Assertions.assertTrue(find(titleShipping).isDisplayed()),
                () -> Assertions.assertTrue(find(btnCancel).isDisplayed()),
                () -> Assertions.assertTrue(find(btnFinish).isDisplayed())
        );
    }

    public void clickFinish() {
        find(btnFinish).click();
    }


}
