package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ActionsWithOutWebElements {
    WebDriver webDriver;
    Logger logger;


    public ActionsWithOutWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }


    // ввод текста в инпут
    public void enterTextInToInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + "was inputed to input");
        } catch (Exception e) {
            logger.error("cant work with input");
            // красим в красный цвет в списке тестов
            Assert.fail("cant work with input");
        }
    }


    //  метод для клика на любом веб элементе
    public void clickOnWebElement(WebElement element) {

        try {
            element.click();
            logger.info("Element was click");
        } catch (Exception e) {
            logger.error("cant work with element");
            // красим в красный цвет в списке тестов
            Assert.fail("cant work with element");
        }
    }

    // est li element na stranice
    public boolean isElementPresent(WebElement element) {
        try {
            // & - обычный "И",&& -если первый false , то второй не проверяется
            return element.isDisplayed() && element.isEnabled();

        } catch (Exception e) {
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
    public void setStateToCheckbox( WebElement element,String neededState){
        //метод будет сам прашивать у елемента чекнут он или нет. если чекнут-оставляем если не чекнут кликаем
    }
}
