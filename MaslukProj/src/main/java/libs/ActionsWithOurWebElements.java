package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;

    public ActionsWithOurWebElements(WebDriver webDriver_) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());


    }

    public void enterTextInToInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + "was inputed to input");
        } catch (Exception e) {
            logger.error("Can notwork with input");
            Assert.fail("Can not work with input");

        }
    }

    public void clickOnWebElement(WebElement element) {
        try {
            element.click();
            logger.info("Elementwasclicked");
        } catch (Exception e) {
            logger.error("Can notwork with input");
            Assert.fail("Can not work with input");
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
