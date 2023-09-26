package testingweb.stepdefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class SeleniumStepDefs {

    public static WebDriver webDriver;

    public SeleniumStepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("El usuario ingresa a la webapp")
    public void elUsuarioExpertoIngresaALaWebapp() {
        webDriver.get("http://localhost:5173/home");
    }

}
