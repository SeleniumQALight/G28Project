package loginTest;

import org.junit.Assert;
import org.junit.Test;
import parrentTest.ParrentTest;

/**
 * Created by Администратор on 25.10.2017.
 */
public class LoginTest extends ParrentTest{
    @Test
    public void validLogin() {
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent());

    }
}
