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

public class TestingIndividualFuncs {
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
		//driver.quit();
	}
	
	@Test
	public void facebookSignInUsFirefox() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		By imageFace = By.id("homelink");
		By loginRealFacebook = By.xpath("//*[@id=\"email\"]");
		By loginRealFacebookPass = By.xpath("//*[@id=\"pass\"]");
		By btnLoginFacebookReal = By.cssSelector("input[id='u_0_0']");
		driver.get("https://www.weddingwire.com/users-signup.php");
		By btnFacebookLogin = By.cssSelector("button[class='btn-outline btn-outline--social btn-full app-facebook-button mb10  \']");
		
		String winHandleBefore = driver.getWindowHandle();
		
		
		
		driver.findElement(btnFacebookLogin).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(btnLoginFacebookReal));
		
		js.executeScript("window.focus()", "");
		
		WebElement accionModal = driver.findElement(btnLoginFacebookReal);
		
		
		
		if (accionModal.isDisplayed() && accionModal.isEnabled()) {
			driver.findElement(loginRealFacebook).sendKeys("s.codina85@yahoo.com");
			
			driver.findElement(loginRealFacebookPass).sendKeys("CCIcci93bcn");
			
			driver.findElement(btnLoginFacebookReal).click();
		}
		//for (String winHandle : driver.getWindowHandles()){
			//wait.until(ExpectedConditions.visibilityOfElementLocated(imageFace));
			
		
			//driver.switchTo().window(winHandleBefore);
			
		
			
	//	}
		Thread.sleep(3000);
		//driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=258399401573410&kid_directed_site=0&app_id=258399401573410&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.6%2Fdialog%2Foauth%3Fapp_id%3D258399401573410%26channel_url%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter.php%253Fversion%253D44%2523cb%253Df3be5aa8ddc03ea%2526domain%253Dwww.weddingwire.com%2526origin%253Dhttps%25253A%25252F%25252Fwww.weddingwire.com%25252Ffd589ec278cdb2%2526relation%253Dopener%26client_id%3D258399401573410%26display%3Dpopup%26domain%3Dwww.weddingwire.com%26e2e%3D%257B%257D%26fallback_redirect_uri%3Dhttps%253A%252F%252Fwww.weddingwire.com%252Fusers-signup.php%26locale%3Den_US%26origin%3D1%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter.php%253Fversion%253D44%2523cb%253Df3af5b0ed52c8ea%2526domain%253Dwww.weddingwire.com%2526origin%253Dhttps%25253A%25252F%25252Fwww.weddingwire.com%25252Ffd589ec278cdb2%2526relation%253Dopener%2526frame%253Dfb32c1d7a7d6dc%26response_type%3Dtoken%252Csigned_request%26scope%3Duser_location%252C%2Bemail%26sdk%3Djoey%26version%3Dv2.6%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3D4f9446ca-84b4-479e-8157-6cde586b1646&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter.php%3Fversion%3D44%23cb%3Df3af5b0ed52c8ea%26domain%3Dwww.weddingwire.com%26origin%3Dhttps%253A%252F%252Fwww.weddingwire.com%252Ffd589ec278cdb2%26relation%3Dopener%26frame%3Dfb32c1d7a7d6dc%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied&display=popup&locale=en_US");
	
			
		
		//By btnGoogleLogin = By.className("btn-outline btn-outline--social btn-full app-google-login");
		
		
		//driver.get("https://www.weddingwire.com/tools/Main");
		
		assertEquals("Wedding Planner - WeddingWire.com", driver.getTitle());
		
		driver.quit();
		
		
	}


}
