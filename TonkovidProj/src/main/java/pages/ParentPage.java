package pages;


import libs.ActionsWithOurWebElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {

    WebDriver webDriver;
    Logger logger;
    ActionsWithOurWebElements actionsWithOurWebElements;

    @FindBy(tagName = "h1")
    private WebElement zagolovok;

    public ParentPage (WebDriver webDriver){
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
      //actionsWithOurWebElements = new ActionsWithOurWebElements(webDriver); //   Mised webDriver( red)
        PageFactory.initElements(webDriver,this);
    }
    public String getTitle() {
        return webDriver.getTitle();
    }

    public void checkTitle(String title) {
        Assert.assertEquals("Title not expected",
                getTitle(), title);
    }

    public void checkZagolovok(String zagolovokText) {
        Assert.assertEquals("Zogolovok is not matched",
                zagolovok.getText(), zagolovokText);
    }
}


