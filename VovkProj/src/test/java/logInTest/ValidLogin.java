package logInTest;

import org.junit.Test;
import parentTest.ParentTest;

public class ValidLogin extends ParentTest {

    public ValidLogin(String browser) {
        super(browser);
    }

    @Test
    public void validLogin() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassIntoInputPass("909090");
        loginPage.clickOnButtonLogin();
        //Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent());
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not exepted", homePage.getTitle(), "Учет запчастей");
    }
}
