package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage {


    // созд локальн переменную
    WebDriver webDriver;
    // добавляем Logger - log4j
    Logger logger;
    ActionsWithOurWebElements actionsWithOurWebElements;

    // сколько элементов на странице = столько и @FindBy
    // для замены
    //webDriver.findElement(By.name("_username"))
    //
    @FindBy(xpath = ".//*[@id=\"service_apparat_serviceDate_date_month\"] ")
    WebElement inputLogin;

    //WebElement	element	=	driver.findElement(By.xpath("//div[@class='main']"));

    // из теста передаем объект драйвера
    // конструктор
    public ServicePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
        //создает объекты описанные анотацией @FindBy
        PageFactory.initElements(webDriver, this);

    }


    // метод для открытия страницы
    public void openPageService() {

        try {
            //открой нам URL
            webDriver.get("http://v3.test.itpmgroup.com/dictionary/service/edit/51");
            logger.info("Page service was opened");
        } catch (Exception e) {
            //сообщает и валит  останавливает тест
            // .fail = безусловно останавл тест
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }
    }


}
