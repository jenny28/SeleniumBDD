package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;

public class CheckoutInformationPage extends BasePage {
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postCode = By.id("postal-code");
    private By btnContinue = By.id("continue");


    @Override
    public void verifyPage() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(firstName).isDisplayed()),
                () -> Assertions.assertTrue(find(lastName).isDisplayed()),
                () -> Assertions.assertTrue(find(postCode).isDisplayed()),
                () -> Assertions.assertTrue(find(btnContinue).isDisplayed())
        );
    }

    public void InfoCheckout(String name, String lastname, String zipcode) {
        find(firstName).sendKeys(name);
        find(lastName).sendKeys(lastname);
        find(postCode).sendKeys(zipcode);
    }

    public void clickContinue() {
        find(btnContinue).click();
    }
}
