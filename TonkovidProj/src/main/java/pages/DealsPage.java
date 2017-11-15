package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends ParentPage {
    @FindBy(xpath = ".//*[@href='http://v3.qalight.com.ua/deal/edit']")
    private WebElement buttonPlus;



    public DealsPage(WebDriver webDriver){ super(webDriver);}

    /**
     *
      * @param nameOfDeal
     * @return
     */
    public boolean isDealInList(String nameOfDeal) {
        return actionsWithOurWebElements.isElementIsPresent(".//*[text()='" + nameOfDeal + "']");
    }


    /**
     * clic to button "add"(+)
     */
    public void clicOnButtonPlus() {
        actionsWithOurWebElements.clickOnWebElement(buttonPlus);
    }

}
