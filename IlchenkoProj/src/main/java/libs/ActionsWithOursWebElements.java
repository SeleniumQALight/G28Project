package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.ExecutionException;

/**
 * Created by user on 30.10.2017.
 */
public class ActionsWithOursWebElements {

    WebDriver webDriver;
    Logger logger;
    WebDriverWait webDriverWait20;
//    WebDriverWait webDriverWait

    public ActionsWithOursWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webDriverWait20 = new WebDriverWait(webDriver,20);

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
            webDriverWait20.until(ExpectedConditions.visibilityOf(element));
//            webDriverWait20.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
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

    public void selectItemInDropDownByVisibleText(WebElement elementDD, String textForSelect) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.deselectByVisibleText(textForSelect);
            logger.info(textForSelect + "was selected in DD");
        } catch (Exception e) {
            logger.error("Cant work with element");
            Assert.fail("Cant work with element");
        }
        }


    public void selectItemInDropDownByValue(WebElement elementDD,String valueInDD){
        try{
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByValue(valueInDD);
            logger.info(valueInDD + " was selected in DD");
        }catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
    }

    /**
     *
     * @param element
     * @param needState  !! only chek OR unchek
     */
    public void setStateToCheckBox(WebElement element, String needState){
//        Assert.assertEquals("Not Expected status", "Checked", needState);
        if (element.isSelected() && "Cheked".equals(needState)){
            logger.info("Element is cheked");
        } else if (element.isSelected() && "Uncheked".equals(needState)) {
            clickOnWebElement(element);
        }else if (!element.isSelected() && "Cheked".equals(needState)) {
            clickOnWebElement(element);
        }else  if (!element.isSelected() && "Unlocked".equals(needState)){
            logger.info("Element is uncheked");

        }

    }

    public boolean isElementPresent(String locator) {
        try{
            WebElement webElement = webDriver.findElement(By.xpath(locator));
            return webElement.isDisplayed()&& webElement.isEnabled();

        }catch (Exception e){
            return false;
        }
    }
}