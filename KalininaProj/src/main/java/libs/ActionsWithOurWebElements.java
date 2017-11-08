package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Администратор on 30.10.2017.
 */
public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;
    public ActionsWithOurWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }
    public void  enterTextIntoInput (WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys (text);
            logger.info(text + " was inputed to input ");
        }
        catch (Exception E) {
            logger.error("Cant work with input");
            Assert.fail("Cant work with input");

        }
    }

    public void clickOnWebElement(WebElement element) {
        try {
            element.click();
            logger.info("Element was clicked");
        }
        catch (Exception E) {
            logger.error ("Cant work with input");
            Assert.fail("Cant work with input");
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed() && element.isEnabled();
        }
        catch (Exception E) {
        return false;
        }
    }
    public void selectItemInDropDownByVisibleText (WebElement elementDD, String textForSelect) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByVisibleText(textForSelect);
            logger.info(textForSelect + "was selected in DD");
        }
        catch (Exception E) {
            logger.error("Cant work with element");
            Assert.fail("Cant work with element");
        }
    }

    public void selectItemInDropDownByValue (WebElement elementDD, String value) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByValue(value);
            logger.info(value + "was selected in DD");
        }
        catch (Exception E) {
            logger.error("Cant work with value");
            Assert.fail("Cant work with value");
        }
    }

    public void setStateToCheckBox (WebElement element, String neededState) {
        try {
            element.isSelected();
           // assertEquals(name.isSelected(),true);

//            if (element.isSelected(), true);
//            else  element.click();
//            logger.info(value + "was selected in DD");
        }
        catch (Exception E) {
            logger.error("Cant work with value");
            Assert.fail("Cant work with value");
        }
    }
}
