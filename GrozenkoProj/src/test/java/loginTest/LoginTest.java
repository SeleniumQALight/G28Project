package loginTest; // Тесты, тест кейсы

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {

    @Test
    public void validLogIn (){
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");

    }
}
