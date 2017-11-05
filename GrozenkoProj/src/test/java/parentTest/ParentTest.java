package parentTest; // Родитель всех тестов

import libs.Utils;
import loginTest.LoginTest;
import mainPack.LogInWithOutPageObject;
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
    //переменная
    public LoginPage loginPage;
    public HomePage homePage;
    private Utils utils = new Utils();
    private boolean isTestPaste = false; // показывает прошел тест или нет
    private String pathToScreenShot;  // путь к скриншоту


    @Rule // используем jUnit , так как он знает какой тест запущен
    // в эту переменную записываем имя тест кейса
    public TestName testName = new TestName();

    //precondition
    // before будет запускаться предкаждым тестом
    @Before
    public void setUp() {

        //прослойка драйвер для подключения браузер (под каждый)
        // путь к драйверу
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());

        // обращаемс к папке Мавена для создания своей папки
        //this.getClass().getPackage().getName() -относительно package
        // this.getClass().getSimpleName() - имя самого класса
        // this.testName.getMethodName()  - имя тест кейса спрашиваем у jUnit
        pathToScreenShot = "..\\GrozenkoProj\\target\\screenshot\\" + this.getClass().getPackage().getName()
                + "\\" + this.getClass().getSimpleName() + "\\" + this.testName.getMethodName()
                + ".jpg";


        // созд нов объект с открыт новым окном
        driver = new ChromeDriver();
        // неявное ожидание , команда будет выполнятся в течении 10сек и выполнять через  0,5 сек
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

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
}
