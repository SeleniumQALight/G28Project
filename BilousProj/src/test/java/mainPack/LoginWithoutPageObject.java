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

public class LoginWithoutPageObject {
    WebDriver driver;
    @Before
    public void setup(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void teerDown(){
        driver.quit();
    }


    @Test
    public void validLogin(){

        driver.get("http://v3.test.itpmgroup.com/login");
        driver.findElement(By.name("_username")).sendKeys("student");
        driver.findElement(By.xpath(".//input[@name='_password']")).sendKeys("909090");
        driver.findElement(By.tagName("button")).click();
        Assert.assertTrue("",driver.findElement(By.xpath(".//a[contains(text(),'Online')]//..//i[@class='fa fa-circle text-success']"))
                .isDisplayed());
    }

    @Test
    public void unvalidLogIn(){
        driver.get("http://v3.test.itpmgroup.com/login");
        driver.findElement(By.name("_username")).sendKeys("wromgusername");
        driver.findElement(By.tagName("button")).click();

        /**Verification if user login page is still displayed and iuser is not logged in*/
        Assert.assertTrue("",driver.findElement(By.xpath(".//p[@class='login-box-msg']"))
                .isDisplayed());
        /**Verification if login field presents*/
        Assert.assertTrue("",driver.findElement(By.name("_username"))
                .isDisplayed());
        /**Verification if password field presents*/
        Assert.assertTrue("",driver.findElement(By.xpath(".//*[@name='_password']"))
                .isDisplayed());

        try{
            Assert.assertTrue("Element with Status Online is not found",driver.findElement(By.xpath(".//a[contains(text(),'Online')]//..//i[@class='fa fa-circle text-success']"))
                .isDisplayed());}
        catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Element" + "  \".//a[contains(text(),'Online')]//..//i[@class='fa fa-circle text-success']\" " + "is not found");
        }
    }
}
