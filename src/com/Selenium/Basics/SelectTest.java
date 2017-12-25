package com.Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 12/20/2017.
 */
public class SelectTest {

    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Resource//chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        Driver.manage().window().maximize();
        Driver.get(System.getProperty("user.dir")+"//Resource//Sample_Select_HTML.html");
        WebElement selElement = Driver.findElement(By.tagName("select"));
        Select select = new Select(selElement);
        List<WebElement> options = select.getOptions();

        for(WebElement iterateOptions : options) {
            System.out.println(iterateOptions.getText());
        }

        options = select.getAllSelectedOptions();

        System.out.println("All selected options");
        for(WebElement iterateOptions : options) {
            System.out.println(iterateOptions.getText());
        }



    }
}
