package com.carles.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class playgroundTest {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver78/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
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


}
