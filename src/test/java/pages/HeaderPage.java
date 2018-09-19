package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage {

	public HeaderPage(WebDriver navegador) {
	        super(navegador);
	    }

	public String getUsuarioLogado(WebDriver navegador) {
		String nomeUsuario = navegador.findElement(By.linkText("")).getTagName();
		
		return nomeUsuario;
	}
}
