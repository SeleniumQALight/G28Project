package loginTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by user on 25.10.2017.
 */
public class LoginTest extends ParentTest{
    @Test
    public void validLogIn(){
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Title is not excepted", homePage.getTitle(), "Учет запчпстей");


    }
}
