package loginTest;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by user on 13.11.2017.
 */
public class ValidLogIn extends ParentTest {
    public ValidLogIn(String browser) {
        super(browser);
    }

    @Test
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not excepted", homePage.getTitle(), "Учет запчпстей");
    }
}
