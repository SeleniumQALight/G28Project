package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;

    public ActionsWithOurWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }

    public void enterTextInToInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + " was inputed to input ");
        } catch (Exception e) {
            logger.error("Can not work with input");
            Assert.fail("Can not work with input");
        }
    }

    public void clickOnWebElement(WebElement element) {
        try {
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed() && element.isEnabled(); // esli sleva tru - proverit sprava
            // enable - elevent pokazan i dostupen

        } catch (Exception e) {
            return false;
        }

    }

    public void selectItemInDropDownByVisiblText(WebElement elementDD, String textForSelect) {
        try {
            Select optionsFromDD = new Select(elementDD);   // находит и выбирает ДД а в переменной все строки нашего ДД
            optionsFromDD.selectByVisibleText(textForSelect); // медленно работающий метод
            logger.info(textForSelect + " was selected in DD");
        } catch (Exception e) {

            logger.error("Can not work with element");
            Assert.fail("Can not work with element");

        }
    }
// написать ..... выбор по value

//    public void selectItemInDropDownByValue(WebElement elementDD, String valueForSelect) {
//        try {
//            Select optionsFromDD = new Select(elementDD);   // находит и выбирает ДД а в переменной все строки нашего ДД
//            optionsFromDD.selectByVisibleText(valueForSelectForSelect); // медленно работающий метод
//            logger.info(valueForSelect + " was selected in DD");
//        } catch (Exception e) {
//
//            logger.error("Can not work with element");
//            Assert.fail("Can not work with element");
//        }
//    }


}