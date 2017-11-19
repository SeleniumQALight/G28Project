package logInTest;

import lib.ConfigData;
import lib.SpreadsheetData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class UnValidLogInWithParamsWithDataFromExel extends ParentTest {
    String login, pass;

    public UnValidLogInWithParamsWithDataFromExel(String browser, String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }

//    @Parameterized.Parameters
//    public static Collection testDData(){
//        return Arrays.asList(new Object[][]{
//                {"chrome","Student","906090"},
//                {"iedriver","Student","906090"},
//
//                {"chrome","Student","909090"},
//                {"chrome","Student","90909"}
//        });
//    }



    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        InputStream spreadsheet = new FileInputStream(ConfigData.getCfgValue("DATA_FILE_PATH") + "testDataSuit.xls");
        return new SpreadsheetData(spreadsheet, "InvalidLogOn").getData();      //2й параметр - указываем название листа в екселе
    }



    @Test
    public void unvalidLogIn(){
        loginPage.loginUser(login, pass);
        checkAcceptanceCriteria("Title not match"
                , loginPage.getTitle(),
                "Account of spare:Авторизация");
    }
}
