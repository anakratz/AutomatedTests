package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage{

	public CartPage(WebDriver navegador) {
		super(navegador);
	}
	
	public Boolean isEmptyCart() {
		try {
			WebDriverWait wait = new WebDriverWait(navegador, 5);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main")));
			WebElement element = navegador.findElement(By.id("main")).findElement(By.className("cart-title"));
			return element.isDisplayed();
		} catch (Exception e) {
			System.out.println(" CART CONTEM ITENS ");
			return false;
		}
	}
	
	public void clearCart() {
		navegador.findElement(By.xpath("//*[@id=\\\"gimbaShoppingCart_v1_v1-wi700008\\\"]/section/div/div[1]/button/span[1]")).click();
	}
}
