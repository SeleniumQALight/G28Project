package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {

    WebDriver webDriver; // созд локальн переменную
    Logger logger;       // добавляем Logger - log4j
    ActionsWithOurWebElements actionsWithOurWebElements;


    //конструктор
    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        // созд объект и даем ему параметр - имя класса
        logger = Logger.getLogger(getClass());
        PageFactory.initElements(webDriver, this);
        actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
    }


}
