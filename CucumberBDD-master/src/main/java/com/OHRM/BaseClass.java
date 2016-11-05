package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Shohil on 28/08/2016.
 */
public class BaseClass {
    //WebDriver instance variable instantiation
    protected static WebDriver driver;


    public String getCurrentHeader() {
        return driver.findElement(By.cssSelector("#content .head h1")).getText();
    }

}
