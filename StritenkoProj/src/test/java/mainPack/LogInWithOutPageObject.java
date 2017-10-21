package mainPack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Marina on 10/21/2017.
 */
public class LogInWithOutPageObject {



   WebDriver driver = new ChromeDriver();
    @Test

    public void validLogIn(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://v3.test.itpmgroup.com/login");
        driver.findElement(By.id("_name")).sendKeys("Student");
        driver.findElement(By.xpath(".//*[@name='_password']")).sendKeys("909090");
        driver.findElement(By.tagName("button")).click();
        Assert.assertTrue(" ",driver.findElement(By.xpath("//div[@class='e']//img[@class='img-circle']")).isDisplayed());

        driver.quit();


    }
}
