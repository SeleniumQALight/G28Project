package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
    WebDriver webDriver;
    Logger logger;
    ActionsWithOurWebElements actionsWithOurWebElements;

    @FindBy(name = "_username")
    WebElement inputLogin;

    @FindBy(name = "_password")
    WebElement inputPassWord;

    @FindBy(xpath = ".//*[@type='submit']")
    WebElement buttonLogIn;


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());


    }

    public void openPageLogin() {
            try {
                webDriver.get("http://v3.test.itpmgroup.com/");
                logger.info("page login was opened");
            } catch (Exception e) {
                logger.error("cant open url");
                Assert.fail("page is not found");


            }
        }

    public void enterLoginInToImputLogin(String login) {
        try {
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info("Text " + login + " enter the login field");

        } catch (Exception e) {
            logger.error("Cant work with this field");
            Assert.fail("Cant work with this field");
        }
    }

    public void enterPasswordInToImputPassword(String password){
        try{
            webDriver.findElement(By.id("password")).sendKeys(password);
            logger.info("Text"+password+" was entered the password field");
        }catch (Exception e){
            logger.error("cant work whith this field");
            Assert.fail("cant work whit this field");
        }

    }
    public void clickOnButtonLogIn(){
        actionsWithOurWebElements.clickOnWebElement(buttonLogIn);

    }
    public void loginUser(String login, String pass) {
        openPageLogin();
        enterLoginInToImputLogin(login);
        enterPasswordInToImputPassword(pass);
        clickOnButtonLogIn();

    }
}