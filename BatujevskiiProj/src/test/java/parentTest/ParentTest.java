package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;

public class ParentTest {
    WebDriver driver;
    public LoginPage loginPage;  // peremennaia
    public HomePage homePage;

    @Before
    public void setUp(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // time-out for every command !
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }



    protected void checkAcceptanceCriteria(String message, boolean actual, boolean expected ){
    //асерт выносим и заворачиваем в обертку -
        Assert.assertThat(message, actual, is(expected));

    }


}
