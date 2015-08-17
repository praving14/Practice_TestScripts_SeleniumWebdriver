package com.synchronisys.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Pravin on 8/12/2015.
 */
public class FirstTest {
    @Test
    public void first() throws Exception{
        System.out.println("Test");
    }

   @Test
    public void driver() throws Exception{
       WebDriver driver = new FirefoxDriver();
       driver.get("https://github.com/explore");

       WebElement element = driver.findElement(By.name("q"));
       element.clear();
       element.sendKeys("automation_selenium");

       element.submit();

       driver.get("https://github.com/search?utf8=%E2%9C%93&q=automation_selenium");


       /*List<WebElement> results = driver.findElements(By.tagName("em"));
       for (WebElement result : results) {
           if (result.getText() != null && result.getText().equalsIgnoreCase("automation_selenium")) {
               System.out.println("Hooray");
           }
       }

*/
   }

}
