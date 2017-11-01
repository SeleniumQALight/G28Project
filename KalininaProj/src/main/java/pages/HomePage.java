package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Администратор on 30.10.2017.
 */
public class HomePage extends ParrentPage {
    @FindBy (xpath = ".//div[@class = 'pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    public boolean isAvatarPresent () {
        return actionsWithOurWebElements.isElementPresent (avatar);
    }
}
