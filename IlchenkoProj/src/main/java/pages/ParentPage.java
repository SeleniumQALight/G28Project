package pages;


import libs.ActionsWithOursWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 30.10.2017.
 */
public class ParentPage {
    WebDriver webDriver;
    Logger logger;
    ActionsWithOursWebElements actionsWithOursWebElements;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        actionsWithOursWebElements = new ActionsWithOursWebElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
