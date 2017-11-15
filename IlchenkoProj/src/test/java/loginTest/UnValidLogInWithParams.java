package loginTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by user on 25.10.2017.
 */
@RunWith(value = Parameterized.class)


public class UnValidLogInWithParams extends ParentTest{
    String login, pass;

    public UnValidLogInWithParams(String browser, String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }
    @Parameterized.Parameters
    public static Collection testDData(){
        return Arrays.asList(new Object[][]{
                {"chrome","Student","906090"},
                {"chrome","tudent","909090"},
                {"chrome","Student","909090"}
        });
    }


    @Test
    public void validLogIn(){
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Title is not excepted", homePage.getTitle(), "Учет запчпстей");


    }
    @Test
    public void unvalidLogin(){
        loginPage.loginUser(login,pass);
        checkAcceptanceCriteria("Title no match",loginPage.getTitle(),"Account of spare:Авторизация");

    }
}
