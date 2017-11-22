package loginTest; // для написания команд для удобного чтения обычн людьми

import libs.ConfigData;
import libs.SpreadsheetData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;


// для запуска праметризированного через junit
@RunWith(value = Parameterized.class)


public class UnValidLogInWithParamsWithDataFromExcel extends ParentTest {

    // параметры для параметризированного запуса
    String login, pass;


    // конструктор потому что появились переменные login,pass
    public UnValidLogInWithParamsWithDataFromExcel(String browser, String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }
    // выносим параметры в Excel
//    // параметры для нашего параметризированнго запуска
//    // для параметизирования необходимо использовать только
//    // один Тест кейс -@Test - для 1 класса
//    @Parameterized.Parameters
//    public static Collection testDData() {
//        return Arrays.asList(new Object[][]{
//                {"chrome","Student", "907790"},
//                {"chrome","Student", "909090"},
//                {"iedriver","Student", "907790"},
//                {"iedriver","Student", "909090"},
//
//        });
//    }

    // FileInputStream -библиотека для работы с файлами
    // сверяем key "DATA_FILE_PATH" c файлом config.properties
    @Parameterized.Parameters

    public static Collection testData() throws IOException {
        InputStream spreadsheet = new FileInputStream(ConfigData.getCfgValue(
                "DATA_FILE_PATH") + "testDataSuit.xls");
        //SpreadsheetData(, "InvalidLogOn")
        return new SpreadsheetData(spreadsheet, "InvalidLogOn").getData();  //2й параметр - указываем название листа в екселе    }
    }

        @Test // Тест кейс

        public void unvalidLogIn () {
            //     loginPage.loginUser("tudent","909090");
            loginPage.loginUser(login, pass);
            checkAcceptanceCriteries("Title not match",
                    loginPage.getTitle(), "Account of spare:Авторизация");
        }

    }
