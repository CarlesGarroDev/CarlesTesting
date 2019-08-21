package com.carles.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	public void GLoginChrome(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
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
		By inputFotosHidden = By.id("html5_1diqffudvmbvn1tu73ulg1g6t4");
		
		
		driver.findElement(campoEmailUsuario).sendKeys("cgarro+55@bodas.net");
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
		driver.findElement(inputFotosHidden).sendKeys("C:\\Users\\cgarro\\Desktop\\Wedshoots\\19958465_wedshoots.jpg");
		
	}
}
