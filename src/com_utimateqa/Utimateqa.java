package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Utimateqa {

    public static void main(String[] args) {

        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver = new ChromeDriver();      // Object creation for Chrome driver
        driver.get(baseURL);        //Open URL in to the Browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Give implicit time
        driver.manage().window().maximize();        // Maximize the browser window
        System.out.println(driver.getTitle());      // Print the Title of the page
        System.out.println(driver.getCurrentUrl());     // Print the Current URl
        System.out.println(driver.getPageSource());     //Print the Page source
        driver.findElement(By.id("user[email]")).sendKeys("kaushikpatel@hotmail.com");  // Enter the email address in the User Email field.
        driver.findElement(By.id("user[password]")).sendKeys("123456789");              // Enter the Password in the Password field.
        driver.close();     // Closing the Browser
    }
}
