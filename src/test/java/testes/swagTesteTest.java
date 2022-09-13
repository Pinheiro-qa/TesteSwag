package testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class swagTesteTest {
    @Test
    public void entrarNoSwagLabs(){
        //ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        // Informar onde o chromedriver está
        System.setProperty("webdriver.chrome.driver", "F:\\Tutorial_Chrome_Driver\\chromedriver.exe");
        // atribuir ao navegador para abrir um novo navegador
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("checkout")).click();
        navegador.findElement(By.id("first-name")).sendKeys("Joe");
        navegador.findElement(By.id("last-name")).sendKeys("Pinetree");
        navegador.findElement(By.id("postal-code")).sendKeys("60175047");
        navegador.findElement(By.id("continue")).click();
        navegador.findElement(By.id("finish")).click();
        navegador.findElement(By.id("back-to-products")).click();
    }
}
