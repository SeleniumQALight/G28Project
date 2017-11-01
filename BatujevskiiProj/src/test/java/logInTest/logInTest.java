package logInTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class logInTest extends ParentTest {
    @Test
    public void validLogIn() {
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("student");
        loginPage.enterPassInToInputPass("9090");
        loginPage.clickOnButtonLogin();

        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);


        // Assert.assertTrue("Avatar is not present", homePage.isAvatarPresent());
        // сообщение, что проверяется и какой должен быть результат....

    }


}
