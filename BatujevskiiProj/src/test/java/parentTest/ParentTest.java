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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
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
                {"chrome"}
//                ,
//                { "iedriver" }
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


        if ("chrome".equals(browser)) {
            log.info("Chrome will be started");
            File fileFF = new File(".././drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
            driver = new ChromeDriver();
            log.info("Chrome is started");
        }else if ("iedriver".equals(browser)) {
            log.info("IE will be started");
 //           File file1 = new File(".././drivers/IEDriverServer.exe");
            File file1 = new File("/IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file1.getAbsolutePath());
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability("ignoreZoomSetting", true);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver = new InternetExplorerDriver();
            log.info(" IE is started");
        } else if ("fireFox".equals(browser)) {
            log.info("FireFox will be started");
            File fileFF = new File(".././drivers/geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", fileFF.getAbsolutePath());
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.startup.page", 0); // Empty start page
            profile.setPreference("browser.startup.homepage_override.mstone", "ignore"); // Suppress the "What's new" page
            driver = new FirefoxDriver();
            log.info(" FireFox is started");
        }


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
