package logInTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.logging.SimpleFormatter;

@RunWith(value = Parameterized.class)
public class UnValidTest extends ParentTest {
   String login, pass;
// конструктор

    public UnValidTest(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }


// блок параметров
    @Parameterized.Parameters
    public static Collection testDData()    {
        return Arrays.asList(new Object[][]{
                {"Student","906090"},
                {"tudent","909090"},
                {"student","9090"}
        });
    }



@Test
    public void unvalidLogIn(){
        loginPage.loginUser(login,pass);
        checkAcceptanceCriteria("Title not match", loginPage.getTitle(), "Account of spare:Авторизация");
    }


}