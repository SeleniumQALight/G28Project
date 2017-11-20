package loginTest; // для написания команд для удобного чтения обычн людьми

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.HomePage;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;


// для запуска праметризированного через junit
@RunWith(value = Parameterized.class)


public class UnValidLogInWithParams extends ParentTest {

    // параметры для параметризированного запуса
    String login, pass;


    // конструктор потому что появились переменные login,pass
    public UnValidLogInWithParams(String browser,String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }

    // параметры для нашего параметризированнго запуска
    // для параметизирования необходимо использовать только
    // один Тест кейс -@Test - для 1 класса
    @Parameterized.Parameters
    public static Collection testDData() {
        return Arrays.asList(new Object[][]{
                {"chrome","Student", "907790"},
                {"chrome","Student", "909090"},
                {"iedriver","Student", "907790"},
                {"iedriver","Student", "909090"},

        });
    }





    @Test // Тест кейс

    public void unvalidLogIn() {
        //     loginPage.loginUser("tudent","909090");
        loginPage.loginUser(login, pass);
        checkAcceptanceCriteries("Title not match",
                loginPage.getTitle(), "Account of spare:Авторизация");
    }

}
