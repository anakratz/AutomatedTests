package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFormPage extends BasePage{
	
	public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }
	public Boolean isLogged() {
		WebDriverWait wait = new WebDriverWait(navegador, 5);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("(Sair)")));
			return navegador.findElement(By.id("gimba-header")).findElement(By.linkText("(Sair)")).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
    public LoginFormPage digitarEmail(String email) {
    	WebDriverWait wait = new WebDriverWait(navegador, 20);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("GimbaLogin")));
    	navegador.findElement(By.id("GimbaLogin")).findElement(By.id("email")).sendKeys(email);

        return this;
    }

    public LoginFormPage digitarSenha(String password) {
    	navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	navegador.findElement(By.id("GimbaLogin")).findElement(By.id("password")).sendKeys(password);
        return this;
        
    }
    
    public LoginFormPage confirmar() {
    	navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	navegador.findElement(By.id("GimbaLogin")).findElement(By.id("btnLogin")).click();

        return this;
    }

    public LoginFormPage fazerLogin(String email, String senha) {
        return digitarEmail(email)
                .digitarSenha(senha)
                .confirmar();
    }
}
