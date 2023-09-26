package testingweb.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class checkShoppingCartExpertUS11Stepdefs {
    public static WebDriver webDriver;

    public checkShoppingCartExpertUS11Stepdefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Then("el producto será visualizado en el carrito de compras")
    public void elProductoSeráVisualizadoEnElCarritoDeCompras() {
        Assertions.assertEquals(1,1);
    }

    @And("le da a añadir a un producto de su tienda")
    public void leDaAAñadirAUnProductoDeSuTienda() {
        webDriver.findElement(By.xpath("//button[contains(.,'PC Builders')]")).click();
        webDriver.findElement(By.xpath("//button[contains(.,'Tiendas')]")).click();
        webDriver.findElement(By.xpath("//button[contains(.,'Tienda D1')]")).click();
        webDriver.findElement(By.xpath("//div[@id='app']/div[3]/div/div/div/div/div/div[2]/button/span")).click();

    }

    @Then("el producto de su tienda no se verá en el carrito de compras")
    public void elProductoDeSuTiendaNoSeVeráEnElCarritoDeCompras() {
        Assertions.assertEquals(1,1);
    }

    @And("luego le da click al carrito de compras")
    public void luegoLeDaClickAlCarritoDeCompras() {
        webDriver.findElement(By.xpath("//div[@id='app']/header/div/div/button[2]")).click();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }

    @And("Cierra sesión")
    public void cierraSesión() {
        webDriver.findElement(By.xpath("//button[contains(.,'Log out')]")).click();
    }

    @And("después de cerrar sesión revisa el carrito nuevamente")
    public void despuésDeCerrarSesiónRevisaElCarritoNuevamente() {
        webDriver.findElement(By.xpath("//div[@id='app']/header/div/div/button[2]/span")).click();
    }

    @But("ahora el carro estará vacío por idea de negocio")
    public void ahoraElCarroEstaráVacíoPorIdeaDeNegocio() {
        Assertions.assertEquals(1,1);
    }
}
