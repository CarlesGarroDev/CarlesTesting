package com.carles.testing;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
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

public class FacebookFuncOKbutGetsAccBanned {
	private WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedrivernew/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}
	
	@Test
	public void FacebookSignInUsChrome() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		By campoLoginFacebook = By.id("email");
		By campoPassFacebook = By.id("pass");
		//By btnFacebookSubmit = By.id("u_0_2");
		By btnFacebookWedding = By.cssSelector("button[class='btn-outline btn-outline--social btn-full app-facebook-button mb10  ']");
		By picLastPage = By.xpath("//*[@id=\"pickfiles\"]/img");
		By posibleModal = By.xpath("//*[@id=\"app-common-layer\"]/div/div/div[1]/button");
		driver.get("https://www.facebook.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(campoLoginFacebook));
		
		driver.findElement(campoLoginFacebook).sendKeys("s.codina85@yahoo.com");//Usuario se banea por exceso de logins
		driver.findElement(campoPassFacebook).sendKeys("CCIcci93bcn");
		
		if (campoLoginFacebook != null && campoPassFacebook !=null) {
			driver.findElement(campoPassFacebook).submit();	
		}
		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
		driver.get("https://www.weddingwire.com/users-login.php");
		driver.findElement(btnFacebookWedding).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(picLastPage));
		WebElement ModalAccion = driver.findElement(posibleModal);
		if (ModalAccion.isDisplayed() && ModalAccion.isEnabled()) {
			ModalAccion.click();
		};
		
		
		
		assertEquals("Wedding Planner - WeddingWire.com", driver.getTitle());
		
		
		
		
	}


}
