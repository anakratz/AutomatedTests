package utils;

import org.openqa.selenium.WebDriver;

import pages.LoginFormPage;
import pages.LoginPage;

public class LoginUtil {
	public static WebDriver fazerLogin(WebDriver driver, String email, String senha) {
		LoginFormPage page = new LoginPage(driver).clicarLogin();
		page.fazerLogin(email, senha);
		
		return driver;
	}
}
