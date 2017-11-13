package logInTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest{
    @Test
    public void validLogin(){
        loginPage.openPageLogin();
        loginPage.enterLoginInToImputLogin("Student");
        loginPage.enterPasswordInToImputPassword("909090");
        loginPage.clickOnButtonLogIn();
        checkOnAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not excepted", homePage.getTitle(),"Учет запчастей");
    }

}
