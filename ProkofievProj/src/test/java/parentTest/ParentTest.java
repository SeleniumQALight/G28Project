package parentTest;

import Pages.HomePage;
import Pages.LoginPage;
import junit.framework.Assert;
import libs.Utils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;

public class ParentTest {
    WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    private Utils utils = new Utils();
    private boolean isTestPass = false;
    private String pathToScreenShot;

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp() {
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        pathToScreenShot = "..\\ProkofievProj\\target\\screenshot\\" + this.getClass().getPackage().getName()
                + "\\" + this.getClass().getSimpleName() + "\\" + this.testName.getMethodName() + ".jpg";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
       if (!isTestPass){
           utils.screenShot(pathToScreenShot,driver);
       }
        driver.quit();
    }

    protected void checkAcceptanceCriteria(String message, boolean actual, boolean expected){
        if (actual != expected){
            utils.screenShot(pathToScreenShot,driver);
        }
        org.junit.Assert.assertThat(message, actual, is(expected));
        isTestPass = true;
    }
}
