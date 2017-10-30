package libs;


import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;
    public ActionsWithOurWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }

    public void enterTextInToInput(WebElement input, String text){
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + " was inputed to input");
        }
        catch (Exception e){
            logger.error("Can not work with input");
            Assert.fail("Can not work with input");
        }
}
