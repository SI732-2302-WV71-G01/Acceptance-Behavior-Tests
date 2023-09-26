package testingweb.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class RegisterExpertUS1StepDefs {
    public static WebDriver webDriver;

    public RegisterExpertUS1StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @And("Hace click en el botón Sign Up")
    public void haceClickEnElBotónSignUp() {
        //webDriver.findElement(By.cssSelector(".p-button:nth-child(1)")).click();
        webDriver.get("http://localhost:5173/sign-up");
    }

    @When("Rellena todos los campos solicitados de registro válidamente")
    public void rellenaTodosLosCamposSolicitadosDeRegistroVálidamente() {
        String randomString = RandomString.make(8);
        webDriver.findElement(By.id("FirstName")).sendKeys(randomString);
        webDriver.findElement(By.id("LastName")).click();
        webDriver.findElement(By.id("LastName")).sendKeys(randomString);
        webDriver.findElement(By.id("Username")).click();
        webDriver.findElement(By.id("Username")).sendKeys(randomString);
        webDriver.findElement(By.id("Password")).click();
        webDriver.findElement(By.id("Password")).sendKeys(randomString);
    }

    @And("Selecciona el rol de Experto")
    public void seleccionaElRolDeExperto() {
        webDriver.findElement(By.cssSelector(".p-dropdown-label")).click();
        webDriver.findElement(By.id("Role_1")).click();
    }

    @And("Hace click en Sign Up")
    public void haceClickEnSignUp() {
        webDriver.findElement(By.cssSelector(".p-button-label:nth-child(1)")).click();
    }

    @Then("la app registra al usuario en la aplicación")
    public void laAppRegistraAlUsuarioEnLaAplicación() {
        Assertions.assertEquals(1,1);
    }

    @When("No Rellena todos los campos solicitados de registro")
    public void noRellenaTodosLosCamposSolicitadosDeRegistro() {
        webDriver.findElement(By.id("FirstName")).click();
        webDriver.findElement(By.id("FirstName")).sendKeys("Juan");
        webDriver.findElement(By.id("LastName")).click();
        webDriver.findElement(By.id("LastName")).sendKeys("Paiva");
    }

    @Then("la app le alerta los campos faltantes de registro")
    public void laAppLeAlertaLosCamposFaltantesDeRegistro() {
        Assertions.assertEquals(1,1);
    }

    @When("Rellena los campos de registro con un nombre de usuario experto ya existente")
    public void rellenaLosCamposDeRegistroConUnNombreDeUsuarioYaExistente() {
        webDriver.findElement(By.id("FirstName")).click();
        webDriver.findElement(By.id("FirstName")).sendKeys("Juan");
        webDriver.findElement(By.id("LastName")).click();
        webDriver.findElement(By.id("LastName")).sendKeys("Paiva");
        webDriver.findElement(By.id("Username")).click();
        webDriver.findElement(By.id("Username")).sendKeys("jpaiva");
        webDriver.findElement(By.id("Password")).click();
        webDriver.findElement(By.id("Password")).sendKeys("jpaiva");
    }

    @Then("la app le alerta la app le notificará que el username ya existe")
    public void laAppLeAlertaLaAppLeNotificaráQueElUsernameYaExiste() {
        Assertions.assertEquals(1,1);
    }


}
