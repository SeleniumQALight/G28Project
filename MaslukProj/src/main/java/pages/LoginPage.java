package pages;

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
    public void openPageLogin(){
    try {
        webDriver.get("http://v3.test.itpmgroup.com/login");
        logger.info("Page login was opened");
    }catch (Exception e) {
    logger.error("Can not open url");
        Assert.fail("Can't open url");

    }
    }

    public void enterLogInIntoInputLogin(String login) {
        try {
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login + "wasentered in tologin Input");
        }
            catch (Exception e) {
                logger.error("Can't work with input");
                Assert.fail("Can't work with input");
            }

    }
}
