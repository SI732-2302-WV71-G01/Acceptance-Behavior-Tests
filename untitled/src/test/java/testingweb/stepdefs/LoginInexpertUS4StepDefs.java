package testingweb.stepdefs;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class LoginInexpertUS4StepDefs {
    public static WebDriver webDriver;
    public LoginInexpertUS4StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("Rellena todos los campos solicitados con datos existentes de cuenta de inexperto")
    public void rellenaLosTodosLosCamposSolicitadosConDatosExistentesDeCuentaDeInexperto() {
        webDriver.findElement(By.id("username")).click();
        webDriver.findElement(By.id("username")).sendKeys("c");
        webDriver.findElement(By.id("password")).click();
        webDriver.findElement(By.id("password")).sendKeys("c");
    }

    @When("No rellena todos los campos solicitados con datos existentes de cuenta de inexperto")
    public void noRellenaLosTodosLosCamposSolicitadosConDatosExistentesDeCuentaDeInexperto() {
        webDriver.findElement(By.id("username")).click();
        webDriver.findElement(By.id("username")).sendKeys("c");
    }
}
