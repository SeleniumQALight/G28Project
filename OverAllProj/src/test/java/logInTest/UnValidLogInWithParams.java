package logInTest;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.logging.SimpleFormatter;

@RunWith(value = Parameterized.class)
public class UnValidLogInWithParams extends ParentTest {
    String login, pass;

    public UnValidLogInWithParams(String browser,String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters
    public static Collection testDData(){
        return Arrays.asList(new Object[][]{
                {"chrome","Student","909090"},
                {"iedriver","Student","906090"},
                {"chrome","Student","909090"},
                {"chrome","Student","90909"}
        });
    }



    @Test
    public void unvalidLogIn(){
        loginPage.loginUser(login, pass);
        checkAcceptanceCriteria("Title not match"
                , loginPage.getTitle(),
                "Account of spare:Авторизация");
    }
}
