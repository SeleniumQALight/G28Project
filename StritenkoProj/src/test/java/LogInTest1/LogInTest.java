package LogInTest1;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by Marina on 10/25/2017.
 */
public class LogInTest extends ParentTest{
    @Test
    public void validLogIn (){
        loginPage.openPage();
        loginPage.enterLogInInputLogin("Student");
        loginPage.clickOnButtonLogIn();
    }
}
