package loginTest; // для написания команд для удобного чтения обычн людьми

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {

    @Test // Тест кейс
    public void validLogIn (){
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");

    }
}
