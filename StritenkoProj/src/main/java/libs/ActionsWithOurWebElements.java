package libs;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Marina on 10/30/2017.
 */
public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;

    public ActionsWithOurWebElements(WebDriver driver) {
        this.webDriver = driver;
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
            return element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public void selectItemInDropDownByVisibleText(WebElement elementDD, String textForSelect) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByVisibleText(textForSelect);
            logger.info(textForSelect + "was selected in DD");

        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");

        }

    }

    public void selectCheckBox(WebElement element) {
        try {
            if (!element.isSelected()) {
                element.click();
                logger.info("CheckBox was just selected");
            } else {
                logger.info("CheckBox already selected previously");
            }

        } catch (Exception e) {
            logger.error("Error occurred while checking the checkbox.");

        }
    }

    public void deselectCheckBox(WebElement element) {
        try {
            if (element.isSelected()) {
                element.click();
                logger.info("CheckBox was just deselected");
            } else {
                logger.info("CheckBox already deselected previously");
            }

        } catch (Exception e) {
            logger.error("Error occurred while unchecking the checkbox.");
        }
    }


    public void selectItemInDropDownByValue(WebElement elementDD, String valyeInDD) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByValue(valyeInDD);
            logger.info(valyeInDD + "was selected in DD");

        } catch (Exception e) {
            logger.info("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }


   /* @param element
   @param needState!! only Checked Or Unchecked
    */
    public void setStateToCheckBox(WebElement element, String neededState) {

        if (element.isSelected() && "Checked".equals(neededState)) {
            logger.info("Element is checked");
        } else if (element.isSelected() && "Unchecked".equals(neededState)) {
            clickOnWebElement(element);
        } else if (!element.isSelected() && "Checked".equals(neededState)) {

        } else if (!element.isSelected() && "Unchecked".equals(neededState)) {
            logger.info("Element is Unchecked");
        }
    }
}



