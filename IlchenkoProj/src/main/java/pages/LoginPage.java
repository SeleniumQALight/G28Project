package pages;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver webDriver;
    Logger logger;

    public LoginPage(WebDriver WebDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());

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
        try {
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login + "was entered in to login Input");
        } catch (Exception e) {
            logger.error("Can not work with input");
            Assert.fail("Can not work with input");
        }

    }

    public void clickOnButtonLogIn() {
        try {
            webDriver.findElement(By.xpath(".//button[@type=\"submit\"]")).click();
            logger.info("The button was pushed");
        } catch (Exception e) {
            logger.error("Can`t find the button");
            Assert.fail("Can`t find the button");
        }

    }
}
