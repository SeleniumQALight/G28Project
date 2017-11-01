package parrentTest;

import loginTest.LoginTest;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 25.10.2017.
 */
public class ParrentTest {
    WebDriver driver;

    public LoginPage loginPage;
    public HomePage homePage;

    @Before
    public void setUp() {
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
