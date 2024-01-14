package org.example;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
// import org.openqa.selenium.JavascriptExecutor;





public class LoginTest {
    WebDriver driver;
    DriverManager driverManager;


    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/ankushkumar/Downloads/chromedriver-mac-x64/chromedriver");
        driverManager = DriverFactoryManager.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://www.instagram.com");
        driver.manage().window().maximize();
    }
    

    public void loginTest() throws InterruptedException, IOException {

        if(driver.getTitle().equalsIgnoreCase("instagram")){
            System.out.println("Test successful");
        }
        else{
            System.out.println("Test not successful");
        }
        Thread.sleep(3000);
//   
//        InstaLoginpage instaLoginpage = new InstaLoginpage(driver);
//        instaLoginpage.login("funnycozitstruee", "35543554");
//        Thread.sleep(10000);
        
       // ((JavascriptExecutor) driver).executeScript("window.open()");
      //((JavascriptExecutor) driver).executeScript("window.open()");

        String window  = driver.getWindowHandle();
        System.out.println("Current window handle is :" + window);
        //driver.switchTo().newWindow(WindowType.TAB);
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().window(window);

        // take a screenshot

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/image.png"));


        driver.close();


    }


    }
