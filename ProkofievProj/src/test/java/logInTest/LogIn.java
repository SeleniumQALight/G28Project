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
        checkAcceptanceCriteria("Title is not expected",homePage.getTitle(), "Учет запчастей");
    }

    @Test
    public void invalidLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInput("udent");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(),false);
    }

    @Test
    public void invalidPass() {
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInput("Student");
        loginPage.enterPassInToInputPass("909080");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(),false);
    }
}


