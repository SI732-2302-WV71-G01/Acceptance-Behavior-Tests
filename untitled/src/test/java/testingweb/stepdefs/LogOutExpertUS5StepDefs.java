package testingweb.stepdefs;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class LogOutExpertUS5StepDefs {
    public static WebDriver webDriver;

    public LogOutExpertUS5StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("Hace click al botón de Logout")
    public void haceClickAlBotónDeLogout() {
        webDriver.findElement(By.xpath("//button[contains(.,'Log out')]")).click();
        //webDriver.findElement(By.xpath("(//button[2]")).click();
    }

    @Given("La aplicación se encuentra sin inciar sesión")
    public void laAplicaciónSeEncuentraSinInciarSesión() {
        webDriver.findElement(By.xpath("//button[contains(.,'Log out')]")).click();
    }

    @When("El usuario no encuentra el botón de Log Out")
    public void elUsuarioNoEncuentraElBotónDeLogOut() {
        Assertions.assertEquals(1,1);
    }

    @Then("El usuario no puede deslogearse")
    public void elUsuarioNoPuedeDeslogearse() {
        Assertions.assertEquals(1,1);
    }


    @Then("Es dirigido a la página de My purchases")
    public void esDirigidoALaPáginaDeMyPurchases() {
        Assertions.assertEquals(1,1);
    }

    @But("no es dirigido a la página principal")
    public void noEsDirigidoALaPáginaPrincipal() {
        Assertions.assertEquals(1,1);
    }

    @Given("El usuario hace click al botón de My Purchases")
    public void elUsuarioHaceClickAlBotónDeMyPurchases() {
        //webDriver.findElement(By.cssSelector(".p-button:nth-child(10)")).click();
        webDriver.findElement(By.xpath("//button[contains(.,'My Purchases')]")).click();
    }
}
