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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testMapLayer {
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
}
