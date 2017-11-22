package mainPack;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginWithoutPageObjectDumskaya {


    @Test
    public void validLogin() {
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://dumskaya.net/");
        driver.findElement(By.xpath(".//a[@href='javascript:showuserinfo()']")).click();
        //driver.findElement(By.xpath(".//*[@id='userinfo']"));
        driver.findElement(By.xpath(".//input[@id='login']")).sendKeys("alexprokofiev@ukr.net");
        driver.findElement(By.xpath(".//input[@id='psw']")).sendKeys("909090");
        driver.findElement(By.name("submitbutton")).click();
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='cell1user']"))
                .isDisplayed());
        driver.quit();
    }

    @Test
    public void invalidLogin() {
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://dumskaya.net/");
        driver.findElement(By.xpath(".//a[@href='javascript:showuserinfo()']")).click();
        //driver.findElement(By.xpath(".//*[@id='userinfo']"));
        driver.findElement(By.xpath(".//input[@id='login']")).sendKeys("Student88");
        driver.findElement(By.xpath(".//input[@id='psw']")).sendKeys("909090");
        driver.findElement(By.name("submitbutton")).click();
        Assert.assertTrue(driver.findElement(By.xpath(".//*/b[contains(text(),'Нет пользователя с такими е-мейлом и паролем')]"))
                .isDisplayed());
        driver.quit();
    }
}

