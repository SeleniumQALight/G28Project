package logInTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@RunWith(value = Parameterized.class)



public class UnValidLoginTestWihtParams extends ParentTest {

    String login, pass;

    public UnValidLoginTestWihtParams(String login, String pass){
    this.login =login;
    this.pass =pass;
}
   @Parameterized.Parameters

   public static Collection testData() {
       return Arrays.asList(new Object[] []{
               {"Student","9090901"},
               {"Student","909090"},
               {"Teacher","909090gg"}
       });
   }

    @Test
    public  void unValidLogin(){
        loginPage.loginUser("student1","9090901");
        checkAcceptanceCriteria("title not match",loginPage.getTitle(),"Account of spare:Авторизация");
    }

}
