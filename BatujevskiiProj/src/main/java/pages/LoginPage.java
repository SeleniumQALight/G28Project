package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
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

}
