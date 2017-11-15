package loginTest;

import libs.ConfigData;
import libs.ExcelDriver;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;


public class ValidLogInWithParamsFromExcel extends ParentTest {


    public ValidLogInWithParamsFromExcel(String browser ) {
        super(browser);
//        excelDriver = new ExcelDriver();
    }

    @Test
    public void validLogIn() throws IOException {
        Map dataFromExzelForValidLogin = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"), "validLogOn");
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin(dataFromExzelForValidLogin.get("login").toString());
        loginPage.enterPassInToInputPass(dataFromExzelForValidLogin.get("pass").toString());
        loginPage.enterLogInIntoInputLogin("Student");
        loginPage.enterPassInToInputPass("909090");
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not excepted", homePage.getTitle(), "Учет запчпстей");
    }
}
