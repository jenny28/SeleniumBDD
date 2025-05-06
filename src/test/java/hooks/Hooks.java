package hooks;

import com.google.common.io.Files;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utilities.Logs;
import utilities.WebDriverProvider;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Hooks {

    private static WebDriver driver;

    @Before
    public static void before(Scenario scenario) {
        Logs.info("comienzo el escenario: %s", scenario.getName());
        Logs.debug("Inicializando el driver");
        driver = new EdgeDriver();

        Logs.debug("maximizar las pantallas");
        driver.manage().window().maximize();

        // para que un test no impacte al otro test
        Logs.debug("eliminar cookies");
        driver.manage().deleteAllCookies();

        // no es tan óptimo por ser una espera global, se especifica un tiempo grande para los procesos que más se demoran
        Logs.debug("Agregando implicit wait");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Logs.debug("guardar el driver inicializado");
        new WebDriverProvider().set(driver);
    }

    @After
    public void after(Scenario scenario) throws IOException {
        Logs.info("Terminando el escenario: %s, status: %s", scenario.getName(), scenario.getStatus());

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file, new File("F:\\Proyectos\\seleniumBDD\\sample\\screenshot.jpg"));
        Logs.debug("matando el driver");
        driver.quit();
    }


}
