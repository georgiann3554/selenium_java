package org.example;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test22{
	
	DriverManager driverManager;
	WebDriver driver;
	
	
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/ankushkumar/Downloads/chromedriver-mac-x64/chromedriver");
		driverManager = DriverFactoryManager.getDriverManager(DriverType.CHROME);
		driver = driverManager.getWebDriver();
	}
	
	@Test
	public void test() throws InterruptedException {
//		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
//		System.out.println(driver.getTitle());		
//		if(driver.findElement(By.xpath("//input[@name='fname']")).isEnabled()) driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Ankush");
//		if(driver.findElement(By.xpath("//input[@name='lname']")).isEnabled()) driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Kumar");
//		driver.findElement(By.xpath("//input[@value='Bike']")).click();
//		driver.findElement(By.xpath("//input[@value='male']")).click();
//		
//		driver.findElement(By.xpath("//input[@name='img']")).sendKeys("/Users/ankushkumar/Desktop/rt.png");
//		Select s = new Select(driver.findElement(By.xpath("//select[@id='Carlist']")));
//	    s.selectByVisibleText("Volvo");
//	    
//	    driver.findElement(By.xpath("//option[text()='Japan']")).click();
//	    driver.findElement(By.xpath( "//input[@value='->']")).click();
//	    SoftAssert softAssert = new SoftAssert();
//	    softAssert.assertFalse(driver.findElement(By.xpath("(//select[@name='ToLB']/option)[1]")).isDisplayed());
//	   // softAssert.assertAll();
//	    driver.findElement(By.xpath("//*[text()='Show Me Confirmation']")).click();
//	    Thread.sleep(2000);
//	    driver.switchTo().alert().dismiss();
//	    Assert.assertEquals(driver.findElement(By.id("demo")).getText(), "You pressed Cancel!");
//	    driver.findElement(By.xpath("//*[text()='Show Me Confirmation']")).click();
//	    Thread.sleep(2000);
//	    driver.switchTo().alert().accept();
//	    Assert.assertEquals(driver.findElement(By.id("demo")).getText(), "You pressed OK!");
//	    
//	    JavascriptExecutor jse1 = (JavascriptExecutor) driver;
//	    jse1.executeScript("window.scrollBy(0,800)");  
//	    
//	    driver.get("chrome://downloads/");
//	    
//	    String ss = "return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('div>div>input')";
//	    String sf = "arguments[0].setAttribute('value','Selenium')";
//	    
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    
//	    WebElement w = (WebElement) js.executeScript(ss);
//	    
//	    js.executeScript(sf, w);
//	    
//	    Thread.sleep(2000);
//	    
//	    driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
//	    Thread.sleep(1000);
//	    String parent = driver.getWindowHandle();
//	    System.out.println("Parent winow ID- " + parent);
//	    driver.findElement(By.xpath("//input[@name='PushButton']")).click();
//	    
//	   
//	    
//	    Set<String> handles = driver.getWindowHandles();
//	    
//	    for(String e: handles) {
//	    	System.out.println(e + " - > Window ID");
//	    	System.out.println("Is this parent? - " + (e != parent));
//	    	if(e != parent) {
//	    		System.out.print("closing- " + e);
//	    		driver.switchTo().window(e);
//	    		System.out.println(driver.getTitle());
//	    		driver.close();
//	    	}
//	    }
//	    
//	    Thread.sleep(3000);
//	    
//	    System.out.println("Parent winow ID- " + parent);
//	
//	    driver.switchTo().window(parent);
//	    System.out.println(driver.getTitle());
//	    Thread.sleep(2000);
//	    
//	    
//	    
//	    
//	    
////	    Actions action = new Actions(driver);
////	    action.moveToElement(driver.findElement(By.xpath("//td/select[@name='FromLB']"))).perform();
////	    action.moveToElement(driver.findElement(By.xpath("//a[@class='home-link']"))).perform();
//	    
//		
//		Thread.sleep(5000);
		
		
		
//		
//		driver.get("https://www.spicejet.com/");
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("(//div[text()='SpiceClub'])[1]"))).perform();
//		driver.findElement(By.xpath("//div[text()='Use Points']")).click();
//		Thread.sleep(2000);
		
		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(0);
//		Actions action = new Actions(driver);
//		//action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().perform();
//		
//		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).perform();
//		
//		Thread.sleep(3000);
		
		driver.get("https://www.javatpoint.com/how-to-create-a-dynamic-table-in-javascript");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//table[@class='alt']")));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='alt']/tbody/tr"));
		for(int i = 2; i<=rows.size();i++) {
			System.out.println(driver.findElement(By.xpath("//table[@class='alt']/tbody/tr[" + i + "]/td[1]")).getText());
			if(driver.findElement(By.xpath("//table[@class='alt']/tbody/tr[" + i + "]/td[1]")).getText().equals("Clementina DuBuque")) {
				System.out.println(driver.findElement(By.xpath("//table[@class='alt']/tbody/tr[" + i + "]/td[1]")).getText() + driver.findElement(By.xpath("//table[@class='alt']/tbody/tr[" + i + "]/td[2]")).getText() 
						+ driver.findElement(By.xpath("//table[@class='alt']/tbody/tr[" + i + "]/td[3]")).getText());
				
			}
		}
		
		Thread.sleep(5000);
		
		
		
		
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
		
		
	}
	
	
	
}