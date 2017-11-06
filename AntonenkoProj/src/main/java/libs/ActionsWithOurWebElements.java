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
            logger.error("Cannot work with input");
            Assert.fail("Cannot work with input");
        }


    }

    public void clickOnWebElement(WebElement element) {
        try {
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            logger.error("Cannot work with element");
            Assert.fail("Cannot work with element");
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
            logger.info(textForSelect + " was selected in DD");

        } catch (Exception e) {
            logger.error("Cannot work with element");
            Assert.fail("Cannot work with element");
        }

    }

    public void selectItemInDropDownByValue(WebElement elementDD, String valueInDD) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByValue(valueInDD);
            logger.info(valueInDD + " was select in DD");

        } catch (Exception e) {
            logger.error("Cannot work with element");
            Assert.fail("Cannot work with element");
        }

    }

    //needed state = checked or unchecked
    public void setStateToCheckbox(WebElement element, String neededState) {
        boolean isChecked;
        isChecked = (element.isSelected());

        if (neededState.equals("checked")) {
            if (!isChecked)
                clickOnWebElement(element);

        } else if (neededState.equals("unchecked")) {
            if (isChecked)
              clickOnWebElement(element);
        }

/*
        switch (neededState) {
            case "checked":
                if (isChecked)
                    break;
                else clickOnWebElement(element);
                break;
            case "unchecked":
                if (!isChecked)
                    break;
                else clickOnWebElement(element);
                break;
            }
*/
    }
}



