package testingweb.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class RegisterInexpertUS2StepDefs {
    public static WebDriver webDriver;

    public RegisterInexpertUS2StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @When("Rellena los campos de registro con un nombre de usuario inexperto ya existente")
    public void rellenaLosCamposDeRegistroConUnNombreDeUsuarioInexpertoYaExistente() {
        webDriver.findElement(By.id("FirstName")).click();
        webDriver.findElement(By.id("FirstName")).sendKeys("c");
        webDriver.findElement(By.id("LastName")).click();
        webDriver.findElement(By.id("LastName")).sendKeys("c");
        webDriver.findElement(By.id("Username")).click();
        webDriver.findElement(By.id("Username")).sendKeys("c");
        webDriver.findElement(By.id("Password")).click();
        webDriver.findElement(By.id("Password")).sendKeys("c");
    }
    @And("Selecciona el rol de Inexperto")
    public void seleccionaElRolDeInexperto() {
        webDriver.findElement(By.cssSelector(".p-dropdown-label")).click();
        webDriver.findElement(By.id("Role_0")).click();
    }
}
