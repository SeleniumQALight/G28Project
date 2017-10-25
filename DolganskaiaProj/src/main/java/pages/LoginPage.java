package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage implements base_Functions
{
    WebDriver webDriver;
    Logger logger;


    public LoginPage(WebDriver webDriver)
    {
        this.webDriver=webDriver;
        logger=Logger.getLogger(getClass());
    }

// Functions

    @Override
    public void buttonClick(By by)
    {
        webDriver.findElement(by).click();
    }

// Methods
    public void openPageLogin()
    {
        try
        {
            webDriver.get("http://v3.test.itpmgroup.com/login");
            logger.info("Page login was opened");
        }
        catch (Exception e)
        {
            logger.error("Cannot open URL");
            Assert.fail("Cannot open URL");
        }
    }

    public void enterLoginIntoInputLogin(String login)
    {
        try
        {
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login+"was entered into login field");
        }
        catch (Exception e)
        {
            logger.error("Cannot enter into login field");
            Assert.fail("Cannot enter into login field");
        }
    }
    public void enterPasswordIntoInputLogin(String password)
    {
        try
        {
            webDriver.findElement(By.name("_password")).sendKeys(password);
            logger.info(password+"was entered into login field");
        }
        catch (Exception e)
        {
            logger.error("Cannot enter into password field");
            Assert.fail("Cannot enter into password field");
        }
    }
    public void loginButtonClick()
    {
        try
        {
            buttonClick(By.tagName("button"));
            logger.info( "Login buttonClick was successful");
        }
        catch (Exception e)
        {
            logger.error("Login buttonClick failed");
            Assert.fail("Login buttonClick failed");
        }
    }

}
