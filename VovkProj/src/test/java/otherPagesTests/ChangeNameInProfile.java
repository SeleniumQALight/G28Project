package otherPagesTests;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class ChangeNameInProfile extends ParentTest {

    @Test
    public void changeNameInProfile() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassIntoInputPass("909090");
        loginPage.clickOnButtonLogin();
        homePage.clickOnAvatar();
        homePage.clickOnButtonMyProfile();
        homePage.changeProfileName("Student");
        homePage.saveChangesToMyProfile();
        checkAcceptanceCriteria("Profile name wasn't changes", homePage.isNewProfileNameIsPresent("Student"), true);
    }
}
