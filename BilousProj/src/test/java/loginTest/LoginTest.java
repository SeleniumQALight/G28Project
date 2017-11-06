package loginTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {
    @Test
    public void validLogin() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPasswordIntoInputPass("909090");
        loginPage.clickOnLoginButton();
        Assert.assertTrue("Avater is not present",
                homePage.isAvatarPresent()
                );

    }

}
