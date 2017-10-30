package mainPack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LogInWithOutPageObject {



    @Test
    public void validLogin(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://v3.test.itpmgroup.com/login");
        driver.findElement(By.name("_username")).sendKeys("udent");
        driver.findElement(By.xpath(".//*[@name='_password']")).sendKeys("909090");
        driver.findElement(By.tagName("button")).click();
        Assert.assertTrue("",driver.findElement(By.xpath(".//div[@class='e']//img[@class='img-circle']"))
                .isDisplayed());
        driver.quit();
    }

    @Test
    public void unvalidLogIn(){

    }
}