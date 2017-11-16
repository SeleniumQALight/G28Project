package parentTest; // Родитель всех тестов

import libs.ExcelDriver;
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
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;
import pages.LoginPage;
import pages.SparePage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;

@RunWith(value = Parameterized.class)
public class ParentTest {


    WebDriver driver;
    //переменная
    public LoginPage loginPage;
    public HomePage homePage;

    public SparePage sparePage;

    private String browser;
    Logger log;
    public ExcelDriver excelDriver;


    private Utils utils = new Utils();
    private boolean isTestPaste = false; // показывает прошел тест или нет
    private String pathToScreenShot;  // путь к скриншоту


    @Rule // используем jUnit , так как он знает какой тест запущен
    // в эту переменную записываем имя тест кейса
    public TestName testName = new TestName();


    // konstructor для передачи варианта браузера для тестов
    public ParentTest(String browser) {
        this.browser = browser;
        log = Logger.getLogger(getClass());
    }


    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        return Arrays.asList(new Object[][]{
//                "fireFox"}
                        {"chrome"}
//                {"iedriver"}
// {           "opera" }
// {           "phantomJs" }
// {         "remote" }
    });

        }



    //precondition
// before будет запускаться предкаждым тестом

    // driver takes from http://www.seleniumhq.org/download/
    @Before
    public void setUp() {

        pathToScreenShot = "..\\GrozenkoProj\\target\\screenshot\\" + this.getClass().getPackage().getName()
                + "\\" + this.getClass().getSimpleName() + "\\" + this.testName.getMethodName()
                + ".jpg";

        if ("chrome".equals(browser)) {
            log.info("Chrome will be started");
            //прослойка драйвер для подключения браузер (под каждый)
            // путь к драйверу
            File fileFF = new File(".././drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());

            // обращаемс к папке Мавена для создания своей папки
            //this.getClass().getPackage().getName() -относительно package
            // this.getClass().getSimpleName() - имя самого класса
            // this.testName.getMethodName()  - имя тест кейса спрашиваем у jUnit

            // созд нов объект с открыт новым окном
            driver = new ChromeDriver();
            log.info("Chrome is started");
        } // driver for InetExplorer
        else if ("iedriver".equals(browser)) {
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

        // неявное ожидание , команда будет выполнятся в течении 10сек и выполнять через  0,5 сек
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        //servicePage = new ServicePage(driver);
        sparePage = new SparePage(driver);

        excelDriver = new ExcelDriver();

    }


    //выполняется после теста
    @After
    public void tearDown() {
        //сделаем скришот
        // если тест завалился на чем-нибудь
        // !isTestPaste --- isTestPaste==false
        if (!isTestPaste) {
            utils.screenShot(pathToScreenShot, driver);
        }
        //quit - для закрытия браузера
        // close -для закрытия вкладки
        driver.quit();
    }


    //переносим Assert в этот метод - ожидаемый результат теста
    protected void checkAcceptanceCriteries(String message, boolean actual
            , boolean expected) {

        if (actual != expected) {
            // driver -браузер с которого хотим снять
            //путь для сохранения скриншота
            utils.screenShot(pathToScreenShot, driver);
        }
        // сравнивает actualresult and expected и выдает сообщение если есть несовпадение
        // для импорта a "is" используем coreMatch
        Assert.assertThat(message, actual, is(expected));

        isTestPaste = true; // для предачи переменной isTestPaste в @After
        // так как по умолчанию isTestPaste = false
    }


    //переносим Assert в этот метод - ожидаемый результат теста
//для проверки вводимого текста
    protected void checkAcceptanceCriteries(String message, String actual
            , String expected) {

        if (!actual.equals(expected)) {
            // driver -браузер с которого хотим снять
            //путь для сохранения скриншота
            utils.screenShot(pathToScreenShot, driver);
        }
        // сравнивает actualresult and expected и выдает сообщение если есть несовпадение
        // для импорта a "is" используем coreMatch
        Assert.assertThat(message, actual, is(expected));

        isTestPaste = true; // для предачи переменной isTestPaste в @After
        // так как по умолчанию isTestPaste = false
    }

}
