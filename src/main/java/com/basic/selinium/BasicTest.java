package com.basic.selinium;


import jdk.internal.jline.internal.TestAccessible;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

import static java.lang.System.out;

public class BasicTest {
    String testUrl = "Ravi";
    WebDriver chromeDriver;

    @BeforeSuite
    public void setUp() {
        out.println("Hello");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        testUrl = "https://google.com/";
        WebDriver.Options options = chromeDriver.manage();
        WebDriver.Window window = options.window();
        window.maximize();
    }
    @BeforeClass
    public void setUpClass() {
        out.println("Print Characters");
    }

    @Test
    public void firstTest() {


    }

    @Test
    public void secondTest() {

    }

    @Test
    public void thirdTest() {

    }
}




