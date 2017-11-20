package loginTest;

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

@RunWith(value = Parameterized.class)
public class InvalidLoginWithParamWithDataFromExcel extends ParentTest {
    String login, pass;

    public InvalidLoginWithParamWithDataFromExcel(String browser, String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }

//    @Parameterized.Parameters
//    public static Collection testDData(){
//        return Arrays.asList(new Object[][]{
//                {"chrome","Student","906090"},
//                {"chrome","tudent","909090"}
//        });
//    }

    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        InputStream spreadsheet = new FileInputStream(ConfigData.getCfgValue("DATA_FILE_PATH") + "testDataSuit.xls");
        return new SpreadsheetData(spreadsheet, "InvalidLogOn").getData();      //2й параметр - указываем название листа в екселе
    }



    @Test
    public void invalidLogin(){
        loginPage.loginUser(login,pass);
        checkAcceptanceCriteria("Title not match", loginPage.getTitle(), "Account of spare:Авторизация");
    }
}
