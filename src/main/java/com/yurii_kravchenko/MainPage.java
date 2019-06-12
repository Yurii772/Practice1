package com.yurii_kravchenko;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class MainPage {
    WebDriver browser;

    @Test
    public void  qalight_home_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        browser=new ChromeDriver();
        browser.get ("https://qalight.com.ua");
        WebElement about_us=browser.findElement(By.xpath("//*[@id=\"menu-item-254\"]/a"));
        WebElement courses=browser.findElement(By.xpath("//*[@id=\"menu-item-256\"]/a"));
        WebElement knowledge_base=browser.findElement(By.xpath("//*[@id=\"menu-item-716\"]/a"));
        WebElement FAQ=browser.findElement(By.xpath("//*[@id=\"menu-item-5479\"]/a"));
        WebElement Сontact=browser.findElement((By.xpath("//*[@id=\"menu-item-258\"]/a")));
        WebElement Student_cabinet=browser.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/a/span[2]"));
        sleep(2000);
        Student_cabinet.click();
        }
}
