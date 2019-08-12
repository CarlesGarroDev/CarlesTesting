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

public class UsRoutinesTry1 {
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
	public void Page400Chrome() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.weddingwire.com/hasfkas");
		assertEquals("Page not found - WeddingWire.com", driver.getTitle());
		
	}
	@Test
	public void Page400Firefox() {
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
		driver.get("https://www.weddingwire.com/hasfkas");
		assertEquals("Page not found - WeddingWire.com", driver.getTitle());
	}
	
	@Test
	public void noLoginSendRequestChrome(){
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.weddingwire.com/biz/jelwery-glam/4b7ebd73d077039c.html");
		By campoRequestNombre = By.id("SolicNombre");
		By campoRequestMail = By.id("SolicMail");
		By selectDatePicker = By.id("SolicFecha");
		By messageArea = By.name("Comentario");
		By optionEmail = By.id("contact-email");
		By selectRol = By.className("app-role-selector");
		By botonRequest = By.xpath("//*[@id=\"contact-emp\"]/form/input[11]");
		By campoYear =  By.xpath("/html/body/div[24]/div[3]/table/tbody/tr/td/span[8]");
		By campoMeses = By.xpath("/html/body/div[24]/div[2]/table/tbody/tr/td/span[12]");
		By campoDias = By.xpath("/html/body/div[24]/div[1]/table/tbody/tr[4]/td[4]");
		
		driver.findElement(campoRequestNombre).sendKeys("CarlesAutomationChrome");
		driver.findElement(campoRequestMail).sendKeys("cgarrobodas+20@gmail.com");
		driver.findElement(selectDatePicker).click();
		wait.until(ExpectedConditions.elementToBeClickable(campoYear));
		driver.findElement(campoYear).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(campoMeses));
		driver.findElement(campoMeses).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(campoDias));
		driver.findElement(campoDias).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try {
			WebElement clickOrNo = wait.until(ExpectedConditions.elementToBeClickable(optionEmail));
			clickOrNo.click();
			
		} catch (TimeoutException catchFail) {
			System.out.println("10 segundos! El elemento no es clickable");
		}
		WebElement campoRoles = driver.findElement(selectRol);
		if (campoRoles.isDisplayed() && campoRoles.isEnabled()) {
			Select finalistaRoles = new Select(driver.findElement(selectRol));
			finalistaRoles.selectByVisibleText("Groom");
		}
		driver.findElement(messageArea).sendKeys("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
	
		
		driver.findElement(botonRequest).click();
		
	}
	
	
	@Test
	public void noLoginSendRequestFirefox() {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.weddingwire.com/biz/jelwery-glam/4b7ebd73d077039c.html");
		By campoRequestNombre = By.id("SolicNombre");
		By campoRequestMail = By.id("SolicMail");
		By selectDatePicker = By.id("SolicFecha");
		By messageArea = By.name("Comentario");
		By optionEmail = By.id("contact-email");
		By selectRol = By.className("app-role-selector");
		By botonRequest = By.xpath("//*[@id=\"contact-emp\"]/form/input[11]");
		By campoYear =  By.xpath("/html/body/div[24]/div[3]/table/tbody/tr/td/span[8]");
		By campoMeses = By.xpath("/html/body/div[24]/div[2]/table/tbody/tr/td/span[12]");
		By campoDias = By.xpath("/html/body/div[24]/div[1]/table/tbody/tr[4]/td[4]");
		
		driver.findElement(campoRequestNombre).sendKeys("CarlesAutomationFirefox");
		driver.findElement(campoRequestMail).sendKeys("cgarrobodas+28@gmail.com");
		driver.findElement(selectDatePicker).click();
		wait.until(ExpectedConditions.elementToBeClickable(campoYear));
		driver.findElement(campoYear).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(campoMeses));
		driver.findElement(campoMeses).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(campoDias));
		
		driver.findElement(campoDias).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);;
		
		try {
			WebElement clickOrNo = wait.until(ExpectedConditions.elementToBeClickable(optionEmail));
			clickOrNo.click();
			
		} catch (TimeoutException catchFail) {
			System.out.println("10 segundos! El elemento no es clickable");
		}
		
		WebElement campoRoles = driver.findElement(selectRol);
		if (campoRoles.isDisplayed() && campoRoles.isEnabled()) {
			Select finalistaRoles = new Select(driver.findElement(selectRol));
			finalistaRoles.selectByVisibleText("Groom");
		}
		
		driver.findElement(messageArea).sendKeys("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
		
		driver.findElement(botonRequest).click();
		
	}
	@Test
	public void userSignInUsChrome() {
		driver.get("https://www.weddingwire.com/users-signup.php");
		By campoInsertarNombre = By.name("Nombre");
		By campoInstertarEmail = By.name("Mail");
		By campoInstertarPassword = By.name("Password");
		By campoInsertarCiudad = By.id("txtStrPoblacion");
		
		driver.findElement(campoInsertarNombre).sendKeys("CarlesAutomateSignIn");
		driver.findElement(campoInstertarEmail).sendKeys("cgarro+55@bodas.net");
		driver.findElement(campoInstertarPassword).sendKeys("000000");
		driver.findElement(campoInsertarCiudad).sendKeys("s");
		List<WebElement> allSuggestions = driver.findElements(campoInsertarCiudad);
		//Iterator<WebElement> it = allSuggestions.iterator();
		for (int i = 0; i < allSuggestions.size(); i++) {
			
			allSuggestions.get(2).click();
		}
		
		
		//driver.findElement(btnSubmit).click();
		
	}


}
