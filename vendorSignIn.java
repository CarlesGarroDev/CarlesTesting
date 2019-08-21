package com.carles.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vendorSignIn {

	private WebDriver driver;
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedrivernew/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefoxdriver/geckodriver.exe");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
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
		
		
		
	}

}
