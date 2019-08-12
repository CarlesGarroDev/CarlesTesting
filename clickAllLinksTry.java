package com.carles.testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickAllLinksTry {
	
	private WebDriver driver;


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pre66.matrimonios.cl/musica-matrimonio/soundbeats--e115738/informacion");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		//WebElement getLinks = driver.findElement(By.cssSelector("a[href]"));
		
		List<WebElement> oLinksOnPage = driver.findElements(By.tagName("a"));

	    System.out.println(oLinksOnPage.size());

	    for(int i=0;i<oLinksOnPage.size();i++){

	        System.out.println(oLinksOnPage.get(i).getText());
	        
	        
	}

}}

//List<WebElement> linkElements = driver.findElements(By.tagName("a"));
//int i = 0;
//String notWorkingUrlTitle = "Under Construction: QAAutomated";
//String[] linkTexts = new String[linkElements.size()];
// for (WebElement elements : linkElements) {
//        linkTexts[i] = elements.getText();
//        i++;
//        
//    }

    //test each link
//    for (String t : linkTexts) {
//        driver.findElement(By.linkText(t)).click();
//        if (driver.getTitle().equals(notWorkingUrlTitle )) {
//            System.out.println("\"" + t + "\""
//                    + " is not working.");
//        } else {
//            System.out.println("\"" + t + "\""
//                    + " is working.");
//        }
//        driver.navigate().back();
//    }
