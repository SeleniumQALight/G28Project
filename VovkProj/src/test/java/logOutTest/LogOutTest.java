package logOutTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LogOutTest extends ParentTest {
    @Test
    public void logOutTest () {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassIntoInputPass("909090");
        loginPage.clickOnButtonLogin();
        homePage.clickOnAvatar();
        homePage.clickOnButtonLogout();
        checkAcceptanceCriteria("Button Login is not present", loginPage.isButtonLoginPresent(), true);
    }
}
