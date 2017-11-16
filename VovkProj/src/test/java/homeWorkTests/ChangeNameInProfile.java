package homeWorkTests;

import Pages.LoginPage;
import org.junit.Test;
import parentTest.ParentTest;

public class ChangeNameInProfile extends ParentTest {
    final private String PROFILE_NAME = "StudentNew";

    public ChangeNameInProfile(String browser) {
        super(browser);
    }

    @Test
    public void changeNameInProfile() {
        loginPage.loginUser("Student", "909090");
        homePage.checkTitle("Учет запчастей");
        homePage.checkZagolovok("Главная");
        homePage.clickOnAvatar();
        homePage.clickOnButtonMyProfile();
        profilePage.checkZagolovok("Профиль");
        profilePage.changeProfileName(PROFILE_NAME);
        profilePage.saveChangesToMyProfile();
        checkAcceptanceCriteria(" Can not find new name in profilename", profilePage.isNewProfileNameIsPresent(PROFILE_NAME), true );
    }
}
