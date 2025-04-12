package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class FooterSection extends BasePage {

    private final By urlFacebook = By.cssSelector("a[data-test='social-facebook'");
    private final By urlTwitter = By.cssSelector("a[data-test='social-twitter'");
    private final By urlLinkdin = By.cssSelector("a[data-test='social-linkedin'");


    @Override
    public void verifyPage() {

    }

    public void verificarRedesSociales(String urlFB, String urlTW, String urlLK) {
        Logs.info("verificar página");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(urlFacebook).isDisplayed(), "desplegado urlFB"),
                () -> Assertions.assertTrue(find(urlFacebook).isEnabled(), "habilitado"),
                () -> Assertions.assertEquals(find(urlFacebook).getDomAttribute("href"), urlFB),
                () -> Assertions.assertTrue(find(urlTwitter).isDisplayed(), "urlTw"),
                () -> Assertions.assertTrue(find(urlTwitter).isEnabled(), "habilitado"),
                () -> Assertions.assertEquals(find(urlTwitter).getDomAttribute("href"), urlTW),
                () -> Assertions.assertTrue(find(urlLinkdin).isDisplayed(), "urlLinkdin"),
                () -> Assertions.assertTrue(find(urlLinkdin).isEnabled(), "habilitado Twitter")
        );
    }
}
