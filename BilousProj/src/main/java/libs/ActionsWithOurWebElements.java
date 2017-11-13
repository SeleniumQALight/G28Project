package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;
    Utils utils = new Utils();
    WebDriverWait webDriverWait20;

    public ActionsWithOurWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webDriverWait20 = new WebDriverWait(webDriver, 20);
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
            webDriverWait20.until(ExpectedConditions.visibilityOf(element));
//            webDriverWait20.until(ExpectedConditions.not(
//                    ExpectedConditions.visibilityOf(element)
//            ));
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


    public boolean elementIsNotPresent(WebElement element) {
        try {

            return !element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return true;
        }
    }

    public boolean elementIsNotPresent(String locator) {
        try {
            WebElement webElement = webDriver.findElement(By.xpath(locator));
            return !webElement.isDisplayed() && webElement.isEnabled();
        } catch (Exception e) {
            return true;
        }
    }

    /*public void setStateToCheckBox(WebElement element) {
        if (!element.isSelected()) {
            element.click();
        }

    }*/

    /**
     * @param element
     * @param neededState !! Only Checked and Unchecked
     */
    public void setStateToCheckBox(WebElement element, String neededState) {
        Assert.assertEquals("Not expected status", "Checked", neededState);

        if (element.isSelected() && "Checked".equals(neededState)) {
            logger.info("Element is Checked");
        } else if (element.isSelected() && "UnChecked".equals(neededState)) {
            clickOnWebElement(element);
        } else if (!element.isSelected() && "Checked".equals(neededState)) {
            clickOnWebElement(element);
        } else if (!element.isSelected() && "Unchecked".equals(neededState)) {
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

    public void clickOnWebElement(String locator) {
        try {
            WebElement webElement = webDriver.findElement(By.xpath(locator));
            webDriverWait20.until(ExpectedConditions.visibilityOf(webElement));
            webElement.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");

        }
    }



   /*public boolean areElementsPresent(ArrayList<String> locators) {

       try {
           List<WebElement> webElement = new ArrayList<WebElement>();
           for (String locator:locators
                ) {
               webElement.add(webDriver.findElements(By.xpath(locator)));
           }
           for (WebElement element : webElement) {
               return element.isDisplayed() && element.isEnabled();
           }
           return false;

       } catch (Exception e) {
           return false;
       }
   }*/

}


