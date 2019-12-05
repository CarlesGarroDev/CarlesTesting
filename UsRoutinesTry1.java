package com.carles.testing;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class UsRoutinesTry1 {
	private WebDriver driver;
	


	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedrivernew/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver78/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	@Test
	public void APage400Chrome() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.weddingwire.com/hasfkas");
		assertEquals("Page not found - WeddingWire.com", driver.getTitle());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	@Test
	public void DPage400Firefox() {
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
		driver.get("https://www.weddingwire.com/hasfkas");
		assertEquals("Page not found - WeddingWire.com", driver.getTitle());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Test
	public void BnoLoginSendRequestChrome(){
		
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
		driver.findElement(messageArea).sendKeys("..··..·>> 05/12/2019 lorem daily changes whats played has been the industry's standard dummy text ever since the 1500s");
	
		
		driver.findElement(botonRequest).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
	
	@Test
	public void EnoLoginSendRequestFirefox() {
		
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
		
		driver.findElement(messageArea).sendKeys("..··..>> 05/12/2019 changes to change it more changes to test push notifications!! en Lorem Ipsum has been the industry's standard dummy text ever since the 1500s");
		
		driver.findElement(botonRequest).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
	@Test
	public void CuserSignInUsChrome() {
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
		By btnSubmit = By.id("app-register-btn");
		
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
		
		driver.findElement(btnSubmit).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		
	}
	
	
	@Test
	public void userSignInUsFirefox() {
		driver = new FirefoxDriver();
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
		By btnSubmit = By.id("app-register-btn");
		
		driver.findElement(campoInsertarNombre).sendKeys("CarlesAutomateSignIn");
		driver.findElement(campoInstertarEmail).sendKeys("cgarro+55@bodas.net");
		driver.findElement(campoInstertarPassword).sendKeys("000000");
		driver.findElement(campoInsertarCiudad).sendKeys("s");
		List<WebElement> allSuggestions = driver.findElements(campoSuggest);
		//Iterator<WebElement> it = allSuggestions.iterator();
		for (int i = 0; i < allSuggestions.size(); i++) {
			//wait.until(ExpectedConditions.elementToBeClickable(campoSuggest));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		
		driver.findElement(btnSubmit).click();
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.quit();
		
		
	}
	
	@Test
	public void GLoginChrome(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.weddingwire.com/users-login.php");
		By campoEmailUsuario = By.id("Mail");
		By campoPassword = By.id("Password");
		By btnSubmit = By.cssSelector("button[type= 'submit']");
		
		driver.findElement(campoEmailUsuario).sendKeys("cgarro+55@bodas.net");
		driver.findElement(campoPassword).sendKeys("000000");
		driver.findElement(btnSubmit).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
	@Test
	public void HLoginFirefox(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.weddingwire.com/users-login.php");
		By campoEmailUsuario = By.id("Mail");
		By campoPassword = By.id("Password");
		By btnSubmit = By.cssSelector("button[type= 'submit']");
		
		driver.findElement(campoEmailUsuario).sendKeys("cgarro+55@bodas.net");
		driver.findElement(campoPassword).sendKeys("000000");
		driver.findElement(btnSubmit).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
	@Test
	public void GoogleSignInFirefox() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		By btnAccesoGoogle = By.xpath("//*[@id=\"app-signup-layer-content\"]/div[1]/div/button[2]");
		
		
		driver.get("https://www.weddingwire.com/users-signup.php");
		Thread.sleep(1500);
		driver.findElement(btnAccesoGoogle).click();
		Thread.sleep(1500);
		//Get current
		String winHandle = driver.getWindowHandle();
		
		//Get List of windows
		ArrayList pestañas = new ArrayList (driver.getWindowHandles());
		System.out.println(pestañas.size());
		
		//Use the list to get the position and move to it
		driver.switchTo().window((String) pestañas.get(1));
	
		By campoEmailGoogle = By.cssSelector("input[type='email']");
		By btnNextToPass = By.cssSelector("span[class='RveJvd snByac']");
		By campoPassGoogle = By.cssSelector("input[type='password']");
		By posibleModal = By.xpath("//*[@id=\"app-common-layer\"]/div/div/div[1]/button");
		By cerrarModalRef = By.xpath("//*[@id=\"formVicularCuenta\"]/div[1]/div[2]/button");
		
		driver.findElement(campoEmailGoogle).sendKeys("cgarrobodas@gmail.com");
		driver.findElement(btnNextToPass).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(campoPassGoogle));
		driver.findElement(campoPassGoogle).sendKeys("uni-5001");
		driver.findElement(btnNextToPass).click();
		driver.switchTo().window((String) pestañas.get(0));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cerrarModalRef));
		WebElement ModalAccion = driver.findElement(posibleModal);
		if (ModalAccion.isDisplayed() && ModalAccion.isEnabled()) {
			ModalAccion.click();
		};
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		
			}
	@Test
	public void GoogleSignInChrome() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		By btnAccesoGoogle = By.xpath("//*[@id=\"app-signup-layer-content\"]/div[1]/div/button[2]");

		driver.get("https://www.weddingwire.com/users-signup.php");
		Thread.sleep(1500);
		driver.findElement(btnAccesoGoogle).click();
		Thread.sleep(1500);
		// Get current
		String winHandle = driver.getWindowHandle();

		// Get List of windows
		ArrayList pestañas = new ArrayList(driver.getWindowHandles());
		System.out.println(pestañas.size());

		// Use the list to get the position and move to it
		driver.switchTo().window((String) pestañas.get(1));

		By campoEmailGoogle = By.cssSelector("input[type='email']");
		By btnNextToPass = By.cssSelector("span[class='RveJvd snByac']");
		By campoPassGoogle = By.cssSelector("input[type='password']");
		// By posibleModal =
		// By.xpath("//*[@id=\"app-common-layer\"]/div/div/div[1]/button");
		By posibleModal = By.xpath("//*[@id=\"app-common-layer\"]/div/div/div[1]/button");
		By cerrarModalRef = By.xpath("//*[@id=\"formVicularCuenta\"]/div[1]/div[2]/button");

		driver.findElement(campoEmailGoogle).sendKeys("cgarrobodas@gmail.com");
		driver.findElement(btnNextToPass).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(campoPassGoogle));
		driver.findElement(campoPassGoogle).sendKeys("uni-5001");
		driver.findElement(btnNextToPass).click();
		driver.switchTo().window((String) pestañas.get(0));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cerrarModalRef));
		WebElement ModalAccion = driver.findElement(posibleModal);
		if (ModalAccion.isDisplayed() && ModalAccion.isEnabled()) {
			ModalAccion.click();
		}
		;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}
	
	@Test
	public void vendorSignInChrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.weddingwire.com/vendors/home");
		
		By CompanyName = By.name("company");
		By PostalCode = By.name("zip_code");
		Select selectCategory = new Select (driver.findElement(By.name("Category__c")));
		By btnNextVendors = By.xpath("//*[@id=\"app-contact-form\"]/form/div/div[1]/div[7]/button");
		By firstName = By.name("first_name");
		By lastName = By.name("last_name");
		By phoneNum = By.name("phone");
		By mailVendor = By.name("email");
		By btnGetInTouch = By.xpath("//*[@id=\"app-contact-form\"]/form/div/div[2]/div[12]/button");
		
		driver.findElement(CompanyName).sendKeys("Empresa CarlesQA");
		driver.findElement(PostalCode).sendKeys("08012");
		selectCategory.selectByIndex(5);
		driver.findElement(btnNextVendors).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(firstName).sendKeys("Carles");
		driver.findElement(lastName).sendKeys("CarlQA");
		driver.findElement(phoneNum).sendKeys("999888777");
		driver.findElement(mailVendor).sendKeys("cgarrobodas@gmail.com");
		driver.findElement(btnGetInTouch).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
	
	@Test
	public void vendorSignInFirefox() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.weddingwire.com/vendors/home");
		
		By CompanyName = By.name("company");
		By PostalCode = By.name("zip_code");
		Select selectCategory = new Select (driver.findElement(By.name("Category__c")));
		By btnNextVendors = By.xpath("//*[@id=\"app-contact-form\"]/form/div/div[1]/div[7]/button");
		By firstName = By.name("first_name");
		By lastName = By.name("last_name");
		By phoneNum = By.name("phone");
		By mailVendor = By.name("email");
		By btnGetInTouch = By.xpath("//*[@id=\"app-contact-form\"]/form/div/div[2]/div[12]/button");
		
		driver.findElement(CompanyName).sendKeys("Empresa CarlesQA");
		driver.findElement(PostalCode).sendKeys("08012");
		selectCategory.selectByIndex(5);
		driver.findElement(btnNextVendors).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(firstName).sendKeys("Carles");
		driver.findElement(lastName).sendKeys("CarlQA");
		driver.findElement(phoneNum).sendKeys("999888777");
		driver.findElement(mailVendor).sendKeys("cgarrobodas@gmail.com");
		driver.findElement(btnGetInTouch).click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	@Test
	@Ignore
	
	public void postReviewFirefox(){
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 180);
	driver.get("https://www.weddingwire.com/users-login.php");
	By campoEmailUsuario = By.id("Mail");
	By campoPassword = By.id("Password");
	By btnSubmit = By.cssSelector("button[type= 'submit']");
	By comprobarLogin = By.xpath("//*[@id=\"uploadContainer\"]/div[2]/div/a");
	By estrellita1 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[1]/div[2]/div/span[5]");
	By estrellita2 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[2]/div[2]/div/span[5]");
	By estrellita3 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[3]/div[2]/div/span[5]");
	By estrellita4 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[4]/div[2]/div/span[5]");
	By estrellita5 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[5]/div[2]/div/span[5]");
	By btnNextRating = By.xpath("/html/body/div[1]/div[2]/div/div[3]/button[2]");
	By reviewTitle = By.name("tituloOpinion");
	By cuadroTexto = By.name("opinion");
	By btnOpinionNext = By.xpath("/html/body/div[1]/div[2]/div/div[3]/button[2]");
	By btnPasarDelPrecio = By.xpath("/html/body/div[1]/div[2]/div/div[3]/button[2]"); 
	By comprobarCambioPaginaFotos = By.xpath("/html/body/div[1]/div[2]/div/div[1]/p");
	By fotoComprobarProceso = By.cssSelector("img[src='https://cdn0.weddingwire.com/emp/fotos/7/3/3/9/1/0/t20_alfonso-lorenzetto-703636-unsplash_51_1019337.jpg']");
	By inputHidden = By.cssSelector("[accept]");
	By checkBtnConfirmar = By.className("iCheck-helper");
	By btnPost = By.cssSelector("button[type='submit']");
	By fotoSubida = By.id("upload_4img");
	By posibleModal = By.cssSelector("button[class='close']");
	
	driver.findElement(campoEmailUsuario).sendKeys("cgarrobodas@gmail.com");
	driver.findElement(campoPassword).sendKeys("000000");
	driver.findElement(btnSubmit).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(comprobarLogin));
	driver.get("https://www.weddingwire.com/shared/rate/new?vid=4b7ebd73d077039c");
	driver.findElement(estrellita1).click();
	driver.findElement(estrellita2).click();
	driver.findElement(estrellita3).click();
	driver.findElement(estrellita4).click();
	driver.findElement(estrellita5).click();
	driver.findElement(btnNextRating).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(reviewTitle));
	driver.findElement(reviewTitle).sendKeys("El titulo es importante");
	driver.findElement(cuadroTexto).sendKeys("Write at least 30 characters about your experience. Include any details that will help other couples make their hiring decision.");
	driver.findElement(btnOpinionNext).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(btnPasarDelPrecio));
	driver.findElement(btnPasarDelPrecio).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(comprobarCambioPaginaFotos));
	// C:\Users\cgarro\Desktop\Wedshoots\19958465_wedshoots.jpg
	
	//HOW TO CHANGE STYLES WITH JAVACRIPT USING SELENIUM
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("document.getElementsByClassName('moxie-shim moxie-shim-html5')[0].style.overflow='visible'");
	//js.executeScript("document.getElementsByClassName('moxie-shim moxie-shim-html5')[0].style.top='40px'");
	//js.executeScript("document.getElementsByClassName('moxie-shim moxie-shim-html5')[0].style.width='40px'");
	//js.executeScript("document.getElementsByClassName('moxie-shim moxie-shim-html5')[0].style.height='40px'");
	//js.executeScript("document.getElementsByClassName('moxie-shim moxie-shim-html5')[0].style.height='40px'");
	//js.executeScript("document.querySelector('[accept]').style.opacity='100'");
	
	
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(inputHidden));
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958465_wedshoots.jpg");
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958463_wedshoots.jpg");
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958457_wedshoots.jpg");
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958459_wedshoots.jpg");
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958461_wedshoots.jpg");
	
	driver.findElement(checkBtnConfirmar).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(fotoSubida));
	driver.findElement(btnPost).click();
/*		try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (posibleModal == null){
		System.out.println("No hay que realizar acción");
	}else {
		driver.findElement(posibleModal).click();
	}   */
	try {
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(posibleModal)) == null) {
			System.out.println("No modal or alert is present");
		}else {
			driver.findElement(posibleModal).click();
		}
		
	} catch (Exception e) {
		System.out.println("No aparece niguna modal!");
	}
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(fotoComprobarProceso));
	
	assertEquals("My Booked Vendors - WeddingWire.com", driver.getTitle());
	
	driver.quit();
	

}

@Test
@Ignore
public void postReviewChrome(){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 180);
	driver.get("https://www.weddingwire.com/users-login.php");
	By campoEmailUsuario = By.id("Mail");
	By campoPassword = By.id("Password");
	By btnSubmit = By.cssSelector("button[type= 'submit']");
	By comprobarLogin = By.xpath("//*[@id=\"uploadContainer\"]/div[2]/div/a");
	By estrellita1 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[1]/div[2]/div/span[5]");
	By estrellita2 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[2]/div[2]/div/span[5]");
	By estrellita3 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[3]/div[2]/div/span[5]");
	By estrellita4 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[4]/div[2]/div/span[5]");
	By estrellita5 = By.xpath("//*[@id=\"app-review-form\"]/section[2]/div[3]/div[5]/div[2]/div/span[5]");
	By btnNextRating = By.xpath("/html/body/div[1]/div[2]/div/div[3]/button[2]");
	By reviewTitle = By.name("tituloOpinion");
	By cuadroTexto = By.name("opinion");
	By btnOpinionNext = By.xpath("/html/body/div[1]/div[2]/div/div[3]/button[2]");
	By btnPasarDelPrecio = By.xpath("/html/body/div[1]/div[2]/div/div[3]/button[2]"); 
	By comprobarCambioPaginaFotos = By.xpath("/html/body/div[1]/div[2]/div/div[1]/p");
	By inputHidden = By.cssSelector("[accept]");
	By checkBtnConfirmar = By.className("iCheck-helper");
	By btnPost = By.cssSelector("button[type='submit']");
	By fotoSubida = By.id("upload_4img");
	By fotoComprobarProceso = By.cssSelector("img[src='https://cdn0.weddingwire.com/emp/fotos/7/3/3/9/1/0/t20_alfonso-lorenzetto-703636-unsplash_51_1019337.jpg']");
	By posibleModal = By.cssSelector("button[class='close']");
	
	driver.findElement(campoEmailUsuario).sendKeys("cgarrobodas+55@gmail.com");
	driver.findElement(campoPassword).sendKeys("000000");
	driver.findElement(btnSubmit).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(comprobarLogin));
	driver.get("https://www.weddingwire.com/shared/rate/new?vid=4b7ebd73d077039c");
	//var estrellitaExtra = document.getElementById("");
	//estrellitaExtra.scrollIntoView(true);
	driver.findElement(estrellita1).click();
	driver.findElement(estrellita2).click();
	driver.findElement(estrellita3).click();
	driver.findElement(estrellita4).click();
	driver.findElement(estrellita5).click();
	driver.findElement(btnNextRating).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(reviewTitle));
	driver.findElement(reviewTitle).sendKeys("El titulo es importante");
	driver.findElement(cuadroTexto).sendKeys("Write at least 30 characters about your experience. Include any details that will help other couples make their hiring decision.");
	driver.findElement(btnOpinionNext).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(btnPasarDelPrecio));
	driver.findElement(btnPasarDelPrecio).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(comprobarCambioPaginaFotos));
	

	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958465_wedshoots.jpg");
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958463_wedshoots.jpg");
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958457_wedshoots.jpg");
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958459_wedshoots.jpg");
	driver.findElement(inputHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958461_wedshoots.jpg");
	
	driver.findElement(checkBtnConfirmar).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(fotoSubida));
	driver.findElement(btnPost).click();
	try {
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(posibleModal)) == null) {
			System.out.println("No modal or alert is present");
		}else {
			driver.findElement(posibleModal).click();
		}
		
	} catch (Exception e) {
		System.out.println("No aparece niguna modal!");
	}
/*		try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (posibleModal == null){
		System.out.println("No hay que realizar acción");
	}else {
		driver.findElement(posibleModal).click();
	}
	
	*/
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(fotoComprobarProceso));
	
	assertEquals("My Booked Vendors - WeddingWire.com", driver.getTitle());
	
	driver.quit();
	

}
@Test
public void mapLayerTestFirefox() throws InterruptedException {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.manage().deleteAllCookies();

	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.get("https://www.weddingwire.com/shared/search?group_id=2&showmode=map&page=1&userSearch=1");
	
	By filterMap = By.xpath("//*[@id=\"app-vendors-search-filters\"]/div/form/div/div[1]/div/div[2]/ul/li[5]");
	By filterPageNext = By.xpath("//*[@id=\"search-results\"]/div/div[2]/ul/li[11]/a");
	By confirmTitle = By.xpath("//*[@id=\"app-vendors-search-filters\"]/div/form/div/div[2]/div/div/ul/li/div[2]/ul/li[2]/div");
	
	driver.findElement(filterMap).click();
	Thread.sleep(3000);
	driver.findElement(filterPageNext).click();
	Thread.sleep(3000);
	
	//assertTrue(ExpectedConditions.visibilityOfElementLocated(locator));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(confirmTitle));
	
	assertEquals("Wedding Planner & Wedding Coordinator - WeddingWire - Page 2", driver.getTitle());
	
	driver.quit();
	
}
@Test
public void mapLayerTestChrome() throws InterruptedException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	driver.manage().deleteAllCookies();

	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.get("https://www.weddingwire.com/shared/search?group_id=2&showmode=map&page=1&userSearch=1");
	
	By filterMap = By.xpath("//*[@id=\"app-vendors-search-filters\"]/div/form/div/div[1]/div/div[2]/ul/li[5]");
	By filterPageNext = By.xpath("//*[@id=\"search-results\"]/div/div[2]/ul/li[11]/a");
	By confirmTitle = By.xpath("//*[@id=\"app-vendors-search-filters\"]/div/form/div/div[2]/div/div/ul/li/div[2]/ul/li[2]/div");
	
	driver.findElement(filterMap).click();
	Thread.sleep(3000);
	driver.findElement(filterPageNext).click();
	Thread.sleep(3000);
	
	//assertTrue(ExpectedConditions.visibilityOfElementLocated(locator));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(confirmTitle));
	
	assertEquals("Wedding Planner & Wedding Coordinator - WeddingWire - Page 2", driver.getTitle());
	//Wedding Planner & Wedding Coordinator - WeddingWire - Page 2
	driver.quit();
	
}
@Test
public void landingsChrome() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	driver.get("https://www.weddingwire.com/landings");
	
	By searchBox = By.id("txtStrSearch");
	By endTestValidate = By.className("mb15");	
	By endTest2 = By.className("storefrontSearchResult__title");
	
	driver.findElement(searchBox).sendKeys("Jelwery Glam");
	driver.findElement(searchBox).submit();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(endTest2));
	
	assertEquals("Weddings, Wedding - WeddingWire.com", driver.getTitle());
	driver.quit();
}


@Test
public void landingsFirefox() {
driver = new FirefoxDriver();
driver.manage().window().maximize();
WebDriverWait wait = new WebDriverWait(driver, 60);
driver.get("https://www.weddingwire.com/landings");

By searchBox = By.id("txtStrSearch");
By endTestValidate = By.className("mb15");
By endTest2 = By.className("storefrontSearchResult__title");

driver.findElement(searchBox).sendKeys("Jelwery Glam");
driver.findElement(searchBox).submit();

wait.until(ExpectedConditions.visibilityOfElementLocated(endTest2));

assertEquals("Weddings, Wedding - WeddingWire.com", driver.getTitle());
driver.quit();
}



}
