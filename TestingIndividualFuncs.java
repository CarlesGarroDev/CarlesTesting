package com.carles.testing;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class TestingIndividualFuncs {
	private WebDriver driver;
	


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedrivernew/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	
	@Test
	public void userSignInUsChrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.weddingwire.com/users-signup.php");
		By campoInsertarNombre = By.name("Nombre");
		By campoInstertarEmail = By.name("Mail");
		By campoInstertarPassword = By.name("Password");
		By campoInsertarCiudad = By.id("txtStrPoblacion");
		By campoSuggest = By.id("StrPoblacion");
		By selectDatePicker = By.name("Fecha");
		By campoYear =  By.xpath("/html/body/div[11]/div[3]/table/tbody/tr/td/span[10]");
		By campoMeses = By.xpath("/html/body/div[11]/div[2]/table/tbody/tr/td/span[12]");
		By campoDias = By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[5]/td[6]");
		
		driver.findElement(campoInsertarNombre).sendKeys("CarlesAutomateSignIn");
		driver.findElement(campoInstertarEmail).sendKeys("cgarro+55@bodas.net");
		driver.findElement(campoInstertarPassword).sendKeys("000000");
		driver.findElement(campoInsertarCiudad).sendKeys("s");
		List<WebElement> allSuggestions = driver.findElements(campoSuggest);
		//Iterator<WebElement> it = allSuggestions.iterator();
		for (int i = 0; i < allSuggestions.size(); i++) {
			
			allSuggestions.get(0).click();
		}
		driver.findElement(selectDatePicker).click();
		wait.until(ExpectedConditions.elementToBeClickable(campoYear));
		driver.findElement(campoYear).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(campoMeses));
		driver.findElement(campoMeses).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(campoDias));
		driver.findElement(campoDias).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}


}
