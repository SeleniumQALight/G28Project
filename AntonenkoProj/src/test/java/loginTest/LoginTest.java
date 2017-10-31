package loginTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {
    @Test
    public void validLogin() {
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent());
    }
}
