package com.yurii_kravchenko;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainPage {
    WebDriver browser;
        WebElement about_us=browser.findElement(By.xpath("//*[@id=\"menu-item-254\"]/a"));
        WebElement courses=browser.findElement(By.xpath("//*[@id=\"menu-item-256\"]/a"));
        WebElement knowledge_base=browser.findElement(By.xpath("//*[@id=\"menu-item-716\"]/a"));
        WebElement FAQ=browser.findElement(By.xpath("//*[@id=\"menu-item-5479\"]/a"));
        WebElement Сontact=browser.findElement((By.xpath("//*[@id=\"menu-item-258\"]/a")));
        WebElement Student_cabinet=browser.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/a/span[2]"));
        WebElement Phone_life=browser.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/ul/li[1]/a"));
        WebElement Phone_kyivstar=browser.findElement((By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/ul/li[2]/a")));
        WebElement Phone_vodafone=browser.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/ul/li[3]/a"));
        WebElement Sign_on_course=browser.findElement(By.xpath("/html/body/div[4]/div/div[1]/a"));
        WebElement Lamp=browser.findElement((By.xpath("/html/body/div[4]/div/div[2]/a/img")));
        WebElement All=browser.findElement(By.xpath("//*[@id=\"two\"]/div/div/div[1]/div[2]/ul/li[1]"));
        WebElement Testing=browser.findElement(By.xpath("//*[@id=\"two\"]/div/div/div[1]/div[2]/ul/li[2]/a"));
}
