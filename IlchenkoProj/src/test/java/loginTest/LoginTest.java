package loginTest;

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
        loginPage.clickOnButtonLogIn();
    }
}
