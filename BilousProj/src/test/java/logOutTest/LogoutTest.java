package logOutTest;

import org.junit.Test;
import parentTest.ParentTest;



public class LogoutTest extends ParentTest {
    @Test
    public void logOut() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPasswordIntoInputPass("909090");
        loginPage.clickOnLoginButton();
        checkAcceptanceCriteria("Avater is not present",
                homePage.isAvatarPresent(), true);
        homePage.expandProfileBox();
        checkAcceptanceCriteria("Profile Box is not present",
                homePage.isProfileBoxPresent(), true);
        homePage.clickOnLogoutButton();
        checkAcceptanceCriteria("Login Box is not present",
             loginPage.isLogInBoxPresent(), true);
    }
}