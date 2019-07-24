package com.carles.testing;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class carlesFirst {
	
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bodas.net");
		
	}

	@After
	public void tearDown() {
		//driver.quit();
		
		
	}

	@Test
	public void test() {
		By BtnAcceder = By.cssSelector("a[href= 'https://www.bodas.net/users-login.php']");
		By campoEmailUsuario = By.id("Mail");
		By campoPassword = By.id("Password");
		By btnSubmit = By.cssSelector("button[type= 'submit']");
		By btnClose = By.cssSelector("button[type= 'button']");
		By abrirOpciones = By.cssSelector("div[class='header-joined__toggle icon-header icon-header-nav-down']");
		By abrirConfig = By.cssSelector("a[href= '/users-preferences.php']");
		By irPerfilUsuario = By.cssSelector("a[href='/com-Modif.php']");
		By cambiarNombre = By.name("Nombre");
		By saveChanges = By.name("com-ModifSubmit");
		
		
		
		driver.findElement(BtnAcceder).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(campoEmailUsuario).sendKeys("cgarro+5@bodas.net");
		driver.findElement(campoPassword).sendKeys("123456");
		driver.findElement(btnSubmit).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(btnClose).click();
		driver.findElement(abrirOpciones).click();
		driver.findElement(abrirConfig).click();
		driver.findElement(irPerfilUsuario).click();
		driver.findElement(cambiarNombre).clear();
		driver.findElement(cambiarNombre).sendKeys("Garro Cegarra");
		driver.findElement(saveChanges).click();
		assertEquals("Modificar mi perfil - Bodas.net", driver.getTitle());
		
	}
	
	/*@Test void localizadores() {
	 
	By locator = By.id("id_del_elemento");
	
	By locator_name = By.name("name_elemnt");
	
	By locator_className = By.className("clase_elemento");
	
	By locator_tagName = By.tagName("tag");
	
	By locator_linktext = By.linkText("texto_link");
	
	By locator_partialLinkText = By.partialLinkText("parte_texto");
	
	By locator_cssSelector = By.cssSelector("input[name='q']");
	
	By locator_Xpath = By.xpath("//input[@name='q']");
	
	// JavaScript
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement searchBox = (WebElement)js.executeScript("return document.getElementsByName('q')[0]");
	
}*/

}
