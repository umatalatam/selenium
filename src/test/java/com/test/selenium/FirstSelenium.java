package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
/*
   Testing
 */
public class FirstSelenium {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }

    @Test
    public void testCase1() {

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();
    }

    @Test
    public void readDataFromHTMLfile() {
        driver.get(new File("src/test/resources/htmls/brokenImage.html")
                .getAbsolutePath());
        String text = driver.findElement(By.cssSelector("#Talatam")).getText();
        System.out.println(text);
    }

}


