package logInTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by Marina on 10/25/2017.
 */
public class LogInTest extends ParentTest {

    @Test
    public void validLogIn() {
        loginPage.openPage();
        loginPage.enterLogInInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
       checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(),true);
    }
}
