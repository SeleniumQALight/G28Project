package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {

    WebDriver webDriver; // созд локальн переменную
    Logger logger;       // добавляем Logger - log4j
    ActionsWithOurWebElements actionsWithOurWebElements;


    @FindBy(tagName = "h1")
    private WebElement zagolovok;

    //конструктор
    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        // созд объект и даем ему параметр - имя класса
        logger = Logger.getLogger(getClass());
        PageFactory.initElements(webDriver, this);
        actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
    }

     // метод возврвщает title web page
    public String getTitle() {
        return webDriver.getTitle();
    }


    // метод проверяет title web page
    public void checkTitle(String title) {
        Assert.assertEquals("Title not expected",
                getTitle(),title);
    }


    // метод проверяет имя заголовка на странице
    public void checkZagolovok(String zagolovokText) {

          Assert.assertEquals("Zagolovok is not matched",
                zagolovok.getText(),zagolovokText);
    }


}
