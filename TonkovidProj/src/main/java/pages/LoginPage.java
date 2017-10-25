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
        logger= Logger.getLogger(getClass());

    }

    public void openPageLogin(){


        {
            try {
                webDriver.get("thttp://v3.test.itpmgroup.com/login");
                logger.info("page login was opened");
            } catch (Exception e) {
                logger.error("cant open url");
                Assert.fail("page is not found");


            }
        }

    }

    public void enterLoginInToImputLogin(String login) {
        try{webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info("Text "+login+" enter the login field");

    }catch(Exception e){
            logger.error("Cant work with this field");
            Assert.fail("Cant work with this field");
        }
}