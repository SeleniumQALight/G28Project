package logInTest;

import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {
    @Test
    public void validLogin() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassIntoInputPass("909090");
        loginPage.clickOnButtonLogin();
        //Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent());
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
    }
}
