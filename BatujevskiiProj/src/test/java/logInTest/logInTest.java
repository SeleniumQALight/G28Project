package logInTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class logInTest extends ParentTest {
    @Test
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogin();
        Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent());
    }


}
