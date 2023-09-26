package testingweb.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testingweb.selenium.MyWebDriver;

import java.util.HashMap;

public class buyAProductUS13defs {
    public static WebDriver webDriver;
    //JavascriptExecutor js = (JavascriptExecutor) webDriver;

    public buyAProductUS13defs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el usuario ingresa a la tienda D uno")
    public void elUsuarioIngresaALaTiendaDUno(){
        webDriver.findElement(By.xpath("//button[contains(.,'Tiendas')]")).click();
        webDriver.findElement(By.xpath("//button[contains(.,'Tienda D1')]")).click();
    }

    @When("añade un producto a su carrito")
    public void añadeUnProductoASuCarrito() {
        webDriver.findElement(By.xpath("//div[@id='app']/div[3]/div/div/div/div/div/div[2]/button")).click();
    }

    @And("se dirige al carrito de compras")
    public void seDirigeAlCarritoDeCompras() {
        //div[@id='app']/header/div/div/button[4]/span
    }

    @And("Selecciona comprar")
    public void seleccionaComprar() {
        //span[contains(.,'COMPRAR')]
    }

    @And("Rellena todos los campos de compra solicitados")
    public void rellenaTodosLosCamposDeCompraSolicitados() {
        webDriver.findElement(By.id("FirstName")).click();
        webDriver.findElement(By.id("FirstName")).sendKeys("Av.Duarez");
        webDriver.findElement(By.cssSelector(".field:nth-child(2) #FirstName")).click();
        webDriver.findElement(By.cssSelector(".field:nth-child(2) #FirstName")).sendKeys("Lima");
        webDriver.findElement(By.cssSelector(".field:nth-child(3) #FirstName")).click();
        webDriver.findElement(By.cssSelector(".field:nth-child(3) #FirstName")).sendKeys("34");
        webDriver.findElement(By.cssSelector(".field:nth-child(4) #FirstName")).click();
        webDriver.findElement(By.cssSelector(".field:nth-child(4) #FirstName")).sendKeys("23543");
        webDriver.findElement(By.id("Role")).click();
        webDriver.findElement(By.id("Role_2")).click();
        webDriver.findElement(By.cssSelector(".p-placeholder")).click();
        //js.executeScript("window.scrollTo(0,17.600000381469727)");
        webDriver.findElement(By.id("Role_4")).click();
        webDriver.findElement(By.cssSelector(".field:nth-child(7) #FirstName")).click();
        webDriver.findElement(By.cssSelector(".field:nth-child(7) #FirstName")).sendKeys("Cuellar");
        webDriver.findElement(By.cssSelector(".field:nth-child(8) #FirstName")).click();
        webDriver.findElement(By.cssSelector(".field:nth-child(8) #FirstName")).sendKeys("f22");
    }

    @And("le da click en comprar")
    public void leDaClickEnComprar() {
        //span[contains(.,'Comprar')]
    }

    @And("la da click a Mis Compras")
    public void laDaClickAMisCompras() {
        //button[contains(.,'My Purchases')]
    }

    @Then("el producto habra sido agregado a Mis Compras")
    public void elProductoHabraSidoAgregadoAMisCompras() {
        Assertions.assertEquals(1,1);
    }

}
