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

public class ParentTest {
    public WebDriver driver;    // must be whithout publick
    public LoginPage loginPage;
    public HomePage homePage;
    public SparePage sparePage;
    public EditSparePage editSparePage;

    public Utils utils = new Utils();   // must be private
    private boolean isTestPass = false;
    public String pathToScreenShot;     // must be private

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp() {
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        pathToScreenShot = "..\\BatujevskiiProj\\target\\screenshot\\" + this.getClass().getPackage().getName()
                + "\\" + this.getClass().getSimpleName() + "\\" +
                this.testName.getMethodName() + ".jpg";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        sparePage = new SparePage(driver);
        editSparePage = new EditSparePage(driver);


    }

    @After
    public void tearDown() {
        if (!isTestPass ){
            utils.screenShot(pathToScreenShot,driver);
        }
        driver.quit();
    }

    protected void checkAcceptanceCriteria(String message, boolean actual, boolean expected){
        if (actual != expected){
            utils.screenShot(pathToScreenShot,driver);
        }
        Assert.assertThat(message,actual,is(expected));
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
