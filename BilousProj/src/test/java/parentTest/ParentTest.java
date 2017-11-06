package parentTest;

import libs.Utils;
import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ApparatPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SparePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;

public class ParentTest {
    WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    public SparePage sparePage;
    public ApparatPage apparatPage;
    private Utils utils = new Utils();
    private boolean isTestPass = false;
    private String pathToScreenShot;

    /**
     * Additional method of jUnit that help us to find test name
     */
    @Rule
    public TestName testName = new TestName();

    @Before
    public void setup() {
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        pathToScreenShot = "..\\BilousProj\\target\\screenshot\\" + this.getClass().getPackage().getName()
                + "\\" + this.getClass().getSimpleName() + "\\" + this.testName.getMethodName() + ".jpg";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        sparePage = new SparePage(driver);
        apparatPage = new ApparatPage(driver);


    }

    @After
    public void teerDown() {
        if (!isTestPass) {
            utils.screenShot(pathToScreenShot, driver);
        }
        driver.quit();
    }

    /**
     * Method checks acceptance criteria of our test
     */
    protected void checkAcceptanceCriteria(String message, boolean actual, boolean expected) {
        if (actual != expected) {
            utils.screenShot(pathToScreenShot, driver);

        }
        Assert.assertThat(message, actual, is(expected));
        isTestPass = true;
    }

    protected void checkAcceptanceCriteria(String message, String actual, String expected) {
        if (!actual.equals(expected)) {
            utils.screenShot(pathToScreenShot, driver);

        }
        Assert.assertThat(message, actual, is(expected));
        isTestPass = true;
    }



}
