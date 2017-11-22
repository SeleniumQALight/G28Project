package logInTest;

import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class UnvalidLoginWithParam extends ParentTest {
    String login, pass, broswer;

    public UnvalidLoginWithParam(String browser, String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
        this.broswer = browser;
    }

    @Parameterized.Parameters
    public static Collection testDData(){
        return Arrays.asList(new Object[][]{
                //{"Student","906090"},
                //{"Student","909090"},
                {"firefox", "Student","90909"}
        });
    }

    @Test
    public void unvalidLogin() {
        loginPage.loginUser(login, pass);
        checkAcceptanceCriteria("Title is not match", loginPage.getTitle(), "Account of spare:Авторизация");
    }
}
