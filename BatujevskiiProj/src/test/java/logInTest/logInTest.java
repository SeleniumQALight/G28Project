package logInTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

import java.util.Calendar;
import java.util.logging.SimpleFormatter;

public class logInTest extends ParentTest {
    @Test
    public void validLogIn(){
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogin();
        checkAcceptanceCriteria("Avatar is not present",
                homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Title is not exepted", homePage.getTitle(), "Учет запчастей");

        //         Calendar
        //        SimpleFormatter
    }
}
