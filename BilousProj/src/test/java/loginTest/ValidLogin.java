package loginTest;

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
        loginPage.enterPasswordIntoInputPass("909090");
        loginPage.clickOnLoginButton();
        checkAcceptanceCriteria("Avater is not present",
                homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Titles is not exepted",
                homePage.getTitle(), "Учет запчастей");
    }
}
