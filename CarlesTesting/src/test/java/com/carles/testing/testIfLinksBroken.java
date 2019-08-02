package com.carles.testing;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testIfLinksBroken {
	private WebDriver driver;
	//JavascriptExecutor js = (JavascriptExecutor) driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		
	}

	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

//	public void JavaJavascript() {
//		
//		var intento = js.document.getElementsByClassName("nav-main-link app-header-tab")[0];
//		intento.setAttribute("href", "https://pre66.matrimonios.cl/vestidos-noviaaaaaaaa");
//		
//	}
	@Test
	public void test() throws InterruptedException {
		
		
		String homePage = "https://www.weddingwire.com/";
		String PageATestear = "https://www.weddingwire.com/tools/Guests";
		
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
 // ACCEDER PAGINA LOGIN SI ES NECESARIO HACER LOGIN ANTES DE TESTEAR
        driver.get("https://www.weddingwire.com/users-login.php");
 //LOGIN USUARIO
        By campoEmailUsuario = By.id("Mail");
		By campoPassword = By.id("Password");
		By btnSubmit = By.cssSelector("button[type= 'submit']");
//        
//LOGIN EMPRESA
      //  By UserEmpresa = By.id("Login");
	//	By PassEmpresa = By.id("Password");
	//	By BtnEmpresaLogin = By.cssSelector("input[class='adminAccessLogin__submit']");
		
		//HACER LOGIN USUARIO
		driver.findElement(campoEmailUsuario).sendKeys("cgarrobodas@gmail.com");
		driver.findElement(campoPassword).sendKeys("000000");
		driver.findElement(btnSubmit).click();
		
		//HACER LOGIN EMPRESA
		//driver.findElement(UserEmpresa).sendKeys("empresaqa");
		//driver.findElement(PassEmpresa).sendKeys("000000");
		//driver.findElement(BtnEmpresaLogin).click();
        
        driver.get(PageATestear);
//    	By posibleModal = By.cssSelector("a[class='btn btn-flat red app-close-contest']");
//    	WebElement ModalAccion = driver.findElement(posibleModal);
//		if (ModalAccion.isDisplayed() && ModalAccion.isEnabled()) {
//			ModalAccion.click();
//		};
       //js.executeScript(intento.setAttribute("href", "https://www.tutorialrepublic.com"));
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){

            
            url = it.next().getAttribute("href");
            //SHOW URLS BEFORE VALIDATING
            //System.out.println(url);
        
            if(url == null || url.isEmpty()){
            	System.out.println(url+" URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println(url+" URL belongs to another domain, skipping it.");
                continue;
            }
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" WARNING, this is a broken link");
                }
                else{
                    System.out.println(url+" FINE, this is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}

}
