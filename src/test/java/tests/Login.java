package tests;

import java.util.concurrent.TimeUnit;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pages.DashboardPage;
import pages.LoginFormPage;
import pages.LoginPage;
import utils.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "C:\\Projects\\AutomatedTests\\src\\test\\java\\resources\\LoginTestData.csv")
public class Login {

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
	public void testPJuser(@Param(name="email")String email, @Param(name="senha")String senha) {
		LoginFormPage page = new LoginPage(driver).clicarLogin();
		//Preencher dados e acionar Login
		page.fazerLogin(email,senha);
		//Validar se esta na homepage com o usuario no header
		Assert.assertTrue(page.isLogged());
	}
	@Test
	public void testPJuserFail() {
		LoginFormPage page = new LoginPage(driver).clicarLogin();
		//Preencher dados e acionar Login
		String teste= "teste";
		page.fazerLogin(teste,teste);
		//Validar se esta na homepage com o usuario no header
		Assert.assertFalse(page.isLogged());
	}/*
	@Test
	public void testPFuser(@Param(name="email")String email, @Param(name="senha")String senha) {
		//Apertar botao de login
		LoginFormPage page = new LoginPage(driver).clicarLogin();
		//Preencher dados e acionar Login
		page.fazerLogin(email,senha);
		
		//Validar se esta na homepage com o usuario no header
		Assert.assertTrue(true);
		//Assert.assertTrue(new HomePage(driver).isOnHomePage());
	}*/
	
	@Test
	public void testVendoruser(@Param(name="email")String email, @Param(name="senha")String senha) {
		//Apertar botao de login
		LoginFormPage page = new LoginPage(driver).clicarLogin();
		//Preencher dados e acionar Login
		page.fazerLogin(email,senha);
		//Validar se esta na homepage com o usuario no header
		Assert.assertTrue(new DashboardPage(driver).isOnDashboardPage());
	}

}
