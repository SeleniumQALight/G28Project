package pages;

import org.openqa.selenium.WebDriver;

public class SparePage extends ParentPage {
    public SparePage(WebDriver webDriver) {
        super(webDriver);
    }









    public boolean isSpareInList(String nameOfSpare) {
        return actionsWithOurWebElements.isElementIsPresent(".//*[text()='" + nameOfSpare + "']");
    }




}
