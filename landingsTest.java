package com.carles.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class landingsTest {
	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedrivernew/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void landingsChrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.get("https://www.weddingwire.com/landings");
		
		By searchBox = By.id("txtStrSearch");
		By endTestValidate = By.className("mb15");		
		
		driver.findElement(searchBox).sendKeys("Jelwery Glam");
		driver.findElement(searchBox).submit();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(endTestValidate));
		
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
	
	driver.findElement(searchBox).sendKeys("Jelwery Glam");
	driver.findElement(searchBox).submit();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(endTestValidate));
	
	assertEquals("Weddings, Wedding - WeddingWire.com", driver.getTitle());
	driver.quit();
}

}