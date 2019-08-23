package com.carles.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class writeAReviewPhotos {
	private WebDriver driver;
	
	
	
	public static void HoverAndClick(WebDriver driver,WebElement elementToHover,WebElement elementToClick) {
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
	}
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedrivernew/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
		public void postReviewFirefox(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 60);
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
	
	public void postReviewChrome(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 60);
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
	
	
}
