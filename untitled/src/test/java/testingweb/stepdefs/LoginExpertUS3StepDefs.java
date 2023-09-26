package testingweb.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class LoginExpertUS3StepDefs {
    public static WebDriver webDriver;

    public LoginExpertUS3StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("Hace click al botón de Access")
    //@And("Hace click al botón de Access")
    public void haceClickAlBotónDeAccess() {
        webDriver.findElement(By.cssSelector(".p-toolbar-group-start > .p-button-text")).click();
        webDriver.get("http://localhost:5173/sign-in");
    }
    @When("Rellena los todos los campos solicitados con datos existentes de cuenta de experto")
    public void rellenaLosTodosLosCamposSolicitadosConDatosExistentesDeCuentaDeExperto() {
        webDriver.findElement(By.id("username")).click();
        webDriver.findElement(By.id("username")).sendKeys("d");
        webDriver.findElement(By.id("password")).click();
        webDriver.findElement(By.id("password")).sendKeys("d");
    }

    //Scenario 02
    @When("No rellena los todos los campos solicitados con datos existentes de cuenta de experto")
    public void noRellenaLosTodosLosCamposSolicitadosConDatosExistentesDeCuentaDeExperto() {
        webDriver.findElement(By.id("username")).click();
        webDriver.findElement(By.id("username")).sendKeys("d");
    }

    @And("Hace click en Sign In")
    public void haceClickEnSignIn() {
        webDriver.findElement(By.cssSelector(".p-button-label:nth-child(1)")).click();
        //webDriver.get("http://localhost:5173/home");
    }

    @Then("el usuario es redirigido a la página principal de la webapp")
    public void elUsuarioEsRedirigidoALaPáginaPrincipalDeLaWebapp() {
        Assertions.assertEquals(1,1);
    }
    //Scenario 02
    @Then("la webapp le mostrará una alerta en cada campo faltantes")
    public void laWebappLeMostraráUnaAlertaEnCadaCampoFaltantes() {
        Assertions.assertEquals(1,1);
    }
    //Scenario 03
    @When("Rellena los campos con información inválida")
    public void rellenaLosCamposConInformaciónInválida() {
        webDriver.findElement(By.id("username")).click();
        webDriver.findElement(By.id("username")).sendKeys("invalidUser");
        webDriver.findElement(By.id("password")).click();
        webDriver.findElement(By.id("password")).sendKeys("invalidUser");
    }
    //Scenario 03
    @Then("la web app le mostrará un mensaje de alerta notificando que el usuario es inválido")
    public void laWebAppLeMostraráUnMensajeDeAlertaNotificandoQueElUsuarioEsInválido() {
        Assertions.assertEquals(1,1);
    }



}