package pages;


import org.apache.log4j.Logger;
import org.junit.Assert;
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
}