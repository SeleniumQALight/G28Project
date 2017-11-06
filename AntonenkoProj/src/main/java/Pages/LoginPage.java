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
    WebElement inputPassWord;

    @FindBy(tagName = "button")
    WebElement buttonLogIn;


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
            logger.error("Can not open URL");
            Assert.fail("Can not open URL");

        }
    }

    public void enterLoginIntoInputLogin(String login) {
//        try {
//            inputLogin.clear();
//            inputLogin.sendKeys(login);
//            logger.info(login + " was entered in to login Input");
//        }catch (Exception e){
//            logger.error("Can not work with input");
//            Assert.fail("Can not work with input");
//
//        }
        actionsWithOurWebElements.enterTextInToInput(inputLogin, login);

    }

    public void enterPassInToInputPass(String pass) {
        actionsWithOurWebElements.enterTextInToInput(inputPassWord, pass);

    }

    public void clickOnButtonLogIn() {
//        try {
//            webDriver.findElement(By.tagName("button")).click();
//            logger.info("Button was clicked");
//        }catch (Exception e){
//            logger.error("Can not click on Button");
//            Assert.fail("Can not click on Button");
//        }

        actionsWithOurWebElements.clickOnWebElement(buttonLogIn);
    }


    public boolean isButtonLoginPresent() {
        return actionsWithOurWebElements.isElementPresent(buttonLogIn);
    }
}
