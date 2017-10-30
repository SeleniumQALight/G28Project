package parentTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;
public class ParentTest {
    WebDriver driver;
    public LoginPage loginPage;  // peremennaia

    @Before
    public void setUp(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // time-out for every command !
        loginPage = new LoginPage(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
