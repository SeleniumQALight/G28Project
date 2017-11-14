package pages;

import lib.ActionsWithOurWebElements;

import lib.ConfigData;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends ParentPage{


    // удаляем - они вынесены
    //    WebDriver webDriver;
//    Logger logger;
//    ActionsWithOurWebElements actionsWithOurWebElements;

    @FindBy(name = "_username")
    WebElement inputLogin;

    @FindBy(name = "_password")
    WebElement inputPassWord;

    @FindBy(tagName = "button")
    WebElement buttonLogIn;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }


    // конструктор удалить
//
//    public LoginPage(WebDriver webDriver) {
//        this.webDriver = webDriver;
//        logger = Logger.getLogger(getClass());
//        actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
//        PageFactory.initElements(webDriver, this);
//    }


//    public void openPageLogin() {
//        try {
//            webDriver.get("http://v3.test.itpmgroup.com/login");
//            logger.info("Page login was opened");
//        } catch (Exception e) {
//            logger.error("Can not open url");
//            Assert.fail("Can not open url");
//        }
//
//    }

    public void openPageLogin() {
        try {
            webDriver.get(ConfigData.getCfgValue("base_url") + "/login");
            logger.info("Page login was opened");
        } catch (Exception e) {
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }

    }
    public void enterLogInIntoInputLogin(String login) {
//        try {
//            inputLogin.clear();
//            inputLogin.sendKeys(login);
//            logger.info(login + " was entrered in to login Input");
//        }catch (Exception e){
//            logger.error("Can not work with input");
//            Assert.fail("Can not work with input");
//        }
        actionsWithOurWebElements.enterTextInToInput(inputLogin, login);
    }

    public void enterPassInToInputPass(String pass) {
        actionsWithOurWebElements.enterTextInToInput(inputPassWord, pass);
    }

    public void clickButton() {
        try {
            webDriver.findElement(By.tagName("button")).click();
            logger.info("Click ENTER");
        } catch (Exception e) {
            logger.error("Can not click to 'ENTER'");
            Assert.fail("Can not click to 'ENTER'");
        }

    }

    public void clickOnButtonLogin(){
        actionsWithOurWebElements.clickOnWebElement(buttonLogIn);
    }

    public void loginUser(String login, String pass) {
        openPageLogin();
        enterLogInIntoInputLogin(login);
        enterPassInToInputPass(pass);
        clickOnButtonLogin();
    }
}