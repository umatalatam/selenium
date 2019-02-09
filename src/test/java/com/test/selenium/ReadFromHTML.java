package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class ReadFromHTML {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        File htmlFile = new File("src/test/resources/htmls/brokenImage.html");
        String htmlFilePath = htmlFile.getAbsolutePath();
        driver.get(htmlFilePath);

    }
    @Test
    public void readHTML(){
        String text = driver.findElement(By.cssSelector("#Talatam")).getText();
        System.out.println(text);

    }
      @Test
        public void readHTML1(){
          String text = driver.findElement(By.cssSelector("#UMA")).getText();
          System.out.println(text);
      }


    }

