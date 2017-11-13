package LoginTest;

import org.junit.Test;
import parentTest.ParentTest;


/**
 * Created by Администратор on 13.11.2017.
 */
public class ValidLogin extends ParentTest {

    @Test
    public void validLogin() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not excepted", homePage.getTitle(), "Учет запчастей");

    }

}