package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by o.bilous on 25-Oct-17.
 */
public class LoginPage {
    WebDriver webDriver;
    Logger logger;
    public LoginPage(WebDriver webDriver) {
        this.webDriver=webDriver;
        logger = Logger.getLogger(getClass());
    }

    public void openPageLogin(){
        try{
            webDriver.get("http://v3.test.itpmgroup.com/login");
            logger.info("Page Login was opened");
        }catch (Exception e){
            logger.error("Can not open URL");
            Assert.fail("Can not open URL");

        }
    }

    public void enterLogInIntoInputLogin(String login) {
        try{
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login + "is entered into input login ");
        }catch (Exception e) {
            logger.error("cannot enter login to input login");
            Assert.fail("cannot enter login to input login");
        }
    }

    public void enterPasswordIntoInputLogin(String password) {
        try{
            webDriver.findElement(By.xpath(".//input[@name='_password']")).sendKeys(password);
            logger.info(password + "is entered into input password ");
        }catch (Exception e) {
            logger.error("cannot enter password to input password");
            Assert.fail("cannot enter password to input password");
        }
    }

    public void clickLoginButton() {
        try{
            webDriver.findElement(By.tagName("button")).click();
            logger.info("Login button is clicked");
        }catch (Exception e) {
            logger.error("cannot click Login button");
            Assert.fail("cannot click Login button");
        }
    }
}
