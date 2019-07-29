package com.carles.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ConfirmarInvitados {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.weddingwire.ca/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		By loginUser = By.cssSelector("a[href='https://www.weddingwire.ca/users-login.php']");
		By campoUserLogin = By.id("Mail");
		By campoUserPassword = By.id("Password");
		By abrirMenuUser = By.cssSelector("img[class='avatar-thumb']");
		By invitadoConfirmar = By.cssSelector("span[class='app-input-label input-select-label input-filled']");
	
		By btnLogin = By.cssSelector("button[class='btn-flat btn-flat--big red btn-full app-ua-track-event']");
		
		
		driver.findElement(loginUser).click();
		driver.findElement(campoUserLogin).sendKeys("cgarro@bodas.net");
		driver.findElement(campoUserPassword).sendKeys("123456");
		driver.findElement(btnLogin).click();
		Thread.sleep(500);
		driver.findElement(abrirMenuUser).click();
		By irGuests = By.cssSelector("a[href='https://www.weddingwire.ca/tools/Guests']");
		driver.findElement(irGuests).click();
		Thread.sleep(500);
		driver.findElement(invitadoConfirmar).click();
		Thread.sleep(1000);
		By cambiarEstadoConfirmado = By.cssSelector("li[data-value='0']");
		driver.findElement(cambiarEstadoConfirmado).click();
		
	}

}
