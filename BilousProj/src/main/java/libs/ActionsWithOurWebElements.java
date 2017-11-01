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

    public void enterTextIntoInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info("Text with entered to input");
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

            return element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public void selectItemInDropDownByVisibleText(WebElement elementdd, String textForSelect) {
        try {
            Select optionsFromDD = new Select(elementdd);
            optionsFromDD.selectByVisibleText(textForSelect);
            logger.error(textForSelect + "was selected in drop-down");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void selectItemInDropDownByValue(WebElement elementdd, String valueInDropDown) {
        try {
            Select optionsFromDD = new Select(elementdd);
            optionsFromDD.selectByValue(valueInDropDown);
            logger.error(valueInDropDown + "was selected in drop-down");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }



    public void setStateToCheckBox(WebElement element,String neededState){


        if(){

        }
    }


}