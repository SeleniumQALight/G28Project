package logInTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LogInTest extends ParentTest {

    @Test
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present",
        homePage.isAvatarPresent(),true);

    }
}
