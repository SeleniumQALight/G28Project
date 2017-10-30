package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marina on 10/25/2017.
 */
public class LoginPage {
    WebDriver webDriver;
    Logger logger;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }

    public void openPage() {
        try {
            webDriver.get("http://v3.test.itpmgroup.com/login");
            logger.info("Page login was opened");
        } catch (Exception e) {
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }
    }

    public void enterLogInInputLogin(String login) {
        try {
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login + "was entered in to login");

        } catch (Exception e) {
            logger.error("Can not work with input");
            Assert.fail("Can not work with input");
        }
    }

    public void enterPassword (String password){
        try {
            webDriver.findElement(By.xpath(".//*[@name='_password']")).sendKeys(password);
            logger.info(password + " was enterd into password");

        } catch (Exception e){
            logger.error("Cant work with password " + password);
            Assert.fail("Cant work with password " + password);
        }
    }

    public void clickOnButtonLogIn() {
        try {
            webDriver.findElement(By.xpath(".//*[@type = 'submit']")).click();
            logger.info("button Submit was clicked");
        }catch (Exception e){
            logger.error("button Submit wasn't clicked ");
            Assert.fail("button Submit wasn't clicked ");
        }

    }
}
