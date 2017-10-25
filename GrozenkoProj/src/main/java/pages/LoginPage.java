package pages; // для написания команд для удобного чтения обычн людьми

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;


public class LoginPage {

    // созд локальн переменную
    WebDriver webDriver;
    // добавляем Logger - log4j
    Logger logger;


    // из теста передаем объект драйвера
    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());

    }

    // метод для открытия страницы
    public void openPageLogin (){

        try {
            //открой нам URL
            webDriver.get("http://v3.test.itpmgroup.com/login");
            logger.info("Page login was opened");
        }
        catch (Exception e){
            //сообщает и валит  останавливает тест
            // .fail = безусловно останавл тест
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }
    }

    public void enterLogInIntoInputLogin(String login) {
        try {
            webDriver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login + "was entered in to login Input");
        }
        catch (Exception e){
            logger.error("Can not work with input");
            Assert.fail("Can not work with input");

        }

    }
}
