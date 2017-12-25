package com.Selenium.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 11/11/2017.
 */
public class SampleTest {

    public static WebDriver Driver= null;
    public static URL url=null;

    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("This method will be executed before the first test method in the current class");
    }

    @BeforeMethod
    public void  beforeMethodTest() {
        System.out.println("This method will be executed before the test methods within the class");
    }

    @Test
    public void chromeDriverTest() {
        System.setProperty("webdriver.chrome.driver","D://NaveenFiles//My Softwares//Course//Selenium//Softwares//Chromedriver//chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            url = new URL("https://www.sony.co.uk");
            Driver.navigate().to(url);
        }catch(Exception ie) {
            System.out.println("Found exception");
        }
    }

    @Test
    public void firefoxDriverTest() {
        System.setProperty("webdriver.gecko.driver","D://NaveenFiles//SeleniumProjects//ExploreSelenium//Resource//geckodriver.exe");
        Driver = new FirefoxDriver();
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            url = new URL("https://www.sony.com");
            Driver.navigate().to(url);
        }catch(Exception ie) {
            System.out.println("Found exception");
        }
    }

    @AfterMethod
    public void afterMethodTest() {
        System.out.println("This method will be executed after each test method within the class");
    }

    @AfterClass
    public void afterTestClass() {
        System.out.println("This method will be executed after all the test method within the current class");
    }

}
