package logInTest;

import org.junit.Test;
import parentTest.ParentTest;

public class LogIn extends ParentTest {
    @Test
    public void validLogIn(){
        loginPage.openPageLogin();
        loginPage.enterLoginIntoInput("Student");


    }
}
