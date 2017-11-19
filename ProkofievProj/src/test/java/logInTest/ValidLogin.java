package logInTest;

import org.junit.Test;
import parentTest.ParentTest;

public class ValidLogin extends ParentTest{
    public ValidLogin(String browser) {
        super(browser);
    }

    @Test
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInput("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Title is not expected", homePage.getTitle(), "Учет запчастей");
    }
}
