package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage{
    private String pageUrl = "http://the-internet.herokuapp.com/";
    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");

    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage(){
        log.info("Opening page: " + pageUrl);
        openPage(pageUrl);
        log.info("Page id opened");
    }

    public LogInPage navigateToFormAuthentication(){
        log.info("Navigating to Form Authentication on Welcome Page");
        driver.findElement(formAuthenticationLinkLocator).click();
        return new LogInPage(driver, log);
    }
}
