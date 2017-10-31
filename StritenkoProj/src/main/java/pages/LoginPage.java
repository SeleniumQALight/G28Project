package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Marina on 10/25/2017.
 */
public class LoginPage extends ParentPage{

    @FindBy(name = "_username" )
    WebElement inputLogin;

    @FindBy(name = "_password")
    WebElement inputPassword;

    @FindBy(tagName = "button")
    WebElement buttonLogIn;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
        try {
            super.openPage("http://v3.test.itpmgroup.com/login");
            logger.info("Page login was opened");
        } catch (Exception e) {
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }
    }

    public void enterLogInInputLogin(String login) {
//        try {
//            inputLogin.clear();
//           inputLogin.sendKeys(login);
//            logger.info(login + "was entered in to login");
//
//        } catch (Exception e) {
//            logger.error("Can not work with input");
//            Assert.fail("Can not work with input");
//        }
        actionsWithOurWebElements.enterTextInToInput(inputLogin, login);
    }

    public void enterPassInToInputPass (String pass){
        actionsWithOurWebElements.enterTextInToInput(inputPassword,pass);
    }

    public void clickOnButtonLogIn() {
//        try {
//            webDriver.findElement(By.xpath(".//*[@type = 'submit']")).click();
//            logger.info("button Submit was clicked");
//        }catch (Exception e){
//            logger.error("button Submit wasn't clicked ");
//            Assert.fail("button Submit wasn't clicked ");
//        }
        actionsWithOurWebElements.clickOnWebElement(buttonLogIn);

    }
}
