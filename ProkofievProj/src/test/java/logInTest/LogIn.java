package logInTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LogIn extends ParentTest {
    @Test
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInput("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(),true);
    }
}
