package logInTest;


import lib.ConfigData;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class ValidLoginWithParamsFormExel extends ParentTest {

    public ValidLoginWithParamsFormExel(String browser) {
        super(browser);
    }

    @Test
    public void validLogIn() throws IOException {

        Map dataFromExcelForValidLogin = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"),"validLogOn") ;
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin(dataFromExcelForValidLogin.get("login").toString());
        loginPage.enterPassInToInputPass(dataFromExcelForValidLogin.get("pass").toString());
        loginPage.clickOnButtonLogin();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not exepted", homePage.getTitle(), "Учет запчастей");

        //         Calendar
        //        SimpleFormatter
    }


}
