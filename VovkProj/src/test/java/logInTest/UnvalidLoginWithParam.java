package logInTest;

import Pages.HomePage;
import org.junit.Assert;
import org.junit.Ignore;
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
                {"chrome", "student","909090"},
                {"chrome", "tudent","90909"},
                {"chrome", "Student","90909"}
        });
    }

    //@Ignore
    @Test
    public void unvalidLogin() {
        loginPage.loginUser(login, pass);
        checkAcceptanceCriteria("Title is not match", loginPage.getTitle(), "Account of spare:Авторизация");
    }
}
