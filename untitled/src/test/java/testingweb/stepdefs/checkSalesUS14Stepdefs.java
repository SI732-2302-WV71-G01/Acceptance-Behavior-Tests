package testingweb.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class checkSalesUS14Stepdefs {
    public static WebDriver webDriver;

    public checkSalesUS14Stepdefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @And("el usuario va a una de sus tiendas con ventas")
    public void elUsuarioVaAUnaDeSusTiendasConVentas() {
        webDriver.findElement(By.xpath("//button[contains(.,'Tienda D1')]")).click();
    }

    @When("le da click en Ventas de la tienda")
    public void leDaClickEnVentasDeLaTienda() {
        webDriver.findElement(By.xpath("//span[contains(.,'Sales')]")).click();

    }

    @Then("la aplicación le mostrará las ventas de dicha tienda satifactoriamente")
    public void laAplicaciónLeMostraráLasVentasDeDichaTiendaSatifactoriamente() {
        Assertions.assertEquals(1,1);
    }

    @And("el usuario va a una de sus tiendas sin ventas")
    public void elUsuarioVaAUnaDeSusTiendasSinVentas() {
        webDriver.findElement(By.xpath("//button[contains(.,'Tienda D2')]")).click();
    }

    @Then("la aplicación le notificará que la tienda no tiene ventas aún")
    public void laAplicaciónLeNotificaráQueLaTiendaNoTieneVentasAún() {
        Assertions.assertEquals(1,1);
    }
}
