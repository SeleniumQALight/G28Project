package Pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver webDriver;
    Logger logger;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
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
        try {
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login + " was entered in to login Input");

        } catch (Exception e) {
            logger.error("Can not work with login input");
            Assert.fail("Can not work with login input");

        }
    }

    public void enterPasswordIntoInputPassword(String password) {
        try {
            webDriver.findElement(By.xpath(".//*[@name='_password']")).sendKeys(password);
            logger.info(password + " was entered into password Input");

        } catch (Exception e) {
            logger.error("Can not work with password input");
            Assert.fail("Can not work with password input");

        }
    }

    public void clickOnButton(String button) {
        try {
            webDriver.findElement(By.tagName(button)).click();;
            logger.info("We are clicked on " + button);

        } catch (Exception e) {
            logger.error("Can not work with " + button);
            Assert.fail("Can not work with " + button);

        }
    }
}
