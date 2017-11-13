package logInTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class UnvalidLogInWithParam extends ParentTest {
    String login, pass;

    public UnvalidLogInWithParam(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters
    public static Collection testDData(){
        return Arrays.asList(new Object[][]{
                {"Student", "906090"},
                {"tudent", "909090"},
                {"Student", "909090"}
        });
    }



    @Test
    public void invalidLogIn() {
        loginPage.loginUser(login, pass);
        checkAcceptanceCriteria("Title not match", loginPage.getTitle(), "Account of spare:Авторизация");
    }

}


