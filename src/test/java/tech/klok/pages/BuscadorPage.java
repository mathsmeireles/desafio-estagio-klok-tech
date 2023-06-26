package tech.klok.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscadorPage {
    private WebDriver driver;
    private By texbox_busca = By.id("twotabsearchtextbox");
    private By btn_buscar = By.id("nav-search-submit-button");
    private By busca_info = By.id("sg-col-inner");

    public BuscadorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void escreverTextoNaBusca(String texto) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(texto);
    }

    public void clicarEmBuscar() {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public String resultado() {
        String resultado = driver.findElement(By.className("sg-col-inner")).getText();
        return resultado;
    }
}
