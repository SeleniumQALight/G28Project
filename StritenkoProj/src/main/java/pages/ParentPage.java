package pages;

import libs.ActionsWithOurWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Marina on 10/30/2017.
 */
public class ParentPage {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    ActionsWithOurWebElements actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver);
   @FindBy(tagName = "h1")
    private WebElement zagolovok;


    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void openPage(String url) {
        webDriver.get(url);
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    public void checkTitle(String title) {
        Assert.assertEquals("Title not expected",getTitle(),title);
        ;
    }

    public void checkZagolovok(String zagolovokText) {
        Assert.assertEquals("Zagolovok is not matched",
        zagolovok.getText(), zagolovokText);
    }
}
