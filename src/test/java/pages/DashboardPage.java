package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage{
	public DashboardPage(WebDriver navegador) {
        super(navegador);
    }

    public Boolean isOnDashboardPage() {
    	WebDriverWait wait = new WebDriverWait(navegador, 5);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header-venda-assistida_v1_v1-wi200029")));
			return navegador.findElement(By.id("header-venda-assistida_v1_v1-wi200029")).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
}
