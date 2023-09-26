package testingweb.stepdefs;

import io.cucumber.java.en.But;
import org.openqa.selenium.WebDriver;
import testingweb.selenium.MyWebDriver;

public class checkShoppingCartInexpertUS12 {
    public static WebDriver webDriver;

    public checkShoppingCartInexpertUS12() {
        webDriver = MyWebDriver.getWebDriver();
    }
}
