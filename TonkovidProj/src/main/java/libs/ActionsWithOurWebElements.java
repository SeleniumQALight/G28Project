package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ActionsWithOurWebElements {
    WebDriver webDriver;
    Logger logger;

    public ActionsWithOurWebElements(WebDriver webDriver) {
        this.webDriver=webDriver;
        logger = Logger.getLogger(getClass());
    }

    /**
     *
     * @param input
     * @param text
     */
    public void enterTextInToinput(WebElement input,String text){
        try {
            input.clear();
            input.sendKeys(text);
        }catch (Exception e){
            logger.error(text+"this text is was inputed");
            Assert.fail("Can not work with input field");
         }
        }

       public void clickOnWebElement(WebElement element){
        try {
            element.click();
            logger.info(element+" -Element was cliked");
        }catch (Exception e){
            logger.error(element+ " -cant work with element");
            Assert.fail(" cant work with element");

        }
       }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed() && element.isEnabled();
        }catch (Exception e){
            return false;
        }
    }

    public void selectItemInDropDownByVisibleText(WebElement elementDD,String textForSelect){
        try{
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByVisibleText(textForSelect);
            logger.info(textForSelect + " was selected in DD");
        }catch (Exception e){
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
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
     * @param neededState !! only Checked OR Unchecked
     */
    public void setStateToCheckBox(WebElement element, String neededState){
//        Assert.assertEquals("Not Expected status", "Checked",neededState);

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
    public boolean isElementIsPresent(String locator){
        try {
            WebElement webElement = webDriver.findElement(By.xpath(locator));
            return webElement.isDisplayed() && webElement.isEnabled();

        }catch (Exception e){
            return false;

        }
    }
    }


