package utilities;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CommonFlows {

    private String urlActual;

    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    public void currentUrl() {
        urlActual = getDriver().getCurrentUrl();
    }

    public void goTOLoginPage(String url) {
        Logs.info("go to page");
        getDriver().get(url);
    }

    public void verificarURL(String URLesperada) {
        Assertions.assertEquals(urlActual, URLesperada);
    }
}
