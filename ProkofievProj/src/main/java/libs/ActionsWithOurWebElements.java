package libs;


import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;
    WebDriverWait webDriverWait20;

    public ActionsWithOurWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webDriverWait20 = new WebDriverWait(webDriver,20);
    }

    public void enterTextInToInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + " was inputed to input");
        } catch (Exception e) {
            logger.error("Can not work with input");
            Assert.fail("Can not work with input");
        }
    }

    public void clickOnWebElement(WebElement element) {
        try {
            webDriverWait20.until(ExpectedConditions.visibilityOf(element));
//          webDriverWait20.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)))
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

    public void selectItemInDropDownByVisibleText(WebElement elementDD, String textForSelect) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByVisibleText(textForSelect);
            logger.info(textForSelect + " was selected in DD");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    public void selectItemInDropDownByValue(WebElement elementDD, String valueInDropDown) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByValue(valueInDropDown);
            logger.info(valueInDropDown + " was selected in DD");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

        /**
         * @param element
         * @param neededState !! only Checked OR Unchecked
         */
    public void setStateToCheckBox (WebElement element, String neededState){
        //    Assert.assert("Not Expected status", "Checked",neededState);
            if (element.isSelected() && "Checked".equals(neededState)){
                logger.info("Element is checked");
            } else if (element.isSelected() && "Unchecked".equals(neededState)){
                clickOnWebElement(element);
            } else if (!element.isSelected() && "Checked".equals(neededState)){
                clickOnWebElement(element);
            } else if (!element.isSelected() && "Unchecked".equals(neededState)){
                logger.info("Element is Unchecked");
            }
    }

    public boolean isElementPresent(String locator) {
        try {
            WebElement webElement = webDriver.findElement(By.xpath(locator));
            return webElement.isDisplayed() && webElement.isEnabled();
        } catch (Exception e) {
        return false;
        }
    }
}
