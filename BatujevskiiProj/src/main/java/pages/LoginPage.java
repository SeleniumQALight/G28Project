package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver webDriver;  // local perevennaia v clase
    Logger  logger; // define logger

    // constructor ----- start line
     public LoginPage(WebDriver webDriver) {    // peredali iz testa
         this.webDriver = webDriver;  /// poluchennuu zapisat v peremennu classa
         logger = Logger.getLogger(getClass());
     }

    // open login page
     public void openPageLogin(){
         try {
             webDriver.get("http://v3.qalight.com.ua/login");
             logger.info("Page login was opened");

         } catch (Exception e){
             logger.error("Can not open url");
            Assert.fail("Can not open url");
         }

     }

    public void enterLogInToInputLogin(String login) {

         try {
             webDriver.findElement(By.name("_username")).sendKeys(login);
             logger.info(login + " was entered in to login Input.");
         }catch (Exception e) {
             logger.error("Can not work with input.");
             Assert.fail("Can not work with input.");
         }
    }

    public void clickButton(){
         try {
             webDriver.findElement(By.tagName("button")).click();
             logger.info("Click ENTER");
         } catch (Exception e) {
             logger.error("Can not click to 'ENTER'");
             Assert.fail("Can not click to 'ENTER'");
         }
    }


}
