package mainPack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 19.10.2017.
 */
public class LoginWithoutPageObjects {
   WebDriver driver;
    @Before
    public void setUp(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
        public void tirDown(){
        driver.quit();
    }


    @Test
    public void validLogin(){

        driver.get("http://v3.test.itpmgroup.com/login");
        driver.findElement(By.name("_username")).sendKeys("Student");
        driver.findElement(By.xpath(".//*[@name='_password']")).sendKeys("909090");
        driver.findElement(By.tagName("button")).click();
        Assert.assertTrue(driver.findElement(By.xpath(".//div[@class='pull-left image']//img[@class='img-circle']")).isDisplayed());

    }
    @Test
    public void unvalidLogIn(){
}}

