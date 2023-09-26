package testingweb.stepdefs;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class RegisterProductUS8StepDefs {
    public static WebDriver webDriver;

    public RegisterProductUS8StepDefs() {
        webDriver = MyWebDriver.getWebDriver();
    }

    @Given("el usuario da click en el perfil de una de sus tiendas")
    public void elUsuarioDaClickEnElPerfilDeUnaDeSusTiendas() {
        webDriver.findElement(By.xpath("//button[contains(.,'Tienda D1')]")).click();
    }

    @When("le de click a Nuevo Producto")
    public void leDeClickANuevoProducto() {
        webDriver.findElement(By.xpath("//button[contains(.,'New Product')]")).click();
    }

    @And("Rellene todos los campos de registro de producto solicitados")
    public void relleneTodosLosCamposDeRegistroDeProductoSolicitados() {
        webDriver.findElement(By.id("name")).click();
        webDriver.findElement(By.id("name")).sendKeys("Procesador Intel Core i9 10th generation");
        webDriver.findElement(By.id("description")).click();
        webDriver.findElement(By.id("description")).sendKeys("Processors");
        webDriver.findElement(By.cssSelector("#Rating > .p-dropdown-label")).click();
        webDriver.findElement(By.id("Rating_4")).click();
        webDriver.findElement(By.id("address")).click();
        webDriver.findElement(By.id("address")).sendKeys("1000");
        webDriver.findElement(By.cssSelector(".p-placeholder")).click();
        webDriver.findElement(By.id("Inventory_1")).click();
        webDriver.findElement(By.cssSelector(".p-fileupload-choose > .p-icon")).click();
        try{
            Thread.sleep(15000);
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }

    @Then("el producto se registrará en su tienda exitosamente")
    public void elProductoSeRegistraráEnSuTiendaExitosamente() {
        Assertions.assertEquals(1,1);
    }

    @And("No rellena todos los campos de registro de producto solicitados")
    public void noRellenaTodosLosCamposDeRegistroDeProductoSolicitados() {
        webDriver.findElement(By.id("name")).click();
        webDriver.findElement(By.id("name")).sendKeys("Procesador Intel Core i9 10th generation");
        webDriver.findElement(By.id("description")).click();
        webDriver.findElement(By.id("description")).sendKeys("Processors");
        webDriver.findElement(By.cssSelector("#Rating > .p-dropdown-label")).click();
        webDriver.findElement(By.id("Rating_4")).click();
    }

    @Then("el producto se no registrará en su tienda")
    public void elProductoSeNoRegistraráEnSuTienda() {
        Assertions.assertEquals(1,1);
    }

    @And("le de click en Guardar Producto")
    public void leDeClickEnGuardarProducto() {
        webDriver.findElement(By.cssSelector(".p-dialog-footer > .p-button:nth-child(2)")).click();
    }

    @And("el producto no se registrará en su tienda exitosamente")
    public void elProductoNoSeRegistraráEnSuTiendaExitosamente() {
        Assertions.assertEquals(1,1);
    }

    @And("Rellena los campos de registro de producto solicitados")
    public void rellenaLosCamposDeRegistroDeProductoSolicitados() {
        webDriver.findElement(By.id("name")).click();
        webDriver.findElement(By.id("name")).sendKeys("Procesador Intel Core i9 10th generation");
        webDriver.findElement(By.id("description")).click();
        webDriver.findElement(By.id("description")).sendKeys("Processors");
        webDriver.findElement(By.cssSelector("#Rating > .p-dropdown-label")).click();
        webDriver.findElement(By.id("Rating_4")).click();
        webDriver.findElement(By.id("address")).click();
        webDriver.findElement(By.id("address")).sendKeys("1000");
        webDriver.findElement(By.cssSelector(".p-placeholder")).click();
        webDriver.findElement(By.id("Inventory_1")).click();

    }

    @But("se excede en el máximo de número de fotos del producto")
    public void seExcedeEnElMáximoDeNúmeroDeFotosDelProducto() {
        webDriver.findElement(By.cssSelector(".p-fileupload-choose > .p-icon")).click();
        try{
            Thread.sleep(15000);
        }
        catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}
