package libs;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Marina on 10/30/2017.
 */
public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;

    public ActionsWithOurWebElements(WebDriver driver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }

    public void enterTextInToInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + "was inputed to input");

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
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed() &&element.isEnabled();
        }catch (Exception e){
            return false;
        }
    }
}
