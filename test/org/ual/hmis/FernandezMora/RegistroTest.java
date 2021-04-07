package org.ual.hmis.FernandezMora;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class RegistroTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		// Browser selector
		int browser = 0; // 0: firefox, 1: chrome,...
		Boolean headless = false;

		switch (browser) {
		case 0: // firefox
			// Firefox
			// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
			// Descomprimir el archivo geckodriver.exe en la carpeta drivers

			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			if (headless)
				firefoxOptions.setHeadless(headless);
			driver = new FirefoxDriver(firefoxOptions);

			break;
		case 1: // chrome
			// Chrome
			// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
			// Descomprimir el archivo chromedriver.exe en la carpeta drivers

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			if (headless)
				chromeOptions.setHeadless(headless);
			chromeOptions.addArguments("window-size=1920,1080");
			driver = new ChromeDriver(chromeOptions);

			break;

		default:
			fail("Please select a browser");
			break;
		}
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void iniciarSesionCorrecto() {
		// Test name: iniciarSesion-Correcto
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | type | name=username | prueba
		driver.findElement(By.name("username")).sendKeys("prueba");
		// 4 | type | name=password | 12345678
		driver.findElement(By.name("password")).sendKeys("12345678");
		// 5 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
	}

	@Test
	public void iniciarSesionIncorrectoNoCampos() {
		// Test name: iniciarSesion-Incorrecto-NoCampos
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 4 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 5 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 6 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 7 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 8 | doubleClick | css=span:nth-child(4) |
		{
			WebElement element = driver.findElement(By.cssSelector("span:nth-child(4)"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 9 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 10 | assertText | css=span:nth-child(4) | Your username and password is
		// invalid.
		assertThat(driver.findElement(By.cssSelector("span:nth-child(4)")).getText(),
				is("Your username and password is invalid."));
	}

	@Test
	public void iniciarSesionIncorrectoNoContrasenia() {
		// Test name: iniciarSesion-Incorrecto-NoContrasenia
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | type | name=username | prueba
		driver.findElement(By.name("username")).sendKeys("prueba");
		// 4 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 5 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 6 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 7 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 8 | doubleClick | css=span:nth-child(4) |
		{
			WebElement element = driver.findElement(By.cssSelector("span:nth-child(4)"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 9 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 10 | assertText | css=span:nth-child(4) | Your username and password is
		// invalid.
		assertThat(driver.findElement(By.cssSelector("span:nth-child(4)")).getText(),
				is("Your username and password is invalid."));
	}

	@Test
	public void iniciarSesionIncorrectoNoNombreUsuario() {
		// Test name: iniciarSesion-Incorrecto-NoNombreUsuario
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 4 | click | name=password |
		driver.findElement(By.name("password")).click();
		// 5 | type | name=password | 12345678
		driver.findElement(By.name("password")).sendKeys("12345678");
		// 6 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 7 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 8 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 9 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 10 | doubleClick | css=span:nth-child(4) |
		{
			WebElement element = driver.findElement(By.cssSelector("span:nth-child(4)"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 11 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 12 | assertText | css=span:nth-child(4) | Your username and password is
		// invalid.
		assertThat(driver.findElement(By.cssSelector("span:nth-child(4)")).getText(),
				is("Your username and password is invalid."));
	}

	@Test
	public void iniciarSesionIncorrectoUsuarioNoRegistrado() {
		// Test name: iniciarSesion-Incorrecto-UsuarioNoRegistrado
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | type | name=username | prueba
		driver.findElement(By.name("username")).sendKeys("prueba");
		// 4 | type | name=password | 0707
		driver.findElement(By.name("password")).sendKeys("0707");
		// 5 | sendKeys | name=password | ${KEY_ENTER}
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		// 6 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 7 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 8 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 9 | doubleClick | css=span:nth-child(4) |
		{
			WebElement element = driver.findElement(By.cssSelector("span:nth-child(4)"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 10 | click | css=span:nth-child(4) |
		driver.findElement(By.cssSelector("span:nth-child(4)")).click();
		// 11 | assertText | css=span:nth-child(4) | Your username and password is
		// invalid.
		assertThat(driver.findElement(By.cssSelector("span:nth-child(4)")).getText(),
				is("Your username and password is invalid."));
	}

	@Test
	public void registroIncorrectoContraseniaCorta() {
		// Test name: registro-Incorrecto-ContraseniaCorta
		// Step # | name | target | value
		// 1 | open | /registration |
		driver.get("http://localhost:8080/registration");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 4 | click | id=username |
		driver.findElement(By.id("username")).click();
		// 5 | type | id=username | usuario
		driver.findElement(By.id("username")).sendKeys("usuario");
		// 6 | type | id=password | 1
		driver.findElement(By.id("password")).sendKeys("1");
		// 7 | type | id=passwordConfirm | 1
		driver.findElement(By.id("passwordConfirm")).sendKeys("1");
		// 8 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 9 | click | id=password.errors |
		driver.findElement(By.id("password.errors")).click();
		// 10 | click | id=password.errors |
		driver.findElement(By.id("password.errors")).click();
		// 11 | doubleClick | id=password.errors |
		{
			WebElement element = driver.findElement(By.id("password.errors"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 12 | click | id=password.errors |
		driver.findElement(By.id("password.errors")).click();
		// 13 | assertText | id=password.errors | Try one with at least 8 characters.
		assertThat(driver.findElement(By.id("password.errors")).getText(), is("Try one with at least 8 characters."));
	}

	@Test
	public void registroIncorrectoContraseniasNoCoinciden() {
		// Test name: registro-Incorrecto-ContraseniasNoCoinciden
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | linkText=Create an account |
		driver.findElement(By.linkText("Create an account")).click();
		// 4 | type | id=username | jejejeje
		driver.findElement(By.id("username")).sendKeys("jejejeje");
		// 5 | type | id=password | 12345678
		driver.findElement(By.id("password")).sendKeys("12345678");
		// 6 | type | id=passwordConfirm | contraseniadeprueba12
		driver.findElement(By.id("passwordConfirm")).sendKeys("contraseniadeprueba12");
		// 7 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 8 | click | id=passwordConfirm.errors |
		driver.findElement(By.id("passwordConfirm.errors")).click();
		// 9 | click | id=passwordConfirm.errors |
		driver.findElement(By.id("passwordConfirm.errors")).click();
		// 10 | doubleClick | id=passwordConfirm.errors |
		{
			WebElement element = driver.findElement(By.id("passwordConfirm.errors"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 11 | click | id=passwordConfirm.errors |
		driver.findElement(By.id("passwordConfirm.errors")).click();
		// 12 | assertText | id=passwordConfirm.errors | These passwords don't match.
		assertThat(driver.findElement(By.id("passwordConfirm.errors")).getText(),
				is("These passwords don\\\'t match."));
	}

	@Test
	public void registroIncorrectoNoContrasenia() {
		// Test name: registro-Incorrecto-NoContrasenia
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 4 | click | linkText=Create an account |
		driver.findElement(By.linkText("Create an account")).click();
		// 5 | click | id=userForm |
		driver.findElement(By.id("userForm")).click();
		// 6 | click | id=password |
		driver.findElement(By.id("password")).click();
		// 7 | click | id=username |
		driver.findElement(By.id("username")).click();
		// 8 | type | id=username | prueba
		driver.findElement(By.id("username")).sendKeys("prueba");
		// 9 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 10 | click | css=.form-group:nth-child(3) |
		driver.findElement(By.cssSelector(".form-group:nth-child(3)")).click();
		// 11 | click | id=password.errors |
		driver.findElement(By.id("password.errors")).click();
		// 12 | click | id=password.errors |
		driver.findElement(By.id("password.errors")).click();
		// 13 | doubleClick | id=password.errors |
		{
			WebElement element = driver.findElement(By.id("password.errors"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 14 | click | id=password.errors |
		driver.findElement(By.id("password.errors")).click();
		// 15 | assertText | id=password.errors | This field is required.\nTry one with
		// at least 8 characters.
		assertThat(driver.findElement(By.id("password.errors")).getText(),
				is("This field is required.\\\\nTry one with at least 8 characters."));
	}

	@Test
	public void registroIncorrectoNoNombreUsuario() {
		// Test name: registro-Incorrecto-NoNombreUsuario
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | linkText=Create an account |
		driver.findElement(By.linkText("Create an account")).click();
		// 4 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 5 | click | id=password |
		driver.findElement(By.id("password")).click();
		// 6 | type | id=password | 12345678
		driver.findElement(By.id("password")).sendKeys("12345678");
		// 7 | type | id=passwordConfirm | 12345678
		driver.findElement(By.id("passwordConfirm")).sendKeys("12345678");
		// 8 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 9 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 10 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 11 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 12 | doubleClick | id=username.errors |
		{
			WebElement element = driver.findElement(By.id("username.errors"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 13 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 14 | assertText | id=username.errors | This field is required.\nPlease use
		// between 6 and 32 characters.
		assertThat(driver.findElement(By.id("username.errors")).getText(),
				is("This field is required.\\\\nPlease use between 6 and 32 characters."));
	}

	@Test
	public void registroIncorrectoNombreUsuarioCorto() {
		// Test name: registro-Incorrecto-NombreUsuarioCorto
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | linkText=Create an account |
		driver.findElement(By.linkText("Create an account")).click();
		// 4 | type | id=username | jeje
		driver.findElement(By.id("username")).sendKeys("jeje");
		// 5 | click | id=password |
		driver.findElement(By.id("password")).click();
		// 6 | type | id=password | 12345678
		driver.findElement(By.id("password")).sendKeys("12345678");
		// 7 | type | id=passwordConfirm | 12345678
		driver.findElement(By.id("passwordConfirm")).sendKeys("12345678");
		// 8 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 9 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 10 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 11 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 12 | doubleClick | id=username.errors |
		{
			WebElement element = driver.findElement(By.id("username.errors"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 13 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 14 | assertText | id=username.errors | Please use between 6 and 32
		// characters.
		assertThat(driver.findElement(By.id("username.errors")).getText(),
				is("Please use between 6 and 32 characters."));
	}

	@Test
	public void registroIncorrectoUsuarioExistente() {
		// Test name: registro-Incorrecto-UsuarioExistente
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | css=.form-heading |
		driver.findElement(By.cssSelector(".form-heading")).click();
		// 4 | click | linkText=Create an account |
		driver.findElement(By.linkText("Create an account")).click();
		// 5 | type | id=username | prueba
		driver.findElement(By.id("username")).sendKeys("prueba");
		// 6 | type | id=password | 12345678
		driver.findElement(By.id("password")).sendKeys("12345678");
		// 7 | type | id=passwordConfirm | 12345678
		driver.findElement(By.id("passwordConfirm")).sendKeys("12345678");
		// 8 | click | css=.btn |
		driver.findElement(By.cssSelector(".btn")).click();
		// 9 | click | css=.container |
		driver.findElement(By.cssSelector(".container")).click();
		// 10 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 11 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 12 | doubleClick | id=username.errors |
		{
			WebElement element = driver.findElement(By.id("username.errors"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		// 13 | click | id=username.errors |
		driver.findElement(By.id("username.errors")).click();
		// 14 | assertText | id=username.errors | Someone already has that username.
		assertThat(driver.findElement(By.id("username.errors")).getText(), is("Someone already has that username."));
	}

	@Test
	public void registrocorrecto() {
		// Test name: registro-correcto
		// Step # | name | target | value
		// 1 | open | /login |
		driver.get("http://localhost:8080/login");
		// 2 | setWindowSize | 925x692 |
		driver.manage().window().setSize(new Dimension(925, 692));
		// 3 | click | linkText=Create an account |
		driver.findElement(By.linkText("Create an account")).click();
		// 4 | click | id=username |
		driver.findElement(By.id("username")).click();
		// 5 | type | id=username | prueba
		driver.findElement(By.id("username")).sendKeys("prueba");
		// 6 | type | id=password | 12345678
		driver.findElement(By.id("password")).sendKeys("12345678");
		// 7 | type | id=passwordConfirm | 12345678
		driver.findElement(By.id("passwordConfirm")).sendKeys("12345678");
		// 8 | sendKeys | id=passwordConfirm | ${KEY_ENTER}
		driver.findElement(By.id("passwordConfirm")).sendKeys(Keys.ENTER);
		// 9 | click | css=html |
		driver.findElement(By.cssSelector("html")).click();
		// 10 | click | css=h2 |
		driver.findElement(By.cssSelector("h2")).click();
		// 11 | assertText | css=h2 | Welcome prueba | Logout
		assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Welcome prueba | Logout"));
		// 12 | click | css=h2 |
		driver.findElement(By.cssSelector("h2")).click();
		// 13 | click | css=h2 |
		driver.findElement(By.cssSelector("h2")).click();
		// 14 | click | css=h2 |
		driver.findElement(By.cssSelector("h2")).click();
		// 15 | assertText | linkText=Logout | Logout
		assertThat(driver.findElement(By.linkText("Logout")).getText(), is("Logout"));
	}
}
