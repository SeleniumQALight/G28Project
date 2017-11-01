package parentTest;

import libs.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;


public class ParentTest {
    WebDriver driver;
    public LoginPage loginPage;
    private Utils utils = new Utils();
    private boolean isTestPass=false;
    private String pathToScreen;

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp(){
        File fileFF = new File(".././drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        pathToScreen="\\target\\screenshot\\"+this.getClass().getPackage().getName()+
                "\\"+this.getClass().getSimpleName()+ "\\"+this.testName.getMethodName()+".jpg";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage  = new LoginPage(driver);



    }

    @After
    public void tearDown() {
        if(!isTestPass){
            utils.screenShot(pathToScreen,driver);
        }
        driver.quit();
    }
    protected void checkAcceptanceCriteria(String massage,boolean actual,boolean expected){
        if (actual != expected) {
            utils.screenShot(pathToScreen,driver);

        }
        Assert.assertThat(massage,actual,is(expected));
        isTestPass=true;
    }
}
