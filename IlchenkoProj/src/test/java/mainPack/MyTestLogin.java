package mainPack;

import org.openqa.selenium.chrome.ChromeDriver;
//package mainPack;

        import org.junit.Assert;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.io.File;
        import java.util.concurrent.TimeUnit;

/**
 * Created by user on 22.10.2017.
 */
public class MyTestLogin {
    WebDriver driver = new ChromeDriver();
    @Test
    public void validLogin(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://v3.qalight.com.ua/login");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/input")).sendKeys("Student");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/input")).sendKeys("909090");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/div[2]/button")).click();
        Assert.assertTrue(driver.findElement(By.xpath(".//*[text()='Добро пожаловать в систему учета запчастей!']")).isDisplayed());
        driver.quit();


    }

//    public class MyTestLoginNoValid {
//        WebDriver driver = new ChromeDriver();

        @Test
        public void MyTestLoginNoValid() {
            File fileFF = new File(".././drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://v3.qalight.com.ua/login");
            //driver.findElement(By.xpath(".//*[@name=\"_username\"]")).sendKeys("");
            driver.findElement(By.xpath(".//*[@name=\"_password\"]")).sendKeys("909090");
            driver.findElement(By.xpath(".//button[@type=\"submit\"]")).click();
            Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"login-box-msg\"]")).isDisplayed());
            driver.quit();
        }



            @Test
            public void MyTestPasswordNoValid() {
                File fileFF = new File(".././drivers/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
                WebDriver driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("http://v3.qalight.com.ua/login");
                driver.findElement(By.xpath(".//*[@name=\"_username\"]")).sendKeys("Student");
                driver.findElement(By.xpath(".//*[@name=\"_password\"]")).sendKeys("9090");
                driver.findElement(By.xpath(".//button[@type=\"submit\"]")).click();
                Assert.assertTrue(driver.findElement(By.xpath(".//*[@class=\"login-box-msg\"]")).isDisplayed());
                driver.quit();
            }


        }









