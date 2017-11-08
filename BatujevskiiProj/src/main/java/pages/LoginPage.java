package pages;

import lib.ActionsWithOurWebElements;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver webDriver;
    Logger logger;
    ActionsWithOurWebElements actionsWithOurWebElements;

    @FindBy(name = "_username")
    WebElement inputLogin;



    @FindBy(name = "_password")
    WebElement inputPassWord;

    @FindBy(tagName = "button")
    WebElement buttonLogIn;

    /**
     *  ItBox start
     */

    @FindBy(name = "email")
    WebElement inputEmailItBox;

    @FindBy(name = "password")
    WebElement inputPassWordItBox;


    @FindBy(xpath= ".//*[@href='#auth']")
    WebElement authLink;

//    @FindBy(xpath = ".//*[@value='Отправить']")
//    WebElement enterLoginButtonItBox;
//    @FindBy(xpath = ".//*[@href='/registration/']")

    @FindBy(xpath = ".//*[@type='submit']")
    WebElement enterLoginButtonItBox;

    @FindBy(name = "q")
    WebElement findField;

    @FindBy(xpath = ".//*[@title='Искать']")
    WebElement findButton;


    @FindBy(xpath = ".//*[@href='https://last.itbox.ua/prod_img/0/B0002310_big.jpg']")
    public WebElement imageLink;


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }


        public void openPageLogin() {
        try {
            webDriver.get("http://v3.test.itpmgroup.com/login");
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


    //////////////// IT BOX

    public void clickAuthButton(){
        actionsWithOurWebElements.clickOnWebElement(authLink);
    }

    public void clickEnterToLogin(){
        actionsWithOurWebElements.clickOnWebElement(enterLoginButtonItBox);
    }

    public void enterEmailInItBoxLogin(String login) {

        actionsWithOurWebElements.enterTextInToInput(inputEmailItBox, login);
    }

    public void enterPassItBox(String pass) {
        actionsWithOurWebElements.enterTextInToInput(inputPassWordItBox, pass);
    }

    public void openPageItBox() {
        try {
            webDriver.get("https://www.itbox.ua/");
            logger.info("Page login was opened");
        } catch (Exception e) {
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }

    }

    public void typeProductNameToSearchField(String productName) {

        actionsWithOurWebElements.enterTextInToInput(findField, productName);
        actionsWithOurWebElements.clickOnWebElement(findButton);
    }
}