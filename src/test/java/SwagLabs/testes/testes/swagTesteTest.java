package SwagLabs.testes.testes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class swagTesteTest {


    @Test
    public void inclusaoDeProdutosNoCarrinho(){
        //Informar onde o Chromedriver está no computador que irá executar o teste
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        // atribuir ao browser para abrir um novo navegador
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        //Acessar os elementos do site para executar os asserts
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.quit();
    }
    @Test
    public void selecionarViaPaginaDoProduto(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("item_4_img_link")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.quit();
    }
    @Test
    public void carrinhoSemProduto(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("checkout")).click();
        navegador.quit();
    }
    @Test
    public void checkoutSemDados(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("item_4_img_link")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("checkout")).click();
        navegador.findElement(By.id("continue")).click();
        navegador.quit();
    }
    @Test
    public void cadastroEretiradaDeProdutosNoCarrinho() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        navegador.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
        navegador.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
        navegador.findElement(By.id("continue-shopping")).click();
        navegador.quit();
    }
    @Test
    public void botaoContinuarComprando() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("continue-shopping")).click();
        navegador.quit();
    }
    @Test
    public void logoutDiretoDoCarrinho() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("react-burger-menu-btn")).click();
        navegador.findElement(By.id("logout_sidebar_link")).click();
        navegador.quit();
    }
    @Test
    public void checkouDadosInvalidos() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("checkout")).click();
        navegador.findElement(By.id("first-name")).sendKeys("@#$%¨6789");
        navegador.findElement(By.id("last-name")).sendKeys("1254");
        navegador.findElement(By.id("postal-code")).sendKeys("    ");
        navegador.findElement(By.id("continue")).click();
        navegador.findElement(By.id("finish")).click();
        navegador.quit();
    }
    @Test
    public void finalizacaoSemProdutos() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("checkout")).click();
        navegador.findElement(By.id("first-name")).sendKeys("@#$%¨6789");
        navegador.findElement(By.id("last-name")).sendKeys("1254");
        navegador.findElement(By.id("postal-code")).sendKeys("    ");
        navegador.findElement(By.id("continue")).click();
        navegador.findElement(By.id("finish")).click();
        navegador.quit();
    }
    @Test
    public void finalizacaoComTodosProdutos() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        navegador.get("https://www.saucedemo.com/");
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        navegador.findElement(By.id("login-button")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        navegador.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        navegador.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        navegador.findElement(By.id("shopping_cart_container")).click();
        navegador.findElement(By.id("checkout")).click();
        navegador.findElement(By.id("first-name")).sendKeys("Aaron");
        navegador.findElement(By.id("last-name")).sendKeys("Flyn");
        navegador.findElement(By.id("postal-code")).sendKeys("20400851");
        navegador.findElement(By.id("continue")).click();
        navegador.findElement(By.id("finish")).click();
        navegador.quit();
    }
}
