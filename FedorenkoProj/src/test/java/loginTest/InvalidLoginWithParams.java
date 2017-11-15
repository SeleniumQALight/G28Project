package loginTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class) // стандартная строка для запуска теста с параметрами через junit


public class InvalidLoginWithParams extends ParentTest {
    String login, pass; // параметры для запуска параметризированого теста

    public InvalidLoginWithParams(String browser , String login, String pass) { // создаем конструктор дял настройки класа
        super(browser);
        this.login = login;                         // сколько даных в конструкторе столько будет
        this.pass = pass;                                 // вариантов на каждый тест в классе;
    }
    @Parameterized.Parameters // задаем параметры для тест кейса
    public static Collection testDData(){
        return Arrays.asList(new Object[][]{
                {"Student","906090"},
                {"tudent","909090"}
        });
    }
     @Test
     public void unvalidLogin(){
        loginPage.loginUser(login, pass);
        checkAcceptanceCriteria("Title not match", loginPage.getTitle(),
                "Account of spare:Авторизация");
        }
    }

