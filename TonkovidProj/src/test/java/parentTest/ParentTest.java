package parentTest;

import libs.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;


public class ParentTest {
    WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    public SparePage sparePage;
    public DealsPage dealsPage;
    private Utils utils;
    private String pathToScreenShot;
    private boolean isTestPass=false;



    @Before
    public void setUp() {
        File fileFF = new File(".././drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    protected void checkOnAcceptanceCriteria(String massage, boolean actual, boolean expected) {
        if (actual != expected) {
            utils.screenShot(pathToScreenShot, driver);
        }
        Assert.assertThat(massage,actual,is(expected));
        isTestPass = true;
    }



    protected void checkAcceptanceCriteria(String message, String actual
            , String expected){
        if (!actual.equals(expected)){
            utils.screenShot(pathToScreenShot,driver);
        }
        Assert.assertThat(message,actual,is(expected));
        isTestPass = true;
    }

}
