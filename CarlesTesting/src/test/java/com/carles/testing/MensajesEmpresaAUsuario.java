package com.carles.testing;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MensajesEmpresaAUsuario {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bodas.net/emp-Acceso.php/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		By UserEmpresa = By.id("Login");
		By PassEmpresa = By.id("Password");
		By BtnEmpresaLogin = By.cssSelector("input[class='adminAccessLogin__submit']");
		By CerrarModal = By.cssSelector("button[class='close white']");
		By ClickMensajes = By.cssSelector("a[href='/emp-AdminSolicitudes.php']");
		By SeleccionarUsuario = By.cssSelector("a[href='/emp-AdminSolicitudesShow.php?id_solicitud=20431581'");
		By SeleccionarCampoMensaje = By.cssSelector("div[class='trumbowyg-editor']");
		By EnviarMensaje = By.cssSelector("input[class='btn-flat red app-va-solic-chat-submit-btn']");
		By DropDownLogout = By.cssSelector("i[class='icon-header icon-header-arrow-down icon-right app-logged-toggle']");
		By clickLogout = By.cssSelector("a[href='https://www.bodas.net/emp-CloseSession.php']");
		By irABodas = By.cssSelector("img[src='https://cdn1.bodas.net/assets/img/logos/gen_logoHeaderPro.svg?v=4\']");
		By accesoUsuario = By.cssSelector("a[href='https://www.bodas.net/users-login.php']");
		By campoEmailUsuario = By.id("Mail");
		By campoPassword = By.id("Password");
		By btnSubmit = By.cssSelector("button[class= 'btn-flat btn-flat--big red btn-full app-ua-track-event']");
		By btnClose = By.cssSelector("button[type= 'button']");
		By abrirSolicitudes = By.cssSelector("i[class= 'icon-header icon-header-nav-envelope']");
		By abriruserMensaje = By.cssSelector("a[data-href= '/ureq.php?authsolic=20431581x09024d054081117da99a441&returnUrl=%2Fusers-mailbox.php%3Ffolder%3D1%26frmNPage%3D1%26TemasPagina%3D16%26txtSearch%3D']");
		By EnviarMensajeUsuario = By.cssSelector("input[class='btn-flat red app-ureq-form-btn']");
		
		
		
		
		
		driver.findElement(UserEmpresa).sendKeys("empresaqa");
		driver.findElement(PassEmpresa).sendKeys("000000");
		driver.findElement(BtnEmpresaLogin).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(CerrarModal).click();
		driver.findElement(ClickMensajes).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(SeleccionarUsuario).click();
		driver.findElement(SeleccionarCampoMensaje).click();
		driver.findElement(SeleccionarCampoMensaje).sendKeys("Hola, le hacemos llegar");
		driver.findElement(EnviarMensaje).click();
		Thread.sleep(500);
		driver.findElement(SeleccionarCampoMensaje).sendKeys(" la informacion que nos ha pedido");
		driver.findElement(EnviarMensaje).click();
		Thread.sleep(500);
		driver.findElement(SeleccionarCampoMensaje).sendKeys(" esto es un mensaje automatico");
		driver.findElement(EnviarMensaje).click();
		Thread.sleep(1000);
		driver.findElement(SeleccionarCampoMensaje).sendKeys(" y reproduce una conversacion Empresa-Usuario");
		driver.findElement(EnviarMensaje).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(DropDownLogout).click();
		driver.findElement(clickLogout).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(irABodas).click();
		driver.findElement(accesoUsuario).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(campoEmailUsuario).sendKeys("cgarro+99@bodas.net");
		driver.findElement(campoPassword).sendKeys("111222");
		driver.findElement(btnSubmit).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(abrirSolicitudes).click();
		driver.findElement(abriruserMensaje).click();
		Thread.sleep(1000);
		driver.findElement(SeleccionarCampoMensaje).click();
		driver.findElement(SeleccionarCampoMensaje).sendKeys("Mensajes usuario");
		driver.findElement(EnviarMensajeUsuario).click();
		Thread.sleep(500);
		driver.findElement(SeleccionarCampoMensaje).sendKeys(" a la empresa");
		driver.findElement(EnviarMensajeUsuario).click();
		Thread.sleep(500);
		driver.findElement(SeleccionarCampoMensaje).sendKeys(" para responder automaticamente");
		driver.findElement(EnviarMensajeUsuario).click();
		Thread.sleep(1000);
		driver.findElement(SeleccionarCampoMensaje).sendKeys(" y reporducir conversacion Usuario-Empresa");
		driver.findElement(EnviarMensajeUsuario).click();


		
		
		
	}

}
