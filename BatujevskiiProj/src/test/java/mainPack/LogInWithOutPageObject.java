package mainPack;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LogInWithOutPageObject {
    WebDriver driver;
    //  @BeforeClass @AfterClass

    @Before
    public void setUp(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // time-out for every command !
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void validLogin(){

        driver.get("http://v3.qalight.com.ua/login");
        driver.findElement(By.name("_username")).sendKeys("student");
        driver.findElement(By.xpath(".//*[@name='_password']")).sendKeys("909090");
        driver.findElement(By.tagName("button")).click();

        Assert.assertTrue("Message if false !",false);

        // Assert.assertTrue("Message if false !",driver.findElement(By.xpath(".//div[@class='pull-left image']//img[@class='img-circle']"))
        //        .isDisplayed());
        // проверка


    }

/*
    @Test
    public void unvalidLogin() {
    }
  */
}