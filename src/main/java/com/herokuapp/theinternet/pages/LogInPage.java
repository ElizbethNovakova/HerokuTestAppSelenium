package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.name("password");
    private By logInBtnLocator = By.tagName("button");

    public LogInPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public SecureAreaPage logIn(String username, String password){
        log.info("Executing logIn with username [{username}] and password [{password}]");
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(logInBtnLocator).click();
        return new SecureAreaPage(driver, log);
    }
}
