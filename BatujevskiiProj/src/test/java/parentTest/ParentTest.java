package parentTest;

import lib.Utils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
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
    private Utils utils = new Utils(); // нам надо объект который внутри себя содержит объекты класса утился
    private boolean isTestPass = false; // переменная флажок для индикации тест прошел или нет
    private String pathToScreenShot;

    @Rule
    public TestName testName = new TestName(); //сюда пишется имя тесткейса который запускается


    @Before
    public void setUp() {
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        pathToScreenShot = "..\\BatujevskiiProj\\target\\screenshot\\" + this.getClass().getPackage().getName() +
                "\\" + this.getClass().getSimpleName() + "\\" + this.testName.getMethodName() + ".jpg";
// строим путь относительно класса потом имя класса и имя тесткейса.
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // time-out for every command !
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

    }

    @After
    public void tearDown() {
        if (!isTestPass) {               //зайдем сюда если переменная false мы ее проинвертим и зайдем. те не true
            utils.screenShot(pathToScreenShot, driver);
        }
        driver.quit();
    }


    protected void checkAcceptanceCriteria(String message, boolean actual, boolean expected) {
        //асерт выносим и заворачиваем в обертку -

        if (actual != expected) {
            utils.screenShot(pathToScreenShot, driver);
        } // actual не равен expected снимаем скриншот.

        Assert.assertThat(message, actual, is(expected));
        isTestPass = true;


    }


}
