package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public Boolean isOnHomePage() {
		return navegador.findElement(By.id("alert-page-change")).getText().equals("homePage está carregada.");
	}
}
