package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstaLoginpage {
    WebDriver driver;

    public InstaLoginpage(WebDriver driver){
        this.driver = driver;

    }

    private By usernameField = By.className("_ap35");
    private By passwordField = By.xpath("//input[@type='password']");
    private By loginButton = By.cssSelector("button[class*='_ap30']>div");


    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
        this.clickLogin();
    }






    
}
