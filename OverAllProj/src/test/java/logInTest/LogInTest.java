package logInTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

import java.util.Calendar;
import java.util.logging.SimpleFormatter;

public class LogInTest extends ParentTest {
    @Test
    public void validLogIn(){
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("90900");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present",
                homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Title is not excepted",
                homePage.getTitle(),"Учет запчастей");

    }
}
