package pages;// Описание страницы LoginPage

import libs.ConfigData;
import libs.ActionsWithOurWebElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends ParentPage{

//    // созд локальн переменную
//    WebDriver webDriver;
//    // добавляем Logger - log4j
//    Logger logger;
//    ActionsWithOurWebElements actionsWithOurWebElements;


    // сколько элементов на странице = столько и @FindBy

    // для замены
    //webDriver.findElement(By.name("_username"))
    //
    @FindBy(name = "_username")
    WebElement inputLogin;


    //
    @FindBy(name = "_password")
    WebElement inputPassWord;


    // поиск кнопки
    @FindBy(tagName = "button")
    WebElement buttonLogin;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

//    // из теста передаем объект драйвера
//    // конструктор
//    public LoginPage(WebDriver webDriver) {
//        this.webDriver = webDriver;
//        logger = Logger.getLogger(getClass());
//        actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
//        //создает объекты описанные анотацией @FindBy
//        PageFactory.initElements(webDriver, this);
//
//    }

    // метод для открытия страницы
    public void openPageLogin() {

        try {
            //открой нам URL
           // webDriver.get("http://v3.test.itpmgroup.com/login");
            webDriver.get(ConfigData.getCfgValue("base_url")+"/login");
            logger.info("Page login was opened");
        } catch (Exception e) {
            //сообщает и валит  останавливает тест
            // .fail = безусловно останавл тест
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }
    }

    // ввод данных в поле Login
    public void enterLogInIntoInputLogin(String login) {
//        try {
//            // очистить поле logIn на странице
//            inputLogin.clear();
//
//           // webDriver.findElement(By.name("_username")).sendKeys(login);
//            inputLogin.sendKeys(login);
//            logger.info(login + "was entered in to login Input");
//        }
//        catch (Exception e){
//            logger.error("Can not work with input");
//            Assert.fail("Can not work with input");
//
//        }
        actionsWithOurWebElements.enterTextInToInput(inputLogin, login);


    }

    public void enterPassInToInputPass(String pass) {
        actionsWithOurWebElements.enterTextInToInput(inputPassWord, pass);
    }


    public void clickOnButtonLogin() {
        actionsWithOurWebElements.clickOnWebElement(buttonLogin);
    }



    public void loginUser(String login, String pass) {
        openPageLogin();
        enterLogInIntoInputLogin(login);
        enterPassInToInputPass(pass);
        clickOnButtonLogin();

    }

    // проверка на page



}
