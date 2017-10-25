package logInTest;

import org.junit.Test;
import parentTest.ParentTest;

public class logInTest extends ParentTest {
    @Test
    public void validLogIn(){
        loginPage.openPageLogin();
    }


}
