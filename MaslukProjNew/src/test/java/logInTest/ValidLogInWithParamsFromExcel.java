package logInTest;

import libs.ConfigData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class ValidLogInWithParamsFromExcel extends ParentTest {


    public ValidLogInWithParamsFromExcel(String browser) {
        super(browser);

    }

    @Test
    public void validLogIn() throws IOException {
        Map dataFromExcelForValidLogIn = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"),"validLogOn");
        loginPage.openPageLogin();
        loginPage.enterLogInIntoInputLogin(dataFromExcelForValidLogIn.get("login").toString());
        loginPage.enterPassInToInputPass(dataFromExcelForValidLogIn.get("pass").toString());
        loginPage.clickOnButtonLogIn();
        checkAcceptanceCriteria("Avatar is not present",
                homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Title is not excepted",
                homePage.getTitle(),"Учет запчастей");

    }
}
