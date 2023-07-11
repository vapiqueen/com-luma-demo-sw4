package com.luma.demo.testbase;


import com.luma.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "chrome";

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
