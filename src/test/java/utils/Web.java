package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Web {
	
	static DesiredCapabilities capability = new DesiredCapabilities();
	
	public static WebDriver createChrome() {
		// Abrindo o navegador
		capability = DesiredCapabilities.chrome();
		System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("test-type");
	    options.addArguments("allow-running-insecure-content");
	    capability.setCapability(ChromeOptions.CAPABILITY, options);
	    WebDriver driver = new ChromeDriver(capability);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navegando para a página da Gimba!
		driver.manage().window().maximize();
		driver.navigate().to("http://admin:admin@ccstore-test-zb5a.oracleoutsourcing.com/home/");
		
		return driver;
	}
	
	public static WebDriver createFirefox() {
		// Abrindo o navegador
		capability = DesiredCapabilities.firefox();
		System.setProperty("webdriver.gecko.driver", "c:\\webdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(capability);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navegando para a página da Gimba!
		driver.manage().window().maximize();
		driver.navigate().to("http://admin:admin@ccstore-stage-zb5a.oracleoutsourcing.com/home/");

		//Autenticacao OCC
		driver.switchTo().alert().sendKeys("admin"+Keys.TAB+"admin");
		driver.switchTo().alert().accept();
		
		return driver;
	}
}
