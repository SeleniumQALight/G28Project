package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
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

    @FindBy(xpath = ".//input[@name='_password']")
    WebElement inputPassword;

    @FindBy(tagName = "button")
    WebElement buttonLogin;


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
        PageFactory.initElements(webDriver,this);
    }


    public void openPageLogin() {
        try {
            webDriver.get("http://v3.test.itpmgroup.com/login");
            logger.info("Page Login was opened");
        } catch (Exception e) {
            logger.error("Can not open URL");
            Assert.fail("Can not open URL");

        }
    }

    public void enterLogInIntoInputLogin(String login) {

        actionsWithOurWebElements.enterTextIntoInput(inputLogin, login);
    }

    public void enterPasswordIntoInputPass(String pass) {

        actionsWithOurWebElements.enterTextIntoInput(inputPassword, pass);
    }

    public void clickOnLoginButton() {
//        try{
//            webDriver.findElement(By.tagName("button")).click();
//            logger.info("Login button is clicked");
//        }catch (Exception e) {
//            logger.error("cannot click Login button");
//            Assert.fail("cannot click Login button");

        actionsWithOurWebElements.clickOnWebElement(buttonLogin);
    }
}
