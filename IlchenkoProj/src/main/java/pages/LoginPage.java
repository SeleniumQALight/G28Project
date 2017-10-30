package pages;


import libs.ActionsWithOursWebElements;
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
    ActionsWithOursWebElements actionsWithOursWebElements;

    @FindBy(name = "_username")
    WebElement inputLogin;
    @FindBy(name = "_password")
    WebElement inputPassword;
    @FindBy(tagName = "button")
    WebElement buttonLogin;

    public LoginPage(WebDriver WebDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        actionsWithOursWebElements = new ActionsWithOursWebElements(webDriver);
        PageFactory.initElements(webDriver, this);

    }

    public void openPageLogin() {
        try {
            webDriver.get("http://v3.test.itpmgroup.com/login");
            logger.info("Page login was opened");
        } catch (Exception e) {
            logger.error("Can not open URL");
            Assert.fail("Can not open URL");


        }
    }

    public void enterLogInIntoInputLogin(String login) {
//        try {
//            inputLogin.clear();
//            inputLogin.sendKeys(login);
//            logger.info(login + "was entered in to login Input");
//        } catch (Exception e) {
//            logger.error("Can not work with input");
//            Assert.fail("Can not work with input");
//        }
        actionsWithOursWebElements.enterTextInToInput(inputLogin,login);
    }
    public void  enterPassInToInputPass(String pass){
        actionsWithOursWebElements.enterTextInToInput(inputPassword, pass);
    }

    public void clickOnButtonLogIn(){
        actionsWithOursWebElements.clickOnWebElement( buttonLogin);
    }
}


