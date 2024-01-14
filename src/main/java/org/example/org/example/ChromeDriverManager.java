package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

    public void createWebDriver(){
        this.driver = new ChromeDriver();
    }
    
}
