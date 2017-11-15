package pages;

import libs.ConfigData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends ParrentPage {

    @FindBy(xpath = ".//*[@class='login-box']")
    WebElement logInBox;
    @FindBy(name = "_username")
    WebElement inputLogin;

    @FindBy(xpath = ".//input[@name='_password']")
    WebElement inputPassword;

    @FindBy(tagName = "button")
    WebElement buttonLogin;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void openPageLogin() {
        try {
            //webDriver.get(ConfigData.getCfgValue(("base_url")+"/login"));
            webDriver.get(ConfigData.getCfgValue("base_url"));
            logger.info("Page Login was opened");
        } catch (Exception e) {

            logger.error("Can not open URL");
            Assert.fail("Can not open URL");

        }
    }

    public boolean isLogInBoxPresent() {
        return actionsWithOurWebElements.isElementPresent(logInBox);
    }

    public void enterLogInIntoInputLogin(String login) {

        actionsWithOurWebElements.enterTextIntoInput(inputLogin, login);
    }

    public void enterPasswordIntoInputPass(String pass) {

        actionsWithOurWebElements.enterTextIntoInput(inputPassword, pass);
    }

    public void clickOnLoginButton() {
//        try{
//            webDriver.findElement(By.tagName("button")).click();
//            logger.info("Login button is clicked");
//        }catch (Exception e) {
//            logger.error("cannot click Login button");
//            Assert.fail("cannot click Login button");

        actionsWithOurWebElements.clickOnWebElement(buttonLogin);
    }

    public void loginUser(String login, String pass) {
            openPageLogin();
            enterLogInIntoInputLogin(login);
            enterPasswordIntoInputPass(pass);
            clickOnLoginButton();
    }


}
