package logOutTest;

import org.junit.Test;
import parentTest.ParentTest;



public class LogoutTest extends ParentTest {
   @Test
    public void logOut() {
       loginPage.loginUser("Student", "909090");
       homePage.menuProfileBox();
       checkAcceptanceCriteria("Profile submenu is not present",
               homePage.isProfileBoxPresent(),true);
       homePage.clickOnLogoutButton();
       checkAcceptanceCriteria("Login Box is not present",
               loginPage.isLogInBoxPresent(), true);
   }
}