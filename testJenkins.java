package com.carles.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testJenkins {
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
	public void test() throws SkipException {
		String allIcons = "";
		String iconName = "icon";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		By checkLoad = By.id("yui-gen1-button");
		By userInput = By.id("j_username");
		By passInput = By.name("j_password");
		By blueBalls = By.className("icon-blue");
		By redBalls = By.className("icon-red");
		By greyBalls = By.className("icon-nobuilt");
		
		
		driver.get("http://jenkins.nuptic.com/login?from=%2F");
		try {
			if (wait.until(ExpectedConditions.visibilityOfElementLocated(checkLoad)) == null) {
				System.out.println("Not Loaded");
			}else {
				System.out.println("Loaded");
			}
			
		} catch (Exception e) {
			System.out.println("Error!");
		}
		driver.findElement(userInput).sendKeys("spineda");
		driver.findElement(passInput).sendKeys("ccicci93bcn");
		driver.findElement(checkLoad).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
			System.out.println("fail to wait with thread sleep");
		}
		
		List<WebElement> iconos = driver.findElements(By.className("job-status-red"));
		List<String> strings = new ArrayList<String>();
		
		
		for (WebElement iconosLista:iconos ) {
			String iconClass=iconosLista.getAttribute("class");
			String iconId=iconosLista.getAttribute("id");
			System.out.println(" " + iconClass+" " + iconId);
			strings.add(iconosLista.getText());
	
		}
		System.out.println(strings);
		
//		if (strings.stream().anyMatch(s -> s.equals("Optimizar"))) {
//		    System.out.println("Found");
//		} else {
//		    throw new SkipException();
//		}
		driver.quit();
	}

}
