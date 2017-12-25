package com.Selenium.testNG;

import org.testng.annotations.Test;

/**
 * Created by User on 12/13/2017.
 */
public class methodGrouping {

    @Test(groups = {"integrationTest","functionalTest"})
    public void methodGrouping1() {
        System.out.println("Method grouping 1");
    }

    @Test(groups = {"functionalTest"})
    public void methodGrouping2() {
        System.out.println("Method grouping 2");
    }

    @Test(groups = {"integrationTest"})
    public void methodGrouping3() {
        System.out.println("Method grouping 3");
    }
}
