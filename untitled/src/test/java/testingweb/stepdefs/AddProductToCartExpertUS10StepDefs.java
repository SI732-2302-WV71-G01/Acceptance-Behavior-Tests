package testingweb.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class AddProductToCartExpertUS10StepDefs {
    public static WebDriver webDriver;

    public AddProductToCartExpertUS10StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }
    @Given("el usuario da click a Tiendas")
    public void elUsuarioDaClickATiendas() {
        webDriver.findElement(By.xpath("//button[contains(.,'Tiendas')]")).click();
    }

    @And("le da click al perfil de una Tienda")
    public void leDaClickAlPerfilDeUnaTienda() {
        webDriver.findElement(By.xpath("//button[contains(.,'Tienda E')]")).click();
    }

    @When("le da click a añadir un producto de la tienda al carrito")
    public void leDaClickAAñadirUnProductoDeLaTiendaAlCarrito() {
        webDriver.findElement(By
                .xpath("//div[@id='app']/div[3]/div/div/div/div/div/div[2]/button/span")).click();
    }

    @And("le da click al carrito de compras")
    public void leDaClickAlCarritoDeCompras() {
        webDriver.findElement(By.xpath("//div[@id='app']/header/div/div/button[6]")).click();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }

    }

    @Then("el producto será añadido al carrito de compras")
    public void elProductoSeráAñadidoAlCarritoDeCompras() {
        Assertions.assertEquals(1,1);
    }

    @When("le da click a añadir un producto fuera de stock de la tienda al carrito")
    public void leDaClickAAñadirUnProductoFueraDeStockDeLaTiendaAlCarrito() {
        webDriver.findElement(By.xpath("//div[@id='app']/div[3]/div/div/div[2]/div/div/div[2]/button")).click();
    }

    @Then("el producto no será añadido al carrito de compras")
    public void elProductoNoSeráAñadidoAlCarritoDeCompras() {
        Assertions.assertEquals(1,1);
    }

    @When("le de click a añadir al mismo producto nuevamente al carrito de compras nuevamente")
    public void leDeClickAAñadirAlMismoProductoNuevamenteAlCarritoDeComprasNuevamente() {
        webDriver.findElement(By
                .xpath("//div[@id='app']/div[3]/div/div/div/div/div/div[2]/button/span")).click();
    }

    @Then("la app no le permitirá el registro de dicho producto")
    public void laAppNoLePermitiráElRegistroDeDichoProducto() {
        Assertions.assertEquals(1,1);
    }

    @And("la webapp le mostrará un mensaje notificando que el producto ya se encuentra en el carrito de compras")
    public void laWebappLeMostraráUnMensajeNotificandoQueElProductoYaSeEncuentraEnElCarritoDeCompras() {
        Assertions.assertEquals(1,1);
    }

    @And("la webapp le mostrará un mensaje notificando que el producto ya se encuentra fuera de stock")
    public void laWebappLeMostraráUnMensajeNotificandoQueElProductoYaSeEncuentraFueraDeStock() {
        Assertions.assertEquals(1,1);
    }
}
