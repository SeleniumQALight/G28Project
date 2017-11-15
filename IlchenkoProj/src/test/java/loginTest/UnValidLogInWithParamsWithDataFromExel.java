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

/**
 * Created by user on 25.10.2017.
 */
@RunWith(value = Parameterized.class)


public class UnValidLogInWithParamsWithDataFromExel extends ParentTest{
    String login, pass;

    public UnValidLogInWithParamsWithDataFromExel(String browser, String login, String pass) {
        super(browser);
        this.login = login;
        this.pass = pass;
    }
    @Parameterized.Parameters
    public static Collection testData() throws IOException {
        InputStream spreadsheet = new FileInputStream(ConfigData.getCfgValue("DATA_FILE_PATH") + "testDataSuit.xls");
        return new SpreadsheetData(spreadsheet, "InvalidLogOn").getData();      //2й параметр - указываем название листа в екселе
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
