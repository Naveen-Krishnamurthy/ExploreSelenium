package com.Selenium.testNG;

import org.testng.annotations.*;

/**
 * Created by User on 12/13/2017.
 */
public class BasicTestNgTest {

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("This method will be executed before the Suite tag");
    }

    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("This method will be executed before any test method within the class tag");
    }

    @Test
    public void firstTest() {
        System.out.println("This is first test");
    }

    @Test
    public void secondTest() {
        System.out.println("This is second test");
    }

    @Test
    public void thirdTest() {
        System.out.println("This is 3rd Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This method will be executed after the suite");
    }

    @AfterTest
    public void afterTestMethod() {
        System.out.println("This method will be executed after the test method within the class tag");
    }


}
