package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage clicarLogin() {
    	WebDriverWait wait = new WebDriverWait(navegador, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLoginCadastrar")));
        navegador.findElement(By.id("btnLoginCadastrar")).click();
        return new LoginFormPage(navegador);
    }
}
