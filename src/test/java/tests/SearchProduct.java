package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utils.Web;

public class SearchProduct {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		//driver = Web.createChrome();
		driver = Web.createFirefox();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void searchAndAddToCart() {
		//selecionar barra de pesquisa
		
		//Digitar produto e pesquisar
				
		//Validar se a tela de busca foi aberta pelos breadcrumbs com resultados
		
		//Selecionar o comprar de um produto
		
		//Validar se foi adcionado ao carrinho
		fail("Not yet implemented");
	}
	
	@Test
	public void searchExistingProduct() {
		//selecionar barra de pesquisa
		
		//Digitar produto e pesquisar
		
		//Validar se a tela de busca foi aberta pelos breadcrumbs com resultados
		
		fail("Not yet implemented");
	}
	
	@Test
	public void searchNotExistingProduct() {
		//selecionar barra de pesquisa
		
		//Digitar produto e pesquisar
		
		//Validar se a tela de busca foi aberta pelos breadcrumbs e sem resultados
		
		fail("Not yet implemented");
	}

}
