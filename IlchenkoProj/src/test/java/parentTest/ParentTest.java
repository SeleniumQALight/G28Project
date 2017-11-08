package parentTest;

import libs.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EditSparePage;
import pages.HomePage;
import pages.LoginPage;
import pages.SparePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by user on 25.10.2017.
 */
public class ParentTest {
    WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    public SparePage sparePage;
    public EditSparePage editSparePage;
    private Utils utils = new Utils();
    private boolean isTestPass = false;
    private String pathToSreenShot;


    @Rule
    public TestName testName = new TestName();


    @Before
    public void setUp(){
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        pathToSreenShot = "..\\IlchenkoProj\\target\\screenshot\\" + this.getClass().getPackage().getName()
                + "\\" + this.getClass().getSimpleName() + "\\" + this.testName.getMethodName() + ".jpg";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        sparePage = new SparePage(driver);
        editSparePage = new EditSparePage(driver);

    }

    @After
    public void  tearDown(){
        if (!isTestPass) {
            utils.screenShot(pathToSreenShot,driver);
        }

        driver.quit();
    }

    protected void checkAcceptanceCriteria(String message, boolean actual, boolean expected){
        if (actual!= expected){
         utils.screenShot(pathToSreenShot, driver);
        }
        Assert.assertThat(message,actual,is(expected));
        isTestPass = true;

    }
    protected void checkAcceptanceCriteria(String message, String actual, String expected){
        if (actual.equals(expected)){
            utils.screenShot(pathToSreenShot, driver);
        }
        Assert.assertThat(message,actual,is(expected));
        isTestPass = true;

    }
}
