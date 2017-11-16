package logInTest;

import org.junit.Test;
import parentTest.ParentTest;


public class ValidLogin extends ParentTest {


    public ValidLogin(String browser) {
        super(browser);
    }

    @Test
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogin();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not exepted", homePage.getTitle(), "Учет запчастей");

        //         Calendar
        //        SimpleFormatter
    }






}
