package logInTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest{
    @Test
    public void validLogin(){
        loginPage.openPageLogin();
        loginPage.enterLoginInToImputLogin("Student");
        checkAcceptanceCriteria("Avatar is not present",homePage.isAvatarPresent(),true);


    }

}
