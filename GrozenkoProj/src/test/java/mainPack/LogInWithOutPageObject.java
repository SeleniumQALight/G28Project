package mainPack;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LogInWithOutPageObject {

    WebDriver driver;


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
    }


    //выполняется после теста
    @After
    public void tearDown() {
        //quit - для закрытия браузера
        // close -для закрытия вкладки
        driver.quit();
    }


    // пример проекта до 20 тестов
    @Test //junit
    public void validLogin() {

        //открой нам URL
        driver.get("http://v3.test.itpmgroup.com/login");
        // найти элемент с таким локатором, sendKeys - введение символа с клавиатуры
        driver.findElement(By.name("_username")).sendKeys("student");

        // найти элемент с таким локатором, find - найти . sendKeys - введи ,команды через точку
        driver.findElement(By.xpath(".//*[@name='_password']")).sendKeys("909090");
        // найти элемент с таким локатором
        driver.findElement(By.tagName("button")).click();

        // проверка логической проверки - пример появилась ли аватарка
        // если false после assert - дальше нет смысла делать тест дальше
        // message- описание ошибки дляпонимания ошибки
        Assert.assertTrue("message - тест не прошел", driver.findElement(By.xpath(".//div[@class='e']//img[@class='img-circle']"))
                .isDisplayed());


    }

    @Test
    public void unvalidLogIn() {

    }
}
