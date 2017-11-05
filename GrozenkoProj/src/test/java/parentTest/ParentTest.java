package parentTest; // Родитель всех тестов

import loginTest.LoginTest;
import mainPack.LogInWithOutPageObject;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver driver;
    //переменная
    public LoginPage loginPage;
    public HomePage homePage;

    //precondition
    // before будет запускаться предкаждым тестом
    @Before
    public void setUp() {

        //прослойка драйвер для подключения браузер (под каждый)
        // путь к драйверу
        File fileFF = new File(".././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());

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
        //quit - для закрытия браузера
        // close -для закрытия вкладки
        driver.quit();
    }


}
