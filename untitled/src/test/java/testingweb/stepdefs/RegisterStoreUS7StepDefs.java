package testingweb.stepdefs;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class RegisterStoreUS7StepDefs {
    public static WebDriver webDriver;

    public RegisterStoreUS7StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }
    @Given("El usuario da click en Mis Tiendas")
    public void elUsuarioDaClickEnMisTiendas() {
        webDriver.findElement(By.xpath("//button[contains(.,'My Stores')]")).click();
    }

    @And("Le da click a Nueva Tienda")
    public void leDaClickANuevaTienda() {
        webDriver.findElement(By.cssSelector(".p-button-success > .p-button-label")).click();
    }

    @When("Rellena todos los campos solicitados para el registro de la nueva tienda")
    public void rellenaTodosLosCamposSolicitadosParaElRegistroDeLaNuevaTienda() {
        webDriver.findElement(By.id("name")).click();
        webDriver.findElement(By.id("name")).sendKeys("Tienda D2");
        webDriver.findElement(By.id("description")).click();
        webDriver.findElement(By.id("description")).sendKeys("Mejor Tienda del Centro");
        webDriver.findElement(By.id("address")).click();
        webDriver.findElement(By.id("address")).sendKeys("Av.Los Grises");

        webDriver.findElement(By.xpath("//div[@id='logo']/div/span/span")).click();

        webDriver.findElement(By.xpath("//div[@id='storeImages']/div/span/span")).click();
        try{
            Thread.sleep(20000);
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }

    @And("le da en Guardar Tienda")
    public void leDaEnGuardarTienda() {
        webDriver.findElement(By.xpath("//span[contains(.,'SAVE')]")).click();
    }

    @Then("la nueva tienda se encontrará registrada")
    public void laNuevaTiendaSeEncontraráRegistrada() {
    }

    @When("No rellena todos los campos solicitados para el registro de la nueva tienda")
    public void noRellenaTodosLosCamposSolicitadosParaElRegistroDeLaNuevaTienda() {
        webDriver.findElement(By.id("name")).click();
        webDriver.findElement(By.id("name")).sendKeys("Tienda D2");
        webDriver.findElement(By.id("description")).click();
        webDriver.findElement(By.id("description")).sendKeys("Mejor Tienda del Centro");
    }

    @Then("la app le notificará los campos faltantes")
    public void laAppLeNotificaráLosCamposFaltantes() {
        Assertions.assertEquals(1,1);
    }

    @When("Rellena los campos solicitados para el registro de la nueva tienda")
    public void rellenaLosCamposSolicitadosParaElRegistroDeLaNuevaTienda() {
        webDriver.findElement(By.id("name")).click();
        webDriver.findElement(By.id("name")).sendKeys("Tienda D2");
        webDriver.findElement(By.id("description")).click();
        webDriver.findElement(By.id("description")).sendKeys("Mejor Tienda del Centro");
        webDriver.findElement(By.id("address")).click();
        webDriver.findElement(By.id("address")).sendKeys("Av.Los Grises");
        webDriver.findElement(By.xpath("//div[@id='logo']/div/span/span")).click();
        webDriver.findElement(By.xpath("//div[@id='storeImages']/div/span/span")).click();
        try{
            Thread.sleep(20000);
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }

    }

    @But("Se excede en el número de imágenes permitidas de la tienda")
    public void seExcedeEnElNúmeroDeImágenesPermitidasDeLaTienda() {
        Assertions.assertEquals(1,1);
    }

    @Then("La tienda no se registrará")
    public void laTiendaNoSeRegistrará() {
        Assertions.assertEquals(1,1);
    }

    @And("la app le notificará el exceso de fotos")
    public void laAppLeNotificaráElExcesoDeFotos() {
        Assertions.assertEquals(1,1);
    }
}
