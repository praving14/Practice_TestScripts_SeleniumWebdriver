package com.synchronisys.automation.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Pravin on 8/12/2015.
 */
public class TestTwoRandom {
    @Test
    public void driver() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/?gws_rd=ssl");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("pravin");

        element.submit();
    }
}

