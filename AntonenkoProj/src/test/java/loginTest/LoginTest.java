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
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true
        );
        checkAcceptanceCriteria("Title is not expected", homePage.getTitle(),"Учет запчастей");
    }
    @Test
    public void invalidLogin(){
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInputLogin("udent");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        Assert.assertTrue("Button is not displayed", loginPage.isButtonLoginPresent());
    }
}
