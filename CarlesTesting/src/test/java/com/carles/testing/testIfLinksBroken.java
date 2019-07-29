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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testIfLinksBroken {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		
	
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		
		String homePage = "https://pre66.matrimonios.cl/";
		String PageATestear = "https://pre66.matrimonios.cl/emp-Menu.php";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://pre66.matrimonios.cl/emp-Acceso.php");
        // LOGIN USUARIO
        //By campoEmailUsuario = By.id("Mail");
		//By campoPassword = By.id("Password");
		//By btnSubmit = By.cssSelector("button[type= 'submit']");
        
        //LOGIN EMPRESA
        By UserEmpresa = By.id("Login");
		By PassEmpresa = By.id("Password");
		By BtnEmpresaLogin = By.cssSelector("input[class='adminAccessLogin__submit']");
		
		//HACER LOGIN USUARIO
		//driver.findElement(campoEmailUsuario).sendKeys("cgarro+1@bodas.net");
		//driver.findElement(campoPassword).sendKeys("000000");
		//driver.findElement(btnSubmit).click();
		
		//HACER LOGIN EMPRESA
		driver.findElement(UserEmpresa).sendKeys("empresaqa");
		driver.findElement(PassEmpresa).sendKeys("000000");
		driver.findElement(BtnEmpresaLogin).click();
        
        driver.get(PageATestear);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
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
