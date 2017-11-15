package parentTest;

import libs.Utils;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EditSparePage;
import pages.HomePage;
import pages.LoginPage;
import pages.SparePage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;


@RunWith(value =  Parameterized.class)

public class ParentTest {
    public WebDriver driver;    // must be whithout publick
    public LoginPage loginPage;
    public HomePage homePage;
    public SparePage sparePage;
    public EditSparePage editSparePage;
    private String browser;
    Logger log;



    public Utils utils = new Utils();   // must be private
    private boolean isTestPass = false;
    public String pathToScreenShot;     // must be private

    @Rule
    public TestName testName = new TestName();

    public ParentTest(String browser) {
        this.browser = browser;
        log = Logger.getLogger(getClass());

    }


    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        return Arrays.asList(new Object[][]{
//               {"fireFox"}
////                ,
//                {"chrome"}
//                ,
                { "iedriver" }
//                ,
//                    { "opera" }
//                ,
//                {"phantomJs"}
//                ,
//                {"remote"}
        });
    }

    @Before
    public void setUp() {
        pathToScreenShot = "..\\BatujevskiiProj\\target\\screenshot\\" + this.getClass().getPackage().getName()
                + "\\" + this.getClass().getSimpleName() + "\\" +
                this.testName.getMethodName() + ".jpg";

        if ("chrome".eqals(browser)) {
            log.info("Chrome will be started");
            File fileFF = new File(".././drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
            log.info("Chrome is started");
        }else if ("iedriver".equals(browser)) {
            log.info("IE will be started");
            File file1 = new File(".././drivers/IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file1.getAbsolutePath());
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability("ignoreZoomSetting", true);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new InternetExplorerDriver();
            log.info(" IE is started");
        }

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
