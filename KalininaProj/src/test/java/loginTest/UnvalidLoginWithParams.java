package loginTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parrentTest.ParrentTest;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Администратор on 25.10.2017.
 */

@RunWith(value = Parameterized.class) //данный тест будет запускаться с параметрами

public class UnvalidLoginWithParams extends ParrentTest{

    String login, pass;

    public UnvalidLoginWithParams(String browser, String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters
    public static Collection testDData () {
        return Arrays.asList(new Object [] [] {
                {"Chrome", "Student", "906090"},
                {"Chrome","Student", "909090"},
                {"Chrome","tudent", "909090"},

                {"iedriver","Student", "906090"}

        } );
    }

   @Test
    public void unvalidLogin () {
        loginPage.loginUser(login, pass);
        checkAcceptanceCriteria("Title not match", loginPage.getTitle(), "Account of spare:Автоматизация");
    }
}

