package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Администратор on 25.10.2017.
 */
public class LoginPage {
    WebDriver webDriver;
    Logger logger;
    ActionsWithOurWebElements actionsWithOurWebElements;

    @FindBy(name= "_username")
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
    public void openPageLogin () {
        try {
            webDriver.get("http://v3.test.itpmgroup.com/login");
            logger.info("Page login was opened");

        }
        catch(Exception e) {
            logger.error("Cannot open url");
            Assert.fail("Cannot open url");
        }
    }

    public void enterLoginIntoInputLogin(String login) {
//        try{
//            inputLogin.clear();
//            inputLogin.sendKeys(login);
//            logger.info(login + " was entered into login Input");
//        }
//        catch (Exception e){
//            logger.error("Cannot with input");
//            Assert.fail("Cannot work with input");
//        }
        actionsWithOurWebElements.enterTextIntoInput(inputLogin, login);
   }

//    public void clickOnButtonLogin() {
//        try {
//            webDriver.findElement(By.tagName("button")).click();
//                    logger.info("clicking on button passed");
//        }
//        catch (Exception e) {
//            logger.error("clicking on button failed");
//            Assert.fail("Cannot click on button");
//        }
//    }
    public void enterPassInToInputPass (String pass) {
        actionsWithOurWebElements.enterTextIntoInput(inputPassWord, pass);
    }

    public void clickOnButtonLogIn() {
        actionsWithOurWebElements.clickOnWebElement (buttonLogIn);
    }
}
