package com.synchronisys.automation.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Pravin on 8/12/2015.
 */
public class TestTwoRandom {

    @Test
    public void driver() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("https:/www.hotmail.com/"); // go to hotmail sign in page
        driver.findElement(By.id("i0116")).sendKeys("pravingrg14@hotmail.com"); //input username
        driver.findElement(By.id("i0118")).sendKeys("prasabin14"); //input password
        driver.findElement(By.name("SI")).click(); // click sign in button
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS); // wait for 300 seconds
        driver.findElement(By.id("NewMessage")).click(); // Click on New message button
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        // maybe pause fore few seconds ?
        driver.findElement(By.xpath(".//*[@id='toCP']/div[2]/div/span[2]/textarea")).sendKeys("pravingrg14@gmail.com"); //error in this path ??
        /* driver.findElement(By.id("watermarkedInputControl361f")).sendKeys("Test Selenium");
        driver.findElement(By.xpath("html/body")).sendKeys("Test success!!");
        driver.findElement(By.xpath(".//*[@id='SendMessage']")).click();
        driver.findElement(By.id("c_meun")).click();
        driver.findElement(By.id("c_signout")).click(); */

        driver.quit();
    }
}
