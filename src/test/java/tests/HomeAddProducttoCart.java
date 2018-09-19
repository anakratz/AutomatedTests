package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CartPage;
import pages.LoginFormPage;
import pages.LoginPage;
import utils.Web;

public class HomeAddProducttoCart {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		//driver = Web.createChrome();
		driver = Web.createFirefox();
	}

	@After
	public void tearDown() {
		//driver.quit();
	}
	/*
	@Test
	public void AddToCart() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gimba-header")));
		//Selecionar o botao de comprar de um produto que esteja disponivel
		driver.findElement(By.id("carousel-generic")).findElement(By.className("product-item")).findElement(By.id("button-11181850")).click();
		//Verificar se foi adicionado no carrinho
		//ir para o carrinho
		driver.navigate().to("http://admin:admin@ccstore-stage-zb5a.oracleoutsourcing.com/cart/");
		Assert.assertTrue(true);
	}*/
	
	@Test
	public void ClearCart() {
		String email = "demosp4pf2@mailinator.com";
		String senha = "Admin123";
		try {
			LoginFormPage page = new LoginPage(driver).clicarLogin();
			page.fazerLogin(email,senha);
		} catch (Exception e) {
			System.out.println(" FALHA NO LOGIN ");
		}
		driver.navigate().to("http://ccstore-stage-zb5a.oracleoutsourcing.com/cart/");
		CartPage page = new CartPage(driver);
		if(!(page.isEmptyCart())) {
			page.clearCart();
		}
		Assert.assertTrue(page.isEmptyCart());
	}

}
