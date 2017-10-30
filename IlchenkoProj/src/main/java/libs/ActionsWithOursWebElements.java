package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.ExecutionException;

/**
 * Created by user on 30.10.2017.
 */
public class ActionsWithOursWebElements {

    WebDriver webDriver;
    Logger logger;

    public ActionsWithOursWebElements(WebDriver WebDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }

    public void enterTextInToInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + "was inputed to input");
        } catch (Exception e) {
            logger.error("Cant work with input");
            Assert.fail("Cant work with input");
        }

    }

    public void clickOnWebElement(WebElement element) {
        try {
            element.click();
            logger.info("Element was clicked");

        } catch (Exception e) {
            logger.error("Cant work with input");
            Assert.fail("Cant work with input");
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }
}