package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Marina on 10/30/2017.
 */
public class ParentPage {
    WebDriver webDriver;
    Logger logger;
    ActionsWithOurWebElements actionsWithOurWebElements;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
