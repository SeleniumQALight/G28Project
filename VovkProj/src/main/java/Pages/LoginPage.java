package Pages;

import libs.ActionsWithOurWebElements;
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
    WebElement inputPassword;

    @FindBy(tagName = "button")
    WebElement buttonLogin;


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
//            logger.info(login + " was entered in to login Input");
//
//        } catch (Exception e) {
//            logger.error("Can not work with login input");
//            Assert.fail("Can not work with login input");
//
//        }
        actionsWithOurWebElements.enterTextIntoInput(inputLogin, login);
    }

    public void enterPassIntoInputPass(String password) {
        actionsWithOurWebElements.enterTextIntoInput(inputPassword, password);
    }

    public void clickOnButtonLogin() {
        actionsWithOurWebElements.clickOnWebElement(buttonLogin);
//        try {
//            webDriver.findElement(By.tagName(button)).click();;
//            logger.info("We are clicked on " + button);
//
//        } catch (Exception e) {
//            logger.error("Can not work with " + button);
//            Assert.fail("Can not work with " + button);
//
//        }
    }

    public boolean isButtonLoginPresent() {
        return actionsWithOurWebElements.isElementPresent(buttonLogin);
    }
}
